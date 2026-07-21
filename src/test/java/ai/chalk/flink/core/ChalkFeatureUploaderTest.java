package ai.chalk.flink.core;

import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ChalkFeatureUploaderTest {

    /** Captures every columnar batch handed to it; optionally scripts failures/errors. */
    private static final class FakeClient implements ChalkUploadClient {
        final List<Map<String, List<?>>> uploads = new ArrayList<>();
        int failFirstN = 0;               // throw `failure` this many times, then succeed
        RuntimeException failure = new StatusRuntimeException(Status.UNAVAILABLE); // retryable default
        List<String> errorsToReturn = List.of();
        boolean closed = false;
        final AtomicInteger attempts = new AtomicInteger();

        @Override
        public UploadOutcome upload(Map<String, List<?>> columnarInputs) throws Exception {
            attempts.incrementAndGet();
            if (failFirstN > 0) {
                failFirstN--;
                throw failure;
            }
            uploads.add(columnarInputs);
            return new UploadOutcome("op-" + uploads.size(), errorsToReturn);
        }

        @Override
        public void close() {
            closed = true;
        }
    }

    private static ChalkSinkConfig config(ChalkSinkConfig.Builder tweak) {
        return tweak.clientId("cid").clientSecret("secret").build();
    }

    @Test
    void toColumnarPivotsAndNullPads() {
        List<Map<String, Object>> rows = List.of(
                Map.of("user.id", 1L, "user.score", 0.9),
                Map.of("user.id", 2L)); // omits user.score
        Map<String, List<?>> columnar = ChalkFeatureUploader.toColumnar(rows);

        assertEquals(List.of(1L, 2L), columnar.get("user.id"));
        assertEquals(2, columnar.get("user.score").size());
        assertEquals(0.9, columnar.get("user.score").get(0));
        assertNull(columnar.get("user.score").get(1)); // null-padded
    }

    @Test
    void flushesWhenBatchSizeReached() {
        FakeClient fake = new FakeClient();
        ChalkFeatureUploader uploader = new ChalkFeatureUploader(
                config(ChalkSinkConfig.builder().batchSize(2)), fake);

        uploader.add(Map.of("user.id", 1L));
        assertEquals(1, uploader.bufferedRows());
        assertEquals(0, fake.uploads.size());

        uploader.add(Map.of("user.id", 2L)); // hits batchSize=2 -> flush
        assertEquals(0, uploader.bufferedRows());
        assertEquals(1, fake.uploads.size());
        assertEquals(2, fake.uploads.get(0).get("user.id").size());
    }

    @Test
    void closeFlushesRemainderAndClosesClient() {
        FakeClient fake = new FakeClient();
        ChalkFeatureUploader uploader = new ChalkFeatureUploader(
                config(ChalkSinkConfig.builder().batchSize(1000)), fake);

        uploader.add(Map.of("user.id", 7L));
        assertEquals(0, fake.uploads.size()); // below batch size, not yet flushed

        uploader.close();
        assertEquals(1, fake.uploads.size());
        assertTrue(fake.closed);
    }

    @Test
    void retriesTransientFailureThenSucceeds() {
        FakeClient fake = new FakeClient();
        fake.failFirstN = 2; // two transient (UNAVAILABLE) throws, third attempt succeeds
        ChalkFeatureUploader uploader = new ChalkFeatureUploader(
                config(ChalkSinkConfig.builder().batchSize(1).maxRetries(3)
                        .retryBackoff(Duration.ofMillis(1))), fake);

        uploader.add(Map.of("user.id", 1L));
        assertEquals(3, fake.attempts.get());
        assertEquals(1, fake.uploads.size());
    }

    @Test
    void throwsAfterRetriesExhausted() {
        FakeClient fake = new FakeClient();
        fake.failFirstN = 99; // always fails, transiently
        ChalkFeatureUploader uploader = new ChalkFeatureUploader(
                config(ChalkSinkConfig.builder().batchSize(1).maxRetries(2)
                        .retryBackoff(Duration.ofMillis(1))), fake);

        assertThrows(ChalkUploadException.class, () -> uploader.add(Map.of("user.id", 1L)));
        assertEquals(3, fake.attempts.get()); // 1 initial + 2 retries
    }

    @Test
    void failsFastOnNonRetryableError() {
        FakeClient fake = new FakeClient();
        fake.failFirstN = 99;
        fake.failure = new StatusRuntimeException(Status.INVALID_ARGUMENT); // non-retryable
        ChalkFeatureUploader uploader = new ChalkFeatureUploader(
                config(ChalkSinkConfig.builder().batchSize(1).maxRetries(5)
                        .retryBackoff(Duration.ofMillis(1))), fake);

        assertThrows(ChalkUploadException.class, () -> uploader.add(Map.of("user.id", 1L)));
        assertEquals(1, fake.attempts.get()); // no retries despite maxRetries=5
    }

    @Test
    void failsWhenResponseCarriesErrorsAndFlagSet() {
        FakeClient fake = new FakeClient();
        fake.errorsToReturn = List.of("bad type for user.score");
        ChalkFeatureUploader uploader = new ChalkFeatureUploader(
                config(ChalkSinkConfig.builder().batchSize(1).failOnUploadErrors(true)), fake);

        assertThrows(ChalkUploadException.class, () -> uploader.add(Map.of("user.id", 1L)));
    }

    @Test
    void continuesWhenResponseCarriesErrorsAndFlagUnset() {
        FakeClient fake = new FakeClient();
        fake.errorsToReturn = List.of("bad type for user.score");
        ChalkFeatureUploader uploader = new ChalkFeatureUploader(
                config(ChalkSinkConfig.builder().batchSize(1).failOnUploadErrors(false)), fake);

        uploader.add(Map.of("user.id", 1L)); // does not throw
        assertEquals(1, fake.uploads.size());
    }
}
