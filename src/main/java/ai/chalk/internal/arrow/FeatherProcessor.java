package ai.chalk.internal.arrow;

import org.apache.arrow.compression.CommonsCompressionFactory;
import org.apache.arrow.memory.RootAllocator;
import org.apache.arrow.vector.*;
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
        javaToArrowType.put(String.class, ArrowType.Utf8.INSTANCE);
        javaToArrowType.put(Boolean.class, ArrowType.Bool.INSTANCE);
        javaToArrowType.put(byte[].class, ArrowType.Binary.INSTANCE);
    }

    public static byte[] inputsToArrowBytes(Map<String, List<?>> inputs) throws Exception {
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
                throw new Exception("Unsupported data type: " + Array.get(entry.getValue(), 0).getClass().getSimpleName());
            }

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
                case Utf8 -> vector = new VarCharVector(field.getName(), new RootAllocator(Long.MAX_VALUE));
                case Bool -> vector = new BitVector(field.getName(), new RootAllocator(Long.MAX_VALUE));
                case Binary -> vector = new LargeVarBinaryVector(field.getName(), new RootAllocator(Long.MAX_VALUE));
                default -> throw new Exception("Unsupported arrow type: " + field.getType().getTypeID());
            }
            fieldVectors.add(vector);
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
                case Utf8 -> {
                    VarCharVector varcharVector = (VarCharVector) vector;
                    varcharVector.allocateNew(values.size());
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
                case Binary -> {
                    LargeVarBinaryVector binaryVector = (LargeVarBinaryVector) vector;
                    binaryVector.allocateNew(values.size());
                    for (int i = 0; i < values.size(); i++) {
                        binaryVector.set(i, (byte[]) values.get(i));
                    }
                    binaryVector.setValueCount(values.size());
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
