package ai.chalk.internal.bytes;

import ai.chalk.internal.arrow.FeatherProcessor;
import ai.chalk.models.OnlineQueryParams;
import ai.chalk.models.OnlineQueryParamsComplete;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.arrow.memory.BufferAllocator;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static ai.chalk.internal.Utils.toChalkDuration;

public class BytesProducer {
    private static final ObjectMapper mapper = new ObjectMapper()
            .registerModule(new com.fasterxml.jackson.datatype.jsr310.JavaTimeModule())
            .configure(com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);

    /**
     * Builds a JSON header map from OnlineQueryParams object
     * This method extracts all the fields from params into a map that will be serialized as JSON
     * 
     * @param params The query parameters object
     * @return A map containing all the fields from params that should be included in the JSON header
     */
    public static Map<String, Object> buildJsonHeader(OnlineQueryParams params) {
        List<String> resolvedOutputs = params.getOutputs();
        if (resolvedOutputs == null) {
            resolvedOutputs = new ArrayList<>();
        }

        Map<String, Object> jsonHeader = new HashMap<>();
        jsonHeader.put("outputs", resolvedOutputs);
        jsonHeader.put("include_meta", params.isIncludeMeta());
        jsonHeader.put("store_plan_stages", params.isStorePlanStages());
        jsonHeader.put("explain", params.isExplain());
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
        if (params.getQueryNameVersion() != null) {
            jsonHeader.put("query_name_version", params.getQueryNameVersion());
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
        if (params.getPlannerOptions() != null) {
            jsonHeader.put("planner_options", params.getPlannerOptions());
        }
        if (params.getNow() != null) {
            jsonHeader.put("now", params.getNow());
        }

        return jsonHeader;
    }

    public static byte[] convertOnlineQueryParamsToBytes(OnlineQueryParamsComplete params, BufferAllocator allocator) throws Exception {
        byte[] arrowBytes;
        if (params.getInputs() == null) {
            throw new Exception("`inputs` cannot be null - please use OnlineQueryParams.builder().input(...).build()");
        }
        try {
            arrowBytes = FeatherProcessor.inputsToArrowBytes(params.getInputs(), allocator);
        } catch (Exception e) {
            throw new Exception("failed to convert inputs to Arrow bytes", e);
        }

        Map<String, Object> jsonHeader = buildJsonHeader(params);

        ByteArrayOutputStream result = new ByteArrayOutputStream();
        DataOutputStream ioWriter = new DataOutputStream(result);

        // Magic string header
        String magicString = "chal1";
        byte[] magicStringBytes = magicString.getBytes(StandardCharsets.UTF_8);
        ioWriter.write(magicStringBytes);

        // Placeholder for the sizes
        byte[] placeholder = new byte[8];
        byte[] jsonBytes = mapper.writeValueAsBytes(jsonHeader);

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

    private static void produceLen(int length, DataOutputStream ioWriter) throws Exception {
        byte[] lengthBytes = ByteBuffer.allocate(8).putLong(length).array();
        ioWriter.write(lengthBytes);
    }

    private static void produceJsonAttrs(Map<String, Object> jsonAttrs, DataOutputStream ioWriter) throws Exception {
        byte[] jsonBytes = mapper.writeValueAsBytes(jsonAttrs);
        produceLen(jsonBytes.length, ioWriter);
        ioWriter.write(jsonBytes);
    }

    private static void produceByteAttrs(Map<String, byte[]> byteAttrs, DataOutputStream ioWriter) throws Exception {
        Map<String, Object> byteAttrsMap = new HashMap<>();
        for (Map.Entry<String, byte[]> entry : byteAttrs.entrySet()) {
            byteAttrsMap.put(entry.getKey(), entry.getValue().length);
        }
        produceJsonAttrs(byteAttrsMap, ioWriter);
        for (byte[] value : byteAttrs.values()) {
            ioWriter.write(value);
        }
    }

    public static byte[] chalkMarshal(Map<String, Object> attrs) throws Exception {
        Map<String, Object> jsonAttrs = new HashMap<>();
        Map<String, byte[]> byteAttrs = new HashMap<>();

        for (Map.Entry<String, Object> entry : attrs.entrySet()) {
            if (entry.getValue() instanceof byte[]) {
                byteAttrs.put(entry.getKey(), (byte[]) entry.getValue());
            } else {
                jsonAttrs.put(entry.getKey(), entry.getValue());
            }
        }

        try (ByteArrayOutputStream result = new ByteArrayOutputStream();
             DataOutputStream ioWriter = new DataOutputStream(result)) {

            // Magic string header
            ioWriter.writeBytes("CHALK_BYTE_TRANSMISSION");

            // JSON attrs
            produceJsonAttrs(jsonAttrs, ioWriter);

            // Pydantic attrs (empty map)
            produceJsonAttrs(new HashMap<>(), ioWriter);

            // Byte attrs
            produceByteAttrs(byteAttrs, ioWriter);

            // ByteSerializables (empty map)
            produceJsonAttrs(new HashMap<>(), ioWriter);

            ioWriter.flush();
            return result.toByteArray();
        }
    }
}