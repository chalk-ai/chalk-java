package ai.chalk.models;


import lombok.Getter;

@Getter
public enum ErrorCode {

    /**
     * Indicates the query contained features that do not exist.
     */
    PARSE_FAILED("PARSE_FAILED"),

    /**
     * Indicates a resolver was required as part of running the dependency graph that could not be found.
     */
    RESOLVER_NOT_FOUND("RESOLVER_NOT_FOUND"),

    /**
     * Indicates the query is invalid. All supplied features need to be rooted in the same top-level entity.
     */
    INVALID_QUERY("INVALID_QUERY"),

    /**
     * Indicates a feature value did not match the expected schema (e.g. `incompatible type "int"; expected "str"`).
     */
    VALIDATION_FAILED("VALIDATION_FAILED"),

    /**
     * Indicates the resolver for a feature errored.
     */
    RESOLVER_FAILED("RESOLVER_FAILED"),

    /**
     * Indicates the resolver for a feature timed out.
     */
    RESOLVER_TIMED_OUT("RESOLVER_TIMED_OUT"),

    /**
     * Indicates a crash in a resolver that was to produce an input for the resolver crashed, and so the resolver could not run.
     */
    UPSTREAM_FAILED("UPSTREAM_FAILED"),

    /**
     * Indicates the request was submitted with an invalid authentication header.
     */
    UNAUTHENTICATED("UNAUTHENTICATED"),

    /**
     * Indicates the supplied credentials do not provide the right authorization to execute the request.
     */
    UNAUTHORIZED("UNAUTHORIZED"),

    /**
     * Indicates an unspecified error occurred.
     */
    INTERNAL_SERVER_ERROR("INTERNAL_SERVER_ERROR"),

    /**
     * Indicates the operation was cancelled, typically by the caller.
     */
    CANCELLED("CANCELLED"),

    /**
     * Indicates the deadline expired before the operation could complete.
     */
    DEADLINE_EXCEEDED("DEADLINE_EXCEEDED");

    private final String value;

    ErrorCode(String value) {
        this.value = value;
    }
}