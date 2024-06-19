package ai.chalk.client;

import ai.chalk.client.e2e.FraudTemplateFeatures;
import ai.chalk.client.e2e.User;
import ai.chalk.models.OnlineQueryParams;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestGrpcClient {
        private static GRPCClient client;

        @BeforeAll
        public static void setUpClass() throws Exception {
            if (FraudTemplateFeatures.getInitException() != null) {
                throw FraudTemplateFeatures.getInitException();
            }
            client = new GRPCClient(new BuilderImpl());
        }

        @Test
        public void testOnlineQuery() throws Exception {
            var params = OnlineQueryParams.builder()
                .withInput("user.id", List.of(1L))
                .withOutputs("user.socure_score")
                .build();
            try (var res = client.onlineQuery(params)) {
                var users = res.unmarshal(User.class);
                System.out.println(">>> SOCURE SCORE: ");
                System.out.println(users[0].socure_score.getValue());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
}
