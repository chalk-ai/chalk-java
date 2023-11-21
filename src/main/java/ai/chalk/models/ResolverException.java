package ai.chalk.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResolverException {
    // The name of the class of the exception.
    private String kind;

    // The message taken from the exception.
    private String message;

    // The stacktrace produced by the code.
    private String stacktrace;

    @Override
    public String toString() {
        return "ResolverException{" +
                "kind='" + kind + '\'' +
                ", message='" + message + '\'' +
                ", stacktrace='" + stacktrace + '\'' +
                '}';
    }
}