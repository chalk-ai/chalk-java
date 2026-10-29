package ai.chalk.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.annotation.Nullable;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Parameters for triggering one or more aggregate backfill jobs. Mirrors the parameters
 * of {@code ChalkClient.trigger_aggregate_backfill} in the Python client, and of the
 * {@code chalk aggregate backfill} CLI command.
 */
@AllArgsConstructor @Getter
public class AggregateBackfillParams {
    /**
     * The fully-qualified names of the aggregate features to backfill.
     */
    private final List<String> features;
    /**
     * The lower bound of the time range to backfill.
     */
    @Nullable
    private final ZonedDateTime lowerBound;
    /**
     * The upper bound of the time range to backfill.
     */
    @Nullable
    private final ZonedDateTime upperBound;
    /**
     * The resolver to use for the backfill. Mutually exclusive with {@code inputSql}.
     */
    @Nullable
    private final String resolver;
    /**
     * Resolver tags to prefer when running the backfill.
     */
    @Nullable
    private final List<String> queryTags;
    /**
     * If true, store materialized aggregate values in the offline store. Requires both
     * {@code lowerBound} and {@code upperBound}. If null, the server default applies.
     */
    @Nullable
    private final Boolean storeOffline;
    /**
     * If true, empty tile spans are silently skipped instead of raising an error.
     * Defaults to true, but is only meaningful together with {@code storeOffline = true}:
     * without an offline target it is always sent as false.
     */
    private final boolean allowEmptyTiles;
    /**
     * If true, execute the underlying SQL source to determine the exact number of rows
     * that need to migrate.
     */
    private final boolean exact;
    /**
     * If true, enable profiling while running the backfill jobs.
     */
    private final boolean enableProfiling;
    /**
     * Resource group to use for the created backfill jobs.
     */
    @Nullable
    private final String resourceGroup;
    /**
     * Chalk SQL query to use to resolve event data. Mutually exclusive with {@code resolver}.
     */
    @Nullable
    private final String inputSql;
    /**
     * Maximum number of bucket-aligned, time-sharded jobs to split each backfill job's
     * window into. Must be greater than 1 when provided. The server chooses the actual
     * count (at most this many) so that all shards stay aligned to the aggregation's
     * bucket grid. Useful when a single job over the full window would run out of memory
     * or disk. Unset preserves the single-job behavior.
     */
    @Nullable
    private final Integer numShards;
    /**
     * If true, validate the request and return the planner's split with cost estimates
     * without creating anything. The response's job is absent, and there is no backfill
     * id to poll. The same validation runs as for a real backfill, so a request that plans
     * cleanly will also create cleanly.
     */
    private final boolean planOnly;
    @Nullable
    private final String environmentId;
    @Nullable
    private final Duration timeout;

    @AllArgsConstructor
    @NoArgsConstructor
    public static class Builder {
        protected List<String> features;
        protected ZonedDateTime lowerBound;
        protected ZonedDateTime upperBound;
        protected String resolver;
        protected List<String> queryTags;
        protected Boolean storeOffline;
        protected boolean allowEmptyTiles = true;
        protected boolean exact = false;
        protected boolean enableProfiling = false;
        protected String resourceGroup;
        protected String inputSql;
        protected Integer numShards;
        protected boolean planOnly = false;
        protected String environmentId;
        protected Duration timeout;

        public AggregateBackfillParams build() {
            return new AggregateBackfillParams(
                this.features,
                this.lowerBound,
                this.upperBound,
                this.resolver,
                this.queryTags,
                this.storeOffline,
                this.allowEmptyTiles,
                this.exact,
                this.enableProfiling,
                this.resourceGroup,
                this.inputSql,
                this.numShards,
                this.planOnly,
                this.environmentId,
                this.timeout);
        }

        public Builder withFeatures(List<String> features) {
            this.features = features == null ? null : new ArrayList<>(features);
            return this;
        }

        public Builder withFeatures(String... features) {
            return this.withFeatures(Arrays.asList(features));
        }

        public Builder withLowerBound(ZonedDateTime lowerBound) {
            this.lowerBound = lowerBound;
            return this;
        }

        public Builder withUpperBound(ZonedDateTime upperBound) {
            this.upperBound = upperBound;
            return this;
        }

        public Builder withResolver(String resolver) {
            this.resolver = resolver;
            return this;
        }

        public Builder withQueryTags(List<String> queryTags) {
            this.queryTags = queryTags;
            return this;
        }

        public Builder withStoreOffline(Boolean storeOffline) {
            this.storeOffline = storeOffline;
            return this;
        }

        /** Defaults to {@code true}; only sent when {@code storeOffline} is true. */
        public Builder withAllowEmptyTiles(boolean allowEmptyTiles) {
            this.allowEmptyTiles = allowEmptyTiles;
            return this;
        }

        public Builder withExact(boolean exact) {
            this.exact = exact;
            return this;
        }

        public Builder withEnableProfiling(boolean enableProfiling) {
            this.enableProfiling = enableProfiling;
            return this;
        }

        public Builder withResourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }

        public Builder withInputSql(String inputSql) {
            this.inputSql = inputSql;
            return this;
        }

        public Builder withNumShards(Integer numShards) {
            this.numShards = numShards;
            return this;
        }

        public Builder withPlanOnly(boolean planOnly) {
            this.planOnly = planOnly;
            return this;
        }

        public Builder withEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }

        public Builder withTimeout(Duration timeout) {
            this.timeout = timeout;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }
}
