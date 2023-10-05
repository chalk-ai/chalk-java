package chalk.arrow;

import chalk.arrow.test_features.ArrowFeatures;
import chalk.arrow.test_features.ArrowUser;
import chalk.internal.arrow.TableUnmarshaller;
import org.apache.arrow.memory.RootAllocator;
import org.apache.arrow.vector.BigIntVector;
import org.apache.arrow.vector.FieldVector;
import org.apache.arrow.vector.IntVector;
import org.apache.arrow.vector.VectorSchemaRoot;
import org.apache.arrow.vector.table.Table;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;


public class TestUnmarshaller {
    public Table getTestTableWithAllArrowTypes() {
        List<FieldVector> fieldVectors = new ArrayList<>();
        var allocator = new RootAllocator(Long.MAX_VALUE);

        var bigIntVector = new BigIntVector(ArrowFeatures.user.favoriteBigInteger.getFqn(), allocator);
        bigIntVector.allocateNew();
        long[] values = {1, 2, 3};
        for (int i = 0; i < values.length; i++) {
            bigIntVector.set(i, values[i]);
        }
        bigIntVector.setValueCount(values.length);
        fieldVectors.add(bigIntVector);

//        var intVector = new IntVector()

        VectorSchemaRoot root = VectorSchemaRoot.of(bigIntVector);
        var table = new Table(root);
        return table;





//        case Int -> {
//
//        case FloatingPoint -> {
//
//        case Bool -> {
//
//        case LargeUtf8, Utf8 -> {
//
//        case Date -> {
//
//        case Timestamp -> {

    }

    @Test
    public void testUnmarshalScalar() throws Exception {
        var users = TableUnmarshaller.unmarshal(getTestTableWithAllArrowTypes(), ArrowUser.class);
        assert users.length == 3;
        assert users[0].favoriteBigInteger.getValue() == 1L;
        assert users[1].favoriteBigInteger.getValue() == 2L;
        assert users[2].favoriteBigInteger.getValue() == 3L;




        // All types
        // Has one features??

        // Has-many

        System.out.println(">>> FANCY PANTS");
    }
}
