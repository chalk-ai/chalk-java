package ai.chalk.internal.bytes;

import ai.chalk.internal.arrow.FeatherProcessor;
import ai.chalk.models.OnlineQueryParamsComplete;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import static ai.chalk.internal.Utils.toChalkDuration;

public class BytesProducer {
    public static byte[] convertOnlineQueryParamsToBytes(OnlineQueryParamsComplete params) throws Exception {
        byte[] arrowBytes;
        if (params.getInputs() == null) {
            throw new Exception("`inputs` cannot be null - please use OnlineQueryParams.builder().input(...).build()");
        }
        if (params.getOutputs() == null) {
            throw new Exception("`outputs` cannot be null - please use OnlineQueryParams.builder().outputs(...).build()");
        }
        try {
            arrowBytes = FeatherProcessor.inputsToArrowBytes(params.getInputs());
        } catch (Exception e) {
            throw new Exception("failed to convert inputs to Arrow bytes", e);
        }

        Map<String, Object> jsonHeader = new HashMap<>();
        jsonHeader.put("outputs", params.getOutputs());
        jsonHeader.put("include_meta", params.isIncludeMeta());
        jsonHeader.put("include_metrics", params.isIncludeMetrics());
        if (params.getBranch() != null) {
            jsonHeader.put("branch", params.getBranch());
        }
        if (params.getCorrelationId() != null) {
            jsonHeader.put("correlation_id", params.getCorrelationId());
        }
        if (params.getEnvironmentId() != null) {
            jsonHeader.put("environment_id", params.getEnvironmentId());
        }
        if (params.getMeta() != null) {
            jsonHeader.put("meta", params.getMeta());
        }
        if (params.getPreviewDeploymentId() != null) {
            jsonHeader.put("deployment_id", params.getPreviewDeploymentId());
        }
        if (params.getQueryName() != null) {
            jsonHeader.put("query_name", params.getQueryName());
        }
        if (params.getStaleness() != null) {
            var staleness = new HashMap<String, String>();
            for (var entry : params.getStaleness().entrySet()) {
                staleness.put(entry.getKey(), toChalkDuration(entry.getValue()));
            }
            jsonHeader.put("staleness", staleness);
        }
        if (params.getTags() != null) {
            jsonHeader.put("tags", params.getTags());
        }

        ByteArrayOutputStream result = new ByteArrayOutputStream();
        DataOutputStream ioWriter = new DataOutputStream(result);

        // Magic string header
        String magicString = "chal1";
        byte[] magicStringBytes = magicString.getBytes(StandardCharsets.UTF_8);
        ioWriter.write(magicStringBytes);

        // Placeholder for the sizes
        byte[] placeholder = new byte[8];
        byte[] jsonBytes = new ObjectMapper().writeValueAsBytes(jsonHeader);

        // Write json header
        ioWriter.write(placeholder);
        ioWriter.write(jsonBytes);

        // Write arrow
        ioWriter.write(placeholder);
        ioWriter.write(arrowBytes);

        // Fill in the sizes
        ioWriter.flush();
        byte[] resultBytes = result.toByteArray();
        int nonBodyLength = magicStringBytes.length + 8 + jsonBytes.length + 8;
        int bodyLength = resultBytes.length - nonBodyLength;
        ByteBuffer wrapped = ByteBuffer.wrap(resultBytes).order(ByteOrder.BIG_ENDIAN);
        wrapped.putLong(magicStringBytes.length, jsonBytes.length);
        wrapped.putLong(magicStringBytes.length + 8 + jsonBytes.length, bodyLength);

        return wrapped.array();
    }
}