package ai.chalk.exceptions;

import ai.chalk.internal.request.models.ChalkHttpException;
import lombok.Getter;

@Getter
public class HttpException extends ChalkException {
    public String detail;
    public String trace;
    public ServerError[] errors;
    public int statusCode;
    public int contentLength;
    public String URL;

    public HttpException(ChalkHttpException e, int statusCode, int contentLength, String URL) {
        super(e.toString());
        this.detail = e.getDetail();
        this.trace = e.getTrace();
        this.errors = e.getErrors();
        this.statusCode = statusCode;
        this.contentLength = contentLength;
        this.URL = URL;
    }

    public HttpException(int statusCode, int contentLength, String URL) {
        super(String.format("HTTP Error: %d", statusCode));
        this.statusCode = statusCode;
        this.contentLength = contentLength;
        this.URL = URL;
    }
}
