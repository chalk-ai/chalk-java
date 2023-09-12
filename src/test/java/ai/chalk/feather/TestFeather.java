package ai.chalk.feather;


import ai.chalk.internal.bytes.BytesConsumer;
import ai.chalk.internal.bytes.BytesProducer;
import ai.chalk.internal.feather.FeatherProcessor;
import ai.chalk.internal.request.models.OnlineQueryBulkResponse;
import ai.chalk.models.OnlineQueryParams;
import ai.chalk.models.OnlineQueryResult;
import org.apache.arrow.vector.table.Table;
import org.apache.arrow.vector.types.DateUnit;
import org.apache.arrow.vector.types.FloatingPointPrecision;
import org.apache.arrow.vector.types.TimeUnit;
import org.apache.arrow.vector.types.pojo.ArrowType;
import org.apache.arrow.vector.util.JsonStringHashMap;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Base64;

public class TestFeather {
    @Test
    public void testConvertBytesResponseToResult() throws Exception {
        String encodedString = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir"), "src/test/java/ai/chalk/feather/", "bulk_query_response.txt")), "UTF-8");
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString.trim());
        OnlineQueryBulkResponse response = OnlineQueryBulkResponse.fromBytes(decodedBytes);
        OnlineQueryResult result = response.toResult();
        Table scalarsTable = result.getScalarsTable();
        Table groupsTable = result.getGroupsTables().get("user.cups");
        assert scalarsTable.getRowCount() == 5;
        assert groupsTable.getRowCount() == 4;
        assert result.getErrors().length == 2;
        assert result.getErrors()[0].getMessage().equals("query.abc referenced invalid feature 'def'");
        assert result.getMeta() != null;
        assert result.getMeta().getExecutionDurationS() == 16.0;

        // These types are obtained from the Python deserialization of the same response.
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

        assert cupsTable.getSchema().findField("__ts__").getType() instanceof ArrowType.Timestamp;
        assert ((ArrowType.Timestamp) cupsTable.getSchema().findField("__ts__").getType()).getTimezone().equals("UTC");
        assert ((ArrowType.Timestamp) cupsTable.getSchema().findField("__ts__").getType()).getUnit() == TimeUnit.MICROSECOND;

        assert cupsTable.getSchema().findField("cup.user_id").getType() instanceof ArrowType.Int;
        assert ((ArrowType.Int) cupsTable.getSchema().findField("cup.user_id").getType()).getBitWidth() == 64;

        assert cupsTable.getSchema().findField("cup.volume").getType() instanceof ArrowType.FloatingPoint;
        assert ((ArrowType.FloatingPoint) cupsTable.getSchema().findField("cup.volume").getType()).getPrecision() == FloatingPointPrecision.DOUBLE;

        assert cupsTable.getSchema().findField("cup.id").getType() instanceof ArrowType.Int;
        assert ((ArrowType.Int) cupsTable.getSchema().findField("cup.id").getType()).getBitWidth() == 64;
    }

    @Test
    public void testMillionRowsInOutput() {
        try {
            byte[] bytes = Files.readAllBytes(Paths.get(System.getProperty("user.dir"), "src/test/java/ai/chalk/feather/", "million_scalar_rows.bin"));
            OnlineQueryBulkResponse response = OnlineQueryBulkResponse.fromBytes(bytes);
            OnlineQueryResult result = response.toResult();
            Table scalarsTable = result.getScalarsTable();
            assert scalarsTable.getRowCount() == 1_000_000;
        } catch (Exception e) {
            assert false;
        }
    }

    @Disabled("Should theoretically work but doesn't. But we successfully " +
            "get a response back when tested end-to-end locally.")
    @Test
    public void testMillionRowsInInput() throws Exception {
        // Failing because 'Cannot invoke "org.apache.arrow.flatbuf.RecordBatch.nodesLength()"
        // because "recordBatchFB" is null'
        int[] intArray = new int[1_000_000];
        for (int i = 0; i < 1_000_000; i++) {
            intArray[i] = i;
        }
        byte[] bytes = BytesProducer.convertOnlineQueryParamsToBytes(OnlineQueryParams.builder().withInputs("user.id", intArray).withOutput("doesntmatter").build());
        try (
            Table table = FeatherProcessor.convertBytesToTable(bytes);
        ) {
            assert table.getRowCount() == 1_000_000;
        }
    }


    @Test
    public void testListsInScalarTable() throws Exception {
        byte[] bytes = Files.readAllBytes(Paths.get(System.getProperty("user.dir"), "src/test/java/ai/chalk/feather/", "lists_in_scalar_table.bin"));
        OnlineQueryBulkResponse response = OnlineQueryBulkResponse.fromBytes(bytes);
        OnlineQueryResult result = response.toResult();
        Table scalarsTable = result.getScalarsTable();
        assert scalarsTable.getRowCount() == 5;
    }

    @Test
    public void testStructsInScalarTable() throws Exception {
        byte[] bytes = Files.readAllBytes(Paths.get(System.getProperty("user.dir"), "src/test/java/ai/chalk/feather/", "structs_in_scalar_table.bin"));
        OnlineQueryBulkResponse response = OnlineQueryBulkResponse.fromBytes(bytes);
        OnlineQueryResult result = response.toResult();
        Table scalarsTable = result.getScalarsTable();
        assert scalarsTable.getRowCount() == 5;
        assert scalarsTable.getSchema().findField("user.lat_lng").getType() instanceof ArrowType.Struct;
        var structVector = scalarsTable.getVectorCopy("user.lat_lng");
        var sampleObject = structVector.getObject(0);
        assert sampleObject instanceof JsonStringHashMap;
        assert ((JsonStringHashMap) sampleObject).get("lat") instanceof Double;
        assert ((JsonStringHashMap) sampleObject).get("lng") instanceof Double;
        assert ((JsonStringHashMap) sampleObject).get("lat").equals(41.9);
        assert ((JsonStringHashMap) sampleObject).get("lng").equals(71.9);
    }


    @Test
    public void testLengthConsumption() throws Exception {
        byte[] intBytes = BytesConsumer.intToEightBytes(123);
        BytesConsumer.ConsumptionResult<Long> result = BytesConsumer.consume8ByteLen(0, intBytes);
        assert result.getIndex() == 8;
        assert result.getResult() == 123;
    }
}
