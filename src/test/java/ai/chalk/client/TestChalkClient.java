package ai.chalk.client;

import ai.chalk.models.OnlineQueryParams;
import org.junit.jupiter.api.Test;

public class TestChalkClient {
    @Test
    public void test() {
        ChalkClient client = null;
        int[] userIds = new int[] {1};
        try {
            client = ChalkClient.create();
            client.printConfig();

            var result = client.OnlineQuery(
                OnlineQueryParams.builder()
                    .withInput("user.id", userIds)
                    .withOutputs("user.favorite_numbers")
                    .build()
            );
            assert result.getScalarsTable().getRowCount() == userIds.length;
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }
}

