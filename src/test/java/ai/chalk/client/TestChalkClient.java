package ai.chalk.client;

import ai.chalk.models.OnlineQueryParams;
import org.junit.jupiter.api.Test;

public class TestChalkClient {
    @Test
    public void test() {
        ChalkClient client = null;
        int[] userIds = new int[] {1, 2, 3, 4, 5};
        try {
            client = ChalkClient.create();
            client.printConfig();

            var result = client.OnlineQueryBulk(
                    OnlineQueryParams.builder()
                            .input("user.id", userIds)
                            .output("user.today")
                            .build()
            );
            assert result.getScalarsTable().getRowCount() == userIds.length;
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }
}

