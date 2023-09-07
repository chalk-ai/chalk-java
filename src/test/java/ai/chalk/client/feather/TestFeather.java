package ai.chalk.client.feather;


import ai.chalk.internal.bytes.BytesProcessor;
import ai.chalk.models.OnlineQueryBulkResponse;
import org.junit.jupiter.api.Test;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

public class TestFeather {
    @Test
    public void test() {
        try {
            String encodedString = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir"), "src/test/java/ai/chalk/client/feather/", "bulk_query_response.txt")), "UTF-8");
            byte[] decodedBytes = Base64.getDecoder().decode(encodedString.trim());
            OnlineQueryBulkResponse res = OnlineQueryBulkResponse.fromBytes(decodedBytes);
            System.out.println(">>> HELLLO");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testLengthConsumption() throws Exception {
        byte[] intBytes = BytesProcessor.intToEightBytes(123);
        BytesProcessor.ConsumptionResult<Long> result = BytesProcessor.consume8ByteLen(0, intBytes);

        assert result.getIndex() == 8;
        assert result.getResult() == 123;
    }
}
