package chalk.internal.request.models;

import chalk.exceptions.ServerError;
import lombok.Data;

@Data
public class ChalkHttpException {
    private String detail;
    private ServerError[] errors;
    private String trace;

    public String toString() {
        String message = "Please contact Chalk Support with the Trace ID";
        if (this.detail.contains(message)) {
            return this.detail;
        }
        return this.detail +
                String.format(" - %s: %s", message, this.trace);
    }
}
