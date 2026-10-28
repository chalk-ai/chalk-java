package ai.chalk.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Nullable;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * One sub-backfill that the planner split an aggregate backfill request into.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AggregateBackfillPlan {
    /** The aggregate features this sub-backfill computes. */
    private List<String> features;
    /** The planner's cost estimate for this sub-backfill. */
    private AggregateBackfillCostEstimate estimate;
    /** The resolver this sub-backfill runs, if it resolves from a resolver. */
    @Nullable
    private String resolver;
    /** The feature this sub-backfill buckets on. */
    @Nullable
    private String datetimeFeature;
    /** The start of the time range this sub-backfill covers, if bounded. */
    @Nullable
    private ZonedDateTime lowerBound;
    /** The end of the time range this sub-backfill covers, if bounded. */
    @Nullable
    private ZonedDateTime upperBound;
    /** The width of each tile bucket this sub-backfill writes. */
    @Nullable
    private Duration bucketDuration;
    /** The longest retention across the aggregations this sub-backfill serves. */
    @Nullable
    private Duration maxRetention;
    /** The features this sub-backfill groups by. */
    private List<String> groupBy;
    /** A human-readable description of the filters applied to the source data. */
    @Nullable
    private String filtersDescription;
    /** The SQL this sub-backfill runs to resolve event data, if it resolves from SQL. */
    @Nullable
    private String inputSql;
}
