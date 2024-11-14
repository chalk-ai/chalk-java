package ai.chalk.client;

import ai.chalk.client.e2e.FraudTemplateFeatures;
import ai.chalk.client.e2e.User;
import ai.chalk.models.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class TestChalkClient {

    private static ChalkClient client;

    @BeforeAll
    public static void setUpClass() throws Exception {
        if (FraudTemplateFeatures.getInitException() != null) {
            throw FraudTemplateFeatures.getInitException();
        }
        client = ChalkClient.create();
    }

    @AfterAll
    public static void tearDown() throws Exception {
        client.close();
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

    @Test
    public void testBinaryInput() throws Exception {
        if (FraudTemplateFeatures.getInitException() != null) {
            throw FraudTemplateFeatures.getInitException();
        }

        String[] userIds = new String[3];
        for (int i = 0; i < userIds.length; i++) {
            userIds[i] = String.format("%d", i);
        }

        var myBytes = new byte[]{1, 2, 3};
        var params = OnlineQueryParams.builder()
                .withInput(FraudTemplateFeatures.user.id, userIds)
                .withInput("user.binary_data", Arrays.asList(myBytes, myBytes, myBytes))
                .withOutputs(FraudTemplateFeatures.user.socure_score)
                .build();

        try (OnlineQueryResult result = client.onlineQuery(params)) {
            var users = result.unmarshal(User.class);
            assert users.length == userIds.length;
            assert users[0].socure_score.getValue().equals(123.0);
        }
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
            };
        }
    }

    @Test
    public void testUploadFeatures() throws Exception {
        var userIds = Arrays.asList("777", "888", "999");
        var scoreList = Arrays.asList(Math.random(), Math.random(), Math.random());

        var inputs = new HashMap<String, List<?>>();
        inputs.put("user.id", userIds);
        inputs.put("user.socure_score", scoreList);
        UploadFeaturesResult res = client.uploadFeatures(UploadFeaturesParams.builder().withInputs(inputs).build());
        assert res.getErrors().size() == 0;
        assert !res.getOperationId().equals("");

        OnlineQueryParamsComplete params = OnlineQueryParams.builder()
            .withInput(FraudTemplateFeatures.user.id, Arrays.asList("777", "888", "999"))
            .withOutputs(FraudTemplateFeatures.user.socure_score)
            .build();

        try (OnlineQueryResult queryRes = client.onlineQuery(params)) {
            assert queryRes.getErrors().length == 0;
            User[] users = queryRes.unmarshal(User.class);
            assert users.length == 3;
            assert users[0].socure_score.getValue().equals(scoreList.get(0));
            assert users[1].socure_score.getValue().equals(scoreList.get(1));
            assert users[2].socure_score.getValue().equals(scoreList.get(2));
        };
    }

    @Disabled("Branch server issue")
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

    @Disabled("Branch server issue")
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

