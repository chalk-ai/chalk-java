package ai.chalk.client;

import ai.chalk.models.OnlineQueryParams;
import org.junit.jupiter.api.Test;

public class TestChalkClient {
    @Test
    public void test() throws Exception {
        ChalkClient client = null;
        int[] userIds = new int[] {1};
        client = ChalkClient.create();
        client.printConfig();

        var result = client.onlineQuery(
            OnlineQueryParams.builder()
                .withInput("user.id", userIds)
                .withOutput("user.socure_score")
                .build()
        );
        assert result.getScalarsTable().getRowCount() == userIds.length;
    }
}

