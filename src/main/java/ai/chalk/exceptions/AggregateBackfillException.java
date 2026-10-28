package ai.chalk.exceptions;

import lombok.Getter;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Exception thrown when the server fails to plan or create an aggregate backfill.
 */
@Getter
public class AggregateBackfillException extends ChalkException {
    /**
     * The server's description of the failure, if it gave one.
     */
    @Nullable
    private final String detail;
    /**
     * The errors the server reported, if it reported structured errors.
     */
    private final List<ServerError> errors;

    public AggregateBackfillException(String message, @Nullable String detail) {
        this(message, detail, List.of(), null);
    }

    public AggregateBackfillException(String message, List<ServerError> errors) {
        this(message, null, errors, null);
    }

    public AggregateBackfillException(
            String message,
            @Nullable String detail,
            List<ServerError> errors,
            @Nullable Throwable cause
    ) {
        super(detail == null || detail.isEmpty() ? message : message + " " + detail, cause);
        this.detail = detail;
        this.errors = errors;
    }
}
