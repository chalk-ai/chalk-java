package ai.chalk.internal.request.models;

import ai.chalk.exceptions.ChalkException;
import ai.chalk.exceptions.ClientException;
import ai.chalk.exceptions.ServerError;
import ai.chalk.internal.arrow.FeatherProcessor;
import ai.chalk.internal.bytes.BytesConsumer;
import ai.chalk.models.QueryMeta;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import org.apache.arrow.memory.BufferAllocator;
import org.apache.arrow.vector.table.Table;

import java.nio.Buffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;


public record OnlineQueryResultFeather(Boolean hasData, Table scalarData, Map<String, Table> groupsData,
                                       ServerError[] errors, QueryMeta meta, BufferAllocator allocator) implements AutoCloseable {
    private static final Set<String> REQUIRED_KEYS = Set.of(
            "has_data",
            "scalar_data",
            "groups_data",
            "errors",
            "meta"
    );

    public static OnlineQueryResultFeather fromBytes(byte[] bytes, BufferAllocator allocator) throws ChalkException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        mapper.registerModule(new JavaTimeModule());

        Map<String, Object> res;
        try {
            res = BytesConsumer.unmarshal(bytes);
        } catch (Exception e) {
            throw new ClientException("failed to unmarshal bytes into OnlineQueryResultFeather", e);
        }

        StringJoiner missingKeys = new StringJoiner(", ");
        for (var key : REQUIRED_KEYS) {
            if (!res.containsKey(key)) {
                missingKeys.add(key);
            }
        }
        if (missingKeys.length() != 0) {
            throw new ClientException("missing keys '[%s]' in unmarshalled bytes".formatted(missingKeys.toString()));
        }

        Object errorsObj = res.get("errors");
        ServerError[] errors;
        if (errorsObj == null) {
            errors = null;
        } else if (!(errorsObj instanceof ArrayList<?> errorsStrList)) {
            throw new ClientException(String.format("malformed value 'errors' in unmarshalled bytes - expected `ArrayList` or `null` found `%s`", errorsObj.getClass().getSimpleName()));
        } else {
            errors = new ServerError[errorsStrList.size()];
            for (int i = 0; i < errorsStrList.size(); i++) {
                Object errorStrObj = errorsStrList.get(i);
                if (!(errorStrObj instanceof String errorStr)) {
                    throw new ClientException(String.format("malformed value 'errors' in unmarshalled bytes - expected an array of `String` found an array of `%s`", errorStrObj.getClass().getSimpleName()));
                }
                try {
                    errors[i] = mapper.readValue(errorStr, ServerError.class);
                } catch (Exception e) {
                    throw new ClientException(String.format("failed to unmarshal an individual error string: %s", errorStr), e);
                }
            }
        }
        Object metaStrObj = res.get("meta");
        QueryMeta meta;
        if (metaStrObj == null) {
            meta = null;
        } else if (!(metaStrObj instanceof String metaStr)) {
            throw new ClientException(String.format("malformed value 'meta' in unmarshalled bytes - expected `String` or `null` found `%s`", metaStrObj.getClass().getSimpleName()));
        } else {
            try {
                meta = mapper.readValue(metaStr, QueryMeta.class);
            } catch (Exception e) {
                throw new ClientException(String.format("failed to unmarshal query meta: %s", metaStr), e);
            }
        }

        Object hasDataObj = res.get("has_data");
        if (!(hasDataObj instanceof Boolean hasDataBool)) {
            throw new ClientException("malformed value 'has_data' in unmarshalled bytes");
        }

        Table scalarData = null;
        Map<String, Table> groupsData = new HashMap<>();
        try {
            if (hasDataBool) {
                var scalarDataBytesObj = res.get("scalar_data");
                if (!(scalarDataBytesObj instanceof byte[] scalarDataBytes)) {
                    throw new ClientException("malformed value 'scalar_data' in unmarshalled bytes");
                }
                try {
                    scalarData = FeatherProcessor.convertBytesToTable(scalarDataBytes, allocator);
                } catch (Exception e) {
                    throw new ClientException("failed to convert scalar data bytes to VectorSchemaRoot", e);
                }

                var groupsDataBytesObj = res.get("groups_data");
                if (!(groupsDataBytesObj instanceof byte[] groupsDataBytes)) {
                    throw new ClientException(String.format("malformed value 'groups_data' in unmarshalled bytes - expected `byte[]` found `%s`", groupsDataBytesObj.getClass().getName()));
                }

                Map<String, Object> groupsDataMap;
                try {
                    groupsDataMap = BytesConsumer.unmarshal(groupsDataBytes);
                } catch (Exception e) {
                    throw new ClientException("failed to unmarshal groups data bytes", e);
                }

                for (Map.Entry<String, Object> entry : groupsDataMap.entrySet()) {
                    String key = entry.getKey();
                    if (!(entry.getValue() instanceof byte[] value)) {
                        throw new ClientException(String.format("malformed value 'groups_data' in unmarshalled bytes - expected `byte[]` found `%s`", entry.getValue().getClass().getSimpleName()));
                    }
                    try {
                        Table table = FeatherProcessor.convertBytesToTable(value, allocator);
                        groupsData.put(key, table);
                    } catch (Exception e) {
                        throw new ClientException(String.format("failed to convert data for has-many feature '%s' bytes to VectorSchemaRoot", key), e);
                    }
                }
            }

            return new OnlineQueryResultFeather(
                    hasDataBool,
                    scalarData,
                    groupsData,
                    errors,
                    meta,
                    allocator
            );
        } catch (Exception e) {
            if (scalarData != null) scalarData.close();
            for (Table table : groupsData.values()) {
                table.close();
            }
            allocator.close();
            throw e;
        }
    }

    @Override
    public void close() {
        if (scalarData != null) {
            scalarData.close();
        }
        for (Table table : groupsData.values()) {
            table.close();
        }
        allocator.close();
    }
}
