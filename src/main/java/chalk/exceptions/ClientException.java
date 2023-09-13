package chalk.exceptions;

/**
 * Exception that originates from the client. For example, when
 * the client is not configured correctly, or when there is an
 * error marshalling or unmarshalling a response, etc.
 */
public class ClientException extends ChalkException {
    public ClientException(String message) {
        super(message);
    }

    public ClientException(String message, Throwable cause) {
        super(message, cause);
    }
}

