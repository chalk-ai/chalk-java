package ai.chalk.internal.bytes;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;

public class BytesProcessor {
    private static final String MAGIC_STR = "CHALK_BYTE_TRANSMISSION";
    private static final ObjectMapper mapper = new ObjectMapper();

    public static byte[] intToEightBytes(int value) {
        return new byte[] {
                0, // padding
                0, // padding
                0, // padding
                0, // padding
                (byte) (value >> 24),
                (byte) (value >> 16),
                (byte) (value >> 8),
                (byte) value
        };
    }

    public static ConsumptionResult<Long> consume8ByteLen(int startIdx, byte[] bytes) throws Exception {
        int numBytesThatRepresentsLength = 8;
        checkLen(startIdx, bytes, numBytesThatRepresentsLength);
        long length = ByteBuffer.wrap(bytes, startIdx, numBytesThatRepresentsLength).order(ByteOrder.BIG_ENDIAN).getLong();
        return new ConsumptionResult<>(startIdx + numBytesThatRepresentsLength, length);
    }

    private static int consumeMagicStr(int startIdx, byte[] bytes) throws Exception {
        byte[] magicBytes = MAGIC_STR.getBytes();
        checkLen(startIdx, bytes, magicBytes.length);

        for (byte b : magicBytes) {
            if (bytes[startIdx++] != b) {
                throw new Exception("Magic string bytes do not match");
            }
        }
        return startIdx;
    }

    private static ConsumptionResult<Map<String, Object>> consumeJsonAttrs(int startIdx, byte[] bytes) throws Exception {
        ConsumptionResult<Long> lengthResult = consume8ByteLen(startIdx, bytes);
        Map<String, Object> jsonBody = new HashMap<>();

        Map<String, Object> jsonBodyRaw = new HashMap<>();
        if (lengthResult.getResult() > 0) {
            byte[] lengthInBytes = new byte[lengthResult.getResult().intValue()];
            System.arraycopy(bytes, lengthResult.getIndex(), lengthInBytes, 0, lengthInBytes.length);
            jsonBodyRaw = mapper.readValue(lengthInBytes, new TypeReference<Map<String, Object>>() {
            });
        }
        return new ConsumptionResult<>(lengthResult.getIndex() + lengthResult.getResult().intValue(), jsonBody);
    }

    private static ConsumptionResult<Map<String, Object>> consumePydanticAttrs(int startIdx, byte[] bytes) throws Exception {
        return consumeJsonAttrs(startIdx, bytes); // same behavior as described
    }

    private static ConsumptionResult<Map<String, byte[]>> consumeByteItemsData(int startIdx, byte[] bytes, Map<String, Integer> byteItemsMap) throws Exception {
        Map<String, byte[]> byteItems = new HashMap<>();
        int idx = startIdx;

        for (Map.Entry<String, Integer> entry : byteItemsMap.entrySet()) {
            String key = entry.getKey();
            int length = entry.getValue();

            checkLen(idx, bytes, length);
            byte[] itemBytes = new byte[length];
            System.arraycopy(bytes, idx, itemBytes, 0, length);
            byteItems.put(key, itemBytes);

            idx += length;
        }
        return new ConsumptionResult<>(idx, byteItems);
    }

    private static ConsumptionResult<Map<String, byte[]>> consumeByteItems(int startIdx, byte[] bytes) throws Exception {
        ConsumptionResult<Map<String, Object>> byteItemsMapResult = consumeJsonAttrs(startIdx, bytes);
        Map<String, Integer> byteItemsMapInt = new HashMap<>();

        Map<String, Object> byteItemsMap = byteItemsMapResult.getResult();
        for (Map.Entry<String, Object> entry : byteItemsMap.entrySet()) {
            byteItemsMapInt.put(entry.getKey(), (Integer) entry.getValue());
        }

        return consumeByteItemsData(byteItemsMapResult.getIndex(), bytes, byteItemsMapInt);
    }

    private static void checkLen(int startIdx, byte[] bytes, int length) throws Exception {
        if (bytes.length < startIdx + length) {
            throw new Exception("Failed to find enough bytes to consume");
        }
    }

    public static Map<String, Object> unmarshal(byte[] body) throws Exception {
        int idx;
        Map<String, Object> result = new HashMap<>();

        idx = consumeMagicStr(0, body);

        ConsumptionResult<Map<String, Object>> jsonBodyResult = consumeJsonAttrs(idx, body);
        if (jsonBodyResult.getResult() != null) {
            result.putAll(jsonBodyResult.getResult());
        }
        idx = jsonBodyResult.getIndex();

        ConsumptionResult<Map<String, Object>> pydanticJsonBodyResult = consumePydanticAttrs(idx, body);
        if (pydanticJsonBodyResult.getResult() != null) {
            result.putAll(pydanticJsonBodyResult.getResult());
        }
        idx = pydanticJsonBodyResult.getIndex();

        ConsumptionResult<Map<String, byte[]>> byteItemsResult = consumeByteItems(idx, body);
        if (byteItemsResult.getResult() != null) {
            result.putAll(byteItemsResult.getResult());
        }
        idx = byteItemsResult.getIndex();

        ConsumptionResult<Map<String, byte[]>> deserializableByteItemsResult = consumeByteItems(idx, body);
        if (deserializableByteItemsResult.getResult() != null) {
            result.putAll(deserializableByteItemsResult.getResult());
        }

        return result;
    }


    @Getter
    @AllArgsConstructor
    public static class ConsumptionResult<T> {
        private final int index;
        private final T result;
    }
}
