package chalk.exceptions;

/**
 * Base class for all Chalk exceptions.
 */
public abstract class ChalkException extends Exception {
    public ChalkException(String message) {
        super(message);
    }

    public ChalkException(String message, Throwable cause) {
        super(message, cause);
    }
}
