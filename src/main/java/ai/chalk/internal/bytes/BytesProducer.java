package ai.chalk.internal.bytes;

import ai.chalk.internal.feather.FeatherProcessor;
import ai.chalk.models.OnlineQueryParams;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.OutputStreamWriter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Map;

public class BytesProducer {
    public static byte[] convertOnlineQueryParamsToBytes(OnlineQueryParams params) throws Exception {
        byte[] arrowBytes;
        try {
            arrowBytes = FeatherProcessor.inputsToArrowBytes(params.getInputs());
        } catch (Exception e) {
            throw new Exception("failed to convert inputs to Arrow bytes", e);
        }

        ByteArrayOutputStream result = new ByteArrayOutputStream();
        DataOutputStream ioWriter = new DataOutputStream(result);

        // Magic string header
        String magicString = "chal1";
        ioWriter.writeUTF(magicString);
        ioWriter.flush();

        // Placeholder for the sizes
        byte[] placeholder = new byte[8];
        Map<String, Object> jsonHeader = Map.of(
                "outputs", params.getOutputs()
        );
        byte[] jsonBytes = new ObjectMapper().writeValueAsBytes(jsonHeader);

        // Write json header
        result.write(placeholder);
        result.write(jsonBytes);

        // Write arrow
        result.write(placeholder);
        result.write(arrowBytes);

        // Fill in the sizes
        byte[] resultBytes = result.toByteArray();
        int nonBodyLength = magicString.length() + 8 + jsonBytes.length + 8;
        int bodyLength = resultBytes.length - nonBodyLength;
        ByteBuffer wrapped = ByteBuffer.wrap(resultBytes).order(ByteOrder.BIG_ENDIAN);
        wrapped.putLong(magicString.length(), jsonBytes.length);
        wrapped.putLong(magicString.length() + 8 + jsonBytes.length, bodyLength);

        return resultBytes;
    }
}