package chalk.internal.arrow;

import chalk.features.Feature;
import chalk.features.FeaturesClass;
import chalk.internal.codegen.Initializer;
import org.apache.arrow.vector.table.Row;
import org.apache.arrow.vector.table.Table;
import org.apache.arrow.vector.types.FloatingPointPrecision;
import org.apache.arrow.vector.types.pojo.ArrowType;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static chalk.internal.Utils.listToArray;

public class TableUnmarshaller {

    public static <T extends FeaturesClass> T[] unmarshal(Table table, Class<T> target) throws Exception {
        List<T> result = new ArrayList<T>();
        for (Row row: table) {
            T obj = target.getDeclaredConstructor().newInstance();
            Map<String, Feature<?>> featureMap;
            try {
                featureMap = Initializer.initResult(obj);
            } catch (Exception e) {
                throw new Exception("Failed to initialize result object", e);
            }

            for (var arrowField: table.getSchema().getFields()) {
                String fqn = arrowField.getName();

                switch (arrowField.getType().getTypeID()) {
                    case Int:
                        var castInt = (ArrowType.Int) (arrowField.getFieldType().getType());
                        var bitWidth = castInt.getBitWidth();
                        if (bitWidth == 32) {
                            int val = row.getInt(fqn);
                            var feature = featureMap.get(fqn);
                            feature.setValue(val);
                        } else if (bitWidth == 64) {
                            long val = row.getBigInt(fqn);
                            var feature = featureMap.get(fqn);
                            feature.setValue(val);
                        } else if (bitWidth == 16) {
                            short val = row.getSmallInt(fqn);
                            var feature = featureMap.get(fqn);
                            feature.setValue(val);
                        } else if (bitWidth == 8) {
                            byte val = row.getTinyInt(fqn);
                            var feature = featureMap.get(fqn);
                            feature.setValue(val);
                        } else {
                            throw new Exception("Unsupported bitwidth found while converting from Arrow to Java: " + bitWidth);
                        }
                        break;
                    case FloatingPoint:
                        var castFloatingPoint = (ArrowType.FloatingPoint) (arrowField.getFieldType().getType());
                        var precision = castFloatingPoint.getPrecision();
                        if (precision == FloatingPointPrecision.SINGLE) {
                            var val2 = row.getFloat4(fqn);
                            var feature2 = featureMap.get(fqn);
                            feature2.setValue(val2);
                        } else if (precision == FloatingPointPrecision.DOUBLE) {
                            var val2 = row.getFloat8(fqn);
                            var feature2 = featureMap.get(fqn);
                            feature2.setValue(val2);
                        } else {
                            throw new Exception("Unsupported precision found while converting from Arrow to Java: " + precision);
                        }
                        break;

                }

            }
            result.add(obj);
        }
        return listToArray(result, target);
    }
}
