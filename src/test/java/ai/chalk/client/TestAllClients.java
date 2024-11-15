package ai.chalk.client;

import ai.chalk.client.e2e.FraudTemplateFeatures;
import ai.chalk.client.e2e.User;
import ai.chalk.models.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.fail;


class TestAllClients {
    private static ChalkClient restClient;
    private static ChalkClient grpcClient;

    @BeforeAll
    static void setUp() throws Exception {
        restClient = ChalkClient.create();
        grpcClient = ChalkClient.createGrpc();
        if (FraudTemplateFeatures.initException != null) {
            throw FraudTemplateFeatures.getInitException();
        }
    }


    /*
        * Test the request header interceptor by setting an environment ID override
        * in online query params.
     */
    @ParameterizedTest
    @ValueSource(strings = {"gRPC", "REST"})
    public void testRequestHeaderInterceptor(String clientVersion) throws Exception {
        ChalkClient c = clientVersion.equals("gRPC") ? grpcClient : restClient;

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
}