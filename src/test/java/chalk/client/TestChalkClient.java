package chalk.client;

import chalk.client.ChalkClient;
import chalk.models.OnlineQueryParams;
import chalk.models.OnlineQueryResult;
import org.junit.jupiter.api.Test;

public class TestChalkClient {
    @Test
    public void test() throws Exception {
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
        try (OnlineQueryResult result = client.onlineQuery(params)) {
            assert result.getScalarsTable().getRowCount() == userIds.length;
        };
    }
}

