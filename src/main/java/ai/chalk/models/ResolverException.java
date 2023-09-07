package ai.chalk.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class ResolverException {

    private String kind;        // Equivalent to Kind in the Go struct
    private String message;     // Equivalent to Message in the Go struct
    private String stacktrace;  // Equivalent to Stacktrace in the Go struct

    @Override
    public String toString() {
        return "ResolverException{" +
                "kind='" + kind + '\'' +
                ", message='" + message + '\'' +
                ", stacktrace='" + stacktrace + '\'' +
                '}';
    }
}