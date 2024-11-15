package ai.chalk.client;

import ai.chalk.client.e2e.FraudTemplateFeatures;
import ai.chalk.client.e2e.User;
import ai.chalk.models.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.fail;


class TestAllClients {
    private static ChalkClient restClient;
    private static ChalkClient grpcClient;

    private final static String restClientKey = "REST";
    private final static String grpcClientKey = "gRPC";

    @BeforeAll
    static void setUp() throws Exception {
        restClient = ChalkClient.create();
        grpcClient = ChalkClient.createGrpc();
        if (FraudTemplateFeatures.initException != null) {
            throw FraudTemplateFeatures.getInitException();
        }
    }

    public ChalkClient getClient(String clientVersion) {
        return clientVersion.equals("gRPC") ? grpcClient : restClient;
    }


    /*
        * Test the request header interceptor by setting an environment ID override
        * in online query params.
     */
    @ParameterizedTest
    @ValueSource(strings = {grpcClientKey, restClientKey})
    public void testRequestHeaderInterceptor(String clientVersion) throws Exception {
        ChalkClient c = getClient(clientVersion);

        OnlineQueryParams.BuilderComplete builder = OnlineQueryParams.builder()
                .withInput(FraudTemplateFeatures.user.id, List.of("1"))
                .withOutputs(FraudTemplateFeatures.user.environmentId);

        String qaEnvId = System.getenv().get("STAGING_QA_ENV_ID");
        if (qaEnvId == null) {
            fail("STAGING_QA_ENV_ID env var not set");
        }
        String devEnvId = System.getenv().get("STAGING_DEV_ENV_ID");
        if (devEnvId == null) {
            fail("STAGING_DEV_ENV_ID env var not set");
        }

        for (String envId : Arrays.asList(qaEnvId, devEnvId)) {
            var params = builder.withEnvironmentId(envId).build();
            try (OnlineQueryResult queryRes = c.onlineQuery(params)) {
                assert queryRes.getErrors().length == 0;
                User[] users = queryRes.unmarshal(User.class);
                assert users.length == 1;
                assert users[0].environmentId.getValue().equals(envId);
            }
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {grpcClientKey, restClientKey})
    public void testUploadFeatures(String clientVersion) throws Exception {
        ChalkClient c = getClient(clientVersion);
        var userIds = Arrays.asList("777", "888", "999");
        var scoreList = Arrays.asList(Math.random(), Math.random(), Math.random());

        UploadFeaturesParams uploadParams = UploadFeaturesParams.builder()
                .withInputs(Map.of("user.id", userIds,"user.socure_score", scoreList))
                .build();
        UploadFeaturesResult res = c.uploadFeatures(uploadParams);
        assert res.getErrors().size() == 0;
        assert !res.getOperationId().equals("");

        OnlineQueryParamsComplete params = OnlineQueryParams.builder()
                .withInput(FraudTemplateFeatures.user.id, Arrays.asList("777", "888", "999"))
                .withOutputs(FraudTemplateFeatures.user.socure_score)
                .build();

        try (OnlineQueryResult queryRes = c.onlineQuery(params)) {
            assert queryRes.getErrors().length == 0;
            User[] users = queryRes.unmarshal(User.class);
            assert users.length == 3;
            assert users[0].socure_score.getValue().equals(scoreList.get(0));
            assert users[1].socure_score.getValue().equals(scoreList.get(1));
            assert users[2].socure_score.getValue().equals(scoreList.get(2));
        };
    }
}