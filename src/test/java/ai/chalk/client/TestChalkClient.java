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

            client = ChalkClient.builder()
                    .withApiServer("https://api.chalk.ai")
                    .withEnvironmentId("tmnmc8beyujew")
                    .withClientId("98wrasfg7dge7wdasg709")
                    .withClientSecret("h23lkj4h23lkj4z9s78fg908as7fkjh324klj23")
                    .build();

            client.printConfig();

            var result = client.OnlineQuery(
                OnlineQueryParams.builder()
                    .withInput("user.id", userIds)
                    .withOutput("user.socure_score")
                    .build()
            );
            assert result.getScalarsTable().getRowCount() == userIds.length;
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }
}

