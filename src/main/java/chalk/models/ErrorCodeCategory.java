package chalk.models;
import lombok.Getter;

@Getter
public enum ErrorCodeCategory {

    /**
     * Request errors are raised before the execution of your
     * resolver code. They may occur due to invalid feature
     * names in the input or a request that cannot be satisfied
     * by the resolvers you have defined.
     */
    REQUEST("REQUEST"),

    /**
     * Field errors are raised while running a feature resolver
     * for a particular field. For this type of error, you'll
     * find a feature and resolver attribute in the error type.
     * When a feature resolver crashes, you will receive a null
     * value in the response. To differentiate from a resolver
     * returning a null value and a failure in the resolver,
     * you need to check the error schema.
     */
    FIELD("FIELD"),

    /**
     * Network errors are thrown outside your resolvers.
     * For example, your request was unauthenticated,
     * connection failed, or an error occurred within Chalk.
     */
    NETWORK("NETWORK");

    private final String value;

    ErrorCodeCategory(String value) {
        this.value = value;
    }
}