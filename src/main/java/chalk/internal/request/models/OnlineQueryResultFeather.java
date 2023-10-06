package chalk.internal.request.models;

import chalk.exceptions.ChalkException;
import chalk.exceptions.ClientException;
import chalk.exceptions.ServerError;
import chalk.internal.arrow.FeatherProcessor;
import chalk.internal.bytes.BytesConsumer;
import chalk.models.QueryMeta;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.apache.arrow.vector.table.Table;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


@Getter
@AllArgsConstructor
public class OnlineQueryResultFeather {
    Boolean hasData;
    Table scalarData;
    Map<String, Table> groupsData;
    ServerError[] errors;
    QueryMeta meta;

    public static OnlineQueryResultFeather fromBytes(byte[] bytes) throws ChalkException {
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

        Object hasDataObj = res.get("has_data");
        if (hasDataObj == null) {
            throw new ClientException("missing key 'has_data' in unmarshalled bytes");
        }
        if (!(hasDataObj instanceof Boolean)) {
            throw new ClientException("malformed value 'has_data' in unmarshalled bytes");
        }

        Table scalarData = null;
        Map<String, Table> groupsData = new HashMap<>();
        Boolean hasDataBool = (Boolean) hasDataObj;
        if (hasDataBool) {
            var scalarDataBytesObj = res.get("scalar_data");
            if (scalarDataBytesObj == null) {
                throw new ClientException("missing key 'scalar_data_bytes' in unmarshalled bytes");
            }
            if (!(scalarDataBytesObj instanceof byte[])) {
                throw new ClientException("malformed value 'scalar_data' in unmarshalled bytes");
            }
            byte[] scalarDataBytes = (byte[]) scalarDataBytesObj;
            try {
                scalarData = FeatherProcessor.convertBytesToTable(scalarDataBytes);
            } catch (Exception e) {
                throw new ClientException("failed to convert scalar data bytes to VectorSchemaRoot", e);
            }

            var groupsDataBytesObj = res.get("groups_data");
            if (groupsDataBytesObj == null) {
                throw new ClientException("missing key 'groups_data' in unmarshalled bytes");
            }
            if (!(groupsDataBytesObj instanceof byte[])) {
                throw new ClientException(String.format("malformed value 'groups_data' in unmarshalled bytes - expected `byte[]` found `%s`", groupsDataBytesObj.getClass().getName()));
            }
            byte[] groupsDataBytes = (byte[]) groupsDataBytesObj;

            Map<String, Object> groupsDataMap;
            try {
                groupsDataMap = BytesConsumer.unmarshal(groupsDataBytes);
            } catch (Exception e) {
                throw new ClientException("failed to unmarshal groups data bytes", e);
            }

            for (Map.Entry<String, Object> entry : groupsDataMap.entrySet()) {
                String key = entry.getKey();
                if (!(entry.getValue() instanceof byte[])) {
                    throw new ClientException(String.format("malformed value 'groups_data' in unmarshalled bytes - expected `byte[]` found `%s`", entry.getValue().getClass().getSimpleName()));
                }
                byte[] value = (byte[]) entry.getValue();
                Table table = null;
                try {
                    table = FeatherProcessor.convertBytesToTable(value);
                } catch (Exception e) {
                    throw new ClientException("failed to convert groups data bytes to VectorSchemaRoot", e);
                }
                groupsData.put(key, table);
            }
        }

        Object errorsObj = res.get("errors");
        ServerError[] errors;
        if (!(res.containsKey("errors"))) {
            throw new ClientException("missing key 'errors' in unmarshalled bytes");
        }
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
        if (!(res.containsKey("meta"))) {
            throw new ClientException("missing key 'meta' in unmarshalled bytes");
        }
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

        return new OnlineQueryResultFeather(
                hasDataBool,
                scalarData,
                groupsData,
                errors,
                meta
        );
    }
}
