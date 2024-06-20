package ai.chalk.client;

import ai.chalk.client.e2e.FraudTemplateFeatures;
import ai.chalk.client.e2e.User;
import ai.chalk.models.OnlineQueryParams;
import ai.chalk.models.OnlineQueryResult;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TestGrpcClient {
        private static ChalkClient client;

        @BeforeAll
        public static void setUpClass() throws Exception {
            if (FraudTemplateFeatures.getInitException() != null) {
                throw FraudTemplateFeatures.getInitException();
            }
            client = ChalkClient.createGrpc();
        }

        @Test
        public void testOnlineQuery() throws Exception {
            var userIds = List.of("1", "2", "3");
            var params = OnlineQueryParams.builder()
                    .withInput(FraudTemplateFeatures.user.id, userIds)
                    .withOutputs(FraudTemplateFeatures.user.socure_score)
                    .build();

            try (OnlineQueryResult result = client.onlineQuery(params)) {
                assert result.getErrors().length == 0;
                var users = result.unmarshal(User.class);
                assert users.length == userIds.size();
                assert users[0].socure_score.getValue().equals(123.0);
            } catch (Exception e) {
                throw e;
            }
        }
}
