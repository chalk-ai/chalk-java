package ai.chalk.client;

import ai.chalk.models.OnlineQueryParams;
import org.junit.jupiter.api.Test;

public class TestChalkClient {
    @Test
    public void test() {
        ChalkClient client = null;
        try {
//            client = ChalkClient.builder()
//                    .setClientId("client-ee1df6a00376611c12ff85d35335a7d2")
//                    .setClientSecret("secret-935f2af00683aecc7195dcc27efee49ebd21e3968c52efd99d9dd6cb3c762109")
//                    .setApiServer("http://127.0.0.1:8000")
//                    .setEnvironmentId("ftdev")
//                    .build();
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

