package ai.chalk.flink.core;

import java.io.Serializable;
import java.time.Duration;

/**
 * Immutable, serializable configuration for the Chalk sink. Flink serializes this and ships it to
 * every TaskManager, where each parallel subtask builds its own {@link ChalkFeatureUploader} /
 * {@code ChalkClient} in {@code open()}. Durations are stored as millis to stay trivially
 * serializable.
 *
 * <p>Credentials note: {@link #clientSecret()} is serialized as part of the job graph. Prefer
 * supplying it from a secret store at job-construction time rather than hard-coding it.
 */
public final class ChalkSinkConfig implements Serializable {

    private static final long serialVersionUID = 1L;

    private final String clientId;
    private final String clientSecret;
    private final String apiServer;      // nullable -> chalk-java default (https://api.chalk.ai)
    private final String environmentId;  // nullable -> token's primary environment
    private final String queryServer;    // nullable -> resolved gRPC engine from the token
    private final String branch;         // nullable -> non-branch (production) deployment

    private final int batchSize;
    private final long flushIntervalMillis;
    private final long uploadTimeoutMillis;
    private final int maxRetries;
    private final long retryBackoffMillis;
    private final boolean failOnUploadErrors;

    private final boolean writeOnline;
    private final boolean writeOffline;
    private final boolean updateMataggs;

    private ChalkSinkConfig(Builder b) {
        this.clientId = b.clientId;
        this.clientSecret = b.clientSecret;
        this.apiServer = b.apiServer;
        this.environmentId = b.environmentId;
        this.queryServer = b.queryServer;
        this.branch = b.branch;
        this.batchSize = b.batchSize;
        this.flushIntervalMillis = b.flushIntervalMillis;
        this.uploadTimeoutMillis = b.uploadTimeoutMillis;
        this.maxRetries = b.maxRetries;
        this.retryBackoffMillis = b.retryBackoffMillis;
        this.failOnUploadErrors = b.failOnUploadErrors;
        this.writeOnline = b.writeOnline;
        this.writeOffline = b.writeOffline;
        this.updateMataggs = b.updateMataggs;
    }

    public String clientId() { return clientId; }
    public String clientSecret() { return clientSecret; }
    public String apiServer() { return apiServer; }
    public String environmentId() { return environmentId; }
    public String queryServer() { return queryServer; }
    public String branch() { return branch; }
    public int batchSize() { return batchSize; }
    public long flushIntervalMillis() { return flushIntervalMillis; }
    public Duration uploadTimeout() { return Duration.ofMillis(uploadTimeoutMillis); }
    public int maxRetries() { return maxRetries; }
    public long retryBackoffMillis() { return retryBackoffMillis; }
    public boolean failOnUploadErrors() { return failOnUploadErrors; }
    public boolean writeOnline() { return writeOnline; }
    public boolean writeOffline() { return writeOffline; }
    public boolean updateMataggs() { return updateMataggs; }

    public static Builder builder() {
        return new Builder();
    }

    public static final class Builder {
        private String clientId;
        private String clientSecret;
        private String apiServer;
        private String environmentId;
        private String queryServer;
        private String branch;
        private int batchSize = 1_000;
        private long flushIntervalMillis = 5_000;
        private long uploadTimeoutMillis = 30_000;
        private int maxRetries = 3;
        private long retryBackoffMillis = 500;
        private boolean failOnUploadErrors = true;
        private boolean writeOnline = true;
        private boolean writeOffline = false;
        private boolean updateMataggs = false;

        /** Chalk client id (required). */
        public Builder clientId(String v) { this.clientId = v; return this; }

        /** Chalk client secret (required). */
        public Builder clientSecret(String v) { this.clientSecret = v; return this; }

        /** API server for token exchange. Defaults to {@code https://api.chalk.ai}. */
        public Builder apiServer(String v) { this.apiServer = v; return this; }

        /** Target environment id. Defaults to the token's primary environment. */
        public Builder environmentId(String v) { this.environmentId = v; return this; }

        /** Override the gRPC query/engine server. Defaults to the engine resolved from the token. */
        public Builder queryServer(String v) { this.queryServer = v; return this; }

        /** Target a branch deployment instead of production. */
        public Builder branch(String v) { this.branch = v; return this; }

        /** Flush when this many rows are buffered. Default 1000. */
        public Builder batchSize(int v) { this.batchSize = v; return this; }

        /** Flush a non-empty buffer at least this often, in millis. Default 5000. */
        public Builder flushInterval(Duration v) { this.flushIntervalMillis = v.toMillis(); return this; }

        /** Per-call upload deadline. Default 30s. */
        public Builder uploadTimeout(Duration v) { this.uploadTimeoutMillis = v.toMillis(); return this; }

        /** Retries per batch on transient failures (in addition to the first attempt). Default 3. */
        public Builder maxRetries(int v) { this.maxRetries = v; return this; }

        /** Base backoff between retries, in millis (doubled each attempt). Default 500. */
        public Builder retryBackoff(Duration v) { this.retryBackoffMillis = v.toMillis(); return this; }

        /**
         * When true (default), a batch whose response carries engine data-level errors fails the sink.
         *
         * <p><b>Poison-pill warning:</b> data-level errors (e.g. a bad feature type) are
         * <em>deterministic</em> — unlike transient transport errors, replaying the same batch after a
         * checkpoint restart reproduces the same error, wedging the pipeline in a restart loop with no
         * forward progress. If your stream may contain individually-invalid rows, either fix them
         * upstream or set this {@code false} to log a WARN and drop the rejected rows (at-least-once
         * for the rest; the bad rows are lost).
         */
        public Builder failOnUploadErrors(boolean v) { this.failOnUploadErrors = v; return this; }

        /** Write to the online store. Default true. */
        public Builder writeOnline(boolean v) { this.writeOnline = v; return this; }

        /**
         * Also write to the offline store. Default false. Requires a chalk-java version whose
         * {@code UploadFeaturesParams} exposes write targets (see README "Write targets").
         */
        public Builder writeOffline(boolean v) { this.writeOffline = v; return this; }

        /**
         * Update materialized (streaming) aggregations on upload. Default false. Requires a
         * chalk-java version whose {@code UploadFeaturesParams} exposes write targets.
         */
        public Builder updateMataggs(boolean v) { this.updateMataggs = v; return this; }

        public ChalkSinkConfig build() {
            if (clientId == null || clientId.isEmpty()) {
                throw new IllegalArgumentException("clientId is required");
            }
            if (clientSecret == null || clientSecret.isEmpty()) {
                throw new IllegalArgumentException("clientSecret is required");
            }
            if (batchSize <= 0) {
                throw new IllegalArgumentException("batchSize must be > 0, got " + batchSize);
            }
            if (maxRetries < 0) {
                throw new IllegalArgumentException("maxRetries must be >= 0, got " + maxRetries);
            }
            if (flushIntervalMillis < 0) {
                throw new IllegalArgumentException("flushInterval must be >= 0");
            }
            if (uploadTimeoutMillis <= 0) {
                throw new IllegalArgumentException("uploadTimeout must be > 0");
            }
            if (retryBackoffMillis < 0) {
                throw new IllegalArgumentException("retryBackoff must be >= 0");
            }
            // Fail fast at job-construction time (not later on the TaskManager) for write targets the
            // pinned chalk-java can't honor. See README "Write targets".
            if (writeOffline || updateMataggs || !writeOnline) {
                throw new IllegalArgumentException(
                        "custom write targets (writeOffline/updateMataggs/writeOnline=false) are not "
                                + "supported by the current chalk-java dependency (online store only). "
                                + "Remove them, or upgrade chalk-java once it exposes UploadFeaturesOptions.");
            }
            return new ChalkSinkConfig(this);
        }
    }
}
