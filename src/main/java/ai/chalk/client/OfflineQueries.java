package ai.chalk.client;

import ai.chalk.exceptions.ClientException;
import ai.chalk.models.OfflineQueryParams;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/** Translation to the existing /v4/offline_query JSON contract. */
final class OfflineQueries {
    private OfflineQueries() {}

    static Map<String, Object> request(OfflineQueryParams params) throws ClientException {
        if (params == null) {
            throw new ClientException("Offline query parameters are required");
        }
        if ((params.getOutputs() == null || params.getOutputs().isEmpty())
                && (params.getRequiredOutputs() == null || params.getRequiredOutputs().isEmpty())) {
            throw new ClientException("At least one output or required output is required");
        }
        if (params.getInputSql() != null && params.getInputUri() != null) {
            throw new ClientException("Specify only one of inputSql and inputUri");
        }
        if ((params.getNumShards() != null && params.getNumShards() < 1)
                || (params.getNumWorkers() != null && params.getNumWorkers() < 1)) {
            throw new ClientException("numShards and numWorkers must be positive");
        }
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("output", params.getOutputs() == null ? List.of() : params.getOutputs());
        body.put("required_output", params.getRequiredOutputs() == null ? List.of() : params.getRequiredOutputs());
        body.put("destination_format", "PARQUET");
        if (params.getInputSql() != null) {
            body.put("input", Map.of("input_sql", params.getInputSql()));
        } else if (params.getInputUri() != null) {
            body.put("input", Map.of("parquet_uri", params.getInputUri()));
        }
        put(body, "dataset_name", params.getDatasetName());
        put(body, "branch", params.getBranch());
        put(body, "observed_at_lower_bound", params.getLowerBound() == null ? null : params.getLowerBound().toString());
        put(body, "observed_at_upper_bound", params.getUpperBound() == null ? null : params.getUpperBound().toString());
        put(body, "max_samples", params.getMaxSamples());
        put(body, "num_shards", params.getNumShards());
        put(body, "num_workers", params.getNumWorkers());
        put(body, "use_metaplanner", params.getUseMetaplanner());
        put(body, "planner_options", params.getPlannerOptions());
        body.put("use_multiple_computers", params.isRunAsynchronously()
                || params.getNumShards() != null || params.getNumWorkers() != null
                || Boolean.TRUE.equals(params.getUseMetaplanner()));
        body.put("recompute_features", params.isRecomputeFeatures());
        body.put("store_online", params.isStoreOnline());
        body.put("store_offline", params.isStoreOffline());
        return body;
    }

    private static void put(Map<String, Object> body, String key, Object value) {
        if (value != null) {
            body.put(key, value);
        }
    }
}
