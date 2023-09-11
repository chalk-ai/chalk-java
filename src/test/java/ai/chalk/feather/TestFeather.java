package ai.chalk.feather;


import ai.chalk.internal.bytes.BytesConsumer;
import ai.chalk.models.OnlineQueryBulkResponse;
import ai.chalk.models.OnlineQueryBulkResult;
import org.apache.arrow.vector.table.Table;
import org.apache.arrow.vector.types.DateUnit;
import org.apache.arrow.vector.types.TimeUnit;
import org.apache.arrow.vector.types.pojo.ArrowType;
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
            Table groupsTable = result.getGroupsTables().get("user.cups");
            assert scalarsTable.getRowCount() == 5;
            assert groupsTable.getRowCount() == 4;
            assert result.getErrors().length == 2;
            assert result.getErrors()[0].getMessage().equals("query.abc referenced invalid feature 'def'");
            assert result.getMeta() != null;
            assert result.getMeta().getExecutionDurationS() == 16.0;


            assert scalarsTable.getSchema().findField("user.__chalk_observed_at__").getType() instanceof ArrowType.Timestamp;
            assert ((ArrowType.Timestamp) scalarsTable.getSchema().findField("user.__chalk_observed_at__").getType()).getTimezone().equals("UTC");
            assert ((ArrowType.Timestamp) scalarsTable.getSchema().findField("user.__chalk_observed_at__").getType()).getUnit() == TimeUnit.MICROSECOND;

            assert scalarsTable.getSchema().findField("user.id").getType() instanceof ArrowType.Int;
            assert ((ArrowType.Int) scalarsTable.getSchema().findField("user.id").getType()).getBitWidth() == 64;

            assert scalarsTable.getSchema().findField("user.today").getType() instanceof ArrowType.Date;
            assert ((ArrowType.Date) scalarsTable.getSchema().findField("user.today").getType()).getUnit() == DateUnit.MILLISECOND;

            assert scalarsTable.getSchema().findField("__ts__").getType() instanceof ArrowType.Timestamp;
            assert ((ArrowType.Timestamp) scalarsTable.getSchema().findField("__ts__").getType()).getTimezone().equals("UTC");
            assert ((ArrowType.Timestamp) scalarsTable.getSchema().findField("__ts__").getType()).getUnit() == TimeUnit.MICROSECOND;

            var cupsTable = result.getGroupsTables().get("user.cups");



        } catch (Exception e) {
            assert false;
        }
    }

    @Test
    public void testMillionRows() {
        try {
            byte[] bytes = Files.readAllBytes(Paths.get(System.getProperty("user.dir"), "src/test/java/ai/chalk/feather/", "million_scalar_rows.bin"));
            OnlineQueryBulkResponse response = OnlineQueryBulkResponse.fromBytes(bytes);
            OnlineQueryBulkResult result = response.toResult();
            Table scalarsTable = result.getScalarsTable();
            assert scalarsTable.getRowCount() == 1_000_000;
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
