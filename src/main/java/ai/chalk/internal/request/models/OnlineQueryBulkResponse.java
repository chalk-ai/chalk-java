package ai.chalk.internal.request.models;

import ai.chalk.exceptions.ChalkException;
import ai.chalk.exceptions.ClientException;
import ai.chalk.internal.bytes.BytesConsumer;
import ai.chalk.models.OnlineQueryResult;
import org.apache.arrow.memory.BufferAllocator;

import java.util.HashMap;
import java.util.Map;


public record OnlineQueryBulkResponse(Map<String, OnlineQueryResultFeather> queryResults) implements AutoCloseable {
    public static OnlineQueryBulkResponse fromBytes(byte[] bytes, BufferAllocator allocator) throws ChalkException {
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
                    OnlineQueryResultFeather featherResult = OnlineQueryResultFeather.fromBytes(value, allocator);
                    resultFeatherMap.put(key, featherResult);
                }
            } catch (Exception e) {
                for (var subResult: resultFeatherMap.values()) {
                    subResult.close();
                }
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
            internalResult.scalarData(),
            internalResult.groupsData(),
            internalResult.errors(),
            internalResult.meta(),
            internalResult.allocator()
        );
    }

    @Override
    public void close() {
        for (var subResult: queryResults.values()) {
            subResult.close();
        }
    }
}
