package ai.chalk.client;

import ai.chalk.client.e2e.FraudTemplateFeatures;
import ai.chalk.client.e2e.User;
import ai.chalk.models.OnlineQueryParams;
import ai.chalk.models.OnlineQueryResult;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;


public class TestChalkClientDeploymentTag {

    private static ChalkClient client;

    @BeforeAll
    public static void setUpClass() throws Exception {
        if (FraudTemplateFeatures.getInitException() != null) {
            throw FraudTemplateFeatures.getInitException();
        }
        client = ChalkClient.builder().withDeploymentTag("test").build();
    }

    @Test
    public void test() throws Exception {
        if (FraudTemplateFeatures.getInitException() != null) {
            throw FraudTemplateFeatures.getInitException();
        }

        String[] userIds = new String[3];
        for (int i = 0; i < userIds.length; i++) {
            userIds[i] = String.format("%d", i);
        }

        var params = OnlineQueryParams.builder()
                .withInput(FraudTemplateFeatures.user.id, userIds)
                .withOutputs(FraudTemplateFeatures.user.socure_score)
                .build();

        try (OnlineQueryResult result = client.onlineQuery(params)) {
            assert result.getErrors().length == 0;
            var users = result.unmarshal(User.class);
            assert users.length == userIds.length;
            assert users[0].socure_score.getValue().equals(123.0);
        }
    }
}

