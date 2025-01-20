package ai.chalk.arrow;

import ai.chalk.arrow.test_features.ArrowUser;
import ai.chalk.arrow.test_features.NamedFeaturesClass;
import ai.chalk.arrow.test_features.VersionedFeaturesClass;
import ai.chalk.internal.Utils;
import ai.chalk.internal.arrow.FeatherProcessor;
import ai.chalk.internal.arrow.Unmarshaller;
import org.apache.arrow.memory.ArrowBuf;
import org.apache.arrow.memory.RootAllocator;
import org.apache.arrow.vector.*;
import org.apache.arrow.vector.complex.ListVector;
import org.apache.arrow.vector.complex.StructVector;
import org.apache.arrow.vector.table.Table;
import org.apache.arrow.vector.types.TimeUnit;
import org.apache.arrow.vector.types.pojo.FieldType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.*;
import java.util.*;


public class TestUnmarshaller {
    private RootAllocator allocator;
    @BeforeEach
    public void setUp() {
        allocator = new RootAllocator(FeatherProcessor.ALLOCATOR_SIZE_TEST);
    }

    @AfterEach
    public void tearDown() {
        // TODO: Fix test leak in fixture. Does not seem as simple as just closing the writers.
        //       Suspecting need to close the writers not immediately but after table creation.
        // allocator.close();
    }

    public Table getHasManyTable() {
        // Transactions class
        List<FieldVector> fieldVectors = new ArrayList<>();
        var idVector = new VarCharVector("transaction.id", allocator);

        idVector.allocateNew();
        String[] idValues = {"1", "2", "3"};
        for (int i = 0; i < idValues.length; i++) {
            idVector.set(i, idValues[i].getBytes());
        }
        idVector.setValueCount(idValues.length);
        fieldVectors.add(idVector);

        var amountVector = new Float8Vector("transaction.amount", allocator);
        amountVector.allocateNew();
        double[] amountValues = {1.0, 2.0, 3.0};
        for (int i = 0; i < amountValues.length; i++) {
            amountVector.set(i, amountValues[i]);
        }
        amountVector.setValueCount(amountValues.length);
        fieldVectors.add(amountVector);

        var userIdVector = new VarCharVector("transaction.user_id", allocator);
        userIdVector.allocateNew();
        String[] userIdValues = {"1", "1", "2"};
        for (int i = 0; i < userIdValues.length; i++) {
            userIdVector.set(i, userIdValues[i].getBytes());
        }
        userIdVector.setValueCount(userIdValues.length);
        fieldVectors.add(userIdVector);

        var transactions = new Table(fieldVectors);
        return transactions;
    }

    public Table getTestTableWithAllArrowTypes() {
        List<FieldVector> fieldVectors = new ArrayList<>();

        var idVector = new VarCharVector("arrow_user.id", allocator);
        idVector.allocateNew();
        String[] idValues = {"1", "2", "3"};
        for (int i = 0; i < idValues.length; i++) {
            idVector.set(i, idValues[i].getBytes());
        }
        idVector.setValueCount(idValues.length);
        fieldVectors.add(idVector);

        var bigIntVector = new BigIntVector("arrow_user.favorite_big_int", allocator);
        bigIntVector.allocateNew();
        long[] values = {1, 2, 3};
        for (int i = 0; i < values.length; i++) {
            bigIntVector.set(i, values[i]);
        }
        bigIntVector.setValueCount(values.length);
        fieldVectors.add(bigIntVector);

        var intVector = new IntVector("arrow_user.favorite_int", allocator);
        intVector.allocateNew();
        int[] intValues = {1, 2, 3};
        for (int i = 0; i < intValues.length; i++) {
            intVector.set(i, intValues[i]);
        }
        intVector.setValueCount(intValues.length);
        fieldVectors.add(intVector);

        var smallIntVector = new SmallIntVector("arrow_user.favorite_small_int", allocator);
        smallIntVector.allocateNew();
        short[] smallIntValues = {1, 2, 3};
        for (int i = 0; i < smallIntValues.length; i++) {
            smallIntVector.set(i, smallIntValues[i]);
        }
        smallIntVector.setValueCount(smallIntValues.length);
        fieldVectors.add(smallIntVector);

        var tinyIntVector = new TinyIntVector("arrow_user.favorite_tiny_int", allocator);
        tinyIntVector.allocateNew();
        byte[] tinyIntValues = {1, 2, 3};
        for (int i = 0; i < tinyIntValues.length; i++) {
            tinyIntVector.set(i, tinyIntValues[i]);
        }
        tinyIntVector.setValueCount(tinyIntValues.length);
        fieldVectors.add(tinyIntVector);

        var floatVector = new Float4Vector("arrow_user.favorite_float4", allocator);
        floatVector.allocateNew();
        float[] floatValues = {1.0f, 2.0f, 3.0f};
        for (int i = 0; i < floatValues.length; i++) {
            floatVector.set(i, floatValues[i]);
        }
        floatVector.setValueCount(floatValues.length);
        fieldVectors.add(floatVector);

        var doubleVector = new Float8Vector("arrow_user.favorite_float8", allocator);
        doubleVector.allocateNew();
        double[] doubleValues = {1.0, 2.0, 3.0};
        for (int i = 0; i < doubleValues.length; i++) {
            doubleVector.set(i, doubleValues[i]);
        }
        doubleVector.setValueCount(doubleValues.length);
        fieldVectors.add(doubleVector);

        var boolVector = new BitVector("arrow_user.favorite_boolean", allocator);
        boolVector.allocateNew();
        boolean[] boolValues = {true, false, true};
        for (int i = 0; i < boolValues.length; i++) {
            boolVector.set(i, boolValues[i] ? 1 : 0);
        }
        fieldVectors.add(boolVector);

        var utf8Vector = new VarCharVector("arrow_user.favorite_utf8", allocator);
        utf8Vector.allocateNew();
        String[] utf8Values = {"a", "b", "c"};
        for (int i = 0; i < utf8Values.length; i++) {
            utf8Vector.set(i, utf8Values[i].getBytes());
        }
        utf8Vector.setValueCount(utf8Values.length);
        fieldVectors.add(utf8Vector);

        var largeUtf8Vector = new LargeVarCharVector("arrow_user.favorite_large_utf8", allocator);
        largeUtf8Vector.allocateNew();
        String[] largeUtf8Values = {"a", "b", "c"};
        for (int i = 0; i < largeUtf8Values.length; i++) {
            largeUtf8Vector.set(i, largeUtf8Values[i].getBytes());
        }
        largeUtf8Vector.setValueCount(largeUtf8Values.length);
        fieldVectors.add(largeUtf8Vector);

        var dateVector = new DateDayVector("arrow_user.favorite_date_day", allocator);
        dateVector.allocateNew();
        int[] dateValues = {18839, 18840, 18841};  // Thursday, July 31, 2021, ..., ...
        for (int i = 0; i < dateValues.length; i++) {
            dateVector.set(i, dateValues[i]);
        }
        dateVector.setValueCount(dateValues.length);
        fieldVectors.add(dateVector);

        var dateMilliVector = new DateMilliVector("arrow_user.favorite_date_milli", allocator);
        dateMilliVector.allocateNew();
        // Thursday, July 31, 2021, ..., ... For some reason has to be epoch seconds instead of epoch milliseconds.
        long[] dateMilliValues = {1627689600000L, 1627776000000L, 1627862400000L};
        for (int i = 0; i < dateMilliValues.length; i++) {
            dateMilliVector.set(i, dateMilliValues[i]);
        }
        dateMilliVector.setValueCount(dateMilliValues.length);
        fieldVectors.add(dateMilliVector);

        var timestampSecVector = new TimeStampSecVector("arrow_user.favorite_timestamp_sec", allocator);
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
        var timestampSecTzVector = new TimeStampSecTZVector("arrow_user.favorite_timestamp_sec_tz", secTzType, allocator);
        timestampSecTzVector.allocateNew();
        long[] timestampSecTzValues = {1627689600, 1627776000, 1627862400};  // Thursday, July 31, 2021 Pacific??, ..., ...
        for (int i = 0; i < timestampSecTzValues.length; i++) {
            timestampSecTzVector.set(i, timestampSecTzValues[i]);
        }
        timestampSecTzVector.setValueCount(timestampSecTzValues.length);
        fieldVectors.add(timestampSecTzVector);

        var timestampMilliVector = new TimeStampMilliVector("arrow_user.favorite_timestamp_milli", allocator);
        timestampMilliVector.allocateNew();
        long[] timestampMilliValues = {1627689600001L, 1627776000001L, 1627862400001L};  // Thursday, July 31, 2021, ..., ...
        for (int i = 0; i < timestampMilliValues.length; i++) {
            timestampMilliVector.set(i, timestampMilliValues[i]);
        }
        timestampMilliVector.setValueCount(timestampMilliValues.length);
        fieldVectors.add(timestampMilliVector);

        var milliTzType = FieldType.nullable(
            new org.apache.arrow.vector.types.pojo.ArrowType.Timestamp(org.apache.arrow.vector.types.TimeUnit.MILLISECOND, "US/Pacific")
        );
        var timestampMilliTzVector = new TimeStampMilliTZVector("arrow_user.favorite_timestamp_milli_tz", milliTzType, allocator);
        timestampMilliTzVector.allocateNew();
        for (int i = 0; i < timestampMilliValues.length; i++) {
            timestampMilliTzVector.set(i, timestampMilliValues[i]);
        }
        timestampMilliTzVector.setValueCount(timestampMilliValues.length);
        fieldVectors.add(timestampMilliTzVector);

        var timestampMicroVector = new TimeStampMicroVector("arrow_user.favorite_timestamp_micro", allocator);
        timestampMicroVector.allocateNew();
        long[] timestampMicroValues = {1627689600000001L, 1627776000000001L, 1627862400000001L};  // Thursday, July 31, 2021, ..., ...
        for (int i = 0; i < timestampMicroValues.length; i++) {
            timestampMicroVector.set(i, timestampMicroValues[i]);
        }
        timestampMicroVector.setValueCount(timestampMicroValues.length);
        fieldVectors.add(timestampMicroVector);

        var microTzType = FieldType.nullable(
            new org.apache.arrow.vector.types.pojo.ArrowType.Timestamp(org.apache.arrow.vector.types.TimeUnit.MICROSECOND, "US/Pacific")
        );
        var timestampMicroTzVector = new TimeStampMicroTZVector("arrow_user.favorite_timestamp_micro_tz", microTzType, allocator);
        timestampMicroTzVector.allocateNew();

        for (int i = 0; i < timestampMicroValues.length; i++) {
            timestampMicroTzVector.set(i, timestampMicroValues[i]);
        }
        timestampMicroTzVector.setValueCount(timestampMicroValues.length);
        fieldVectors.add(timestampMicroTzVector);

        var timestampNanoVector = new TimeStampNanoVector("arrow_user.favorite_timestamp_nano", allocator);
        timestampNanoVector.allocateNew();
        long[] timestampNanoValues = {1627689600000000001L, 1627776000000000001L, 1627862400000000001L};  // Thursday, July 31, 2021, ..., ...
        for (int i = 0; i < timestampNanoValues.length; i++) {
            timestampNanoVector.set(i, timestampNanoValues[i]);
        }
        timestampNanoVector.setValueCount(timestampNanoValues.length);
        fieldVectors.add(timestampNanoVector);

        var nanoTzType = FieldType.nullable(
            new org.apache.arrow.vector.types.pojo.ArrowType.Timestamp(org.apache.arrow.vector.types.TimeUnit.NANOSECOND, "US/Pacific")
        );
        var timestampNanoTzVector = new TimeStampNanoTZVector("arrow_user.favorite_timestamp_nano_tz", nanoTzType, allocator);
        timestampNanoTzVector.allocateNew();
        for (int i = 0; i < timestampNanoValues.length; i++) {
            timestampNanoTzVector.set(i, timestampNanoValues[i]);
        }
        timestampNanoTzVector.setValueCount(timestampNanoValues.length);
        fieldVectors.add(timestampNanoTzVector);

        var timeSecVector = new TimeSecVector("arrow_user.favorite_time_sec", allocator);
        timeSecVector.allocateNew();
        int[] timeSecValues = {36840, 36841, 36842};  // 10:14:00, 10:14:01, 10:14:02
        for (int i = 0; i < timeSecValues.length; i++) {
            timeSecVector.set(i, timeSecValues[i]);
        }
        timeSecVector.setValueCount(timeSecValues.length);
        fieldVectors.add(timeSecVector);

        var timeMilliVector = new TimeMilliVector("arrow_user.favorite_time_milli", allocator);
        timeMilliVector.allocateNew();
        int[] timeMilliValues = {36840001, 36841001, 36842001};  // 10:14:00.000, 10:14:00.001, 10:14:00.002
        for (int i = 0; i < timeMilliValues.length; i++) {
            timeMilliVector.set(i, timeMilliValues[i]);
        }
        timeMilliVector.setValueCount(timeMilliValues.length);
        fieldVectors.add(timeMilliVector);

        var timeMicroVector = new TimeMicroVector("arrow_user.favorite_time_micro", allocator);
        timeMicroVector.allocateNew();
        long[] timeMicroValues = {36840000001L, 36841000001L, 36842000001L};  // 10:14:00, 10:14:01, 10:14:02
        for (int i = 0; i < timeMicroValues.length; i++) {
            timeMicroVector.set(i, timeMicroValues[i]);
        }

        timeMicroVector.setValueCount(timeMicroValues.length);
        fieldVectors.add(timeMicroVector);

        var timeNanoVector = new TimeNanoVector("arrow_user.favorite_time_nano", allocator);
        timeNanoVector.allocateNew();
        long[] timeNanoValues = {36840000000001L, 36841000000001L, 36842000000001L};  // 10:14:00, 10:14:01, 10:14:02
        for (int i = 0; i < timeNanoValues.length; i++) {
            timeNanoVector.set(i, timeNanoValues[i]);
        }
        timeNanoVector.setValueCount(timeNanoValues.length);
        fieldVectors.add(timeNanoVector);

        var durationSecType = FieldType.nullable(
                new org.apache.arrow.vector.types.pojo.ArrowType.Duration(TimeUnit.SECOND)
        );
        var durationSecVector = new DurationVector("arrow_user.favorite_duration_sec", durationSecType, allocator);
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
        var durationMilliVector = new DurationVector("arrow_user.favorite_duration_milli", durationMilliType, allocator);
        durationMilliVector.allocateNew();
        int[] durationMilliValues = {36840001, 36841001, 36842001};  // 10:14:00, 10:14:01, 10:14:02
        for (int i = 0; i < durationMilliValues.length; i++) {
            durationMilliVector.set(i, durationMilliValues[i]);
        }
        durationMilliVector.setValueCount(durationMilliValues.length);
        fieldVectors.add(durationMilliVector);

        var durationMicroType = FieldType.nullable(
                new org.apache.arrow.vector.types.pojo.ArrowType.Duration(TimeUnit.MICROSECOND)
        );
        var durationMicroVector = new DurationVector("arrow_user.favorite_duration_micro", durationMicroType, allocator);
        durationMicroVector.allocateNew();
        long[] durationMicroValues = {36840000001L, 36841000001L, 36842000001L};  // 10:14:00, 10:14:01, 10:14:02
        for (int i = 0; i < durationMicroValues.length; i++) {
            durationMicroVector.set(i, durationMicroValues[i]);
        }
        durationMicroVector.setValueCount(durationMicroValues.length);
        fieldVectors.add(durationMicroVector);

        var durationNanoType = FieldType.nullable(
                new org.apache.arrow.vector.types.pojo.ArrowType.Duration(TimeUnit.NANOSECOND)
        );
        var durationNanoVector = new DurationVector("arrow_user.favorite_duration_nano", durationNanoType, allocator);
        durationNanoVector.allocateNew();
        long[] durationNanoValues = {36840000000001L, 36841000000001L, 36842000000001L};  // 10:14:00, 10:14:01, 10:14:02
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
        var structVector = StructVector.empty("arrow_user.favorite_struct", allocator);

        var numRows = 3;
        structVector.setValueCount(numRows);
        structVector.allocateNew();

        var structWriter = structVector.getWriter();

        long[] niceNumberValues = {1L, 2L, 3L};
        var longWriter = structWriter.bigInt("nice_number");

        int[] niceDatetimeValues = new int[]{1627689600, 1627776000, 1627862400};  // 10:14:00, 10:14:01, 10:14:02
        var datetimeWriter = structWriter.timeStampSec("nice_datetime");
        for (var i = 0; i < numRows; i++) {
            structWriter.start();
            longWriter.writeBigInt(niceNumberValues[i]);
            datetimeWriter.writeTimeStampSec(niceDatetimeValues[i]);
            structWriter.end();
        }
        fieldVectors.add(structVector);

        var nestedNiceNumberValues = new long[]{1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L};
        var nestedNiceTimestampSecValues = new int[]{1627689600, 1627776000, 1627862400, 1627862400, 1627689600, 1627776000, 1627776000, 1627862400, 1627689600};

        var structComplexVector = StructVector.empty("arrow_user.favorite_struct_complex", allocator);
        structComplexVector.setValueCount(numRows);
        structComplexVector.allocateNew();
        var outerStructWriter = structComplexVector.getWriter();

        long[] goodNumberValues = {1L, 2L, 3L};
        var innerIntWriter = outerStructWriter.bigInt("good_number");

        var innerStructWriter = outerStructWriter.struct("good_dataclass");
        var innerStructIntWriter = innerStructWriter.bigInt("nice_number");
        var innerStructDatetimeWriter = innerStructWriter.timeStampSec("nice_datetime");

        var innerStructStructListWriter = outerStructWriter.list("good_dataclasses");

        for (var i = 0; i < numRows; i++) {
            outerStructWriter.start();
            innerIntWriter.writeBigInt(goodNumberValues[i]);
            innerStructWriter.start();
            innerStructIntWriter.writeBigInt(goodNumberValues[i]);
            innerStructDatetimeWriter.writeTimeStampSec(niceDatetimeValues[i]);
            innerStructWriter.end();

            var innerInnerStructWriter = innerStructStructListWriter.struct();
            var nestedBigIntWriter = innerInnerStructWriter.bigInt("nice_number");
            var nestedTimestampWriter = innerInnerStructWriter.timeStampSec("nice_datetime");

            innerStructStructListWriter.startList();
            for (var j = 0; j < 3; j++) {
                var idx = i * 3 + j;
                innerInnerStructWriter.start();
                nestedBigIntWriter.writeBigInt(nestedNiceNumberValues[idx]);
                nestedTimestampWriter.writeTimeStampSec(nestedNiceTimestampSecValues[idx]);
                innerInnerStructWriter.end();
            }
            innerStructStructListWriter.endList();
            outerStructWriter.end();
        }
        fieldVectors.add(structComplexVector);

        var listVector = ListVector.empty("arrow_user.favorite_string_list", allocator);
        var listWriter = listVector.getWriter();
        var varCharValues = new String[]{"a", "b", "c", "d", "e", "f", "g", "h", "i"};
        for (var i = 0; i < 3; i++) {
            listWriter.startList();
            for (var j = 0; j < 3; j++) {
                var idx = i * 3 + j;
                var character = varCharValues[idx];
                var bytes = character.getBytes();
                ArrowBuf tempBuf = allocator.buffer(bytes.length);
                tempBuf.setBytes(0, bytes);
                listWriter.writeVarChar(0, bytes.length, tempBuf);
            }
            listWriter.endList();
        }
        listVector.setValueCount(3);
        fieldVectors.add(listVector);

        var boolListVector = ListVector.empty("arrow_user.favorite_boolean_list", allocator);
        var boolListWriter = boolListVector.getWriter();
        var boolListValues = new boolean[]{false, true, true, true, false, true, true, true, false};
        for (var i = 0; i < 3; i++) {
            boolListWriter.startList();
            for (var j = 0; j < 3; j++) {
                var idx = i * 3 + j;
                var bool = boolListValues[idx];
                boolListWriter.writeBit(bool ? 1 : 0);
            }
            boolListWriter.endList();
        }
        boolListVector.setValueCount(3);
        fieldVectors.add(boolListVector);

        var longListVector = ListVector.empty("arrow_user.favorite_long_list", allocator);
        var longListWriter = longListVector.getWriter();
        var longListValues = new long[]{1L, 2L, 3L, 4L, 5L, 6L, 7L, 8L, 9L};
        for (var i = 0; i < 3; i++) {
            longListWriter.startList();
            for (var j = 0; j < 3; j++) {
                var idx = i * 3 + j;
                var longValue = longListValues[idx];
                longListWriter.writeBigInt(longValue);
            }
            longListWriter.endList();
        }
        longListVector.setValueCount(3);
        fieldVectors.add(longListVector);

        var doubleListvector = ListVector.empty("arrow_user.favorite_double_list", allocator);
        var doubleListWriter = doubleListvector.getWriter();
        var doubleListValues = new double[]{1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0};
        for (var i = 0; i < 3; i++) {
            doubleListWriter.startList();
            for (var j = 0; j < 3; j++) {
                var idx = i * 3 + j;
                var doubleValue = doubleListValues[idx];
                doubleListWriter.writeFloat8(doubleValue);
            }
            doubleListWriter.endList();
        }
        doubleListvector.setValueCount(3);
        fieldVectors.add(doubleListvector);

        var timestampSecListVector = ListVector.empty("arrow_user.favorite_timestamp_sec_list", allocator);
        var timestampSecListWriter = timestampSecListVector.getWriter();
        var timestampSecListValues = new int[]{1627689600, 1627776000, 1627862400, 1627862400, 1627689600, 1627776000, 1627776000, 1627862400, 1627689600};
        for (var i = 0; i < 3; i++) {
            timestampSecListWriter.startList();
            for (var j = 0; j < 3; j++) {
                var idx = i * 3 + j;
                var timestampSecValue = timestampSecListValues[idx];
                timestampSecListWriter.writeTimeStampSec(timestampSecValue);
            }
            timestampSecListWriter.endList();
        }
        timestampSecListVector.setValueCount(3);
        fieldVectors.add(timestampSecListVector);

        // Create a list of structs
        var structListVector = ListVector.empty("arrow_user.favorite_struct_list", allocator);
        var structListWriter = structListVector.getWriter();
        for (var i = 0; i < 3; i++) {
            structListWriter.startList();
            var nestedStructWriter = structListWriter.struct();
            for (var j = 0; j < 3; j++) {
                var idx = i * 3 + j;
                nestedStructWriter.start();
                nestedStructWriter.bigInt("nice_number").writeBigInt(nestedNiceNumberValues[idx]);
                nestedStructWriter.timeStampSec("nice_datetime").writeTimeStampSec(nestedNiceTimestampSecValues[idx]);
                nestedStructWriter.end();
            }
            structListWriter.endList();
        }
        structListVector.setValueCount(3);
        fieldVectors.add(structListVector);

        var hasOneDoubleVector = new Float8Vector("arrow_user.favorite_has_one.length", allocator);
        hasOneDoubleVector.allocateNew();
        double[] hasOneDoubleValues = {1.0, 2.0, 3.0};
        for (int i = 0; i < hasOneDoubleValues.length; i++) {
            hasOneDoubleVector.set(i, hasOneDoubleValues[i]);
        }
        hasOneDoubleVector.setValueCount(hasOneDoubleValues.length);
        fieldVectors.add(hasOneDoubleVector);

        var windowedDoubleVector__1d__ = new Float8Vector("arrow_user.favorite_windowed__86400__", allocator);
        windowedDoubleVector__1d__.allocateNew();
        double[] windowedDoubleValues__1d__ = {1.0, 2.0, 3.0};
        for (int i = 0; i < windowedDoubleValues__1d__.length; i++) {
            windowedDoubleVector__1d__.set(i, windowedDoubleValues__1d__[i]);
        }
        windowedDoubleVector__1d__.setValueCount(windowedDoubleValues__1d__.length);
        fieldVectors.add(windowedDoubleVector__1d__);

        var windowedDoubleVector__601s__ = new Float8Vector("arrow_user.favorite_windowed__601__", allocator);
        windowedDoubleVector__601s__.allocateNew();
        double[] windowedDoubleValues__601s__ = {4.0, 5.0, 6.0};
        for (int i = 0; i < windowedDoubleValues__601s__.length; i++) {
            windowedDoubleVector__601s__.set(i, windowedDoubleValues__601s__[i]);
        }
        windowedDoubleVector__601s__.setValueCount(windowedDoubleValues__601s__.length);
        fieldVectors.add(windowedDoubleVector__601s__);

        // Add nullable versions of the above vectors

        var bigIntVectorNullable = new BigIntVector("arrow_user.favorite_big_int_nullable", allocator);
        bigIntVectorNullable.allocateNew();
        Long[] optionalLongValues = {1L, null, 3L};
        for (int i = 0; i < optionalLongValues.length; i++) {
            if (optionalLongValues[i] != null) {
                bigIntVectorNullable.set(i, optionalLongValues[i]);
            }
        }
        bigIntVectorNullable.setValueCount(optionalLongValues.length);
        fieldVectors.add(bigIntVectorNullable);

        var intVectorNullable = new IntVector("arrow_user.favorite_int_nullable", allocator);
        intVectorNullable.allocateNew();
        Integer[] optionalIntValues = {1, null, 3};
        for (int i = 0; i < optionalIntValues.length; i++) {
            if (optionalIntValues[i] != null) {
                intVectorNullable.set(i, optionalIntValues[i]);
            }
        }
        intVectorNullable.setValueCount(optionalIntValues.length);
        fieldVectors.add(intVectorNullable);

        var smallIntVectorNullable = new SmallIntVector("arrow_user.favorite_small_int_nullable", allocator);
        smallIntVectorNullable.allocateNew();
        Short[] optionalSmallIntValues = {1, null, 3};
        for (int i = 0; i < optionalSmallIntValues.length; i++) {
            if (optionalSmallIntValues[i] != null) {
                smallIntVectorNullable.set(i, optionalSmallIntValues[i]);
            }
        }
        smallIntVectorNullable.setValueCount(optionalSmallIntValues.length);
        fieldVectors.add(smallIntVectorNullable);

        var tinyIntVectorNullable = new TinyIntVector("arrow_user.favorite_tiny_int_nullable", allocator);
        tinyIntVectorNullable.allocateNew();
        Byte[] optionalTinyIntValues = {1, null, 3};
        for (int i = 0; i < optionalTinyIntValues.length; i++) {
            if (optionalTinyIntValues[i] != null) {
                tinyIntVectorNullable.set(i, optionalTinyIntValues[i]);
            }
        }
        tinyIntVectorNullable.setValueCount(optionalTinyIntValues.length);
        fieldVectors.add(tinyIntVectorNullable);

        var floatVectorNullable = new Float4Vector("arrow_user.favorite_float4_nullable", allocator);
        floatVectorNullable.allocateNew();
        Float[] optionalFloatValues = {1.0f, null, 3.0f};
        for (int i = 0; i < optionalFloatValues.length; i++) {
            if (optionalFloatValues[i] != null) {
                floatVectorNullable.set(i, optionalFloatValues[i]);
            }
        }
        floatVectorNullable.setValueCount(optionalFloatValues.length);
        fieldVectors.add(floatVectorNullable);

        var doubleVectorNullable = new Float8Vector("arrow_user.favorite_float8_nullable", allocator);
        doubleVectorNullable.allocateNew();
        Double[] optionalDoubleValues = {1.0, null, 3.0};
        for (int i = 0; i < optionalDoubleValues.length; i++) {
            if (optionalDoubleValues[i] != null) {
                doubleVectorNullable.set(i, optionalDoubleValues[i]);
            }
        }
        doubleVectorNullable.setValueCount(optionalDoubleValues.length);
        fieldVectors.add(doubleVectorNullable);

        var utf8VectorNullable = new VarCharVector("arrow_user.favorite_utf8_nullable", allocator);
        utf8VectorNullable.allocateNew();
        String[] optionalUtf8Values = {"a", null, ""};
        for (int i = 0; i < optionalUtf8Values.length; i++) {
            if (optionalUtf8Values[i] != null) {
                utf8VectorNullable.set(i, optionalUtf8Values[i].getBytes());
            }
        }
        utf8VectorNullable.setValueCount(optionalUtf8Values.length);
        fieldVectors.add(utf8VectorNullable);


        var largeUtf8VectorNullable = new LargeVarCharVector("arrow_user.favorite_large_utf8_nullable", allocator);
        largeUtf8VectorNullable.allocateNew();
        String[] optionalLargeUtf8Values = {"a", null, ""};
        for (int i = 0; i < optionalLargeUtf8Values.length; i++) {
            if (optionalLargeUtf8Values[i] != null) {
                largeUtf8VectorNullable.set(i, optionalLargeUtf8Values[i].getBytes());
            }
        }
        largeUtf8VectorNullable.setValueCount(optionalLargeUtf8Values.length);
         fieldVectors.add(largeUtf8VectorNullable);

        var booleanVectorNullable = new BitVector("arrow_user.favorite_boolean_nullable", allocator);
        booleanVectorNullable.allocateNew();
        Boolean[] optionalBooleanValues = {true, null, false};
        for (int i = 0; i < optionalBooleanValues.length; i++) {
            if (optionalBooleanValues[i] != null) {
                booleanVectorNullable.set(i, optionalBooleanValues[i] ? 1 : 0);
            }
        }
        booleanVectorNullable.setValueCount(optionalBooleanValues.length);
        fieldVectors.add(booleanVectorNullable);

        var dateDayVectorNullable = new DateDayVector("arrow_user.favorite_date_day_nullable", allocator);
        dateDayVectorNullable.allocateNew();
        Integer[] optionalDateDayValues = {18839, null, 18841};
        for (int i = 0; i < optionalDateDayValues.length; i++) {
            if (optionalDateDayValues[i] != null) {
                dateDayVectorNullable.set(i, optionalDateDayValues[i]);
            }
        }
        dateDayVectorNullable.setValueCount(optionalDateDayValues.length);
        fieldVectors.add(dateDayVectorNullable);

        var dateMilliVectorNullable = new DateMilliVector("arrow_user.favorite_date_milli_nullable", allocator);
        dateMilliVectorNullable.allocateNew();
        Long[] optionalDateMilliValues = {1627689600000L, null, 1627862400000L};;
        for (int i = 0; i < optionalDateMilliValues.length; i++) {
            if (optionalDateMilliValues[i] != null) {
                dateMilliVectorNullable.set(i, optionalDateMilliValues[i]);
            }
        }
        dateMilliVectorNullable.setValueCount(optionalDateMilliValues.length);
        fieldVectors.add(dateMilliVectorNullable);

        var timeSecVectorNullable = new TimeSecVector("arrow_user.favorite_time_sec_nullable", allocator);
        timeSecVectorNullable.allocateNew();
        Integer[] optionalTimeSecValues = {36840, null, 36842};
        for (int i = 0; i < optionalTimeSecValues.length; i++) {
            if (optionalTimeSecValues[i] != null) {
                timeSecVectorNullable.set(i, optionalTimeSecValues[i]);
            }
        }
        timeSecVectorNullable.setValueCount(optionalTimeSecValues.length);
        fieldVectors.add(timeSecVectorNullable);

        var timeMilliVectorNullable = new TimeMilliVector("arrow_user.favorite_time_milli_nullable", allocator);
        timeMilliVectorNullable.allocateNew();
        Integer[] optionalTimeMilliValues = {36840001, null, 36842001};
        for (int i = 0; i < optionalTimeMilliValues.length; i++) {
            if (optionalTimeMilliValues[i] != null) {
                timeMilliVectorNullable.set(i, optionalTimeMilliValues[i]);
            }
        }
        timeMilliVectorNullable.setValueCount(optionalTimeMilliValues.length);
        fieldVectors.add(timeMilliVectorNullable);

        var timeMicroVectorNullable = new TimeMicroVector("arrow_user.favorite_time_micro_nullable", allocator);
        timeMicroVectorNullable.allocateNew();
        Long[] optionalTimeMicroValues = {36840000001L, null, 36842000001L};
        for (int i = 0; i < optionalTimeMicroValues.length; i++) {
            if (optionalTimeMicroValues[i] != null) {
                timeMicroVectorNullable.set(i, optionalTimeMicroValues[i]);
            }
        }
        timeMicroVectorNullable.setValueCount(optionalTimeMicroValues.length);
        fieldVectors.add(timeMicroVectorNullable);

        var timeNanoVectorNullable = new TimeNanoVector("arrow_user.favorite_time_nano_nullable", allocator);
        timeNanoVectorNullable.allocateNew();
        Long[] optionalTimeNanoValues = {36840000000001L, null, 36842000000001L};
        for (int i = 0; i < optionalTimeNanoValues.length; i++) {
            if (optionalTimeNanoValues[i] != null) {
                timeNanoVectorNullable.set(i, optionalTimeNanoValues[i]);
            }
        }
        timeNanoVectorNullable.setValueCount(optionalTimeNanoValues.length);
        fieldVectors.add(timeNanoVectorNullable);

        var timestampSecVectorNullable = new TimeStampSecVector("arrow_user.favorite_timestamp_sec_nullable", allocator);
        timestampSecVectorNullable.allocateNew();
        Integer[] optionalTimestampSecValues = {1627689600, null, 1627862400};
        for (int i = 0; i < optionalTimestampSecValues.length; i++) {
            if (optionalTimestampSecValues[i] != null) {
                timestampSecVectorNullable.set(i, optionalTimestampSecValues[i]);
            }
        }
        timestampSecVectorNullable.setValueCount(optionalTimestampSecValues.length);
        fieldVectors.add(timestampSecVectorNullable);

        var timestampMilliVectorNullable = new TimeStampMilliVector("arrow_user.favorite_timestamp_milli_nullable", allocator);
        timestampMilliVectorNullable.allocateNew();
        Long[] optionalTimestampMilliValues = {1627689600001L, null, 1627862400001L};
        for (int i = 0; i < optionalTimestampMilliValues.length; i++) {
            if (optionalTimestampMilliValues[i] != null) {
                timestampMilliVectorNullable.set(i, optionalTimestampMilliValues[i]);
            }
        }
        timestampMilliVectorNullable.setValueCount(optionalTimestampMilliValues.length);
        fieldVectors.add(timestampMilliVectorNullable);

        var timestampMicroVectorNullable = new TimeStampMicroVector("arrow_user.favorite_timestamp_micro_nullable", allocator);
        timestampMicroVectorNullable.allocateNew();
        Long[] optionalTimestampMicroValues = {1627689600000001L, null, 1627862400000001L};
        for (int i = 0; i < optionalTimestampMicroValues.length; i++) {
            if (optionalTimestampMicroValues[i] != null) {
                timestampMicroVectorNullable.set(i, optionalTimestampMicroValues[i]);
            }
        }
        timestampMicroVectorNullable.setValueCount(optionalTimestampMicroValues.length);
        fieldVectors.add(timestampMicroVectorNullable);

        var timestampNanoVectorNullable = new TimeStampNanoVector("arrow_user.favorite_timestamp_nano_nullable", allocator);
        timestampNanoVectorNullable.allocateNew();
        Long[] optionalTimestampNanoValues = {1627689600000000001L, null, 1627862400000000001L};
        for (int i = 0; i < optionalTimestampNanoValues.length; i++) {
            if (optionalTimestampNanoValues[i] != null) {
                timestampNanoVectorNullable.set(i, optionalTimestampNanoValues[i]);
            }
        }
        timestampNanoVectorNullable.setValueCount(optionalTimestampNanoValues.length);
        fieldVectors.add(timestampNanoVectorNullable);

        var timestampSecTzVectorNullable = new TimeStampSecTZVector("arrow_user.favorite_timestamp_sec_tz_nullable", secTzType, allocator);
        timestampSecTzVectorNullable.allocateNew();
        Integer[] optionalTimestampSecTzValues = {1627689600, null, 1627862400};
        for (int i = 0; i < optionalTimestampSecTzValues.length; i++) {
            if (optionalTimestampSecTzValues[i] != null) {
                timestampSecTzVectorNullable.set(i, optionalTimestampSecTzValues[i]);
            }
        }
        timestampSecTzVectorNullable.setValueCount(optionalTimestampSecTzValues.length);
        fieldVectors.add(timestampSecTzVectorNullable);

        var timestampMilliTzVectorNullable = new TimeStampMilliTZVector("arrow_user.favorite_timestamp_milli_tz_nullable", milliTzType, allocator);
        timestampMilliTzVectorNullable.allocateNew();
        Long[] optionalTimestampMilliTzValues = {1627689600001L, null, 1627862400001L};
        for (int i = 0; i < optionalTimestampMilliTzValues.length; i++) {
            if (optionalTimestampMilliTzValues[i] != null) {
                timestampMilliTzVectorNullable.set(i, optionalTimestampMilliTzValues[i]);
            }
        }
        timestampMilliTzVectorNullable.setValueCount(optionalTimestampMilliTzValues.length);
        fieldVectors.add(timestampMilliTzVectorNullable);

        var timestampMicroTzVectorNullable = new TimeStampMicroTZVector("arrow_user.favorite_timestamp_micro_tz_nullable", microTzType, allocator);
        timestampMicroTzVectorNullable.allocateNew();
        Long[] optionalTimestampMicroTzValues = {1627689600000001L, null, 1627862400000001L};
        for (int i = 0; i < optionalTimestampMicroTzValues.length; i++) {
            if (optionalTimestampMicroTzValues[i] != null) {
                timestampMicroTzVectorNullable.set(i, optionalTimestampMicroTzValues[i]);
            }
        }
        timestampMicroTzVectorNullable.setValueCount(optionalTimestampMicroTzValues.length);
        fieldVectors.add(timestampMicroTzVectorNullable);

        var timestampNanoTzVectorNullable = new TimeStampNanoTZVector("arrow_user.favorite_timestamp_nano_tz_nullable", nanoTzType, allocator);
        timestampNanoTzVectorNullable.allocateNew();
        Long[] optionalTimestampNanoTzValues = {1627689600000000001L, null, 1627862400000000001L};
        for (int i = 0; i < optionalTimestampNanoTzValues.length; i++) {
            if (optionalTimestampNanoTzValues[i] != null) {
                timestampNanoTzVectorNullable.set(i, optionalTimestampNanoTzValues[i]);
            }
        }
        timestampNanoTzVectorNullable.setValueCount(optionalTimestampNanoTzValues.length);
        fieldVectors.add(timestampNanoTzVectorNullable);

        var durationSecVectorNullable = new DurationVector("arrow_user.favorite_duration_sec_nullable", durationSecType, allocator);
        durationSecVectorNullable.allocateNew();
        Integer[] optionalDurationSecValues = {36900, null, 36902};
        for (int i = 0; i < optionalDurationSecValues.length; i++) {
            if (optionalDurationSecValues[i] != null) {
                durationSecVectorNullable.set(i, optionalDurationSecValues[i]);
            }
        }
        fieldVectors.add(durationSecVectorNullable);

        var durationMilliVectorNullable = new DurationVector("arrow_user.favorite_duration_milli_nullable", durationMilliType, allocator);
        durationMilliVectorNullable.allocateNew();
        Integer[] optionalDurationMilliValues = {36840001, null, 36842001};
        for (int i = 0; i < optionalDurationMilliValues.length; i++) {
            if (optionalDurationMilliValues[i] != null) {
                durationMilliVectorNullable.set(i, optionalDurationMilliValues[i]);
            }
        }
        fieldVectors.add(durationMilliVectorNullable);

        var durationMicroVectorNullable = new DurationVector("arrow_user.favorite_duration_micro_nullable", durationMicroType, allocator);
        durationMicroVectorNullable.allocateNew();
        Long[] optionalDurationMicroValues = {36840000001L, null, 36842000001L};
        for (int i = 0; i < optionalDurationMicroValues.length; i++) {
            if (optionalDurationMicroValues[i] != null) {
                durationMicroVectorNullable.set(i, optionalDurationMicroValues[i]);
            }
        }
        fieldVectors.add(durationMicroVectorNullable);

        var durationNanoVectorNullable = new DurationVector("arrow_user.favorite_duration_nano_nullable", durationNanoType, allocator);
        durationNanoVectorNullable.allocateNew();
        Long[] optionalDurationNanoValues = {36840000000001L, null, 36842000000001L};
        for (int i = 0; i < optionalDurationNanoValues.length; i++) {
            if (optionalDurationNanoValues[i] != null) {
                durationNanoVectorNullable.set(i, optionalDurationNanoValues[i]);
            }
        }
        fieldVectors.add(durationNanoVectorNullable);

        var structVectorNullable = StructVector.empty("arrow_user.favorite_struct_nullable", allocator);
        var numNullableRows = 3;
        structVectorNullable.setValueCount(numNullableRows);
        structVectorNullable.allocateNew();

        var structWriterNullable = structVectorNullable.getWriter();
        var longWriterNullable = structWriterNullable.bigInt("nice_number");
        var datetimeWriterNullable = structWriterNullable.timeStampSec("nice_datetime");
        // Fill in every row but the last
        for (var i = 0; i < numNullableRows - 1; i++) {
            structWriterNullable.start();
            longWriterNullable.writeBigInt(niceNumberValues[i]);
            datetimeWriterNullable.writeTimeStampSec(niceDatetimeValues[i]);
            structWriterNullable.end();
        }
        fieldVectors.add(structVectorNullable);

        var listVectorNullable = ListVector.empty("arrow_user.favorite_string_list_nullable", allocator);
        listVectorNullable.setValueCount(numNullableRows);
        listVectorNullable.allocateNew();

        var listWriterNullable = listVectorNullable.getWriter();
        for (var i = 0; i < numNullableRows - 1; i++) {
            listWriterNullable.startList();
            for (var j = 0; j < 3; j++) {
                var idx = i * 3 + j;
                var character = varCharValues[idx];
                var bytes = character.getBytes();
                ArrowBuf tempBuf = allocator.buffer(bytes.length);
                tempBuf.setBytes(0, bytes);
                listWriterNullable.writeVarChar(0, bytes.length, tempBuf);
            }
            listWriterNullable.endList();
        }
        fieldVectors.add(listVectorNullable);

        // TODO: Support binary
        // TODO: Support Decimal
        // FIXME: Fix field type should not be nullable for non-nullable tests.
        VectorSchemaRoot root = VectorSchemaRoot.of(Utils.listToArray(fieldVectors, FieldVector.class));
        var table = new Table(root);
        return table;
    }

    @Test
    public void testUnmarshalScalar() throws Exception {
        Table table = getTestTableWithAllArrowTypes();
        ArrowUser[] users = Unmarshaller.unmarshalTable(table, ArrowUser.class);
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

        assert users[0].favoriteTimestampMilli.getValue().equals(expectedDatetime1.plusNanos(1_000_000));
        assert users[1].favoriteTimestampMilli.getValue().equals(expectedDatetime2.plusNanos(1_000_000));
        assert users[2].favoriteTimestampMilli.getValue().equals(expectedDatetime3.plusNanos(1_000_000));

        assert users[0].favoriteTimestampMicro.getValue().equals(expectedDatetime1.plusNanos(1000));
        assert users[1].favoriteTimestampMicro.getValue().equals(expectedDatetime2.plusNanos(1000));
        assert users[2].favoriteTimestampMicro.getValue().equals(expectedDatetime3.plusNanos(1000));

        assert users[0].favoriteTimestampNano.getValue().equals(expectedDatetime1.plusNanos(1));
        assert users[1].favoriteTimestampNano.getValue().equals(expectedDatetime2.plusNanos(1));
        assert users[2].favoriteTimestampNano.getValue().equals(expectedDatetime3.plusNanos(1));

        assert users[0].favoriteTimestampSecTz.getValue().equals(expectedZonedDatetime1);
        assert users[1].favoriteTimestampSecTz.getValue().equals(expectedZonedDatetime2);
        assert users[2].favoriteTimestampSecTz.getValue().equals(expectedZonedDatetime3);

        assert users[0].favoriteTimestampMilliTz.getValue().equals(expectedZonedDatetime1.plusNanos(1_000_000));
        assert users[1].favoriteTimestampMilliTz.getValue().equals(expectedZonedDatetime2.plusNanos(1_000_000));
        assert users[2].favoriteTimestampMilliTz.getValue().equals(expectedZonedDatetime3.plusNanos(1_000_000));

        assert users[0].favoriteTimestampMicroTz.getValue().equals(expectedZonedDatetime1.plusNanos(1000));
        assert users[1].favoriteTimestampMicroTz.getValue().equals(expectedZonedDatetime2.plusNanos(1000));
        assert users[2].favoriteTimestampMicroTz.getValue().equals(expectedZonedDatetime3.plusNanos(1000));

        assert users[0].favoriteTimestampNanoTz.getValue().equals(expectedZonedDatetime1.plusNanos(1));
        assert users[1].favoriteTimestampNanoTz.getValue().equals(expectedZonedDatetime2.plusNanos(1));
        assert users[2].favoriteTimestampNanoTz.getValue().equals(expectedZonedDatetime3.plusNanos(1));

        assert users[0].favoriteStruct.niceDatetime.getValue().equals(expectedDatetime1);
        assert users[1].favoriteStruct.niceDatetime.getValue().equals(expectedDatetime2);
        assert users[2].favoriteStruct.niceDatetime.getValue().equals(expectedDatetime3);
        assert users[0].favoriteStruct.niceNumber.getValue().equals(1L);
        assert users[1].favoriteStruct.niceNumber.getValue().equals(2L);
        assert users[2].favoriteStruct.niceNumber.getValue().equals(3L);

        assert users[0].favoriteStringList.getValue().equals(Arrays.asList("a", "b", "c"));
        assert users[1].favoriteStringList.getValue().equals(Arrays.asList("d", "e", "f"));
        assert users[2].favoriteStringList.getValue().equals(Arrays.asList("g", "h", "i"));

        assert users[0].favoriteBooleanList.getValue().equals(Arrays.asList(false, true, true));
        assert users[1].favoriteBooleanList.getValue().equals(Arrays.asList(true, false, true));
        assert users[2].favoriteBooleanList.getValue().equals(Arrays.asList(true, true, false));

        assert users[0].favoriteLongList.getValue().equals(Arrays.asList(1L, 2L, 3L));
        assert users[1].favoriteLongList.getValue().equals(Arrays.asList(4L, 5L, 6L));
        assert users[2].favoriteLongList.getValue().equals(Arrays.asList(7L, 8L, 9L));

        assert users[0].favoriteDoubleList.getValue().equals(Arrays.asList(1.0, 2.0, 3.0));
        assert users[1].favoriteDoubleList.getValue().equals(Arrays.asList(4.0, 5.0, 6.0));
        assert users[2].favoriteDoubleList.getValue().equals(Arrays.asList(7.0, 8.0, 9.0));

        assert users[0].favoriteTimestampSecList.getValue().equals(Arrays.asList(expectedDatetime1, expectedDatetime2, expectedDatetime3));
        assert users[1].favoriteTimestampSecList.getValue().equals(Arrays.asList(expectedDatetime3, expectedDatetime1, expectedDatetime2));
        assert users[2].favoriteTimestampSecList.getValue().equals(Arrays.asList(expectedDatetime2, expectedDatetime3, expectedDatetime1));

        assert users[0].favoriteStructList.getValue().get(0).niceNumber.getValue().equals(1L);
        assert users[0].favoriteStructList.getValue().get(1).niceNumber.getValue().equals(2L);
        assert users[0].favoriteStructList.getValue().get(2).niceNumber.getValue().equals(3L);
        assert users[1].favoriteStructList.getValue().get(0).niceNumber.getValue().equals(4L);
        assert users[1].favoriteStructList.getValue().get(1).niceNumber.getValue().equals(5L);
        assert users[1].favoriteStructList.getValue().get(2).niceNumber.getValue().equals(6L);
        assert users[2].favoriteStructList.getValue().get(0).niceNumber.getValue().equals(7L);
        assert users[2].favoriteStructList.getValue().get(1).niceNumber.getValue().equals(8L);
        assert users[2].favoriteStructList.getValue().get(2).niceNumber.getValue().equals(9L);

        assert users[0].favoriteStructList.getValue().get(0).niceDatetime.getValue().equals(expectedDatetime1);
        assert users[0].favoriteStructList.getValue().get(1).niceDatetime.getValue().equals(expectedDatetime2);
        assert users[0].favoriteStructList.getValue().get(2).niceDatetime.getValue().equals(expectedDatetime3);
        assert users[1].favoriteStructList.getValue().get(0).niceDatetime.getValue().equals(expectedDatetime3);
        assert users[1].favoriteStructList.getValue().get(1).niceDatetime.getValue().equals(expectedDatetime1);
        assert users[1].favoriteStructList.getValue().get(2).niceDatetime.getValue().equals(expectedDatetime2);
        assert users[2].favoriteStructList.getValue().get(0).niceDatetime.getValue().equals(expectedDatetime2);
        assert users[2].favoriteStructList.getValue().get(1).niceDatetime.getValue().equals(expectedDatetime3);
        assert users[2].favoriteStructList.getValue().get(2).niceDatetime.getValue().equals(expectedDatetime1);

        assert users[0].favoriteDurationSec.getValue().equals(Duration.ofSeconds(36900));
        assert users[1].favoriteDurationSec.getValue().equals(Duration.ofSeconds(36901));
        assert users[2].favoriteDurationSec.getValue().equals(Duration.ofSeconds(36902));

        assert users[0].favoriteDurationMilli.getValue().equals(Duration.ofMillis(36840001));
        assert users[1].favoriteDurationMilli.getValue().equals(Duration.ofMillis(36841001));
        assert users[2].favoriteDurationMilli.getValue().equals(Duration.ofMillis(36842001));

        assert users[0].favoriteDurationMicro.getValue().equals(Duration.ofNanos(36840000001000L));
        assert users[1].favoriteDurationMicro.getValue().equals(Duration.ofNanos(36841000001000L));
        assert users[2].favoriteDurationMicro.getValue().equals(Duration.ofNanos(36842000001000L));

        assert users[0].favoriteDurationNano.getValue().equals(Duration.ofNanos(36840000000001L));
        assert users[1].favoriteDurationNano.getValue().equals(Duration.ofNanos(36841000000001L));
        assert users[2].favoriteDurationNano.getValue().equals(Duration.ofNanos(36842000000001L));

        assert users[0].favoriteTimeSec.getValue().equals(LocalTime.of(10, 14, 0));
        assert users[1].favoriteTimeSec.getValue().equals(LocalTime.of(10, 14, 1));
        assert users[2].favoriteTimeSec.getValue().equals(LocalTime.of(10, 14, 2));

        assert users[0].favoriteTimeMilli.getValue().equals(LocalTime.of(10, 14, 0, 1_000_000));
        assert users[1].favoriteTimeMilli.getValue().equals(LocalTime.of(10, 14, 1, 1_000_000));
        assert users[2].favoriteTimeMilli.getValue().equals(LocalTime.of(10, 14, 2, 1_000_000));

        assert users[0].favoriteTimeMicro.getValue().equals(LocalTime.of(10, 14, 0, 1_000));
        assert users[1].favoriteTimeMicro.getValue().equals(LocalTime.of(10, 14, 1, 1_000));
        assert users[2].favoriteTimeMicro.getValue().equals(LocalTime.of(10, 14, 2, 1_000));

        assert users[0].favoriteTimeNano.getValue().equals(LocalTime.of(10, 14, 0, 1));
        assert users[1].favoriteTimeNano.getValue().equals(LocalTime.of(10, 14, 1, 1));
        assert users[2].favoriteTimeNano.getValue().equals(LocalTime.of(10, 14, 2, 1));

        assert users[0].favoriteHasOne.length.getValue().equals(1.0);
        assert users[1].favoriteHasOne.length.getValue().equals(2.0);
        assert users[2].favoriteHasOne.length.getValue().equals(3.0);

        assert users[0].favoriteWindowed.bucket1d.getValue().equals(1.0);
        assert users[1].favoriteWindowed.bucket1d.getValue().equals(2.0);
        assert users[2].favoriteWindowed.bucket1d.getValue().equals(3.0);

        assert users[0].favoriteWindowed.bucket601s.getValue().equals(4.0);
        assert users[1].favoriteWindowed.bucket601s.getValue().equals(5.0);
        assert users[2].favoriteWindowed.bucket601s.getValue().equals(6.0);

        assert users[0].favoriteStructComplex.goodDataclass.niceDatetime.getValue().equals(expectedDatetime1);
        assert users[1].favoriteStructComplex.goodDataclass.niceDatetime.getValue().equals(expectedDatetime2);
        assert users[2].favoriteStructComplex.goodDataclass.niceDatetime.getValue().equals(expectedDatetime3);

        assert users[0].favoriteStructComplex.goodDataclass.niceNumber.getValue().equals(1L);
        assert users[1].favoriteStructComplex.goodDataclass.niceNumber.getValue().equals(2L);
        assert users[2].favoriteStructComplex.goodDataclass.niceNumber.getValue().equals(3L);

        assert users[0].favoriteStructComplex.goodDataclasses.getValue().get(0).niceDatetime.getValue().equals(expectedDatetime1);
        assert users[0].favoriteStructComplex.goodDataclasses.getValue().get(1).niceDatetime.getValue().equals(expectedDatetime2);
        assert users[0].favoriteStructComplex.goodDataclasses.getValue().get(2).niceDatetime.getValue().equals(expectedDatetime3);
        assert users[1].favoriteStructComplex.goodDataclasses.getValue().get(0).niceDatetime.getValue().equals(expectedDatetime3);
        assert users[1].favoriteStructComplex.goodDataclasses.getValue().get(1).niceDatetime.getValue().equals(expectedDatetime1);
        assert users[1].favoriteStructComplex.goodDataclasses.getValue().get(2).niceDatetime.getValue().equals(expectedDatetime2);
        assert users[2].favoriteStructComplex.goodDataclasses.getValue().get(0).niceDatetime.getValue().equals(expectedDatetime2);
        assert users[2].favoriteStructComplex.goodDataclasses.getValue().get(1).niceDatetime.getValue().equals(expectedDatetime3);
        assert users[2].favoriteStructComplex.goodDataclasses.getValue().get(2).niceDatetime.getValue().equals(expectedDatetime1);

        assert users[0].favoriteStructComplex.goodDataclasses.getValue().get(0).niceNumber.getValue().equals(1L);
        assert users[0].favoriteStructComplex.goodDataclasses.getValue().get(1).niceNumber.getValue().equals(2L);
        assert users[0].favoriteStructComplex.goodDataclasses.getValue().get(2).niceNumber.getValue().equals(3L);
        assert users[1].favoriteStructComplex.goodDataclasses.getValue().get(0).niceNumber.getValue().equals(4L);
        assert users[1].favoriteStructComplex.goodDataclasses.getValue().get(1).niceNumber.getValue().equals(5L);
        assert users[1].favoriteStructComplex.goodDataclasses.getValue().get(2).niceNumber.getValue().equals(6L);
        assert users[2].favoriteStructComplex.goodDataclasses.getValue().get(0).niceNumber.getValue().equals(7L);
        assert users[2].favoriteStructComplex.goodDataclasses.getValue().get(1).niceNumber.getValue().equals(8L);
        assert users[2].favoriteStructComplex.goodDataclasses.getValue().get(2).niceNumber.getValue().equals(9L);

        // Nullable features start
        assert users[0].favoriteBigIntNullable.getValue() == 1L;
        assert users[1].favoriteBigIntNullable.getValue() == null;
        assert users[2].favoriteBigIntNullable.getValue() == 3L;

        assert users[0].favoriteIntNullable.getValue() == 1;
        assert users[1].favoriteIntNullable.getValue() == null;
        assert users[2].favoriteIntNullable.getValue() == 3;

        assert users[0].favoriteSmallIntNullable.getValue() == 1;
        assert users[1].favoriteSmallIntNullable.getValue() == null;
        assert users[2].favoriteSmallIntNullable.getValue() == 3;

        assert users[0].favoriteTinyIntNullable.getValue() == 1;
        assert users[1].favoriteTinyIntNullable.getValue() == null;
        assert users[2].favoriteTinyIntNullable.getValue() == 3;

        assert users[0].favoriteFloat4Nullable.getValue() == 1.0f;
        assert users[1].favoriteFloat4Nullable.getValue() == null;
        assert users[2].favoriteFloat4Nullable.getValue() == 3.0f;

        assert users[0].favoriteFloat8Nullable.getValue() == 1.0;
        assert users[1].favoriteFloat8Nullable.getValue() == null;
        assert users[2].favoriteFloat8Nullable.getValue() == 3.0;

        assert users[0].favoriteBooleanNullable.getValue();
        assert users[1].favoriteBooleanNullable.getValue() == null;
        assert !users[2].favoriteBooleanNullable.getValue();

        assert users[0].favoriteDateDayNullable.getValue().equals(LocalDate.of(2021, 7, 31));
        assert users[1].favoriteDateDayNullable.getValue() == null;
        assert users[2].favoriteDateDayNullable.getValue().equals(LocalDate.of(2021, 8, 2));

        assert users[0].favoriteDateMilliNullable.getValue().equals(LocalDate.of(2021, 7, 31));
        assert users[1].favoriteDateMilliNullable.getValue() == null;
        assert users[2].favoriteDateMilliNullable.getValue().equals(LocalDate.of(2021, 8, 2));

        assert users[0].favoriteTimestampSecNullable.getValue().equals(expectedDatetime1);
        assert users[1].favoriteTimestampSecNullable.getValue() == null;
        assert users[2].favoriteTimestampSecNullable.getValue().equals(expectedDatetime3);

        assert users[0].favoriteTimestampMilliNullable.getValue().equals(expectedDatetime1.plusNanos(1_000_000));
        assert users[1].favoriteTimestampMilliNullable.getValue() == null;
        assert users[2].favoriteTimestampMilliNullable.getValue().equals(expectedDatetime3.plusNanos(1_000_000));

        assert users[0].favoriteTimestampMicroNullable.getValue().equals(expectedDatetime1.plusNanos(1000));
        assert users[1].favoriteTimestampMicroNullable.getValue() == null;
        assert users[2].favoriteTimestampMicroNullable.getValue().equals(expectedDatetime3.plusNanos(1000));

        assert users[0].favoriteTimestampNanoNullable.getValue().equals(expectedDatetime1.plusNanos(1));
        assert users[1].favoriteTimestampNanoNullable.getValue() == null;
        assert users[2].favoriteTimestampNanoNullable.getValue().equals(expectedDatetime3.plusNanos(1));

        assert users[0].favoriteTimestampSecTzNullable.getValue().equals(expectedZonedDatetime1);
        assert users[1].favoriteTimestampSecTzNullable.getValue() == null;
        assert users[2].favoriteTimestampSecTzNullable.getValue().equals(expectedZonedDatetime3);

        assert users[0].favoriteTimestampMilliTzNullable.getValue().equals(expectedZonedDatetime1.plusNanos(1_000_000));
        assert users[1].favoriteTimestampMilliTzNullable.getValue() == null;
        assert users[2].favoriteTimestampMilliTzNullable.getValue().equals(expectedZonedDatetime3.plusNanos(1_000_000));

        assert users[0].favoriteTimestampMicroTzNullable.getValue().equals(expectedZonedDatetime1.plusNanos(1000));
        assert users[1].favoriteTimestampMicroTzNullable.getValue() == null;
        assert users[2].favoriteTimestampMicroTzNullable.getValue().equals(expectedZonedDatetime3.plusNanos(1000));

        assert users[0].favoriteTimestampNanoTzNullable.getValue().equals(expectedZonedDatetime1.plusNanos(1));
        assert users[1].favoriteTimestampNanoTzNullable.getValue() == null;
        assert users[2].favoriteTimestampNanoTzNullable.getValue().equals(expectedZonedDatetime3.plusNanos(1));

        assert users[0].favoriteUtf8Nullable.getValue().equals("a");
        assert users[1].favoriteUtf8Nullable.getValue() == null;
        assert users[2].favoriteUtf8Nullable.getValue().equals("");

        assert users[0].favoriteLargeUtf8Nullable.getValue().equals("a");
        assert users[1].favoriteLargeUtf8Nullable.getValue() == null;
        assert users[2].favoriteLargeUtf8Nullable.getValue().equals("");

        // TODO: Maybe should not propogate nulls, i.e. make favoriteStructNullable null instead of its fields
        assert users[0].favoriteStructNullable.niceDatetime.getValue().equals(expectedDatetime1);
        assert users[1].favoriteStructNullable.niceDatetime.getValue().equals(expectedDatetime2);
        assert users[2].favoriteStructNullable.niceDatetime.getValue() == null;
        assert users[0].favoriteStructNullable.niceNumber.getValue().equals(1L);
        assert users[1].favoriteStructNullable.niceNumber.getValue().equals(2L);
        assert users[2].favoriteStructNullable.niceNumber.getValue() == null;

        assert users[0].favoriteStringListNullable.getValue().equals(Arrays.asList("a", "b", "c"));
        assert users[1].favoriteStringListNullable.getValue().equals(Arrays.asList("d", "e", "f"));
        assert users[2].favoriteStringListNullable.getValue() == null;
        // Nullable features end
    }

    @Test
    public void TestUnmarshalHasMany() throws Exception {
        Table scalarsTable = getTestTableWithAllArrowTypes();
        var users = Unmarshaller.unmarshalTable(scalarsTable, ArrowUser.class);
        Map<String, Table> hasManyTables = new HashMap<>();
        hasManyTables.put("user.small_transactions", getHasManyTable());
        Unmarshaller.unmarshalHasMany(hasManyTables, users);

        assert users[0].smallTransactions.getValue().size() == 2;
        assert users[0].smallTransactions.getValue().get(0).amount.getValue().equals(1.0);
        assert users[0].smallTransactions.getValue().get(1).amount.getValue().equals(2.0);

        assert users[1].smallTransactions.getValue().size() == 1;
        assert users[1].smallTransactions.getValue().get(0).amount.getValue().equals(3.0);

        assert users[2].smallTransactions.getValue().size() == 0;
    }

    @Test
    public void TestUnmarshalVersioned() throws Exception {
        List<FieldVector> fieldVectors = new ArrayList<>();

        var defaultVector = new VarCharVector("versioned_features_class.grade@2", allocator);
        defaultVector.allocateNew();
        String[] idValues = {"a", "b", "c"};
        for (int i = 0; i < idValues.length; i++) {
            defaultVector.set(i, idValues[i].getBytes());
        }
        defaultVector.setValueCount(idValues.length);
        fieldVectors.add(defaultVector);

        var v1Vector = new VarCharVector("versioned_features_class.grade", allocator);
        v1Vector.allocateNew();
        String[] v1Values = {"d", "e", "f"};
        for (int i = 0; i < v1Values.length; i++) {
            v1Vector.set(i, v1Values[i].getBytes());
        }
        v1Vector.setValueCount(v1Values.length);
        fieldVectors.add(v1Vector);

        var table = new Table(fieldVectors);

        var versionedClasses = Unmarshaller.unmarshalTable(table, VersionedFeaturesClass.class);

        assert versionedClasses[0].grade.getValue().equals("a");
        assert versionedClasses[1].grade.getValue().equals("b");
        assert versionedClasses[2].grade.getValue().equals("c");

        assert versionedClasses[0].gradeV1.getValue().equals("d");
        assert versionedClasses[1].gradeV1.getValue().equals("e");
        assert versionedClasses[2].gradeV1.getValue().equals("f");

        assert versionedClasses[0].gradeV2.getValue().equals("a");
        assert versionedClasses[1].gradeV2.getValue().equals("b");
        assert versionedClasses[2].gradeV2.getValue().equals("c");
    }

    @Test
    public void TestUnmarshalNamed() throws Exception {
        List<FieldVector> fieldVectors = new ArrayList<>();

        var defaultVector = new VarCharVector("named_features_class.abc_7d7_efg", allocator);
        defaultVector.allocateNew();
        String[] idValues = {"a", "b", "c"};
        for (int i = 0; i < idValues.length; i++) {
            defaultVector.set(i, idValues[i].getBytes());
        }
        defaultVector.setValueCount(idValues.length);
        fieldVectors.add(defaultVector);

        var table = new Table(fieldVectors);

        var namedClasses = Unmarshaller.unmarshalTable(table, NamedFeaturesClass.class);

        assert namedClasses[0].abc7d7Efg.getValue().equals("a");
        assert namedClasses[1].abc7d7Efg.getValue().equals("b");
        assert namedClasses[2].abc7d7Efg.getValue().equals("c");
    }

    @Test
    public void TestSnakeCaseBackCompat() throws Exception {
        // Test that snake case fields can still be deser-ed into.
        // This supports backwards compatibility with older versions
        // of codegen where we generated snake case fields.
        List<FieldVector> fieldVectors = new ArrayList<>();

        var defaultVector = new VarCharVector("named_features_class.abc_7d7_efg", allocator);
        defaultVector.allocateNew();
        String[] idValues = {"a", "b", "c"};
        for (int i = 0; i < idValues.length; i++) {
            defaultVector.set(i, idValues[i].getBytes());
        }
        defaultVector.setValueCount(idValues.length);
        fieldVectors.add(defaultVector);

        var table = new Table(fieldVectors);

        var namedClasses = Unmarshaller.unmarshalTable(table, NamedFeaturesClass.class);

        assert namedClasses[0].abc_7d7_efg.getValue().equals("a");
        assert namedClasses[1].abc_7d7_efg.getValue().equals("b");
        assert namedClasses[2].abc_7d7_efg.getValue().equals("c");
    }

    @Test
    public void TestBenchmarkBulkUnmarshal() throws Exception {
        var userIds = new ArrayList<String>();
        for (var i = 0; i < 3000; i++) {
            userIds.add(String.valueOf(i));
        }

        var socureScores = new ArrayList<Double>();
        for (var i = 0; i < 3000; i++) {
            socureScores.add((double) i * 2);
        }

        var inputs = new HashMap<String, List<?>>();
        inputs.put("arrow_user.id", userIds);
        inputs.put("arrow_user.favorite_float8", socureScores);

        var table = FeatherProcessor.inputsToTable(inputs, allocator);

        // For some reason first few runs are slower, possibly due to JIT plus
        // CPU contention from test setup
        for (int run = 0; run < 10; run++) {
            Table tableCopy = table.copy();
            var start = System.currentTimeMillis();
            var users = Unmarshaller.unmarshalTable(tableCopy, ArrowUser.class);
            var end = System.currentTimeMillis();
            System.out.printf("Bulk unmarshal for %d rows took %d ms\n", userIds.size(), end - start);
            assert users.length == userIds.size();
            for (var i = 0; i < userIds.size(); i++) {
                assert users[i].id.getValue().equals(userIds.get(i));
                assert users[i].favoriteFloat8.getValue().equals(socureScores.get(i));
            }
        }
    }
}
