package chalk.client;

import chalk.client.features.User;
import chalk.features.Feature;
import chalk.internal.arrow.TableUnmarshaller;
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
        ChalkClient client = ChalkClient.create();
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
            users = TableUnmarshaller.unmarshal(scalarsTable, User.class);
        };
        for (User user : users) {
            assert user != null;
            assert user.socureScore != null;
        }
    }
}
