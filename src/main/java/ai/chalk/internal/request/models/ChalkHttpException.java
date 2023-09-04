package ai.chalk.internal.request.models;

import ai.chalk.ai.chalk.exceptions.ServerError;
import lombok.Data;

@Data
public class ChalkHttpException {
    private String detail;
    private ServerError[] errors;
    private String trace;

    public String toString() {
        return this.detail +
                String.format(" - Please contact Chalk Support with the Trace ID: %s", this.trace);
    }
}
