package ai.chalk.ai.chalk.exceptions;

public abstract class ChalkException extends Exception {
    public ChalkException(String message) {
        super(message);
    }

    public ChalkException(String message, Throwable cause) {
        super(message, cause);
    }
}






//
//
//public class ServerException implements ChalkException {
//
//}
