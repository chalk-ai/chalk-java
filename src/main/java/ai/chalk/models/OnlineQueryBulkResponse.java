package ai.chalk.models;

import ai.chalk.exceptions.ChalkException;
import ai.chalk.exceptions.ClientException;
import ai.chalk.internal.bytes.BytesProcessor;
import lombok.AllArgsConstructor;

import java.util.HashMap;
import java.util.Map;



@AllArgsConstructor
public class OnlineQueryBulkResponse {
    Map<String, OnlineQueryResultFeather> queryResults;

    public static OnlineQueryBulkResponse fromBytes(byte[] bytes) throws ChalkException {
        Map<String, Object> res;
        try {

            res = BytesProcessor.unmarshal(bytes);
        } catch (Exception e) {
            throw new ClientException("failed to unmarshal bytes into OnlineQueryBulkResponse", e);
        }

        Map<String, OnlineQueryResultFeather> resultFeatherMap = new HashMap<>();
        if (res.containsKey("query_results_bytes")) {
            byte[] queryResultsBytes = (byte[]) res.get("query_results_bytes");
            try {

                Map<String, Object> resultBytesMap = BytesProcessor.unmarshal(queryResultsBytes);
                for (Map.Entry<String, Object> entry : resultBytesMap.entrySet()) {
                    String key = entry.getKey();
                    byte[] value = (byte[]) entry.getValue();
                    OnlineQueryResultFeather featherResult = OnlineQueryResultFeather.fromBytes(value);
                    resultFeatherMap.put(key, featherResult);
                }
            } catch (Exception e) {
                throw new ClientException("failed to unmarshal bytes into OnlineQueryBulkResponse", e);
            }
        } else {
            throw new ClientException("missing key 'query_results_bytes' in unmarshalled bytes");
        }

        return new OnlineQueryBulkResponse(resultFeatherMap);

    }


}
