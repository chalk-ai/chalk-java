package chalk.client;

import chalk.client.ChalkClient;
import chalk.models.OnlineQueryParams;
import org.junit.jupiter.api.Test;

public class TestChalkClient {
    @Test
    public void test() throws Exception {
        ChalkClient client = ChalkClient.builder().withClientSecret("secret-a522c4fa81838666fed8d5a8574bbf8f384129806718b2aae59ec7b468068496").withApiServer("http://127.0.0.1:8000").withEnvironmentId("ftdev").withClientId("client-b9c4c78b8226b480be339f7ec8b5dfb4").build();
        client.printConfig();
        int[] userIds = new int[1_000_000];
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

