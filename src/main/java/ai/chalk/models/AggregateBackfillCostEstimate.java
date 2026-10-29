package ai.chalk.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Nullable;
import java.time.Duration;

/**
 * The planner's cost estimate for a single sub-backfill.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AggregateBackfillCostEstimate {
    /** The largest number of tile buckets the sub-backfill could write. */
    private long maxBuckets;
    /** The number of tile buckets the sub-backfill is expected to write. */
    private long expectedBuckets;
    /** The number of bytes the sub-backfill is expected to write. */
    private long expectedBytes;
    /** The expected storage cost, in dollars, of the data the sub-backfill writes. */
    private double expectedStorageCost;
    /** How long the sub-backfill is expected to take, if the planner could estimate it. */
    @Nullable
    private Duration expectedRuntime;
}
