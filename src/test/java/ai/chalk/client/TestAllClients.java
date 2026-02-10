package ai.chalk.client;

import ai.chalk.client.e2e.FraudTemplateFeatures;
import ai.chalk.client.e2e.User;
import ai.chalk.exceptions.ChalkException;
import ai.chalk.models.OnlineQueryParams;
import ai.chalk.models.OnlineQueryParamsComplete;
import ai.chalk.models.OnlineQueryResult;
import ai.chalk.models.UploadFeaturesParams;
import ai.chalk.models.UploadFeaturesResult;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
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

    @AfterAll
    static void tearDown() throws Exception {
        restClient.close();
        grpcClient.close();
    }

    public ChalkClient getClient(String clientVersion) {
        return clientVersion.equals("gRPC") ? grpcClient : restClient;
    }

    @ParameterizedTest
    @ValueSource(strings = {grpcClientKey, restClientKey})
    public void testPlannerOptions(String clientVersion) {
        ChalkClient client = getClient(clientVersion);
        String context = "[client=" + clientVersion + "] ";

        OnlineQueryParamsComplete validParams = buildPlannerVersionParams("2");
        assertDoesNotThrow(() -> {
            try (var res = client.onlineQuery(validParams)) {
                if (clientVersion.equals(grpcClientKey)) {
                    assertNotNull(res.getErrors(), context + "Expected errors array");
                    assertEquals(0, res.getErrors().length, context + "Valid planner version should not produce errors");
                }
            }
        }, context + "Valid planner version should succeed");

        OnlineQueryParamsComplete invalidParams = buildPlannerVersionParams("abc");
        if (clientVersion.equals(grpcClientKey)) {
            assertDoesNotThrow(() -> {
                try (var res = client.onlineQuery(invalidParams)) {
                    assertTrue(res.getErrors() != null && res.getErrors().length > 0,
                            context + "Expected planner errors to be returned for invalid version");
                }
            }, context + "gRPC client should surface planner errors in response");
        } else {
            assertThrows(ChalkException.class, () -> {
                try (var ignored = client.onlineQuery(invalidParams)) {
                    // AutoCloseable will handle cleanup
                }
            }, context + "REST client should raise exception for invalid planner version");
        }
    }


    /*
        * Test the request header interceptor by setting an environment ID override
        * in online query params.
     */
    @ParameterizedTest
    @Disabled("Request header interceptor test broken")
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
                assertEquals(0, queryRes.getErrors().length, "Expected no errors for env " + envId);
                User[] users = queryRes.unmarshal(User.class);
                assertEquals(1, users.length, "Expected single user result for env " + envId);
                assertEquals(envId, users[0].environmentId.getValue(), "Environment id mismatch");
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
        String context = "[client=" + clientVersion + "] ";
        assertEquals(0, res.getErrors().size(), context + "Upload should not return errors");
        assertFalse(res.getOperationId().isBlank(), context + "Operation id should be populated");

        OnlineQueryParamsComplete params = OnlineQueryParams.builder()
                .withInput(FraudTemplateFeatures.user.id, userIds)
                .withOutputs(FraudTemplateFeatures.user.socure_score)
                .build();

        try (OnlineQueryResult queryRes = c.onlineQuery(params)) {
            assertEquals(0, queryRes.getErrors().length, context + "Query should not return errors");
            User[] users = queryRes.unmarshal(User.class);
            assertEquals(3, users.length, context + "Expected three users returned");
            assertEquals(scoreList.get(0), users[0].socure_score.getValue(), context + "User[0] socure score mismatch");
            assertEquals(scoreList.get(1), users[1].socure_score.getValue(), context + "User[1] socure score mismatch");
            assertEquals(scoreList.get(2), users[2].socure_score.getValue(), context + "User[2] socure score mismatch");
        };
    }

    @ParameterizedTest
    @ValueSource(strings = {grpcClientKey, restClientKey})
    public void testTimeoutUploadFeatures(String clientType) throws Exception {
        List<Duration> timeout = new ArrayList<>(Arrays.asList(Duration.ofNanos(1), Duration.ofSeconds(60), null));
        var shouldFail = List.of(true, false, false);
        var client = getClient(clientType);
        for (int i = 0; i < timeout.size(); i++) {
            Duration currentTimeout = timeout.get(i);
            String context = "[client=" + clientType + ",timeout=" + currentTimeout + ",idx=" + i + "] ";
            UploadFeaturesParams params = UploadFeaturesParams.builder()
                    .withInput(FraudTemplateFeatures.user.id, List.of("8868"))
                    .withInput(FraudTemplateFeatures.user.socure_score, List.of(5526.0))
                    .withTimeout(currentTimeout)
                    .build();

            if (shouldFail.get(i)) {
                assertThrows(ChalkException.class, () -> client.uploadFeatures(params),
                        context + "Expected request to fail due to extremely small timeout");
            } else {
                assertDoesNotThrow(() -> {
                    var res = client.uploadFeatures(params);
                    assertEquals(0, res.getErrors().size(), context + "Upload should not return errors");
                }, context + "Upload should complete successfully");
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
            Duration currentTimeout = timeout.get(i);
            String context = "[client=" + clientType + ",timeout=" + currentTimeout + ",idx=" + i + "] ";
            OnlineQueryParamsComplete params = OnlineQueryParams.builder()
                    .withInput(FraudTemplateFeatures.user.id, List.of("1"))
                    .withOutputs(FraudTemplateFeatures.user.socure_score)
                    .withTimeout(currentTimeout)
                    .build();
            if (shouldFail.get(i)) {
                assertThrows(ChalkException.class, () -> {
                    try (var ignored = client.onlineQuery(params)) {
                        // no-op
                    }
                }, context + "Expected timeout to fail request");
            } else {
                assertDoesNotThrow(() -> {
                    try (var res = client.onlineQuery(params)) {
                        var users = res.unmarshal(User.class);
                        assertEquals(123.0, users[0].socure_score.getValue(), context + "Unexpected socure score");
                    }
                }, context + "Online query should succeed");
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
                Duration clientTimeout = timeout.get(i);
                String context = "[client=" + clientType + ",clientTimeout=" + clientTimeout + ",idx=" + i + "] ";
                OnlineQueryParamsComplete params = OnlineQueryParams.builder()
                        .withInput(FraudTemplateFeatures.user.id, List.of("1"))
                        .withOutputs(FraudTemplateFeatures.user.socure_score)
                        .build();
                if (shouldFail.get(i)) {
                    assertThrows(ChalkException.class, () -> {
                        try (var ignored = client.onlineQuery(params)) {
                            // no-op
                        }
                    }, context + "Expected timeout failure at client configuration level");
                } else {
                    assertDoesNotThrow(() -> {
                        try (var res = client.onlineQuery(params)) {
                            var users = res.unmarshal(User.class);
                            assertEquals(123.0, users[0].socure_score.getValue(), context + "Unexpected socure score");
                        }
                    }, context + "Online query should respect client-level timeout");
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
                String context = "[client=" + clientType + ",clientTimeout=" + clientLevelTimeout.get(i)
                        + ",requestTimeout=" + requestLevelTimeout.get(i) + ",idx=" + i + "] ";
                OnlineQueryParamsComplete params = OnlineQueryParams.builder()
                        .withInput(FraudTemplateFeatures.user.id, List.of("1"))
                        .withOutputs(FraudTemplateFeatures.user.socure_score)
                        .withTimeout(requestLevelTimeout.get(i))
                        .build();
                if (shouldFail.get(i)) {
                    assertThrows(ChalkException.class, () -> {
                        try (var ignored = client.onlineQuery(params)) {
                            // no-op
                        }
                    }, context + "Expected exception when request timeout overrides client timeout with invalid value");
                } else {
                    assertDoesNotThrow(() -> {
                        try (var res = client.onlineQuery(params)) {
                            var users = res.unmarshal(User.class);
                            assertEquals(123.0, users[0].socure_score.getValue(), context + "Unexpected socure score");
                        }
                    }, context + "Expected request-level override to succeed");
                }
            }
        }
    }


    @ParameterizedTest
    @ValueSource(strings = {grpcClientKey, restClientKey})
    public void testNamedQuery(String clientType) throws Exception {
        ChalkClient c = getClient(clientType);

        if (FraudTemplateFeatures.getInitException() != null) {
            throw FraudTemplateFeatures.getInitException();
        }

        String[] userIds = new String[3];
        for (int i = 0; i < userIds.length; i++) {
            userIds[i] = String.format("%d", i);
        }

        OnlineQueryParamsComplete params = OnlineQueryParams.builder()
                .withInput(FraudTemplateFeatures.user.id, userIds)
                .withQueryName("user_socure_score")
                .withQueryNameVersion("1.0.0")
                .build();

        String context = "[client=" + clientType + "] ";
        assertDoesNotThrow(() -> {
            try (OnlineQueryResult result = c.onlineQuery(params)) {
                assertEquals(0, result.getErrors().length, context + "Expected no server errors");
                var users = result.unmarshal(User.class);
                assertEquals(userIds.length, users.length, context + "Unexpected user count");
                assertEquals(123.0, users[0].socure_score.getValue(), context + "Unexpected socure score");
            }
        }, context + "Named query should succeed");
    }

    private static OnlineQueryParamsComplete buildPlannerVersionParams(String plannerVersion) {
        return OnlineQueryParams.builder()
                .withInput(FraudTemplateFeatures.user.id, List.of("1"))
                .withOutputs(FraudTemplateFeatures.user.socure_score)
                .withPlannerOptions(Map.of("planner_version", plannerVersion))
                .build();
    }
}
