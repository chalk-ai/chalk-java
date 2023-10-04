package chalk.client;

import chalk.client.features.User;
import chalk.internal.arrow.TableUnmarshaller;
import chalk.models.OnlineQueryParams;
import chalk.models.OnlineQueryResult;
import org.junit.jupiter.api.Test;


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
