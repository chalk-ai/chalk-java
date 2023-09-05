package ai.chalk.exceptions;

public class ClientException extends ChalkException {
    public ClientException(String message) {
        super(message);
    }

    public ClientException(String message, Throwable cause) {
        super(message, cause);
    }
}

