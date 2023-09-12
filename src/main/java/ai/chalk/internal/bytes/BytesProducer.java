package ai.chalk.internal.bytes;

import ai.chalk.internal.feather.FeatherProcessor;
import ai.chalk.models.OnlineQueryParams;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Map;

public class BytesProducer {
    public static byte[] convertOnlineQueryParamsToBytes(OnlineQueryParams params) throws Exception {
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

        ByteArrayOutputStream result = new ByteArrayOutputStream();
        DataOutputStream ioWriter = new DataOutputStream(result);

        // Magic string header
        String magicString = "chal1";
        byte[] magicStringBytes = magicString.getBytes(StandardCharsets.UTF_8);
        ioWriter.write(magicStringBytes);

        // Placeholder for the sizes
        byte[] placeholder = new byte[8];
        Map<String, Object> jsonHeader = Map.of(
                "outputs", params.getOutputs()
        );
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