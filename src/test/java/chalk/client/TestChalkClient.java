package chalk.client;

import chalk.client.ChalkClient;
import chalk.models.OnlineQueryParams;
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

        var result = client.onlineQuery(
            OnlineQueryParams.builder()
                .withInput("user.id", userIds)
                .withOutput("user.socure_score")
                .build()
        );
        assert result.getScalarsTable().getRowCount() == userIds.length;
    }
}

