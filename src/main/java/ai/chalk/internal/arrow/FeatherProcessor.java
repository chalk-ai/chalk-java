package ai.chalk.internal.arrow;

import ai.chalk.internal.Utils;
import org.apache.arrow.compression.CommonsCompressionFactory;
import org.apache.arrow.memory.ArrowBuf;
import org.apache.arrow.memory.BufferAllocator;
import org.apache.arrow.vector.BigIntVector;
import org.apache.arrow.vector.BitVector;
import org.apache.arrow.vector.FieldVector;
import org.apache.arrow.vector.Float8Vector;
import org.apache.arrow.vector.LargeVarBinaryVector;
import org.apache.arrow.vector.LargeVarCharVector;
import org.apache.arrow.vector.NullVector;
import org.apache.arrow.vector.TimeStampMicroTZVector;
import org.apache.arrow.vector.TimeStampMicroVector;
import org.apache.arrow.vector.VectorSchemaRoot;
import org.apache.arrow.vector.complex.LargeListVector;
import org.apache.arrow.vector.complex.StructVector;
import org.apache.arrow.vector.complex.impl.BigIntWriterImpl;
import org.apache.arrow.vector.complex.impl.BitWriterImpl;
import org.apache.arrow.vector.complex.impl.Float8WriterImpl;
import org.apache.arrow.vector.complex.impl.LargeVarBinaryWriterImpl;
import org.apache.arrow.vector.complex.impl.LargeVarCharWriterImpl;
import org.apache.arrow.vector.complex.impl.NullableStructWriter;
import org.apache.arrow.vector.complex.impl.TimeStampMicroTZWriterImpl;
import org.apache.arrow.vector.complex.impl.TimeStampMicroWriterImpl;
import org.apache.arrow.vector.complex.impl.UnionLargeListWriter;
import org.apache.arrow.vector.complex.impl.UnionListWriter;
import org.apache.arrow.vector.complex.writer.BaseWriter;
import org.apache.arrow.vector.complex.writer.BigIntWriter;
import org.apache.arrow.vector.complex.writer.BitWriter;
import org.apache.arrow.vector.complex.writer.Float8Writer;
import org.apache.arrow.vector.complex.writer.LargeVarBinaryWriter;
import org.apache.arrow.vector.complex.writer.LargeVarCharWriter;
import org.apache.arrow.vector.complex.writer.TimeStampMicroTZWriter;
import org.apache.arrow.vector.complex.writer.TimeStampMicroWriter;
import org.apache.arrow.vector.holders.TimeStampMicroHolder;
import org.apache.arrow.vector.holders.TimeStampMicroTZHolder;
import org.apache.arrow.vector.ipc.ArrowFileReader;
import org.apache.arrow.vector.ipc.ArrowFileWriter;
import org.apache.arrow.vector.ipc.SeekableReadChannel;
import org.apache.arrow.vector.table.Table;
import org.apache.arrow.vector.util.ByteArrayReadableSeekableByteChannel;
import org.apache.arrow.vector.util.VectorSchemaRootAppender;

import java.io.ByteArrayOutputStream;
import java.nio.channels.Channels;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class FeatherProcessor {
    public static final long ALLOCATOR_SIZE_REQUEST = 1_000_000_000;
    public static final long ALLOCATOR_SIZE_RESPONSE = 10 * ALLOCATOR_SIZE_REQUEST;
    public static final long ALLOCATOR_SIZE_ROOT = ALLOCATOR_SIZE_RESPONSE * 500;
    public static final long ALLOCATOR_SIZE_TEST = ALLOCATOR_SIZE_RESPONSE / 100;

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

    private static void writeStructValue(BaseWriter.StructWriter structWriter, Object value, BufferAllocator allocator) throws Exception {
        structWriter.start();
        for (var pair : getEntries(value)) {
            var fieldVal = pair.value();
            var fieldName = pair.key();
			if (fieldVal == null) {
				writeValue(structWriter.struct(fieldName), null, allocator);
			} else if (fieldVal instanceof Integer) {
                writeValue(structWriter.bigInt(fieldName), fieldVal, allocator);
            } else if (fieldVal instanceof Long) {
                writeValue(structWriter.bigInt(fieldName), fieldVal, allocator);
            } else if (fieldVal instanceof Double) {
                writeValue(structWriter.float8(fieldName), fieldVal, allocator);
            } else if (fieldVal instanceof String) {
                writeValue(structWriter.largeVarChar(fieldName), fieldVal, allocator);
            } else if (fieldVal instanceof Boolean) {
                writeValue(structWriter.bit(fieldName), fieldVal, allocator);
            } else if (fieldVal instanceof byte[]) {
                writeValue(structWriter.largeVarBinary(fieldName), fieldVal, allocator);
            } else if (fieldVal instanceof ZonedDateTime) {
                writeValue(structWriter.timeStampMicroTZ(fieldName), fieldVal, allocator);
            } else if (fieldVal instanceof LocalDateTime) {
                writeValue(structWriter.timeStampMicro(fieldName), fieldVal, allocator);
            } else if (fieldVal instanceof List) {
                writeValue(structWriter.list(fieldName), fieldVal, allocator);
            } else {
                throw new Exception("Unsupported data type: " + fieldVal.getClass().getSimpleName());
            }
        }
        structWriter.end();
    }

    public static void writeValue(BaseWriter writer, Object value, BufferAllocator allocator) throws Exception {
        if (value == null) {
            writer.writeNull();
        } else if (value instanceof Integer) {
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
            try (
                ArrowBuf tempBuf = allocator.buffer(bytesValue.length)
            ) {
                tempBuf.setBytes(0, bytesValue);
                stringWriter.writeLargeVarChar(0, bytesValue.length, tempBuf);
            }
        } else if (value instanceof Boolean) {
            if (!(writer instanceof BitWriter boolWriter)) {
                throw new Exception(String.format("Have `Boolean` value but mismatched writer type '%s': ", writer.getClass().getSimpleName()));
            }
            boolWriter.writeBit((Boolean) value ? 1 : 0);
        } else if (value instanceof byte[] binaryValue) {
            if (!(writer instanceof LargeVarBinaryWriter binaryWriter)) {
                throw new Exception(String.format("Have `byte[]` value but mismatched writer type '%s': ", writer.getClass().getSimpleName()));
            }
            try (
                ArrowBuf tempBuf = allocator.buffer(binaryValue.length)
            ) {
                tempBuf.setBytes(0, binaryValue);
                binaryWriter.writeLargeVarBinary(0, binaryValue.length, tempBuf);
            }
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
        } else if (value instanceof List<?> vl) {
            if (!(writer instanceof BaseWriter.ListWriter listWriter)) {
                throw new Exception(String.format("Have `List` value but mismatched writer type '%s': ", writer.getClass().getSimpleName()));
            }
	        BaseWriter innerWriter;
            if (vl.isEmpty()) {
                throw new Exception("Input values is an `Array` or a `List` of length 0");
            }

			Object typeItem = null;
	        for (int index = 0; index < vl.size() && typeItem == null; ++index) {
				typeItem = vl.get(index);
			}

			if (typeItem == null) {
				listWriter.writeNull();
				return;
			}

			if (typeItem instanceof Integer) {
                innerWriter = listWriter.bigInt();
            } else if (typeItem instanceof Long) {
                innerWriter = listWriter.bigInt();
            } else if (typeItem instanceof Double) {
                innerWriter = listWriter.float8();
            } else if (typeItem instanceof String) {
                innerWriter = listWriter.largeVarChar();
            } else if (typeItem instanceof Boolean) {
                innerWriter = listWriter.bit();
            } else if (typeItem instanceof byte[]) {
                innerWriter = listWriter.largeVarBinary();
            } else if (typeItem instanceof ZonedDateTime) {
                innerWriter = listWriter.timeStampMicroTZ();
            } else if (typeItem instanceof LocalDateTime) {
                innerWriter = listWriter.timeStampMicro();
            } else if (typeItem instanceof List) {
                innerWriter = listWriter.list();
            } else {
                innerWriter = listWriter.struct();
            }
            listWriter.startList();
            for (Object item: vl) {
                writeValue(innerWriter, item, allocator);
            }
            listWriter.endList();
        } else if (writer instanceof NullableStructWriter structWriter) {
            writeStructValue(structWriter, value, allocator);
        } else if (writer instanceof UnionListWriter structWriter) {
            // When we call `.struct()` on a list writer we sometimes receive a `UnionListWriter`.
            writeStructValue(structWriter, value, allocator);
        } else if (writer instanceof UnionLargeListWriter structWriter) {
            writeStructValue(structWriter, value, allocator);
        } else {
            throw new Exception("Unsupported data type: " + value.getClass().getSimpleName());
        }
    }


    private static List<?> copyValues(String columnName, List<?> rawValues) throws Exception {
        if (rawValues == null) {
            throw new Exception(String.format("Input values for '%s' is null", columnName));
        }
        try {
            return new ArrayList<>(rawValues);
        } catch (Exception e) {
            throw new Exception(String.format("error converting '%s' value to a `List<Object>`: %s", columnName, e.getMessage()), e);
        }
    }

    private static Object firstNonNull(List<?> values) {
        for (Object value : values) {
            if (value != null) {
                return value;
            }
        }
        return null;
    }

    private static void writeColumnValues(BaseWriter writer, List<?> values, BufferAllocator allocator) throws Exception {
        for (int i = 0; i < values.size(); i++) {
            writer.setPosition(i);
            writeValue(writer, values.get(i), allocator);
        }
    }

    private static FieldVector buildVectorForColumn(String columnName, List<?> values, BufferAllocator allocator) throws Exception {
        if (values.isEmpty()) {
            throw new Exception("Input values is an `Array` or a `List` of length 0");
        }

        Object firstNonNull = firstNonNull(values);
        if (firstNonNull == null) {
            NullVector nullVector = new NullVector(columnName, values.size());
            nullVector.setValueCount(values.size());
            return nullVector;
        }

        if (firstNonNull instanceof Integer || firstNonNull instanceof Long) {
            BigIntVector vector = new BigIntVector(columnName, allocator);
            vector.allocateNew(values.size());
            var writer = new BigIntWriterImpl(vector);
            writeColumnValues(writer, values, allocator);
            vector.setValueCount(values.size());
            return vector;
        } else if (firstNonNull instanceof Double) {
            Float8Vector vector = new Float8Vector(columnName, allocator);
            vector.allocateNew(values.size());
            var writer = new Float8WriterImpl(vector);
            writeColumnValues(writer, values, allocator);
            vector.setValueCount(values.size());
            return vector;
        } else if (firstNonNull instanceof String) {
            LargeVarCharVector vector = new LargeVarCharVector(columnName, allocator);
            vector.setInitialCapacity(values.size());
            vector.allocateNew();
            var writer = new LargeVarCharWriterImpl(vector);
            writeColumnValues(writer, values, allocator);
            vector.setValueCount(values.size());
            return vector;
        } else if (firstNonNull instanceof Boolean) {
            BitVector vector = new BitVector(columnName, allocator);
            vector.allocateNew(values.size());
            var writer = new BitWriterImpl(vector);
            writeColumnValues(writer, values, allocator);
            vector.setValueCount(values.size());
            return vector;
        } else if (firstNonNull instanceof byte[]) {
            LargeVarBinaryVector vector = new LargeVarBinaryVector(columnName, allocator);
            vector.setInitialCapacity(values.size());
            vector.allocateNew();
            var writer = new LargeVarBinaryWriterImpl(vector);
            writeColumnValues(writer, values, allocator);
            vector.setValueCount(values.size());
            return vector;
        } else if (firstNonNull instanceof ZonedDateTime zonedDt) {
            String tz = zonedDt.getZone().toString();
            TimeStampMicroTZVector vector = new TimeStampMicroTZVector(columnName, allocator, tz);
            vector.allocateNew(values.size());
            var writer = new TimeStampMicroTZWriterImpl(vector);
            writeColumnValues(writer, values, allocator);
            vector.setValueCount(values.size());
            return vector;
        } else if (firstNonNull instanceof LocalDateTime) {
            TimeStampMicroVector vector = new TimeStampMicroVector(columnName, allocator);
            vector.allocateNew(values.size());
            var writer = new TimeStampMicroWriterImpl(vector);
            writeColumnValues(writer, values, allocator);
            vector.setValueCount(values.size());
            return vector;
        } else if (firstNonNull instanceof List) {
            LargeListVector vector = LargeListVector.empty(columnName, allocator);
            vector.allocateNew();
            var writer = vector.getWriter();
            writeColumnValues(writer, values, allocator);
            writer.setValueCount(values.size());
            vector.setValueCount(values.size());
            return vector;
        } else if (firstNonNull instanceof Map) {
            StructVector vector = StructVector.empty(columnName, allocator);
            vector.allocateNew();
            var writer = vector.getWriter();
            writeColumnValues(writer, values, allocator);
            writer.setValueCount(values.size());
            vector.setValueCount(values.size());
            return vector;
        } else {
            throw new Exception("Unsupported data type: " + firstNonNull.getClass().getSimpleName());
        }
    }

    private static byte[] writeVectorsToBytes(List<FieldVector> vectors) throws Exception {
        try (
            VectorSchemaRoot root = VectorSchemaRoot.of(Utils.listToArray(vectors, FieldVector.class));
            ByteArrayOutputStream out = new ByteArrayOutputStream();
            ArrowFileWriter writer = new ArrowFileWriter(root, null, Channels.newChannel(out));
        ) {
            writer.start();
            writer.writeBatch();
            writer.end();
            return out.toByteArray();
        }
    }

    private static void closeVectors(List<FieldVector> vectors) {
        for (FieldVector vector : vectors) {
            if (vector != null) {
                vector.close();
            }
        }
    }

    public static byte[] inputsToArrowBytes(Map<String, List<?>> inputs, BufferAllocator allocator) throws Exception {
        List<FieldVector> fieldVectors = new ArrayList<>();
        int uniformListLength = -1;
        boolean success = false;
        try {
            for (Map.Entry<String, List<?>> entry : inputs.entrySet()) {
                var columnName = entry.getKey();
                List<?> values = copyValues(columnName, entry.getValue());
                if (uniformListLength == -1) {
                    uniformListLength = values.size();
                } else if (uniformListLength != values.size()) {
                    throw new Exception(String.format("Input values have different lengths - expected %d but got %d: %s", uniformListLength, values.size(), values));
                }
                FieldVector vector = buildVectorForColumn(columnName, values, allocator);
                fieldVectors.add(vector);
            }

            byte[] arrowBytes = writeVectorsToBytes(fieldVectors);
            success = true;
            return arrowBytes;
        } finally {
            if (!success) {
                closeVectors(fieldVectors);
            }
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
    public static Table getTableIfBatchSizeOne(byte[] bytes, BufferAllocator allocator) throws Exception {
        try (
            SeekableReadChannel seekableReadChannelBatchCounter = new SeekableReadChannel(
                new ByteArrayReadableSeekableByteChannel(bytes)
            );
            ArrowFileReader arrowFileReaderBatchCounter = new ArrowFileReader(
                seekableReadChannelBatchCounter,
                allocator,
                new CommonsCompressionFactory()
            );
            VectorSchemaRoot readerRootBatchCounter = arrowFileReaderBatchCounter.getVectorSchemaRoot();
        ) {
            var numBatches = 0;
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
        return null;
    }

    public static Table convertBytesToTable(byte[] bytes, BufferAllocator allocator) throws Exception {
        var maybeSingleBatchTable = getTableIfBatchSizeOne(bytes, allocator);
        if (maybeSingleBatchTable != null) {
            return maybeSingleBatchTable;
        }
        try (
            SeekableReadChannel seekableReadChannel = new SeekableReadChannel(
                new ByteArrayReadableSeekableByteChannel(bytes)
            );
            ArrowFileReader arrowFileReader = new ArrowFileReader(
                seekableReadChannel,
                allocator,
                new CommonsCompressionFactory()
            );
            VectorSchemaRoot readerRoot = arrowFileReader.getVectorSchemaRoot();
            VectorSchemaRoot collectorRoot = VectorSchemaRoot.create(readerRoot.getSchema(), allocator)
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

    public static Table inputsToTable(Map<String, List<?>> inputs, BufferAllocator allocator) throws Exception {
        return convertBytesToTable(inputsToArrowBytes(inputs, allocator), allocator);
    }
}
