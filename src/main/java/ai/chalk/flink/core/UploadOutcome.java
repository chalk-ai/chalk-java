package ai.chalk.flink.core;

import java.util.Collections;
import java.util.List;

/**
 * Transport-agnostic result of one {@code upload_features} call. Decouples the batching logic (and
 * its unit tests) from the Chalk Java client's Lombok-generated result type.
 */
public final class UploadOutcome {

    private final String operationId;
    private final List<String> errors;

    public UploadOutcome(String operationId, List<String> errors) {
        this.operationId = operationId;
        this.errors = errors == null ? Collections.emptyList() : errors;
    }

    /** Server-assigned id for the upload operation, or {@code null} if none was returned. */
    public String operationId() {
        return operationId;
    }

    /** Data-level errors reported by the engine (e.g. schema/validation failures). Never null. */
    public List<String> errors() {
        return errors;
    }

    public boolean isSuccess() {
        return errors.isEmpty();
    }
}
