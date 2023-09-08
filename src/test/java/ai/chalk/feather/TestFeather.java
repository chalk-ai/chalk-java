package ai.chalk.feather;


import ai.chalk.internal.bytes.BytesConsumer;
import ai.chalk.models.OnlineQueryBulkResponse;
import ai.chalk.models.OnlineQueryBulkResult;
import org.apache.arrow.vector.table.Table;
import org.junit.jupiter.api.Test;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

public class TestFeather {
    @Test
    public void testConvertBytesResponseToResult() {
        try {
            String encodedString = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir"), "src/test/java/ai/chalk/feather/", "bulk_query_response.txt")), "UTF-8");
            byte[] decodedBytes = Base64.getDecoder().decode(encodedString.trim());
            OnlineQueryBulkResponse response = OnlineQueryBulkResponse.fromBytes(decodedBytes);
            OnlineQueryBulkResult result = response.toResult();
            Table scalarsTable = result.getScalarsTable();
            Table groupsTable = result.getGroupsTable().get("user.cups");
            assert scalarsTable.getRowCount() == 5;
            assert groupsTable.getRowCount() == 4;
            assert result.getErrors().length == 2;
            assert result.getErrors()[0].getMessage().equals("query.abc referenced invalid feature 'def'");
            assert result.getMeta() != null;
            assert result.getMeta().getExecutionDurationS() == 16.0;
        } catch (Exception e) {
            assert false;
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
