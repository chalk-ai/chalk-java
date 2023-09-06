package ai.chalk.models;

import ai.chalk.exceptions.ChalkException;
import ai.chalk.exceptions.ClientException;
import ai.chalk.exceptions.ServerError;
import ai.chalk.feather.FeatherProcessor;
import ai.chalk.internal.bytes.BytesProcessor;
import org.apache.arrow.vector.VectorSchemaRoot;

import java.util.Map;

public class OnlineQueryResultFeather {
    Boolean hasData;
    VectorSchemaRoot scalarData;
    Map<String, VectorSchemaRoot> groupsData;
    ServerError[] errors;
    QueryMeta meta;

    public static OnlineQueryResultFeather fromBytes(byte[] bytes) throws ChalkException {
        Map<String, Object> res;
        try {
            res = BytesProcessor.unmarshal(bytes);
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

        Boolean hasDataBool = (Boolean) hasDataObj;
        if (hasDataBool) {
            var scalarDataBytesObj = res.get("scalar_data_bytes");
            if (scalarDataBytesObj == null) {
                throw new ClientException("missing key 'scalar_data_bytes' in unmarshalled bytes");
            }
            if (!(scalarDataBytesObj instanceof byte[])) {
                throw new ClientException("malformed value 'scalar_data_bytes' in unmarshalled bytes");
            }
            byte[] scalarDataBytes = (byte[]) scalarDataBytesObj;
            VectorSchemaRoot scalarData = null;
            try {
                VectorSchemaRoot scalarDataRoot = FeatherProcessor.convertBytesToVectorSchemaRoot(scalarDataBytes);
            } catch (Exception e) {
                throw new ClientException("failed to convert scalar data bytes to VectorSchemaRoot", e);
            }

            System.out.println(">>> SCALAR DATA BYTES");
        }

        return new OnlineQueryResultFeather();
    }
}
