package ai.chalk.internal.arrow;

import ai.chalk.internal.Utils;
import org.apache.arrow.compression.CommonsCompressionFactory;
import org.apache.arrow.memory.ArrowBuf;
import org.apache.arrow.memory.RootAllocator;
import org.apache.arrow.vector.*;
import org.apache.arrow.vector.complex.StructVector;
import org.apache.arrow.vector.complex.impl.BigIntWriterImpl;
import org.apache.arrow.vector.complex.impl.BitWriterImpl;
import org.apache.arrow.vector.complex.impl.Float8WriterImpl;
import org.apache.arrow.vector.complex.impl.LargeVarCharWriterImpl;
import org.apache.arrow.vector.complex.writer.*;
import org.apache.arrow.vector.ipc.ArrowFileReader;
import org.apache.arrow.vector.ipc.ArrowFileWriter;
import org.apache.arrow.vector.ipc.SeekableReadChannel;
import org.apache.arrow.vector.types.FloatingPointPrecision;
import org.apache.arrow.vector.types.pojo.ArrowType;
import org.apache.arrow.vector.types.pojo.Field;
import org.apache.arrow.vector.types.pojo.FieldType;
import org.apache.arrow.vector.util.ByteArrayReadableSeekableByteChannel;
import org.apache.arrow.vector.table.Table;
import org.apache.arrow.vector.util.VectorSchemaRootAppender;


import java.io.ByteArrayOutputStream;
import java.lang.reflect.Array;
import java.nio.channels.Channels;
import java.util.*;

public class FeatherProcessor {
    private static Map<Class<?>, ArrowType> javaToArrowType = new HashMap<>();

    static {
        javaToArrowType.put(Short.class, new ArrowType.Int(64, true));
        javaToArrowType.put(Integer.class, new ArrowType.Int(64, true));
        javaToArrowType.put(Long.class, new ArrowType.Int(64, true));
        javaToArrowType.put(Float.class, new ArrowType.FloatingPoint(FloatingPointPrecision.SINGLE));
        javaToArrowType.put(Double.class, new ArrowType.FloatingPoint(FloatingPointPrecision.DOUBLE));
        javaToArrowType.put(String.class, ArrowType.LargeUtf8.INSTANCE);
        javaToArrowType.put(Boolean.class, ArrowType.Bool.INSTANCE);
        javaToArrowType.put(byte[].class, ArrowType.LargeBinary.INSTANCE);
    }



    public static void  powerWrite(BaseWriter writer, Object value) throws Exception {
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
        } else if (writer instanceof BaseWriter.StructWriter structWriter) {
            structWriter.start();
            var structFields = value.getClass().getDeclaredFields();
            for (java.lang.reflect.Field sf: structFields) {
                var structFieldValue = sf.get(value);
                if (structFieldValue instanceof String) {
                    var innerWriter = structWriter.largeVarChar(sf.getName());
                    powerWrite(innerWriter, structFieldValue);
                } else if (structFieldValue instanceof Double) {
                    var innerWriter = structWriter.float8(sf.getName());
                    powerWrite(innerWriter, structFieldValue);
                } else {
                    throw new Exception("Unsupported data type: " + sf.getType().getSimpleName());
                }
            }
            structWriter.end();
        } else {
            throw new Exception("Unsupported data type: " + value.getClass().getSimpleName());
        }

//        switch (arrowType.getTypeID()) {
//            case Int -> {
//                BigIntWriter intWriter = (BigIntWriter) writer;
//                intWriter.writeBigInt((Integer) value);
//            }
//            case FloatingPoint -> {
//                Float8Writer floatWriter = (Float8Writer) writer;
//                floatWriter.writeFloat8((Double) value);
//            }
//            case LargeUtf8 -> {
//                LargeVarCharWriter stringWriter = (LargeVarCharWriter) writer;
//                String stringValue = (String) value;
//                var bytesValue = stringValue.getBytes();
//                ArrowBuf tempBuf = new RootAllocator(Long.MAX_VALUE).buffer(bytesValue.length);
//                tempBuf.setBytes(0, bytesValue);
//                stringWriter.writeLargeVarChar(0, bytesValue.length, tempBuf);
//            }
//            case Bool -> {
//                BitWriter boolWriter = (BitWriter) writer;
//                boolWriter.writeBit((Boolean) value ? 1 : 0);
//            }
//            case LargeBinary -> {
//                LargeVarBinaryWriter binaryWriter = (LargeVarBinaryWriter) writer;
//                byte[] binaryValue = (byte[]) value;
//                ArrowBuf tempBuf = new RootAllocator(Long.MAX_VALUE).buffer(binaryValue.length);
//                tempBuf.setBytes(0, binaryValue);
//                binaryWriter.writeLargeVarBinary(0, binaryValue.length, tempBuf);
//            }
//            case Struct -> {
//                BaseWriter.StructWriter structWriter = (BaseWriter.StructWriter) writer;
//                var structFields = value.getClass().getDeclaredFields();
//                structWriter.start();
//                for (java.lang.reflect.Field structField: structFields) {
//                    var structFieldValue = structField.get(value);
//                    if (structFieldValue instanceof String) {
//                        var innerWriter = structWriter.largeVarChar(structField.getName());
//                        powerWrite(innerWriter, structFieldValue);
//                    } else if (structFieldValue instanceof Double) {
//                        var innerWriter = structWriter.float8(structField.getName());
//                        powerWrite(innerWriter, structFieldValue);
//                    } else {
//                        throw new Exception("Unsupported data type: " + structField.getType().getSimpleName());
//                    }
//                }
//                structWriter.end();
//            }
    }


    public static byte[] inputsToArrowBytes(Map<String, List<?>> inputs) throws Exception {
        List<FieldVector> fieldVectors = new ArrayList<>();
        List<FieldMeta> fieldMetas = new ArrayList<>();

        var uniformListLength = -1;
        for (Map.Entry<String, List<?>> entry : inputs.entrySet()) {
            List<?> value = entry.getValue();
            List<Object> list;
            try {
                list = new ArrayList<>(value);
            } catch (Exception e) {
                throw new Exception(String.format("error converting '%s' value to a `List<Object>`: %s", entry.getKey(), e.getMessage()));
            }
            if (list.size() == 0) {
                throw new Exception("Input values is an `Array` or a `List` of length 0");
            } else if (uniformListLength == -1) {
                uniformListLength = list.size();
            } else if (uniformListLength != list.size()) {
                throw new Exception("Input values have different lengths");
            }

            ArrowType arrowType = javaToArrowType.get(list.get(0).getClass());
            if (arrowType == null) {
//                throw new Exception("Unsupported data type: " + list.get(0).getClass().getSimpleName());
                arrowType = ArrowType.Struct.INSTANCE;
            }
            fieldMetas.add(new FieldMeta(entry.getKey(), list, arrowType));
        }

        for (FieldMeta fieldMeta : fieldMetas) {
            switch (fieldMeta.type.getTypeID()) {
                case Int -> {
                    BigIntVector intVector = new BigIntVector(fieldMeta.fqn, new RootAllocator(Long.MAX_VALUE));
                    fieldVectors.add(intVector);
                    var writer = new BigIntWriterImpl(intVector);
                    for (int i = 0; i < fieldMeta.values.size(); i++) {
                        writer.setPosition(i);
                        powerWrite(writer, fieldMeta.values.get(i));
                    }
                }
                case FloatingPoint -> {
                    Float8Vector doubleVector = new Float8Vector(fieldMeta.fqn, new RootAllocator(Long.MAX_VALUE));
                    fieldVectors.add(doubleVector);
                    var writer = new Float8WriterImpl(doubleVector);
                    for (int i = 0; i < fieldMeta.values.size(); i++) {
                        writer.setPosition(i);
                        powerWrite(writer, fieldMeta.values.get(i));
                    }
                }
                case LargeUtf8 -> {
                    LargeVarCharVector stringVector = new LargeVarCharVector(fieldMeta.fqn, new RootAllocator(Long.MAX_VALUE));
                    fieldVectors.add(stringVector);
                    var writer = new LargeVarCharWriterImpl(stringVector);
                    for (int i = 0; i < fieldMeta.values.size(); i++) {
                        writer.setPosition(i);
                        powerWrite(writer, fieldMeta.values.get(i));
                    }
                }
                case Bool -> {
                    BitVector boolVector = new BitVector(fieldMeta.fqn, new RootAllocator(Long.MAX_VALUE));
                    fieldVectors.add(boolVector);
                    var writer = new BitWriterImpl(boolVector);
                    for (int i = 0; i < fieldMeta.values.size(); i++) {
                        writer.setPosition(i);
                        powerWrite(writer, fieldMeta.values.get(i));
                    }
                }
                case Struct -> {
                    var structVector = StructVector.empty(fieldMeta.getFqn(), new RootAllocator(Long.MAX_VALUE));
                    fieldVectors.add(structVector);
                    var writer = structVector.getWriter();
                    for (int i = 0; i < fieldMeta.values.size(); i++) {
                        powerWrite(writer, fieldMeta.values.get(i));
                    }
                    // Importante to `setValueCount` otherwise values all null.
                    writer.setValueCount(fieldMeta.values.size());
                }
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

    public static byte[] inputsToArrowBytesOld(Map<String, List<?>> inputs) throws Exception {
        List<Field> fields = new ArrayList<>();
        List<FieldVector> fieldVectors = new ArrayList<>();
        Map<String, List<Object>> fqnToList = new HashMap<>();

        for (Map.Entry<String, List<?>> entry : inputs.entrySet()) {
            List<?> value = entry.getValue();
            List<Object> list;
            try {
                list = new ArrayList<>(value);
            } catch (Exception e) {
                throw new Exception(String.format("error converting '%s' value to a `List<Object>`: %s", entry.getKey(), e.getMessage()));
            }
            if (list.size() == 0) {
                throw new Exception("Input values is an `Array` or a `List` of length 0");
            }
            fqnToList.put(entry.getKey(), list);
        }


        for (Map.Entry<String, List<Object>> entry : fqnToList.entrySet()) {
            ArrowType arrowType = javaToArrowType.get(entry.getValue().get(0).getClass());

            if (arrowType == null) {
                // throw new Exception("Unsupported data type: " + entry.getValue().get(0).getClass().getSimpleName());
                Field field = new Field(entry.getKey(), FieldType.nullable(ArrowType.Struct.INSTANCE), null);
                fields.add(field);
                var structVector = StructVector.empty(entry.getKey(), new RootAllocator(Long.MAX_VALUE));
                structVector.setValueCount(entry.getValue().size());
                fieldVectors.add(structVector);
                var structWriter = structVector.getWriter();
                var structFields = entry.getValue().get(0).getClass().getDeclaredFields();

                var fieldToWriter = new HashMap<String, BaseWriter>();
                for (java.lang.reflect.Field sf: structFields) {
                    var innerType = javaToArrowType.get(sf.getType());
                    if (innerType == null) {
                        throw new Exception("Unsupported data type: " + sf.getType().getSimpleName());
                    }

                    switch (innerType.getTypeID()) {
                        case Int -> {
                            BaseWriter intWriter = structWriter.bigInt(sf.getName());
                            fieldToWriter.put(sf.getName(), intWriter);
                        }
                        case FloatingPoint -> {
                            BaseWriter floatWriter = structWriter.float8(sf.getName());
                            fieldToWriter.put(sf.getName(), floatWriter);
                        }
                        case LargeUtf8 -> {
                            BaseWriter stringWriter = structWriter.largeVarChar(sf.getName());
                            fieldToWriter.put(sf.getName(), stringWriter);
                        }
                        case Bool -> {
                            BaseWriter boolWriter = structWriter.bit(sf.getName());
                            fieldToWriter.put(sf.getName(), boolWriter);
                        }
                        case LargeBinary -> {
                            BaseWriter binaryWriter = structWriter.largeVarBinary(sf.getName());
                            fieldToWriter.put(sf.getName(), binaryWriter);
                        }
                    }
                }

                for (Object item : entry.getValue()) {
                    structWriter.start();
                    for (java.lang.reflect.Field structField: structFields) {
                        var structFieldValue = structField.get(item);
                        var innerArrowType = javaToArrowType.get(structField.getType());
                        if (innerArrowType == null) {
                            throw new Exception("Unsupported data type: " + structField.getType().getSimpleName());
                        }
                        switch (innerArrowType.getTypeID()) {
                            case Int -> {
                                BigIntWriter intWriter = (BigIntWriter) fieldToWriter.get(structField.getName());
                                intWriter.writeBigInt((Long) structFieldValue);
                            }
                            case FloatingPoint -> {
                                Float8Writer floatWriter = (Float8Writer) fieldToWriter.get(structField.getName());
                                floatWriter.writeFloat8((Double) structFieldValue);
                            }
                            case LargeUtf8 -> {
                                LargeVarCharWriter stringWriter = (LargeVarCharWriter) fieldToWriter.get(structField.getName());
                                String stringValue = (String) structFieldValue;
                                var bytesValue = stringValue.getBytes();
                                ArrowBuf tempBuf = new RootAllocator(Long.MAX_VALUE).buffer(bytesValue.length);
                                tempBuf.setBytes(0, bytesValue);
                                stringWriter.writeLargeVarChar(0, bytesValue.length, tempBuf);
                            }
                            case Bool -> {
                                BitWriter boolWriter = (BitWriter) fieldToWriter.get(structField.getName());
                                boolWriter.writeBit((Boolean) structFieldValue ? 1 : 0);
                            }
                            case LargeBinary -> {
                                LargeVarBinaryWriter binaryWriter = (LargeVarBinaryWriter) fieldToWriter.get(structField.getName());
                                byte[] binaryValue = (byte[]) structFieldValue;
                                ArrowBuf tempBuf = new RootAllocator(Long.MAX_VALUE).buffer(binaryValue.length);
                                tempBuf.setBytes(0, binaryValue);
                                binaryWriter.writeLargeVarBinary(0, binaryValue.length, tempBuf);
                            }
                        }
                    }
                    structWriter.end();
                }
            } else {
                Field field = new Field(entry.getKey(), FieldType.nullable(arrowType), null);
                fields.add(field);
                FieldVector vector;
                switch (field.getType().getTypeID()) {
                    case Int -> vector = new BigIntVector(field.getName(), new RootAllocator(Long.MAX_VALUE));
                    case FloatingPoint -> {
                        ArrowType.FloatingPoint fpType = (ArrowType.FloatingPoint) field.getType();
                        if (fpType.getPrecision() == FloatingPointPrecision.SINGLE) {
                            vector = new Float4Vector(field.getName(), new RootAllocator(Long.MAX_VALUE));
                        } else {
                            vector = new Float8Vector(field.getName(), new RootAllocator(Long.MAX_VALUE));
                        }
                    }
                    case LargeUtf8 -> vector = new LargeVarCharVector(field.getName(), new RootAllocator(Long.MAX_VALUE));
                    case Bool -> vector = new BitVector(field.getName(), new RootAllocator(Long.MAX_VALUE));
                    case LargeBinary -> vector = new LargeVarBinaryVector(field.getName(), new RootAllocator(Long.MAX_VALUE));
                    default -> throw new Exception("Unsupported arrow type: " + field.getType().getTypeID());
                }
                fieldVectors.add(vector);
            }
        }

        VectorSchemaRoot root = new VectorSchemaRoot(fields, fieldVectors, 0);

        int lastLength = 0;
        for (Field field : fields) {
            List<Object> values = fqnToList.get(field.getName());
            FieldVector vector = root.getVector(field.getName());
            lastLength = values.size();
            // Populate the vector with data
            switch (field.getType().getTypeID()) {
                case Int -> {
                    BigIntVector intVector = (BigIntVector) vector;
                    intVector.allocateNew(values.size());
                    for (int i = 0; i < values.size(); i++) {
                        intVector.set(i, Long.parseLong(values.get(i).toString()));
                    }
                    intVector.setValueCount(values.size());
                }
                case FloatingPoint -> {
                    ArrowType.FloatingPoint fpType = (ArrowType.FloatingPoint) field.getType();
                    if (fpType.getPrecision() == FloatingPointPrecision.SINGLE) {
                        Float4Vector floatVector = (Float4Vector) vector;
                        floatVector.allocateNew(values.size());
                        for (int i = 0; i < values.size(); i++) {
                            floatVector.set(i, (float) values.get(i));
                        }
                        floatVector.setValueCount(values.size());
                    } else {
                        Float8Vector doubleVector = (Float8Vector) vector;
                        doubleVector.allocateNew(values.size());
                        for (int i = 0; i < values.size(); i++) {
                            doubleVector.set(i, (double) values.get(i));
                        }
                        doubleVector.setValueCount(values.size());
                    }
                }
                case LargeUtf8 -> {
                    LargeVarCharVector varcharVector = (LargeVarCharVector) vector;
                    long totalBytes = values.stream()
                            .mapToLong(v -> ((String) v).getBytes().length)
                            .sum();
                    varcharVector.allocateNew(totalBytes, values.size());
                    for (int i = 0; i < values.size(); i++) {
                        varcharVector.set(i, ((String) values.get(i)).getBytes());
                    }
                    varcharVector.setValueCount(values.size());
                }
                case Bool -> {
                    BitVector boolVector = (BitVector) vector;
                    boolVector.allocateNew(values.size());
                    for (int i = 0; i < values.size(); i++) {
                        boolVector.set(i, (boolean) values.get(i) ? 1 : 0);
                    }
                    boolVector.setValueCount(values.size());
                }
                case LargeBinary -> {
                    LargeVarBinaryVector binaryVector = (LargeVarBinaryVector) vector;
                    long totalBytes = values.stream()
                            .mapToLong(v -> ((byte[]) v).length)
                            .sum();
                    binaryVector.allocateNew(totalBytes, values.size());
                    for (int i = 0; i < values.size(); i++) {
                        binaryVector.set(i, (byte[]) values.get(i));
                    }
                    binaryVector.setValueCount(values.size());
                }
                case Struct -> {
                    // Already handled. TODO: Refactor to avoid awkwardness like this
                }
            }
        }

        root.setRowCount(lastLength);

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
