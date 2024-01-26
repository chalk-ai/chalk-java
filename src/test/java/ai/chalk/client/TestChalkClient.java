package ai.chalk.client;

import ai.chalk.client.e2e.FraudTemplateFeatures;
import ai.chalk.client.e2e.User;
import ai.chalk.models.OnlineQueryParams;
import ai.chalk.models.OnlineQueryResult;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class TestChalkClient {

    private static ChalkClient client;

    @BeforeAll
    public static void setUpClass() throws Exception {
        if (FraudTemplateFeatures.getInitException() != null) {
            throw FraudTemplateFeatures.getInitException();
        }
        client = ChalkClient.create();
    }

    @Test
    public void test() throws Exception {
        if (FraudTemplateFeatures.getInitException() != null) {
            throw FraudTemplateFeatures.getInitException();
        }

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
        }
        ;
    }

    @Test
    public void testTwoCalls() throws Exception {
        if (FraudTemplateFeatures.getInitException() != null) {
            throw FraudTemplateFeatures.getInitException();
        }

        String[] userIds = new String[10];
        for (int i = 0; i < userIds.length; i++) {
            userIds[i] = String.format("%d", i);
        }
        var params = OnlineQueryParams.builder()
                .withInput(FraudTemplateFeatures.user.id, userIds)
                .withOutputs(FraudTemplateFeatures.user.socure_score)
                .build();

        for (int i = 0; i < 2; i++) {
            try (OnlineQueryResult result = client.onlineQuery(params)) {
                var users = result.unmarshal(User.class);
                assert users.length == userIds.length;
                assert users[0].socure_score.getValue().equals(123.0);
            }
            ;
        }
    }

    @Test
    public void testBranchFromClientArg() throws Exception {
        if (FraudTemplateFeatures.getInitException() != null) {
            throw FraudTemplateFeatures.getInitException();
        }
        var branchClient = ChalkClient.builder().withBranch("chalk-java").build();
        String[] userIds = new String[10];
        for (int i = 0; i < userIds.length; i++) {
            userIds[i] = String.format("%d", i);
        }
        var params = OnlineQueryParams.builder()
                .withInput(FraudTemplateFeatures.user.id, userIds)
                .withOutputs(FraudTemplateFeatures.user.socure_score)
                .build();

        for (int i = 0; i < 2; i++) {
            // Two calls as of now because the first request currently still
            // gets relayed through the metadata server. Remove this loop
            // once we directly hit the branch server up on the first request.
            try (OnlineQueryResult result = branchClient.onlineQuery(params)) {
                var users = result.unmarshal(User.class);
                assert users.length == userIds.length;
                assert users[0].socure_score.getValue().equals(123.0);
            }
            ;
        }
    }

    @Test
    public void testBranchFromMethodArg() throws Exception {
        if (FraudTemplateFeatures.getInitException() != null) {
            throw FraudTemplateFeatures.getInitException();
        }
        String[] userIds = new String[10];
        for (int i = 0; i < userIds.length; i++) {
            userIds[i] = String.format("%d", i);
        }
        var params = OnlineQueryParams.builder()
                .withInput(FraudTemplateFeatures.user.id, userIds)
                .withOutputs(FraudTemplateFeatures.user.socure_score)
                .withBranch("chalk-java")
                .build();

        try (OnlineQueryResult result = client.onlineQuery(params)) {
            var users = result.unmarshal(User.class);
            assert users.length == userIds.length;
            assert users[0].socure_score.getValue().equals(123.0);
        }
        ;
    }
}

