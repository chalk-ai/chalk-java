package ai.chalk.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Nullable;
import java.time.ZonedDateTime;
import java.util.List;

/**
 * The aggregate backfill row covering every job a single request launched.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AggregateBackfillJob {
    /** The aggregate backfill id. Use this to poll the backfill's status. */
    private String id;
    /** The current status of the backfill. */
    private AggregateBackfillStatus status;
    /** Every aggregate feature this backfill covers. */
    private List<String> features;
    /** Every resolver this backfill runs. */
    private List<String> resolvers;
    /** The resolver tags the backfill's jobs run with. */
    private List<String> queryTags;
    /** The environment the backfill runs in. */
    @Nullable
    private String environmentId;
    /** The resolver the request named, if it named one. */
    @Nullable
    private String resolver;
    /** The id of the user or service token that triggered the backfill. */
    @Nullable
    private String agentId;
    /** The deployment the backfill's jobs run against. */
    @Nullable
    private String deploymentId;
    /** The hash of the plan the backfill was created from. */
    @Nullable
    private String planHash;
    /** The id of the cron aggregate backfill that created this backfill, if any. */
    @Nullable
    private String cronAggregateBackfillId;
    /** The name of the cron aggregate backfill that created this backfill, if any. */
    @Nullable
    private String cronAggregateBackfillName;
    /** When the backfill was created. */
    @Nullable
    private ZonedDateTime createdAt;
    /** When the backfill was last updated. */
    @Nullable
    private ZonedDateTime updatedAt;
}
