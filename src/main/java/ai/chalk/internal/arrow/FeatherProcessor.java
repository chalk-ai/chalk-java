package ai.chalk.internal.arrow;

import ai.chalk.internal.Utils;
import org.apache.arrow.compression.CommonsCompressionFactory;
import org.apache.arrow.memory.ArrowBuf;
import org.apache.arrow.memory.RootAllocator;
import org.apache.arrow.vector.*;
import org.apache.arrow.vector.complex.LargeListVector;
import org.apache.arrow.vector.complex.StructVector;
import org.apache.arrow.vector.complex.impl.*;
import org.apache.arrow.vector.complex.writer.*;
import org.apache.arrow.vector.holders.TimeStampMicroHolder;
import org.apache.arrow.vector.holders.TimeStampMicroTZHolder;
import org.apache.arrow.vector.ipc.ArrowFileReader;
import org.apache.arrow.vector.ipc.ArrowFileWriter;
import org.apache.arrow.vector.ipc.SeekableReadChannel;
import org.apache.arrow.vector.util.ByteArrayReadableSeekableByteChannel;
import org.apache.arrow.vector.table.Table;
import org.apache.arrow.vector.util.VectorSchemaRootAppender;


import java.io.ByteArrayOutputStream;
import java.nio.channels.Channels;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.*;

public class FeatherProcessor {

    public static ArrayList<StructEntry> getEntriesFromMap(Map<String, ?> obj) {
        var entries = new ArrayList<StructEntry>();
        for (var entry : obj.entrySet()) {
            entries.add(new StructEntry(entry.getKey(), entry.getValue()));
        }
        return entries;
    }
    public static ArrayList<StructEntry> getEntriesFromObject(Object obj) throws Exception {
        /* Currently not supported since we limit to Map on the top level.
            .withInput("user.struct_feature__via_classes__", Arrays.asList(
                new StructWithStructList("a", 1.0, Arrays.asList(new InnerStruct("a", 1.0), new InnerStruct("b", 2.0))),
                new StructWithStructList("b", 2.0, Arrays.asList(new InnerStruct("c", 3.0), new InnerStruct("d", 4.0))),
                new StructWithStructList("c", 3.0, Arrays.asList(new InnerStruct("e", 5.0), new InnerStruct("f", 6.0)))
            ))
         */
        var pairs = new ArrayList<StructEntry>();
        var fields = obj.getClass().getDeclaredFields();
        for (var field : fields) {
            var value = field.get(obj);
            pairs.add(new StructEntry(field.getName(), value));
        }
        return pairs;
    }

    public static ArrayList<StructEntry> getEntries(Object obj) throws Exception {
        if (obj instanceof Map mapObj) {
            return getEntriesFromMap(mapObj);
        } else {
            return getEntriesFromObject(obj);
        }
    }

    public static void powerWrite(BaseWriter writer, Object value) throws Exception {
        if (value instanceof Integer) {
            if (!(writer instanceof BigIntWriter intWriter)) {
                throw new Exception(String.format("Have `Integer` value but mismatched writer type '%s': ", writer.getClass().getSimpleName()));
            }
            intWriter.writeBigInt((Integer) value);
        } else if (value instanceof Long) {
            if (!(writer instanceof BigIntWriter intWriter)) {
                throw new Exception(String.format("Have `Long` value but mismatched writer type '%s': ", writer.getClass().getSimpleName()));
            }
            intWriter.writeBigInt((Long) value);
        } else if (value instanceof Double) {
            if (!(writer instanceof Float8Writer floatWriter)) {
                throw new Exception(String.format("Have `Double` value but mismatched writer type '%s': ", writer.getClass().getSimpleName()));
            }
            floatWriter.writeFloat8((Double) value);
        } else if (value instanceof String stringValue) {
            if (!(writer instanceof LargeVarCharWriter stringWriter)) {
                throw new Exception(String.format("Have `String` value but mismatched writer type '%s': ", writer.getClass().getSimpleName()));
            }
            var bytesValue = stringValue.getBytes();
            ArrowBuf tempBuf = new RootAllocator(Long.MAX_VALUE).buffer(bytesValue.length);
            tempBuf.setBytes(0, bytesValue);
            stringWriter.writeLargeVarChar(0, bytesValue.length, tempBuf);
        } else if (value instanceof Boolean) {
            if (!(writer instanceof BitWriter boolWriter)) {
                throw new Exception(String.format("Have `Boolean` value but mismatched writer type '%s': ", writer.getClass().getSimpleName()));
            }
            boolWriter.writeBit((Boolean) value ? 1 : 0);
        } else if (value instanceof byte[] binaryValue) {
            if (!(writer instanceof LargeVarBinaryWriter binaryWriter)) {
                throw new Exception(String.format("Have `byte[]` value but mismatched writer type '%s': ", writer.getClass().getSimpleName()));
            }
            ArrowBuf tempBuf = new RootAllocator(Long.MAX_VALUE).buffer(binaryValue.length);
            tempBuf.setBytes(0, binaryValue);
            binaryWriter.writeLargeVarBinary(0, binaryValue.length, tempBuf);
        } else if (value instanceof ZonedDateTime zonedDt) {
            if (!(writer instanceof TimeStampMicroTZWriter timestampWriter)) {
                throw new Exception(String.format("Have `ZonedDateTime` value but mismatched writer type '%s': ", writer.getClass().getSimpleName()));
            }
            TimeStampMicroTZHolder holder = new TimeStampMicroTZHolder();
            holder.value = zonedDt.toInstant().getEpochSecond() * 1_000_000 + zonedDt.getNano() / 1_000;
            holder.timezone = zonedDt.getZone().toString();
            timestampWriter.write(holder);
        } else if (value instanceof LocalDateTime localDt) {
            if (!(writer instanceof TimeStampMicroWriter timestampWriter)) {
                throw new Exception(String.format("Have `LocalDateTime` value but mismatched writer type '%s': ", writer.getClass().getSimpleName()));
            }
            TimeStampMicroHolder holder = new TimeStampMicroHolder();
            holder.value = localDt.atZone(ZoneId.of("UTC")).toInstant().getEpochSecond() * 1_000_000 + localDt.getNano() / 1_000;
            timestampWriter.write(holder);
        } else if (value instanceof List) {
            if (!(writer instanceof BaseWriter.ListWriter)) {
                throw new Exception(String.format("Have `List` value but mismatched writer type '%s': ", writer.getClass().getSimpleName()));
            }
            BaseWriter.ListWriter listWriter = (BaseWriter.ListWriter) writer;
            BaseWriter innerWriter;
            if (((List<?>) value).size() == 0) {
                throw new Exception("Input values is an `Array` or a `List` of length 0");
            }
            var firstItem = ((List<?>) value).get(0);
            if (firstItem instanceof Integer) {
                innerWriter = listWriter.bigInt();
            } else if (firstItem instanceof Long) {
                innerWriter = listWriter.bigInt();
            } else if (firstItem instanceof Double) {
                innerWriter = listWriter.float8();
            } else if (firstItem instanceof String) {
                innerWriter = listWriter.largeVarChar();
            } else if (firstItem instanceof Boolean) {
                innerWriter = listWriter.bit();
            } else if (firstItem instanceof byte[]) {
                innerWriter = listWriter.largeVarBinary();
            } else if (firstItem instanceof ZonedDateTime) {
                innerWriter = listWriter.timeStampMicroTZ();
            } else if (firstItem instanceof LocalDateTime) {
                innerWriter = listWriter.timeStampMicro();
            } else if (firstItem instanceof List) {
                innerWriter = listWriter.list();
            } else {
                innerWriter = listWriter.struct();
            }
            listWriter.startList();
            for (Object item: (List<?>) value) {
                powerWrite(innerWriter, item);
            }
            listWriter.endList();
        } else if (writer instanceof NullableStructWriter structWriter) {
            // Yes, this is duplicated with `UnionListWriter` below.
            structWriter.start();
            for (var pair: getEntries(value)) {
                var fieldVal = pair.value();
                var fieldName = pair.key();
                if (fieldVal instanceof Integer) {
                    powerWrite(structWriter.bigInt(fieldName), fieldVal);
                } else if (fieldVal instanceof Long) {
                    powerWrite(structWriter.bigInt(fieldName), fieldVal);
                } else if (fieldVal instanceof Double) {
                    powerWrite(structWriter.float8(fieldName), fieldVal);
                } else if (fieldVal instanceof String) {
                    powerWrite(structWriter.largeVarChar(fieldName), fieldVal);
                } else if (fieldVal instanceof Boolean) {
                    powerWrite(structWriter.bit(fieldName), fieldVal);
                } else if (fieldVal instanceof byte[]) {
                    powerWrite(structWriter.largeVarBinary(fieldName), fieldVal);
                } else if (fieldVal instanceof ZonedDateTime) {
                    powerWrite(structWriter.timeStampMicroTZ(fieldName), fieldVal);
                } else if (fieldVal instanceof LocalDateTime) {
                    powerWrite(structWriter.timeStampMicro(fieldName), fieldVal);
                } else if (fieldVal instanceof List) {
                    powerWrite(structWriter.list(fieldName), fieldVal);
                } else {
                    throw new Exception("Unsupported data type: " + fieldVal.getClass().getSimpleName());
                }
            }
            structWriter.end();
        }  else if (writer instanceof UnionListWriter structWriter) {
            // The mystery of the century presents itself:
            // when we do `.struct()` we get a `UnionListWriter` instead of a `NullableStructWriter`
            structWriter.start();
            for (var pair: getEntries(value)) {
                var fieldVal = pair.value();
                var fieldName = pair.key();
                if (fieldVal instanceof Integer) {
                    powerWrite(structWriter.bigInt(fieldName), fieldVal);
                } else if (fieldVal instanceof Long) {
                    powerWrite(structWriter.bigInt(fieldName), fieldVal);
                } else if (fieldVal instanceof Double) {
                    powerWrite(structWriter.float8(fieldName), fieldVal);
                } else if (fieldVal instanceof String) {
                    powerWrite(structWriter.largeVarChar(fieldName), fieldVal);
                } else if (fieldVal instanceof Boolean) {
                    powerWrite(structWriter.bit(fieldName), fieldVal);
                } else if (fieldVal instanceof ZonedDateTime) {
                    powerWrite(structWriter.timeStampMicroTZ(fieldName), fieldVal);
                } else if (fieldVal instanceof LocalDateTime) {
                    powerWrite(structWriter.timeStampMicro(fieldName), fieldVal);
                } else if (fieldVal instanceof byte[]) {
                    powerWrite(structWriter.largeVarBinary(fieldName), fieldVal);
                } else if (fieldVal instanceof List) {
                    powerWrite(structWriter.list(fieldName), fieldVal);
                } else {
                    throw new Exception("Unsupported data type: " + fieldVal.getClass().getSimpleName());
                }
            }
            structWriter.end();
        } else {
            throw new Exception("Unsupported data type: " + value.getClass().getSimpleName());
        }
    }


    public static byte[] inputsToArrowBytes(Map<String, List<?>> inputs) throws Exception {
        List<FieldVector> fieldVectors = new ArrayList<>();
        var uniformListLength = -1;
        for (Map.Entry<String, List<?>> entry : inputs.entrySet()) {
            List<?> value = entry.getValue();
            List<Object> values;
            try {
                values = new ArrayList<>(value);
            } catch (Exception e) {
                throw new Exception(String.format("error converting '%s' value to a `List<Object>`: %s", entry.getKey(), e.getMessage()));
            }
            if (values.size() == 0) {
                throw new Exception("Input values is an `Array` or a `List` of length 0");
            } else if (uniformListLength == -1) {
                uniformListLength = values.size();
            } else if (uniformListLength != values.size()) {
                throw new Exception(String.format("Input values have different lengths - expected %d but got %d: %s", uniformListLength, values.size(), values));
            }

            var clazz = values.get(0).getClass();
            var firstVal = values.get(0);
            var fqn = entry.getKey();
            if (firstVal instanceof Integer) {
                BigIntVector intVector = new BigIntVector(fqn, new RootAllocator(Long.MAX_VALUE));
                fieldVectors.add(intVector);
                var writer = new BigIntWriterImpl(intVector);
                for (int i = 0; i < values.size(); i++) {
                    writer.setPosition(i);
                    powerWrite(writer, values.get(i));
                }
            } else if (firstVal instanceof Long) {
                BigIntVector longVector = new BigIntVector(fqn, new RootAllocator(Long.MAX_VALUE));
                fieldVectors.add(longVector);
                var writer = new BigIntWriterImpl(longVector);
                for (int i = 0; i < values.size(); i++) {
                    writer.setPosition(i);
                    powerWrite(writer, values.get(i));
                }
            } else if (firstVal instanceof Double) {
                Float8Vector doubleVector = new Float8Vector(fqn, new RootAllocator(Long.MAX_VALUE));
                fieldVectors.add(doubleVector);
                var writer = new Float8WriterImpl(doubleVector);
                for (int i = 0; i < values.size(); i++) {
                    writer.setPosition(i);
                    powerWrite(writer, values.get(i));
                }
            } else if (firstVal instanceof String) {
                LargeVarCharVector stringVector = new LargeVarCharVector(fqn, new RootAllocator(Long.MAX_VALUE));
                fieldVectors.add(stringVector);
                var writer = new LargeVarCharWriterImpl(stringVector);
                for (int i = 0; i < values.size(); i++) {
                    writer.setPosition(i);
                    powerWrite(writer, values.get(i));
                }
            } else if (firstVal instanceof Boolean) {
                BitVector boolVector = new BitVector(fqn, new RootAllocator(Long.MAX_VALUE));
                fieldVectors.add(boolVector);
                var writer = new BitWriterImpl(boolVector);
                for (int i = 0; i < values.size(); i++) {
                    writer.setPosition(i);
                    powerWrite(writer, values.get(i));
                }
            } else if (firstVal instanceof byte[]) {
                LargeVarBinaryVector binaryVector = new LargeVarBinaryVector(fqn, new RootAllocator(Long.MAX_VALUE));
                fieldVectors.add(binaryVector);
                var writer = new LargeVarBinaryWriterImpl(binaryVector);
                for (int i = 0; i < values.size(); i++) {
                    writer.setPosition(i);
                    powerWrite(writer, values.get(i));
                }
            } else if (firstVal instanceof ZonedDateTime zonedDt) {
                String tz = zonedDt.getZone().toString();
                TimeStampMicroTZVector timestampVector = new TimeStampMicroTZVector(fqn, new RootAllocator(Long.MAX_VALUE), tz);
                fieldVectors.add(timestampVector);
                var writer = new TimeStampMicroTZWriterImpl(timestampVector);
                for (int i = 0; i < values.size(); i++) {
                    writer.setPosition(i);
                    powerWrite(writer, values.get(i));
                }
            } else if (firstVal instanceof LocalDateTime localDt) {
                TimeStampMicroVector timestampVector = new TimeStampMicroVector(fqn, new RootAllocator(Long.MAX_VALUE));
                fieldVectors.add(timestampVector);
                var writer = new TimeStampMicroWriterImpl(timestampVector);
                for (int i = 0; i < values.size(); i++) {
                    writer.setPosition(i);
                    powerWrite(writer, values.get(i));
                }
            } else if (firstVal instanceof List) {
                var listVector = LargeListVector.empty(fqn, new RootAllocator(Long.MAX_VALUE));
                fieldVectors.add(listVector);
                var writer = listVector.getWriter();
                for (Object o : values) {
                    powerWrite(writer, o);
                }
                writer.setValueCount(values.size());
            } else if (firstVal instanceof Map) {
                var structVector = StructVector.empty(fqn, new RootAllocator(Long.MAX_VALUE));
                fieldVectors.add(structVector);
                var writer = structVector.getWriter();
                for (Object o : values) {
                    powerWrite(writer, o);
                }
                // Importante to `setValueCount` otherwise values all null.
                writer.setValueCount(values.size());
            } else {
                throw new Exception("Unsupported data type: " + clazz.getSimpleName());
            }
        }

        VectorSchemaRoot root = VectorSchemaRoot.of(Utils.listToArray(fieldVectors, FieldVector.class));

        try (
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ArrowFileWriter writer = new ArrowFileWriter(root, null, Channels.newChannel(out));
        ) {
            writer.start();
            writer.writeBatch();
            writer.end();
            writer.close();
            root.close();
            return out.toByteArray();
        }
    }

    /*
    getTableIfBatchSizeOne exists only because we want to skip using VectorSchemaRootAppender
    (when there are multiple batches, we use VectorSchemaRootAppender to concatenate the batches)
    because VectorSchemaRootAppender does not work with LargeLists (fails with:
        ```
        class org.apache.arrow.vector.complex.LargeListVector cannot
        be cast to class org.apache.arrow.vector.complex.ListVector
        ```
    ).
     */
    public static Table getTableIfBatchSizeOne(byte[] bytes) throws Exception {
        SeekableReadChannel seekableReadChannelBatchCounter = new SeekableReadChannel(new ByteArrayReadableSeekableByteChannel(bytes));
        ArrowFileReader arrowFileReaderBatchCounter = new ArrowFileReader(seekableReadChannelBatchCounter, new RootAllocator(Long.MAX_VALUE), new CommonsCompressionFactory());

        var numBatches = 0;
        try (
                VectorSchemaRoot readerRootBatchCounter = arrowFileReaderBatchCounter.getVectorSchemaRoot();
        ) {
            Table firstTable = null;
            while (arrowFileReaderBatchCounter.loadNextBatch()) {
                if (firstTable == null) {
                    firstTable = new Table(readerRootBatchCounter);
                }
                numBatches += 1;
            }
            if (numBatches == 1) {
                return firstTable;
            } else if (firstTable != null) {
                firstTable.close();
            }
        }
        arrowFileReaderBatchCounter.close();
        return null;
    }

    public static Table convertBytesToTable(byte[] bytes) throws Exception {
        var maybeSingleBatchTable = getTableIfBatchSizeOne(bytes);
        if (maybeSingleBatchTable != null) {
            return maybeSingleBatchTable;
        }

        SeekableReadChannel seekableReadChannel = new SeekableReadChannel(new ByteArrayReadableSeekableByteChannel(bytes));
        ArrowFileReader arrowFileReader = new ArrowFileReader(seekableReadChannel, new RootAllocator(Long.MAX_VALUE), new CommonsCompressionFactory());

        try (
            VectorSchemaRoot readerRoot = arrowFileReader.getVectorSchemaRoot();
            VectorSchemaRoot collectorRoot = VectorSchemaRoot.create(readerRoot.getSchema(), new RootAllocator(Long.MAX_VALUE))
        ) {
            collectorRoot.allocateNew();
            while (arrowFileReader.loadNextBatch()) {
                VectorSchemaRootAppender.append(collectorRoot, readerRoot);
            }
            Table table = new Table(collectorRoot);
            arrowFileReader.close();
            return table;
        }
    }
}
