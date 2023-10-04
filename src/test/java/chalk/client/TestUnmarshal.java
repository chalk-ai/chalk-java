package chalk.client;

import chalk.client.features.User;
import chalk.features.Feature;
import chalk.internal.codegen.Initializer;
import chalk.models.OnlineQueryParams;
import chalk.models.OnlineQueryResult;
import org.apache.arrow.vector.table.Row;
import org.apache.arrow.vector.types.FloatingPointPrecision;
import org.apache.arrow.vector.types.pojo.ArrowType;
import org.junit.jupiter.api.Test;

import java.util.Map;


public class TestUnmarshal {
    @Test
    public void testUnmarshalIntoUser() throws Exception {
        String[] expectedInputs = new String[]{"1", "2", "3"};
        var T = User.class;
        ChalkClient client = ChalkClient.create();

        client.printConfig();
        int[] userIds = new int[10];
        for (int i = 0; i < userIds.length; i++) {
            userIds[i] = i;
        }
        var params = OnlineQueryParams.builder()
                .withInput("user.id", userIds)
                .withOutput("user.socure_score")
                .build();
        User[] users = new User[userIds.length];
        try (OnlineQueryResult result = client.onlineQuery(params)) {
            var scalarsTable = result.getScalarsTable();
            assert result.getScalarsTable().getRowCount() == userIds.length;

            for (Row row: scalarsTable) {
                User obj = T.getConstructor().newInstance();

                Map<String, Feature<?>> featureMap;
                try {
                    featureMap = Initializer.initResult(obj);
                } catch (Exception e) {
                    throw new Exception("Failed to initialize result object");
                }


                for (var arrowField: scalarsTable.getSchema().getFields()) {
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
                users[row.getRowNumber()] = obj;
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(">>> THIS OUR RESULT FRINEDS: ");
        for (User user: users) {
            System.out.println(user);
        }
    }
}
