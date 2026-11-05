package ai.chalk.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.annotation.Nullable;
import java.time.Duration;


/**
 * Parameters for looking up an aggregate backfill, e.g. to poll its status.
 */
@AllArgsConstructor @Getter
public class GetAggregateBackfillJobParams {
    /**
     * The aggregate backfill id, as returned by {@code AggregateBackfillResponse.getJob().getId()}.
     */
    private final String aggregateBackfillId;
    @Nullable
    private final String environmentId;
    @Nullable
    private final Duration timeout;

    @AllArgsConstructor
    @NoArgsConstructor
    public static class Builder {
        protected String aggregateBackfillId;
        protected String environmentId;
        protected Duration timeout;

        public GetAggregateBackfillJobParams build() {
            return new GetAggregateBackfillJobParams(
                this.aggregateBackfillId,
                this.environmentId,
                this.timeout);
        }

        public Builder withAggregateBackfillId(String aggregateBackfillId) {
            this.aggregateBackfillId = aggregateBackfillId;
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
