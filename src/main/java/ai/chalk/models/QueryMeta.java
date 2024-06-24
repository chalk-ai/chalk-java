package ai.chalk.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

/**
 * QueryMeta represents metadata about a Chalk query.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QueryMeta {

    /**
     * Execution duration in seconds.
     */
    private double executionDurationS;

    /**
     * The id of the deployment that served this query.
     */
    private String deploymentId;

    /**
     * The id of the environment that served this query. Not
     * intended to be human-readable,but helpful for support.
     */
    private String environmentId;

    /**
     * The short name of the environment that served this query.
     * For example: "dev" or "prod".
     */
    private String environmentName;

    /**
     * A unique ID generated and persisted by Chalk for this
     * query. All computed features, metrics, and logs are
     * associated with this ID. Your system can store this ID
     * for audit and debugging workflows.
     */
    private String queryId;

    /**
     * At the start of query execution, Chalk computes
     * 'datetime.now()'. This value is used to timestamp
     * computed features.
     */
    private ZonedDateTime queryTimestamp;

    /**
     * Deterministic hash of the 'structure' of the query.
     * Queries that have the same input/output features will
     * typically have the same hash; changes may be observed
     * over time as we adjust implementation details.
     */
    private String queryHash;

    /**
     * Associated trace ID for this query. Instrumental for debugging.
     */
    private String traceId;
}
