package ai.chalk.flink.core;

/**
 * Thrown when a batch of feature rows cannot be uploaded to Chalk. Propagating this out of a sink
 * causes Flink to fail the task and restart from the last checkpoint, replaying the un-acked rows.
 * Because {@code upload_features} is an upsert keyed by the primary key, that replay is safe
 * (at-least-once with idempotent effect).
 */
public class ChalkUploadException extends RuntimeException {
    public ChalkUploadException(String message) {
        super(message);
    }

    public ChalkUploadException(String message, Throwable cause) {
        super(message, cause);
    }
}
