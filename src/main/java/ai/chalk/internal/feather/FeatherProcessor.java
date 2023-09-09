package ai.chalk.internal.feather;

import org.apache.arrow.compression.CommonsCompressionFactory;
import org.apache.arrow.memory.BufferAllocator;
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
        javaToArrowType.put(Byte.class, new ArrowType.Int(8, true));
        javaToArrowType.put(Short.class, new ArrowType.Int(16, true));
        javaToArrowType.put(Integer.class, new ArrowType.Int(32, true));
        javaToArrowType.put(Long.class, new ArrowType.Int(64, true));
        javaToArrowType.put(Float.class, new ArrowType.FloatingPoint(FloatingPointPrecision.SINGLE));
        javaToArrowType.put(Double.class, new ArrowType.FloatingPoint(FloatingPointPrecision.DOUBLE));
        javaToArrowType.put(String.class, ArrowType.Utf8.INSTANCE);
        javaToArrowType.put(Boolean.class, ArrowType.Bool.INSTANCE);
    }

    private static Object[] convertArrayElementsToObject(Object array) throws Exception {
        if (!(array.getClass().isArray())) {
            throw new Exception("Value is not an array");
        }
        if (Array.getLength(array) == 0) {
            throw new Exception("Array is empty");
        }

        Object[] result = new Object[Array.getLength(array)];
        for (int i = 0; i < Array.getLength(array); i++) {
            Object element = Array.get(array, i);
            result[i] = element;
        }

        return result;
    }

    public static byte[] inputsToArrowBytes(Map<String, Object> inputs) throws Exception {
        List<Field> fields = new ArrayList<>();
        List<FieldVector> fieldVectors = new ArrayList<>();
        Map<String, Object[]> fqnToArray = new HashMap<>();

        for (Map.Entry<String, Object> entry : inputs.entrySet()) {
            Object value = entry.getValue();
            Object[] array;
            try {
                array = convertArrayElementsToObject(value);
            } catch (Exception e) {
                throw new Exception(String.format("error converting '%s' value to array: %s", entry.getKey(), e.getMessage()));
            }
            fqnToArray.put(entry.getKey(), array);
        }


        for (Map.Entry<String, Object[]> entry : fqnToArray.entrySet()) {
            ArrowType arrowType = javaToArrowType.get(Array.get(entry.getValue(), 0).getClass());
            if (arrowType == null) {
                throw new Exception("Unsupported data type: " + Array.get(entry.getValue(), 0).getClass().getSimpleName());
            }

            Field field = new Field(entry.getKey(), FieldType.nullable(arrowType), null);
            fields.add(field);

            FieldVector vector;
            switch (field.getType().getTypeID()) {
                case Int -> vector = new IntVector(field.getName(), new RootAllocator(Long.MAX_VALUE));
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
                default -> throw new Exception("Unsupported arrow type: " + field.getType().getTypeID());
            }
            fieldVectors.add(vector);
        }

        int rowCount;
        try {
            rowCount = fieldVectors.get(0).getValueCount();
        } catch (Exception e) {
            throw new Exception("All input arrays must be of the same length");
        }
        VectorSchemaRoot root = new VectorSchemaRoot(fields, fieldVectors, rowCount);

        for (Field field : fields) {
            Object[] values = fqnToArray.get(field.getName());
            FieldVector vector = root.getVector(field.getName());

            // Populate the vector with data
            switch (field.getType().getTypeID()) {
                case Int -> {
                    IntVector intVector = (IntVector) vector;
                    intVector.allocateNew(values.length);
                    for (int i = 0; i < values.length; i++) {
                        intVector.set(i, (int) values[i]);
                    }
                    intVector.setValueCount(values.length);
                }
                case FloatingPoint -> {
                    ArrowType.FloatingPoint fpType = (ArrowType.FloatingPoint) field.getType();
                    if (fpType.getPrecision() == FloatingPointPrecision.SINGLE) {
                        Float4Vector floatVector = (Float4Vector) vector;
                        floatVector.allocateNew(values.length);
                        for (int i = 0; i < values.length; i++) {
                            floatVector.set(i, (float) values[i]);
                        }
                        floatVector.setValueCount(values.length);
                    } else {
                        Float8Vector doubleVector = (Float8Vector) vector;
                        doubleVector.allocateNew(values.length);
                        for (int i = 0; i < values.length; i++) {
                            doubleVector.set(i, (double) values[i]);
                        }
                        doubleVector.setValueCount(values.length);
                    }
                }
                case Utf8 -> {
                    VarCharVector varcharVector = (VarCharVector) vector;
                    varcharVector.allocateNew(values.length);
                    for (int i = 0; i < values.length; i++) {
                        varcharVector.set(i, ((String) values[i]).getBytes());
                    }
                    varcharVector.setValueCount(values.length);
                }
                case Bool -> {
                    BitVector boolVector = (BitVector) vector;
                    boolVector.allocateNew(values.length);
                    for (int i = 0; i < values.length; i++) {
                        boolVector.set(i, (boolean) values[i] ? 1 : 0);
                    }
                    boolVector.setValueCount(values.length);
                }
            }
        }

        try (
                ByteArrayOutputStream out = new ByteArrayOutputStream();
                ArrowFileWriter writer = new ArrowFileWriter(root, null, Channels.newChannel(out));
        ) {
            writer.start();
            writer.writeBatch();
            writer.end();
            writer.close();
            return out.toByteArray();
        }
    }

    public static Table convertBytesToTable(byte[] bytes) throws Exception {
        SeekableReadChannel seekableReadChannel = new SeekableReadChannel(new ByteArrayReadableSeekableByteChannel(bytes));
        ArrowFileReader arrowFileReader = new ArrowFileReader(seekableReadChannel, new RootAllocator(Long.MAX_VALUE), new CommonsCompressionFactory());

        VectorSchemaRoot readerRoot = arrowFileReader.getVectorSchemaRoot();
        VectorSchemaRoot collectorRoot = VectorSchemaRoot.create(readerRoot.getSchema(), new RootAllocator(Long.MAX_VALUE));
        while (arrowFileReader.loadNextBatch()) {
              VectorSchemaRootAppender.append(collectorRoot, readerRoot);
        }

        Table table = new Table(collectorRoot);
        arrowFileReader.close();
        return table;
    }
}
