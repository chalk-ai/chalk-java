package ai.chalk.ai.chalk.exceptions;

import ai.chalk.internal.request.models.ChalkHttpException;

public class HttpException extends ChalkException {
    public String detail;
    public String Trace;
    public ServerError[] errors;
    public HttpException(ChalkHttpException) {
        super(message);
    }
}

