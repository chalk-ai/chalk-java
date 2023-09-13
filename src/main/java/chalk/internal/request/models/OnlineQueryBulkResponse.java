package chalk.internal.request.models;

import chalk.exceptions.ChalkException;
import chalk.exceptions.ClientException;
import chalk.internal.bytes.BytesConsumer;
import chalk.models.OnlineQueryResult;
import lombok.AllArgsConstructor;

import java.util.HashMap;
import java.util.Map;



@AllArgsConstructor
public class OnlineQueryBulkResponse {
    Map<String, OnlineQueryResultFeather> queryResults;

    public static OnlineQueryBulkResponse fromBytes(byte[] bytes) throws ChalkException {
        Map<String, Object> res;
        try {

            res = BytesConsumer.unmarshal(bytes);
        } catch (Exception e) {
            throw new ClientException("failed to unmarshal bytes into OnlineQueryBulkResponse", e);
        }

        Map<String, OnlineQueryResultFeather> resultFeatherMap = new HashMap<>();
        if (res.containsKey("query_results_bytes")) {
            byte[] queryResultsBytes = (byte[]) res.get("query_results_bytes");
            try {

                Map<String, Object> resultBytesMap = BytesConsumer.unmarshal(queryResultsBytes);
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

    public OnlineQueryResult toResult() throws ChalkException {
        if (!(this.queryResults.containsKey("0"))) {
            throw new ClientException("malformed online query bulk response");
        }
        OnlineQueryResultFeather internalResult = this.queryResults.get("0");
        return new OnlineQueryResult(
                internalResult.getScalarData(),
                internalResult.getGroupsData(),
                internalResult.getErrors(),
                internalResult.getMeta()
        );
    }
}
