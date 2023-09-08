package ai.chalk.client.feather;


import ai.chalk.internal.bytes.BytesConsumer;
import ai.chalk.models.OnlineQueryBulkResponse;
import ai.chalk.models.OnlineQueryBulkResult;
import org.apache.arrow.vector.VectorSchemaRoot;
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
            OnlineQueryBulkResponse response = OnlineQueryBulkResponse.fromBytes(decodedBytes);
            OnlineQueryBulkResult result = response.toResult();
            VectorSchemaRoot scalarsRoot = result.getScalarsRoot();
            VectorSchemaRoot groupsRoot = result.getGroupsRoot().get("0");

        } catch (Exception e) {

        }
    }

    @Test
    public void testLengthConsumption() throws Exception {
        byte[] intBytes = BytesConsumer.intToEightBytes(123);
        BytesConsumer.ConsumptionResult<Long> result = BytesConsumer.consume8ByteLen(0, intBytes);

        assert result.getIndex() == 8;
        assert result.getResult() == 123;
    }
}