package ai.chalk.flink.core;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

/**
 * Flink-free batching engine for Chalk {@code upload_features}. Accumulates feature rows and flushes
 * them as a single columnar upload when the buffer fills (see {@link #add}), or when the owning sink
 * asks (checkpoint / close). Retries <em>transient</em> failures (gRPC UNAVAILABLE / DEADLINE_EXCEEDED
 * / RESOURCE_EXHAUSTED / ABORTED) with exponential backoff; non-transient failures (auth, invalid
 * argument) are thrown immediately. On exhaustion it throws, letting the caller (a Flink sink) fail
 * and replay from the last checkpoint — at-least-once, made safe by upsert semantics.
 *
 * <p><b>Flush latency</b> is bounded by {@code min(batchSize reached, checkpoint interval)}. The
 * configured flush interval is a best-effort upper bound evaluated when the next element arrives; on
 * a fully idle stream a partial buffer is drained by the next checkpoint (or {@code close}), not by a
 * background timer — there is none. At-least-once therefore requires checkpointing to be enabled.
 *
 * <p>All mutating methods are {@code synchronized} defensively. Flink's mailbox model already runs
 * {@code invoke}/{@code write}, {@code snapshotState}/{@code flush}, and {@code close} serially on a
 * single task thread, so this guards only against unexpected external callers.
 */
public final class ChalkFeatureUploader implements AutoCloseable {

    private static final Logger LOG = LoggerFactory.getLogger(ChalkFeatureUploader.class);

    private final ChalkSinkConfig config;
    private final ChalkUploadClient client;
    private final List<Map<String, Object>> buffer = new ArrayList<>();
    private long lastFlushMillis = System.currentTimeMillis();

    /** Production constructor: builds the real gRPC-backed client from config. */
    public ChalkFeatureUploader(ChalkSinkConfig config) {
        this(config, new ChalkClientUploadClient(config));
    }

    /** Test/advanced constructor: inject a custom {@link ChalkUploadClient}. */
    public ChalkFeatureUploader(ChalkSinkConfig config, ChalkUploadClient client) {
        this.config = config;
        this.client = client;
    }

    /** Buffer one row; flush if the batch is full or the flush interval has elapsed. */
    public synchronized void add(Map<String, Object> row) {
        if (row == null) {
            return;
        }
        // Shallow copy: safe against the caller reusing/mutating the map, but NOT against mutating a
        // shared value object (e.g. a reused byte[]). Converters must emit fresh/immutable values.
        buffer.add(new LinkedHashMap<>(row));
        if (buffer.size() >= config.batchSize() || intervalElapsed()) {
            flush();
        }
    }

    /** Upload the buffered rows as one columnar batch, then clear the buffer. No-op if empty. */
    public synchronized void flush() {
        if (buffer.isEmpty()) {
            lastFlushMillis = System.currentTimeMillis();
            return;
        }
        Map<String, List<?>> columnar = toColumnar(buffer);
        UploadOutcome outcome = uploadWithRetry(columnar);
        if (!outcome.isSuccess()) {
            if (config.failOnUploadErrors()) {
                throw new ChalkUploadException(
                        "upload_features returned " + outcome.errors().size()
                                + " error(s) for a batch of " + buffer.size() + " row(s): "
                                + outcome.errors());
            }
            // failOnUploadErrors=false: rows rejected by the engine are dropped and NOT replayed.
            // Log loudly so the silent-drop is observable (operationId ties it to the server side).
            LOG.warn("upload_features reported {} error(s) for a batch of {} row(s); "
                            + "continuing (failOnUploadErrors=false) — rejected rows are dropped. "
                            + "operationId={} errors={}",
                    outcome.errors().size(), buffer.size(), outcome.operationId(), outcome.errors());
        }
        buffer.clear();
        lastFlushMillis = System.currentTimeMillis();
    }

    /** Rows currently buffered (not yet uploaded). Exposed for metrics/tests. */
    public synchronized int bufferedRows() {
        return buffer.size();
    }

    private boolean intervalElapsed() {
        return !buffer.isEmpty()
                && System.currentTimeMillis() - lastFlushMillis >= config.flushIntervalMillis();
    }

    private UploadOutcome uploadWithRetry(Map<String, List<?>> columnar) {
        int attempts = config.maxRetries() + 1;
        Exception last = null;
        for (int attempt = 0; attempt < attempts; attempt++) {
            try {
                return client.upload(columnar);
            } catch (Exception e) {
                last = e;
                // Fail fast on non-transient errors (auth, invalid argument, ...): retrying them
                // just burns backoff and then triggers a Flink restart storm on the same error.
                if (attempt >= attempts - 1 || !isRetryable(e)) {
                    break;
                }
                LOG.warn("transient upload_features failure (attempt {}/{}), retrying: {}",
                        attempt + 1, attempts, e.toString());
                sleepBackoff(attempt);
            }
        }
        boolean retryable = isRetryable(last);
        throw new ChalkUploadException(
                "upload_features failed" + (retryable ? " after " + attempts + " attempt(s)"
                        : " with a non-retryable error"), last);
    }

    /** Retryable only for transient gRPC statuses; anything else (incl. unknown) fails fast. */
    private static boolean isRetryable(Throwable t) {
        for (Throwable c = t; c != null; c = c.getCause()) {
            if (c instanceof StatusRuntimeException) {
                Status.Code code = ((StatusRuntimeException) c).getStatus().getCode();
                return code == Status.Code.UNAVAILABLE
                        || code == Status.Code.DEADLINE_EXCEEDED
                        || code == Status.Code.RESOURCE_EXHAUSTED
                        || code == Status.Code.ABORTED;
            }
        }
        return false;
    }

    private void sleepBackoff(int attempt) {
        // Exponential backoff, capped at 30s to bound restart latency. Cap the shift and detect
        // overflow (a huge maxRetries could otherwise wrap the product negative -> bad Thread.sleep).
        long scaled = config.retryBackoffMillis() << Math.min(attempt, 20);
        long backoff = (scaled < 0) ? 30_000L : Math.min(scaled, 30_000L);
        try {
            Thread.sleep(backoff);
        } catch (InterruptedException ie) {
            Thread.currentThread().interrupt();
            throw new ChalkUploadException("interrupted while backing off before upload retry", ie);
        }
    }

    /**
     * Pivot a list of row maps into a rectangular columnar table: union of all feature names across
     * the batch, each column padded with {@code null} where a row omitted that feature. Column
     * order follows first-seen insertion order for stable, readable payloads.
     */
    static Map<String, List<?>> toColumnar(List<Map<String, Object>> rows) {
        LinkedHashSet<String> features = new LinkedHashSet<>();
        for (Map<String, Object> row : rows) {
            for (String key : row.keySet()) {
                if (key == null) {
                    throw new ChalkUploadException("feature row contains a null feature name");
                }
                features.add(key);
            }
        }
        Map<String, List<?>> columnar = new LinkedHashMap<>();
        for (String feature : features) {
            List<Object> column = new ArrayList<>(rows.size());
            for (Map<String, Object> row : rows) {
                column.add(row.get(feature)); // null when absent
            }
            columnar.put(feature, column);
        }
        return columnar;
    }

    @Override
    public synchronized void close() {
        RuntimeException flushError = null;
        try {
            flush();
        } catch (RuntimeException e) {
            flushError = e; // preserve the flush failure; don't let a close error mask it
        }
        try {
            client.close();
        } catch (RuntimeException e) {
            if (flushError != null) {
                flushError.addSuppressed(e);
            } else {
                throw e;
            }
        }
        if (flushError != null) {
            throw flushError;
        }
    }
}
