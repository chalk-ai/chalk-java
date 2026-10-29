package ai.chalk.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * The result of triggering an aggregate backfill.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AggregateBackfillResponse {
    /**
     * The backfill that was created, or null when the request was a {@code planOnly}
     * dry run. A dry run creates nothing, so there is no id to poll.
     */
    @Nullable
    private AggregateBackfillJob job;
    /**
     * The planner's split of the request, one entry per sub-backfill, each with its
     * cost estimate.
     */
    private List<AggregateBackfillPlan> subBackfills;

    /**
     * Every aggregate feature covered by the request, across all sub-backfills, in order
     * of first appearance.
     */
    public List<String> getFeatures() {
        Set<String> features = new LinkedHashSet<>();
        for (AggregateBackfillPlan subBackfill : this.subBackfills) {
            features.addAll(subBackfill.getFeatures());
        }
        return new ArrayList<>(features);
    }
}
