package chalk.arrow;

import chalk.arrow.test_features.ArrowFeatures;
import chalk.arrow.test_features.ArrowUser;
import chalk.internal.Utils;
import chalk.internal.arrow.TableUnmarshaller;
import org.apache.arrow.memory.RootAllocator;
import org.apache.arrow.vector.*;
import org.apache.arrow.vector.complex.StructVector;
import org.apache.arrow.vector.table.Table;
import org.apache.arrow.vector.types.TimeUnit;
import org.apache.arrow.vector.types.pojo.FieldType;
import org.junit.jupiter.api.Test;

import java.time.*;
import java.util.ArrayList;
import java.util.List;


public class TestUnmarshaller {
    public Table getTestTableWithAllArrowTypes() {
        List<FieldVector> fieldVectors = new ArrayList<>();
        var allocator = new RootAllocator(Long.MAX_VALUE);

        var bigIntVector = new BigIntVector(ArrowFeatures.user.favoriteBigInt.getFqn(), allocator);
        bigIntVector.allocateNew();
        long[] values = {1, 2, 3};
        for (int i = 0; i < values.length; i++) {
            bigIntVector.set(i, values[i]);
        }
        bigIntVector.setValueCount(values.length);
        fieldVectors.add(bigIntVector);

        var intVector = new IntVector(ArrowFeatures.user.favoriteInt.getFqn(), allocator);
        intVector.allocateNew();
        int[] intValues = {1, 2, 3};
        for (int i = 0; i < intValues.length; i++) {
            intVector.set(i, intValues[i]);
        }
        intVector.setValueCount(intValues.length);
        fieldVectors.add(intVector);

        var smallIntVector = new SmallIntVector(ArrowFeatures.user.favoriteSmallInt.getFqn(), allocator);
        smallIntVector.allocateNew();
        short[] smallIntValues = {1, 2, 3};
        for (int i = 0; i < smallIntValues.length; i++) {
            smallIntVector.set(i, smallIntValues[i]);
        }
        smallIntVector.setValueCount(smallIntValues.length);
        fieldVectors.add(smallIntVector);

        var tinyIntVector = new TinyIntVector(ArrowFeatures.user.favoriteTinyInt.getFqn(), allocator);
        tinyIntVector.allocateNew();
        byte[] tinyIntValues = {1, 2, 3};
        for (int i = 0; i < tinyIntValues.length; i++) {
            tinyIntVector.set(i, tinyIntValues[i]);
        }
        tinyIntVector.setValueCount(tinyIntValues.length);
        fieldVectors.add(tinyIntVector);

        var floatVector = new Float4Vector(ArrowFeatures.user.favoriteFloat4.getFqn(), allocator);
        floatVector.allocateNew();
        float[] floatValues = {1.0f, 2.0f, 3.0f};
        for (int i = 0; i < floatValues.length; i++) {
            floatVector.set(i, floatValues[i]);
        }
        floatVector.setValueCount(floatValues.length);
        fieldVectors.add(floatVector);

        var doubleVector = new Float8Vector(ArrowFeatures.user.favoriteFloat8.getFqn(), allocator);
        doubleVector.allocateNew();
        double[] doubleValues = {1.0, 2.0, 3.0};
        for (int i = 0; i < doubleValues.length; i++) {
            doubleVector.set(i, doubleValues[i]);
        }
        doubleVector.setValueCount(doubleValues.length);
        fieldVectors.add(doubleVector);

        var boolVector = new BitVector(ArrowFeatures.user.favoriteBoolean.getFqn(), allocator);
        boolVector.allocateNew();
        boolean[] boolValues = {true, false, true};
        for (int i = 0; i < boolValues.length; i++) {
            boolVector.set(i, boolValues[i] ? 1 : 0);
        }
        fieldVectors.add(boolVector);

        var utf8Vector = new VarCharVector(ArrowFeatures.user.favoriteUtf8.getFqn(), allocator);
        utf8Vector.allocateNew();
        String[] utf8Values = {"a", "b", "c"};
        for (int i = 0; i < utf8Values.length; i++) {
            utf8Vector.set(i, utf8Values[i].getBytes());
        }
        utf8Vector.setValueCount(utf8Values.length);
        fieldVectors.add(utf8Vector);

        var largeUtf8Vector = new LargeVarCharVector(ArrowFeatures.user.favoriteLargeUtf8.getFqn(), allocator);
        largeUtf8Vector.allocateNew();
        String[] largeUtf8Values = {"a", "b", "c"};
        for (int i = 0; i < largeUtf8Values.length; i++) {
            largeUtf8Vector.set(i, largeUtf8Values[i].getBytes());
        }
        largeUtf8Vector.setValueCount(largeUtf8Values.length);
        fieldVectors.add(largeUtf8Vector);

        var dateVector = new DateDayVector(ArrowFeatures.user.favoriteDateDay.getFqn(), allocator);
        dateVector.allocateNew();
        int[] dateValues = {18839, 18840, 18841};  // Thursday, July 31, 2021, ..., ...
        for (int i = 0; i < dateValues.length; i++) {
            dateVector.set(i, dateValues[i]);
        }
        dateVector.setValueCount(dateValues.length);
        fieldVectors.add(dateVector);

        var dateMilliVector = new DateMilliVector(ArrowFeatures.user.favoriteDateMilli.getFqn(), allocator);
        dateMilliVector.allocateNew();
        // Thursday, July 31, 2021, ..., ... For some reason has to be epoch seconds instead of epoch milliseconds.
        long[] dateMilliValues = {1627689600, 1627776000, 1627862400};
        for (int i = 0; i < dateMilliValues.length; i++) {
            dateMilliVector.set(i, dateMilliValues[i]);
        }
        dateMilliVector.setValueCount(dateMilliValues.length);
        fieldVectors.add(dateMilliVector);

        var timestampSecVector = new TimeStampSecVector(ArrowFeatures.user.favoriteTimestampSec.getFqn(), allocator);
        timestampSecVector.allocateNew();
        long[] timestampSecValues = {1627689600, 1627776000, 1627862400};  // Thursday, July 31, 2021, ..., ...
        for (int i = 0; i < timestampSecValues.length; i++) {
            timestampSecVector.set(i, timestampSecValues[i]);
        }
        timestampSecVector.setValueCount(timestampSecValues.length);
        fieldVectors.add(timestampSecVector);

        var secTzType = FieldType.nullable(
            new org.apache.arrow.vector.types.pojo.ArrowType.Timestamp(org.apache.arrow.vector.types.TimeUnit.SECOND, "US/Pacific")
        );
        var timestampSecTzVector = new TimeStampSecTZVector(ArrowFeatures.user.favoriteTimestampSecTz.getFqn(), secTzType, allocator);
        timestampSecTzVector.allocateNew();
        long[] timestampSecTzValues = {1627689600, 1627776000, 1627862400};  // Thursday, July 31, 2021 Pacific??, ..., ...
        for (int i = 0; i < timestampSecTzValues.length; i++) {
            timestampSecTzVector.set(i, timestampSecTzValues[i]);
        }
        timestampSecTzVector.setValueCount(timestampSecTzValues.length);
        fieldVectors.add(timestampSecTzVector);

        var timestampMilliVector = new TimeStampMilliVector(ArrowFeatures.user.favoriteTimestampMilli.getFqn(), allocator);
        timestampMilliVector.allocateNew();
        long[] timestampMilliValues = {1627689600000L, 1627776000000L, 1627862400000L};  // Thursday, July 31, 2021, ..., ...
        for (int i = 0; i < timestampMilliValues.length; i++) {
            timestampMilliVector.set(i, timestampMilliValues[i]);
        }
        timestampMilliVector.setValueCount(timestampMilliValues.length);
        fieldVectors.add(timestampMilliVector);

        var milliTzType = FieldType.nullable(
            new org.apache.arrow.vector.types.pojo.ArrowType.Timestamp(org.apache.arrow.vector.types.TimeUnit.MILLISECOND, "US/Pacific")
        );
        var timestampMilliTzVector = new TimeStampMilliTZVector(ArrowFeatures.user.favoriteTimestampMilliTz.getFqn(), milliTzType, allocator);
        timestampMilliTzVector.allocateNew();
        for (int i = 0; i < timestampMilliValues.length; i++) {
            timestampMilliTzVector.set(i, timestampMilliValues[i]);
        }
        timestampMilliTzVector.setValueCount(timestampMilliValues.length);
        fieldVectors.add(timestampMilliTzVector);

        var timestampMicroVector = new TimeStampMicroVector(ArrowFeatures.user.favoriteTimestampMicro.getFqn(), allocator);
        timestampMicroVector.allocateNew();
        long[] timestampMicroValues = {1627689600000000L, 1627776000000000L, 1627862400000000L};  // Thursday, July 31, 2021, ..., ...
        for (int i = 0; i < timestampMicroValues.length; i++) {
            timestampMicroVector.set(i, timestampMicroValues[i]);
        }
        timestampMicroVector.setValueCount(timestampMicroValues.length);
        fieldVectors.add(timestampMicroVector);

        var microTzType = FieldType.nullable(
            new org.apache.arrow.vector.types.pojo.ArrowType.Timestamp(org.apache.arrow.vector.types.TimeUnit.MICROSECOND, "US/Pacific")
        );
        var timestampMicroTzVector = new TimeStampMicroTZVector(ArrowFeatures.user.favoriteTimestampMicroTz.getFqn(), microTzType, allocator);
        timestampMicroTzVector.allocateNew();
        // Thursday, July 31, 2021, ..., ... Oddly needs to be in epoch seconds instead of epoch microseconds.
        long[] timestampMicroTzValues = {1627689600, 1627776000, 1627862400};
        for (int i = 0; i < timestampMicroTzValues.length; i++) {
            timestampMicroTzVector.set(i, timestampMicroTzValues[i]);
        }
        timestampMicroTzVector.setValueCount(timestampMicroTzValues.length);
        fieldVectors.add(timestampMicroTzVector);

        var timestampNanoVector = new TimeStampNanoVector(ArrowFeatures.user.favoriteTimestampNano.getFqn(), allocator);
        timestampNanoVector.allocateNew();
        long[] timestampNanoValues = {1627689600000000000L, 1627776000000000000L, 1627862400000000000L};  // Thursday, July 31, 2021, ..., ...
        for (int i = 0; i < timestampNanoValues.length; i++) {
            timestampNanoVector.set(i, timestampNanoValues[i]);
        }
        timestampNanoVector.setValueCount(timestampNanoValues.length);
        fieldVectors.add(timestampNanoVector);

        var nanoTzType = FieldType.nullable(
            new org.apache.arrow.vector.types.pojo.ArrowType.Timestamp(org.apache.arrow.vector.types.TimeUnit.NANOSECOND, "US/Pacific")
        );
        var timestampNanoTzVector = new TimeStampNanoTZVector(ArrowFeatures.user.favoriteTimestampNanoTz.getFqn(), nanoTzType, allocator);
        timestampNanoTzVector.allocateNew();
        for (int i = 0; i < timestampNanoValues.length; i++) {
            timestampNanoTzVector.set(i, timestampNanoValues[i]);
        }
        timestampNanoTzVector.setValueCount(timestampNanoValues.length);
        fieldVectors.add(timestampNanoTzVector);

        var timeSecVector = new TimeSecVector(ArrowFeatures.user.favoriteTimeSec.getFqn(), allocator);
        timeSecVector.allocateNew();
        int[] timeSecValues = {36840, 36841, 36842};  // 10:14:00, 10:14:01, 10:14:02
        for (int i = 0; i < timeSecValues.length; i++) {
            timeSecVector.set(i, timeSecValues[i]);
        }
        timeSecVector.setValueCount(timeSecValues.length);
        fieldVectors.add(timeSecVector);

        var timeMilliVector = new TimeMilliVector(ArrowFeatures.user.favoriteTimeMilli.getFqn(), allocator);
        timeMilliVector.allocateNew();
        int[] timeMilliValues = {36840000, 36841000, 36842000};  // 10:14:00, 10:14:01, 10:14:02
        for (int i = 0; i < timeMilliValues.length; i++) {
            timeMilliVector.set(i, timeMilliValues[i]);
        }
        timeMilliVector.setValueCount(timeMilliValues.length);
        fieldVectors.add(timeMilliVector);

        var timeMicroVector = new TimeMicroVector(ArrowFeatures.user.favoriteTimeMicro.getFqn(), allocator);
        timeMicroVector.allocateNew();
        long[] timeMicroValues = {36840000000L, 36841000000L, 36842000000L};  // 10:14:00, 10:14:01, 10:14:02
        for (int i = 0; i < timeMicroValues.length; i++) {
            timeMicroVector.set(i, timeMicroValues[i]);
        }

        timeMicroVector.setValueCount(timeMicroValues.length);
        fieldVectors.add(timeMicroVector);

        var timeNanoVector = new TimeNanoVector(ArrowFeatures.user.favoriteTimeNano.getFqn(), allocator);
        timeNanoVector.allocateNew();
        long[] timeNanoValues = {36900000000000L, 36901000000000L, 36902000000000L};  // 10:14:00, 10:14:01, 10:14:02
        for (int i = 0; i < timeNanoValues.length; i++) {
            timeNanoVector.set(i, timeNanoValues[i]);
        }
        timeNanoVector.setValueCount(timeNanoValues.length);
        fieldVectors.add(timeNanoVector);

        var durationSecType = FieldType.nullable(
                new org.apache.arrow.vector.types.pojo.ArrowType.Duration(TimeUnit.SECOND)
        );
        var durationSecVector = new DurationVector(ArrowFeatures.user.favoriteDurationSec.getFqn(), durationSecType, allocator);
        durationSecVector.allocateNew();
        int[] durationSecValues = {36900, 36901, 36902};  // 10:14:00, 10:14:01, 10:14:02
        for (int i = 0; i < durationSecValues.length; i++) {
            durationSecVector.set(i, durationSecValues[i]);
        }
        durationSecVector.setValueCount(durationSecValues.length);
        fieldVectors.add(durationSecVector);

        var durationMilliType = FieldType.nullable(
                new org.apache.arrow.vector.types.pojo.ArrowType.Duration(TimeUnit.MILLISECOND)
        );
        var durationMilliVector = new DurationVector(ArrowFeatures.user.favoriteDurationMilli.getFqn(), durationMilliType, allocator);
        durationMilliVector.allocateNew();
        int[] durationMilliValues = {36840000, 36841000, 36842000};  // 10:14:00, 10:14:01, 10:14:02
        for (int i = 0; i < durationMilliValues.length; i++) {
            durationMilliVector.set(i, durationMilliValues[i]);
        }
        durationMilliVector.setValueCount(durationMilliValues.length);
        fieldVectors.add(durationMilliVector);

        var durationMicroType = FieldType.nullable(
                new org.apache.arrow.vector.types.pojo.ArrowType.Duration(TimeUnit.MICROSECOND)
        );
        var durationMicroVector = new DurationVector(ArrowFeatures.user.favoriteDurationMicro.getFqn(), durationMicroType, allocator);
        durationMicroVector.allocateNew();
        long[] durationMicroValues = {36840000000L, 36841000000L, 36842000000L};  // 10:14:00, 10:14:01, 10:14:02
        for (int i = 0; i < durationMicroValues.length; i++) {
            durationMicroVector.set(i, durationMicroValues[i]);
        }
        durationMicroVector.setValueCount(durationMicroValues.length);
        fieldVectors.add(durationMicroVector);

        var durationNanoType = FieldType.nullable(
                new org.apache.arrow.vector.types.pojo.ArrowType.Duration(TimeUnit.NANOSECOND)
        );
        var durationNanoVector = new DurationVector(ArrowFeatures.user.favoriteDurationNano.getFqn(), durationNanoType, allocator);
        durationNanoVector.allocateNew();
        long[] durationNanoValues = {36840000000000L, 36841000000000L, 36842000000000L};  // 10:14:00, 10:14:01, 10:14:02
        for (int i = 0; i < durationNanoValues.length; i++) {
            durationNanoVector.set(i, durationNanoValues[i]);
        }
        durationNanoVector.setValueCount(durationNanoValues.length);
        fieldVectors.add(durationNanoVector);

        /*
        Create struct vector for the following dataclass

            public class VanillaDataclass extends FeaturesClass {
                public Feature<Long> niceNumber;
                public Feature<java.time.LocalDateTime> niceDatetime;
            }
         */
        var structVector = StructVector.empty(ArrowFeatures.user.favoriteStruct.getFqn(), allocator);
        structVector.setValueCount(3);
        structVector.allocateNew();
        long[] niceNumberValues = {1L, 2L, 3L};
        long[] niceDatetimeValues = new long[]{36840000000000L, 36841000000000L, 36842000000000L};  // 10:14:00, 10:14:01, 10:14:02
        var structWriter = structVector.getWriter();
        var longWriter = structWriter.bigInt(ArrowFeatures.user.favoriteStruct.niceNumber.getFqn());
        var datetimeWriter = structWriter.timeStampSec(ArrowFeatures.user.favoriteStruct.niceDatetime.getFqn());
        for (var i = 0; i < niceNumberValues.length; i++) {
            structWriter.start();
            longWriter.writeBigInt(niceNumberValues[i]);
            datetimeWriter.writeTimeStampSec(niceDatetimeValues[i]);
            structWriter.end();
        }
        fieldVectors.add(structVector);

        // TODO: Support Decimal
        VectorSchemaRoot root = VectorSchemaRoot.of(Utils.listToArray(fieldVectors, FieldVector.class));
        var table = new Table(root);
        return table;
    }

    @Test
    public void testUnmarshalScalar() throws Exception {
        Table table = getTestTableWithAllArrowTypes();
        var users = TableUnmarshaller.unmarshal(table, ArrowUser.class);
        assert users.length == 3;
        assert users[0].favoriteBigInt.getValue() == 1L;
        assert users[1].favoriteBigInt.getValue() == 2L;
        assert users[2].favoriteBigInt.getValue() == 3L;

        assert users[0].favoriteInt.getValue() == 1;
        assert users[1].favoriteInt.getValue() == 2;
        assert users[2].favoriteInt.getValue() == 3;

        assert users[0].favoriteSmallInt.getValue() == 1;
        assert users[1].favoriteSmallInt.getValue() == 2;
        assert users[2].favoriteSmallInt.getValue() == 3;

        assert users[0].favoriteTinyInt.getValue() == 1;
        assert users[1].favoriteTinyInt.getValue() == 2;
        assert users[2].favoriteTinyInt.getValue() == 3;

        assert users[0].favoriteUtf8.getValue().equals("a");
        assert users[1].favoriteUtf8.getValue().equals("b");
        assert users[2].favoriteUtf8.getValue().equals("c");

        assert users[0].favoriteLargeUtf8.getValue().equals("a");
        assert users[1].favoriteLargeUtf8.getValue().equals("b");
        assert users[2].favoriteLargeUtf8.getValue().equals("c");

        assert users[0].favoriteBoolean.getValue();
        assert !users[1].favoriteBoolean.getValue();
        assert users[2].favoriteBoolean.getValue();

        assert users[0].favoriteFloat4.getValue() == 1.0f;
        assert users[1].favoriteFloat4.getValue() == 2.0f;
        assert users[2].favoriteFloat4.getValue() == 3.0f;

        assert users[0].favoriteFloat8.getValue() == 1.0;
        assert users[1].favoriteFloat8.getValue() == 2.0;
        assert users[2].favoriteFloat8.getValue() == 3.0;

        var expectedDatetime1 = LocalDateTime.of(2021, 7, 31, 0, 0, 0);
        var expectedDatetime2 = LocalDateTime.of(2021, 8, 1, 0, 0, 0);
        var expectedDatetime3 = LocalDateTime.of(2021, 8, 2, 0, 0, 0);

        var expectedZonedDatetime1 = ZonedDateTime.of(expectedDatetime1, ZoneId.of("UTC"));
        var expectedZonedDatetime2 = ZonedDateTime.of(expectedDatetime2, ZoneId.of("UTC"));
        var expectedZonedDatetime3 = ZonedDateTime.of(expectedDatetime3, ZoneId.of("UTC"));
        expectedZonedDatetime1 = expectedZonedDatetime1.withZoneSameInstant(ZoneId.of("US/Pacific"));
        expectedZonedDatetime2 = expectedZonedDatetime2.withZoneSameInstant(ZoneId.of("US/Pacific"));
        expectedZonedDatetime3 = expectedZonedDatetime3.withZoneSameInstant(ZoneId.of("US/Pacific"));


        assert users[0].favoriteDateMilli.getValue().equals(LocalDate.of(2021, 7, 31));
        assert users[1].favoriteDateMilli.getValue().equals(LocalDate.of(2021, 8, 1));
        assert users[2].favoriteDateMilli.getValue().equals(LocalDate.of(2021, 8, 2));

        assert users[0].favoriteDateDay.getValue().equals(LocalDate.of(2021, 7, 31));
        assert users[1].favoriteDateDay.getValue().equals(LocalDate.of(2021, 8, 1));
        assert users[2].favoriteDateDay.getValue().equals(LocalDate.of(2021, 8, 2));

        assert users[0].favoriteTimestampSec.getValue().equals(expectedDatetime1);
        assert users[1].favoriteTimestampSec.getValue().equals(expectedDatetime2);
        assert users[2].favoriteTimestampSec.getValue().equals(expectedDatetime3);

        assert users[0].favoriteTimestampMilli.getValue().equals(expectedDatetime1);
        assert users[1].favoriteTimestampMilli.getValue().equals(expectedDatetime2);
        assert users[2].favoriteTimestampMilli.getValue().equals(expectedDatetime3);

        assert users[0].favoriteTimestampMicro.getValue().equals(expectedDatetime1);
        assert users[1].favoriteTimestampMicro.getValue().equals(expectedDatetime2);
        assert users[2].favoriteTimestampMicro.getValue().equals(expectedDatetime3);

        assert users[0].favoriteTimestampNano.getValue().equals(expectedDatetime1);
        assert users[1].favoriteTimestampNano.getValue().equals(expectedDatetime2);
        assert users[2].favoriteTimestampNano.getValue().equals(expectedDatetime3);

        assert users[0].favoriteTimestampSecTz.getValue().equals(expectedZonedDatetime1);
        assert users[1].favoriteTimestampSecTz.getValue().equals(expectedZonedDatetime2);
        assert users[2].favoriteTimestampSecTz.getValue().equals(expectedZonedDatetime3);

        assert users[0].favoriteTimestampMilliTz.getValue().equals(expectedZonedDatetime1);
        assert users[1].favoriteTimestampMilliTz.getValue().equals(expectedZonedDatetime2);
        assert users[2].favoriteTimestampMilliTz.getValue().equals(expectedZonedDatetime3);

        assert users[0].favoriteTimestampMicroTz.getValue().equals(expectedZonedDatetime1);
        assert users[1].favoriteTimestampMicroTz.getValue().equals(expectedZonedDatetime2);
        assert users[2].favoriteTimestampMicroTz.getValue().equals(expectedZonedDatetime3);

        assert users[0].favoriteTimestampNanoTz.getValue().equals(expectedZonedDatetime1);
        assert users[1].favoriteTimestampNanoTz.getValue().equals(expectedZonedDatetime2);
        assert users[2].favoriteTimestampNanoTz.getValue().equals(expectedZonedDatetime3);









    }
}
