package ai.chalk.client;

import ai.chalk.client.ChalkClient;
import ai.chalk.models.OnlineQueryParams;
import ai.chalk.models.OnlineQueryResult;
import org.junit.jupiter.api.Test;

public class TestChalkClient {
    @Test
    public void test() throws Exception {
        ChalkClient client = ChalkClient.create();
        client.printConfig();
        String[] userIds = new String[10];
        for (int i = 0; i < userIds.length; i++) {
            userIds[i] = String.format("%d", i);
        }
        var params = OnlineQueryParams.builder()
                .withInput("user.id", userIds)
                .withOutputs("user.socure_score")
                .withQueryName("Andy")
                .build();
        try (OnlineQueryResult result = client.onlineQuery(params)) {
            assert result.getScalarsTable().getRowCount() == userIds.length;
        };
    }
}

