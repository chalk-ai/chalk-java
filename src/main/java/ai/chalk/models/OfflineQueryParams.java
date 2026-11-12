package ai.chalk.models;

import lombok.Builder;
import lombok.Value;

import java.time.Duration;
import java.time.Instant;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * Parameters for an offline query. Inputs may be a Chalk SQL query, an existing
 * Parquet URI, or omitted to sample the offline store. Results are exported as Parquet.
 * Local input upload and loading result files into Java tables are not supported.
 */
@Value
@Builder(setterPrefix = "with")
public class OfflineQueryParams {
    List<String> outputs;
    List<String> requiredOutputs;
    String inputSql;
    String inputUri;
    String datasetName;
    String environmentId;
    String branch;
    Duration timeout;
    Instant lowerBound;
    Instant upperBound;
    Integer maxSamples;
    Integer numShards;
    Integer numWorkers;
    Boolean useMetaplanner;
    boolean runAsynchronously;
    boolean recomputeFeatures;
    boolean storeOnline;
    boolean storeOffline;
    Map<String, Object> plannerOptions;

    public static class OfflineQueryParamsBuilder {
        public OfflineQueryParamsBuilder withOutputs(List<String> outputs) {
            this.outputs = outputs;
            return this;
        }

        public OfflineQueryParamsBuilder withRequiredOutputs(List<String> outputs) {
            this.requiredOutputs = outputs;
            return this;
        }

        public OfflineQueryParamsBuilder withOutputs(String... outputs) {
            this.outputs = Arrays.asList(outputs);
            return this;
        }

        public OfflineQueryParamsBuilder withRequiredOutputs(String... outputs) {
            this.requiredOutputs = Arrays.asList(outputs);
            return this;
        }
    }
}
