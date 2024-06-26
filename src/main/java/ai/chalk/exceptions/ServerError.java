package ai.chalk.exceptions;

import ai.chalk.models.ErrorCode;
import ai.chalk.models.ErrorCodeCategory;
import ai.chalk.models.ResolverException;
import lombok.*;

/**
 * ServerError is an error that occurred in Chalk's server,
 * for example, when a resolver unexpectedly fails to run.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ServerError {

    /**
     * The type of the error.
     */
    private ErrorCode code;

    /**
     * The category of the error, given in the type field for
     * the error codes. This will be one of "REQUEST", "NETWORK",
     * and "FIELD".
     */
    private ErrorCodeCategory category;

    /**
     * A readable description of the error message.
     */
    private String message;

    /**
     * The exception that caused the failure, if applicable.
     */
    private ResolverException exception;

    /**
     * The fully qualified name of the failing feature, e.g.
     * `user.identity.has_voip_phone`.
     */
    private String feature;

    /**
     * The fully qualified name of the failing resolver, e.g.
     * `my.project.get_fraud_score`.
     */
    private String resolver;
}
