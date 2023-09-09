package ai.chalk.client;

import ai.chalk.models.OnlineQueryParams;
import org.junit.jupiter.api.Test;

public class TestChalkClient {
    @Test
    public void test() {
        ChalkClient client = null;
        try {
            client = ChalkClient.create();
            client.printConfig();

            var result = client.OnlineQueryBulk(
                    OnlineQueryParams.builder()
                            .input("user.id", new int[] {1, 2, 3, 4, 5})
                            .output("user.today")
                            .build()
            );
        } catch (Exception e) {
            e.printStackTrace();
            return;
        }
    }
}

