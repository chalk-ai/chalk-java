package chalk.exceptions;

import chalk.internal.request.models.ChalkHttpException;
import lombok.Getter;


/**
 * Exception thrown when the server errors out from a cause
 * that is not directly related to the Chalk query itself.
 */
@Getter
public class ServerException extends ChalkException {
    public String detail;
    public String trace;
    public ServerError[] errors;
    public int statusCode;
    public int contentLength;
    public String URL;

    public ServerException(ChalkHttpException e, int statusCode, int contentLength, String URL) {
        super(e.toString());
        this.detail = e.getDetail();
        this.trace = e.getTrace();
        this.errors = e.getErrors();
        this.statusCode = statusCode;
        this.contentLength = contentLength;
        this.URL = URL;
    }

    public ServerException(int statusCode, int contentLength, String URL) {
        super(String.format("Server Exception with status code: %d", statusCode));
        this.statusCode = statusCode;
        this.contentLength = contentLength;
        this.URL = URL;
    }
}
