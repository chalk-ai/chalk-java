package ai.chalk.arrow;


import ai.chalk.arrow.test_features.User;
import ai.chalk.internal.bytes.BytesConsumer;
import ai.chalk.internal.bytes.BytesProducer;
import ai.chalk.internal.arrow.FeatherProcessor;
import ai.chalk.internal.request.models.OnlineQueryBulkResponse;
import ai.chalk.models.OnlineQueryParams;
import ai.chalk.models.OnlineQueryResult;
import org.apache.arrow.memory.RootAllocator;
import org.apache.arrow.vector.*;
import org.apache.arrow.vector.complex.impl.*;
import org.apache.arrow.vector.complex.writer.*;
import org.apache.arrow.vector.holders.TimeStampMicroTZHolder;
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
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;

public class TestFeather {
    /**
     * This tests that all fields in an OnlineQueryBulkResponse correctly deserialize.
     */
    @Test
    public void testConvertBytesResponseToResult() throws Exception {
        String encodedString = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir"), "src/test/java/ai/chalk/arrow/test_data", "bulk_query_response.txt")), "UTF-8");
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
    public void testConvertMultipleHasManyResultToBytes() throws Exception {
        String encodedString = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir"), "src/test/java/ai/chalk/arrow/test_data", "multi_has_many_base64.txt")), "UTF-8");
        byte[] decodedBytes = Base64.getDecoder().decode(encodedString.trim());
        OnlineQueryBulkResponse response = OnlineQueryBulkResponse.fromBytes(decodedBytes);
        OnlineQueryResult result = response.toResult();
        assert result.getGroupsTables().size() == 2;
        assert result.getGroupsTables().get("series.investors").getRowCount() == 52;
        assert result.getGroupsTables().get("series.haters").getRowCount() == 2;
    }

    @Test
    public void testMillionRowsInOutput() {
        try {
            byte[] bytes = Files.readAllBytes(Paths.get(System.getProperty("user.dir"), "src/test/java/ai/chalk/arrow/test_data", "million_scalar_rows.bin"));
            OnlineQueryBulkResponse response = OnlineQueryBulkResponse.fromBytes(bytes);
            OnlineQueryResult result = response.toResult();
            Table scalarsTable = result.getScalarsTable();
            assert scalarsTable.getRowCount() == 1_000_000;
        } catch (Exception e) {
            assert false;
        }
    }

    @Disabled("Should theoretically work but doesn't. Oddly - successfully " +
            "gets a response back when tested end-to-end locally.")
    @Test
    public void testMillionRowsInInput() throws Exception {
        // Failing because 'Cannot invoke "org.apache.arrow.flatbuf.RecordBatch.nodesLength()"
        // because "recordBatchFB" is null'
        Integer[] intArray = new Integer[1_000_000];
        List<Integer> list = Arrays.asList(intArray);
        for (int i = 0; i < 1_000_000; i++) {
            intArray[i] = i;
        }
        byte[] bytes = BytesProducer.convertOnlineQueryParamsToBytes(OnlineQueryParams.builder().withInput("user.id", list).withOutputs("doesntmatter").build());
        try (
            Table table = FeatherProcessor.convertBytesToTable(bytes);
        ) {
            assert table.getRowCount() == 1_000_000;
        }
    }


    /**
     * Tests deserializing a table with a column that has a list type.
     */
    @Test
    public void testListsInScalarTable() throws Exception {
        String encodedString = new String(Files.readAllBytes(Paths.get(System.getProperty("user.dir"), "src/test/java/ai/chalk/arrow/test_data", "list_feature_in_scalar_table.txt")), "UTF-8");
        byte[] bytes = Base64.getDecoder().decode(encodedString.trim());
        OnlineQueryBulkResponse response = OnlineQueryBulkResponse.fromBytes(bytes);
        OnlineQueryResult result = response.toResult();
        Table scalarsTable = result.getScalarsTable();
        assert scalarsTable.getRowCount() == 5;
        User[] users = result.unmarshal(User.class);
        for (User user : users) {
            assert Arrays.equals(user.favoriteNumbers.getValue().toArray(), new Long[]{1L, 2L, 3L});
        }
    }

    /**
     * Tests deserializing a table with a column that has a struct type.
     */
    @Test
    public void testStructsInScalarTable() throws Exception {
        byte[] bytes = Files.readAllBytes(Paths.get(System.getProperty("user.dir"), "src/test/java/ai/chalk/arrow/test_data", "structs_in_scalar_table.bin"));
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


    /**
     * Tests deserializing a table that has all primitive types.
     */
    @Test
    public void testPrimitiveTypesInOutputTable() throws Exception {
        byte[] bytes = Files.readAllBytes(Paths.get(System.getProperty("user.dir"), "src/test/java/ai/chalk/arrow/test_data", "all_types_in_scalar_table.bin"));
        OnlineQueryBulkResponse response = OnlineQueryBulkResponse.fromBytes(bytes);
        OnlineQueryResult result = response.toResult();
        Table scalarsTable = result.getScalarsTable();
        assert scalarsTable.getRowCount() == 3;

        try (
            BigIntVector expected = new BigIntVector("int_vector", new RootAllocator(Long.MAX_VALUE));
            BigIntWriter writer = new BigIntWriterImpl(expected);
        ) {
            expected.allocateNew(4032);
            writer.setPosition(0);
            writer.writeBigInt(1);
            writer.setPosition(1);
            writer.writeBigInt(2);
            writer.setPosition(2);
            writer.writeBigInt(3);
            BigIntVector actual = (BigIntVector) scalarsTable.getVectorCopy("user.int");
            for (int i = 0; i < 3; i++) {
                assert actual.getObject(i).equals(expected.getObject(i));
            }
        }

        try (
                BitVector expected = new BitVector("bool_vector", new RootAllocator(Long.MAX_VALUE));
        ) {
            expected.allocateNew(3);
            expected.set(0, 1);
            expected.set(1, 0);
            expected.set(2, 1);
            BitVector actual = (BitVector) scalarsTable.getVectorCopy("user.bool");
            for (int i = 0; i < 3; i++) {
                assert actual.getObject(i).equals(expected.getObject(i));
            }
        }

        try (
                Float8Vector expected = new Float8Vector("float_vector", new RootAllocator(Long.MAX_VALUE));
                Float8Writer writer = new Float8WriterImpl(expected);
        ) {
            expected.allocateNew(3);
            writer.setPosition(0);
            writer.writeFloat8(1.0);
            writer.setPosition(1);
            writer.writeFloat8(2.0);
            writer.setPosition(2);
            writer.writeFloat8(3.0);
            Float8Vector actual = (Float8Vector) scalarsTable.getVectorCopy("user.float");
            for (int i = 0; i < 3; i++) {
                assert actual.getObject(i).equals(expected.getObject(i));
            }
        }

        try (
            LargeVarCharVector expected = new LargeVarCharVector("str_vector", new RootAllocator(Long.MAX_VALUE));
        ) {
            expected.allocateNew(3);
            expected.set(0, "string1".getBytes());
            expected.set(1, "string2".getBytes());
            expected.set(2, "string3".getBytes());
            LargeVarCharVector actual = (LargeVarCharVector) scalarsTable.getVectorCopy("user.str");
            for (int i = 0; i < 3; i++) {
                assert actual.getObject(i).equals(expected.getObject(i));
            }
        }

        try (
                DateMilliVector expected = new DateMilliVector("date_vector", new RootAllocator(Long.MAX_VALUE));
                DateMilliWriter writer = new DateMilliWriterImpl(expected);
        ) {
            expected.allocateNew(3);
            writer.setPosition(0);
            writer.writeDateMilli(1577836800000L);
            writer.setPosition(1);
            writer.writeDateMilli(1577923200000L);
            writer.setPosition(2);
            writer.writeDateMilli(1578009600000L);
            DateMilliVector actual = (DateMilliVector) scalarsTable.getVectorCopy("user.date");
            for (int i = 0; i < 3; i++) {
                assert actual.getObject(i).equals(expected.getObject(i));
            }
        }

        try (
                TimeStampMicroTZVector expected = new TimeStampMicroTZVector("datetime_vector", new RootAllocator(Long.MAX_VALUE), "UTC");
                TimeStampMicroTZWriter writer = new TimeStampMicroTZWriterImpl(expected);
        ) {
            expected.allocateNew(3);
            TimeStampMicroTZHolder holder = new TimeStampMicroTZHolder();
            holder.value = 1577836801000000L;
            holder.timezone = "UTC";
            writer.setPosition(0);
            writer.write(holder);

            holder = new TimeStampMicroTZHolder();
            holder.value = 1577836802000000L;
            holder.timezone = "UTC";
            writer.setPosition(1);
            writer.write(holder);

            holder = new TimeStampMicroTZHolder();
            holder.value = 1577836803000000L;
            holder.timezone = "UTC";
            writer.setPosition(2);
            writer.write(holder);

            TimeStampMicroTZVector actual = (TimeStampMicroTZVector) scalarsTable.getVectorCopy("user.datetime");
            for (int i = 0; i < 3; i++) {
                assert actual.getObject(i).equals(expected.getObject(i));
            }
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
