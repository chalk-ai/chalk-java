package ai.chalk.client;

import ai.chalk.client.e2e.FraudTemplateFeatures;
import ai.chalk.client.e2e.User;
import ai.chalk.models.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.Duration;
import java.util.*;

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

    @ParameterizedTest
    @ValueSource(strings = {grpcClientKey, restClientKey})
    public void testPlannerOptions(String clientVersion) {
        ChalkClient c = getClient(clientVersion);

        var validPlannerVersion = "2";
        var invalidPlannerVersion = "abc";
        var plannerVersions = List.of(validPlannerVersion, invalidPlannerVersion);

        for (var plannerVersion : plannerVersions) {
            var plannerOptions = new HashMap<String, Object>();
            plannerOptions.put("planner_version", plannerVersion);
            try {
                OnlineQueryParamsComplete params = OnlineQueryParams.builder()
                        .withInput(FraudTemplateFeatures.user.id, List.of("1"))
                        .withOutputs(FraudTemplateFeatures.user.socure_score)
                        .withPlannerOptions(plannerOptions)
                        .build();
                c.onlineQuery(params);
                if (plannerVersion.equals(invalidPlannerVersion)) {
                    fail("Expected exception for invalid planner version");
                }
            } catch (Exception e) {
                if (plannerVersion.equals(validPlannerVersion)) {
                    fail("Expected no exception for valid planner version");
                }
            }
        }
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
        List<String> userIds;
        // Different user ids for gRPC and REST clients, otherwise race condition
        if (clientVersion.equals("gRPC")) {
            userIds = Arrays.asList("777", "888", "999");
        } else {
            userIds = Arrays.asList("345", "678", "789");
        }
        var scoreList = Arrays.asList(Math.random(), Math.random(), Math.random());

        UploadFeaturesParams uploadParams = UploadFeaturesParams.builder()
                .withInputs(Map.of("user.id", userIds,"user.socure_score", scoreList))
                .build();
        UploadFeaturesResult res = c.uploadFeatures(uploadParams);
        assert res.getErrors().size() == 0;
        assert !res.getOperationId().equals("");

        OnlineQueryParamsComplete params = OnlineQueryParams.builder()
                .withInput(FraudTemplateFeatures.user.id, userIds)
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

    @ParameterizedTest
    @ValueSource(strings = {grpcClientKey, restClientKey})
    public void testTimeoutUploadFeatures(String clientType) throws Exception {
        List<Duration> timeout = new ArrayList<>(Arrays.asList(Duration.ofNanos(1), Duration.ofSeconds(60), null));
        var shouldFail = List.of(true, false, false);
        var client = getClient(clientType);
        for (int i = 0; i < timeout.size(); i++) {
            try {
                UploadFeaturesParams params = UploadFeaturesParams.builder()
                        .withInput(FraudTemplateFeatures.user.id, List.of("8868"))
                        .withInput(FraudTemplateFeatures.user.socure_score, List.of(5526.0))
                        .withTimeout(timeout.get(i))
                        .build();
                var res = client.uploadFeatures(params);
                if (shouldFail.get(i)) {
                    fail("Expected exception for timeout value: " + timeout.get(i));
                }
                assert res.getErrors().size() == 0;
            } catch (Exception e) {
                if (!shouldFail.get(i)) {
                    fail("Expected no timeout but query failed", e);
                }
            }
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {grpcClientKey, restClientKey})
    public void testTimeoutOnlineQueryRequestLevel(String clientType) throws Exception {
        List<Duration> timeout = new ArrayList<>(Arrays.asList(Duration.ofNanos(1), Duration.ofSeconds(5), null));
        var shouldFail = List.of(true, false, false);
        var client = getClient(clientType);
        for (int i = 0; i < timeout.size(); i++) {
            try {
                OnlineQueryParamsComplete params = OnlineQueryParams.builder()
                        .withInput(FraudTemplateFeatures.user.id, List.of("1"))
                        .withOutputs(FraudTemplateFeatures.user.socure_score)
                        .withTimeout(timeout.get(i))
                        .build();
                var res = client.onlineQuery(params);
                if (shouldFail.get(i)) {
                    fail("Expected exception for timeout value: " + timeout.get(i));
                }
                var users = res.unmarshal(User.class);
                assert users[0].socure_score.getValue() == 123.0;
            } catch (Exception e) {
                if (!shouldFail.get(i)) {
                    fail("Expected no timeout but query failed", e);
                }
            }
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {grpcClientKey, restClientKey})
    public void testTimeoutOnlineQueryClientLevel (String clientType) throws Exception {
        List<Duration> timeout = new ArrayList<>(Arrays.asList(Duration.ofNanos(1), Duration.ofSeconds(5), null));
        var shouldFail = List.of(true, false, false);

        for (int i = 0; i < timeout.size(); i++) {
            var builder = ChalkClient.builder().withTimeout(timeout.get(i));
            try (ChalkClient client = clientType.equals(grpcClientKey) ? builder.withGrpc().build() : builder.build()) {
                if (shouldFail.get(i) && clientType.equals(grpcClientKey)) {
                    fail("Expected exception for timeout value: " + timeout.get(i));
                }
                OnlineQueryParamsComplete params = OnlineQueryParams.builder()
                        .withInput(FraudTemplateFeatures.user.id, List.of("1"))
                        .withOutputs(FraudTemplateFeatures.user.socure_score)
                        .build();
                var res = client.onlineQuery(params);
                if (shouldFail.get(i)) {
                    fail("Expected exception for timeout value: " + timeout.get(i));
                }
                var users = res.unmarshal(User.class);
                assert users[0].socure_score.getValue() == 123.0;
            } catch (Exception e) {
                if (!shouldFail.get(i)) {
                    fail("Expected no timeout but query failed", e);
                }
            }
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {grpcClientKey, restClientKey})
    public void testTimeoutOnlineQueryRequestConfigOverridesClientConfig(String clientType) throws Exception {
        List<Duration> clientLevelTimeout = new ArrayList<>(Arrays.asList(Duration.ofSeconds(5), Duration.ofSeconds(5)));
        List<Duration> requestLevelTimeout = new ArrayList<>(Arrays.asList(Duration.ofSeconds(5), Duration.ofNanos(1)));
        var shouldFail = List.of(false, true);

        for (int i = 0; i < clientLevelTimeout.size(); i++) {
            var builder = ChalkClient.builder().withTimeout(clientLevelTimeout.get(i));

            try (ChalkClient client = clientType.equals(grpcClientKey) ? builder.withGrpc().build() : builder.build()) {
                OnlineQueryParamsComplete params = OnlineQueryParams.builder()
                        .withInput(FraudTemplateFeatures.user.id, List.of("1"))
                        .withOutputs(FraudTemplateFeatures.user.socure_score)
                        .withTimeout(requestLevelTimeout.get(i))
                        .build();
                var res = client.onlineQuery(params);
                if (shouldFail.get(i)) {
                    fail("Expected exception for extremely small timeout value");
                }
                var users = res.unmarshal(User.class);
                assert users[0].socure_score.getValue() == 123.0;
            } catch (Exception e) {
                if (!shouldFail.get(i)) {
                    fail("Expected no timeout but query failed", e);
                }
            }
        }
    }


}