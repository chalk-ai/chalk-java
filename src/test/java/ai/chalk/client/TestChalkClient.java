package ai.chalk.client;

import ai.chalk.client.e2e.FraudTemplateFeatures;
import ai.chalk.client.e2e.User;
import ai.chalk.models.OnlineQueryParams;
import ai.chalk.models.OnlineQueryResult;
import org.junit.jupiter.api.Disabled;


public class TestChalkClient {
    @Disabled
    public void test() throws Exception {
        if (FraudTemplateFeatures.getInitException() != null) {
            throw FraudTemplateFeatures.getInitException();
        }

        ChalkClient client = ChalkClient.create();
        String[] userIds = new String[10];
        for (int i = 0; i < userIds.length; i++) {
            userIds[i] = String.format("%d", i);
        }
        var params = OnlineQueryParams.builder()
                .withInput(FraudTemplateFeatures.user.id, userIds)
                .withOutputs(FraudTemplateFeatures.user.socure_score)
                .build();

        try (OnlineQueryResult result = client.onlineQuery(params)) {
            var users = result.unmarshal(User.class);
            assert users.length == userIds.length;
            assert users[0].socure_score.getValue().equals(123.0);
        } catch (Exception e) {
          throw e;
        };
    }
}

