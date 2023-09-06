package ai.chalk.models;

import ai.chalk.exceptions.ChalkException;
import ai.chalk.exceptions.ClientException;
import ai.chalk.internal.bytes.BytesProcessor;

import java.util.Map;

public class OnlineQueryBulkResponse {
    Map<String, OnlineQueryResultFeather> queryResults;

    public OnlineQueryBulkResponse fromBytes(byte[] bytes) throws ChalkException {
        Map<String, Object> res;
        try {
            res = BytesProcessor.unmarshal(bytes);
        } catch (Exception e) {
            throw new ClientException("failed to unmarshal bytes into OnlineQueryBulkResponse", e);
        }

        if (res.containsKey("query_results_bytes")) {
            byte[] queryResultsBytes = (byte[]) res.get("query_results_bytes");
            try {
                Map<String, Object> queryResults = BytesProcessor.unmarshal(queryResultsBytes);

                for (Map.Entry<String, Object> entry : queryResults.entrySet()) {
                    String key = entry.getKey();
                    byte[] value = (byte[]) entry.getValue();
                    OnlineQueryResultFeather featherResult = OnlineQueryResultFeather.fromBytes(value);
                    this.queryResults.put(key, featherResult);
                }
            } catch (Exception e) {
                throw new ClientException("failed to unmarshal bytes into OnlineQueryBulkResponse", e);
            }
            return this;
        } else {
            throw new ClientException("missing key 'query_results_bytes' in unmarshalled bytes");
        }

    }


}
