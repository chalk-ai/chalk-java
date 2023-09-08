package ai.chalk.internal.feather;

import org.apache.arrow.compression.CommonsCompressionFactory;
import org.apache.arrow.memory.RootAllocator;
import org.apache.arrow.vector.*;
import org.apache.arrow.vector.ipc.ArrowFileReader;
import org.apache.arrow.vector.ipc.SeekableReadChannel;
import org.apache.arrow.vector.types.FloatingPointPrecision;
import org.apache.arrow.vector.types.pojo.ArrowType;
import org.apache.arrow.vector.types.pojo.Field;
import org.apache.arrow.vector.types.pojo.FieldType;
import org.apache.arrow.vector.util.ByteArrayReadableSeekableByteChannel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    public VectorSchemaRoot inputsToArrow(Map<String, Object[]> inputs) throws Exception {
        List<Field> fields = new ArrayList<>();
        List<FieldVector> fieldVectors = new ArrayList<>();

        for (Map.Entry<String, Object[]> entry : inputs.entrySet()) {
            Object[] values = entry.getValue();
            if (values.length == 0) {
                throw new Exception("Array for " + entry.getKey() + " is empty");
            }

            ArrowType arrowType = javaToArrowType.get(values[0].getClass());
            if (arrowType == null) {
                throw new Exception("Unsupported data type: " + values[0].getClass().getName());
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

        VectorSchemaRoot root = new VectorSchemaRoot(fields, fieldVectors, inputs.size());

        for (Field field : fields) {
            Object[] values = inputs.get(field.getName());
            FieldVector vector = root.getVector(field.getName());

            // Populate the vector with data
            switch (field.getType().getTypeID()) {
                case Int -> {
                    IntVector intVector = (IntVector) vector;
                    for (int i = 0; i < values.length; i++) {
                        intVector.set(i, (int) values[i]);
                    }
                    intVector.setValueCount(values.length);
                }
                case FloatingPoint -> {
                    ArrowType.FloatingPoint fpType = (ArrowType.FloatingPoint) field.getType();
                    if (fpType.getPrecision() == FloatingPointPrecision.SINGLE) {
                        Float4Vector floatVector = (Float4Vector) vector;
                        for (int i = 0; i < values.length; i++) {
                            floatVector.set(i, (float) values[i]);
                        }
                        floatVector.setValueCount(values.length);
                    } else {
                        Float8Vector doubleVector = (Float8Vector) vector;
                        for (int i = 0; i < values.length; i++) {
                            doubleVector.set(i, (double) values[i]);
                        }
                        doubleVector.setValueCount(values.length);
                    }
                }
                case Utf8 -> {
                    VarCharVector varcharVector = (VarCharVector) vector;
                    for (int i = 0; i < values.length; i++) {
                        varcharVector.set(i, ((String) values[i]).getBytes());
                    }
                    varcharVector.setValueCount(values.length);
                }
                case Bool -> {
                    BitVector boolVector = (BitVector) vector;
                    for (int i = 0; i < values.length; i++) {
                        boolVector.set(i, (boolean) values[i] ? 1 : 0);
                    }
                    boolVector.setValueCount(values.length);
                }
            }
        }

        return root;
    }


    public static VectorSchemaRoot convertBytesToVectorSchemaRoot(byte[] bytes) throws Exception {
        SeekableReadChannel seekableReadChannel = new SeekableReadChannel(new ByteArrayReadableSeekableByteChannel(bytes));
        ArrowFileReader arrowFileReader = new ArrowFileReader(seekableReadChannel, new RootAllocator(Long.MAX_VALUE), new CommonsCompressionFactory());
        return arrowFileReader.getVectorSchemaRoot();
    }

}
