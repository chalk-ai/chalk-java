package ai.chalk.client;

import ai.chalk.exceptions.ClientException;
import ai.chalk.exceptions.ServerException;
import ai.chalk.models.ErrorCode;
import ai.chalk.models.GetOfflineQueryStatusParams;
import ai.chalk.models.OfflineQueryParams;
import ai.chalk.models.OfflineQueryResult;
import ai.chalk.models.OfflineQueryStatus;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.jupiter.api.Assertions.*;

class TestOfflineQuery {
    private final ObjectMapper mapper = new ObjectMapper();
    private HttpServer api;
    private HttpServer engine;
    private ChalkClient client;
    private final AtomicReference<JsonNode> submitted = new AtomicReference<>();
    private final AtomicReference<JsonNode> polled = new AtomicReference<>();
    private final AtomicReference<String> environment = new AtomicReference<>();
    private final AtomicReference<String> branch = new AtomicReference<>();
    private final AtomicReference<String> authorization = new AtomicReference<>();
    private final AtomicReference<String> submissionResponse = new AtomicReference<>();
    private final AtomicReference<String> statusResponse = new AtomicReference<>();
    private final AtomicInteger submissionStatus = new AtomicInteger(200);

    @BeforeEach
    void setUp() throws Exception {
        api = HttpServer.create(new InetSocketAddress("localhost", 0), 0);
        engine = HttpServer.create(new InetSocketAddress("localhost", 0), 0);
        submissionResponse.set("""
                {"is_finished":false,"version":1,"environment_id":"override-env",
                 "dataset_id":"dataset-1","dataset_name":"training",
                 "revisions":[{"revision_id":"job-1","environment_id":"override-env",
                  "branch":"request-branch","status":3,"outputs":["user.score"],
                  "num_partitions":2,"num_computers":2,"errors":null,"future_field":true}],
                 "errors":null,"future_field":true}
                """);
        statusResponse.set("""
                {"is_finished":false,"version":1,"urls":[],"errors":null}
                """);
        api.createContext("/v1/oauth/token", exchange -> respond(exchange, 200, """
                {"access_token":"test-token","expires_in":3600,
                 "primary_environment":"default-env","engines":{}}
                """));
        api.createContext("/v4/offline_query", exchange -> {
            submitted.set(mapper.readTree(exchange.getRequestBody()));
            captureHeaders(exchange);
            respond(exchange, submissionStatus.get(), submissionResponse.get());
        });
        engine.createContext("/v4/offline_query/status", exchange -> {
            polled.set(mapper.readTree(exchange.getRequestBody()));
            captureHeaders(exchange);
            respond(exchange, 200, statusResponse.get());
        });
        api.start();
        engine.start();
        client = ChalkClient.builder()
                .withApiServer(url(api))
                // Submission must ignore this; status must honor it.
                .withQueryServer(url(engine))
                .withClientId("test-client")
                .withClientSecret("test-secret")
                .withEnvironmentId("default-env")
                .withBranch("default-branch")
                .build();
    }

    @AfterEach
    void tearDown() throws Exception {
        try {
            if (client != null) {
                client.close();
            }
        } finally {
            if (api != null) api.stop(0);
            if (engine != null) engine.stop(0);
        }
    }

    @Test
    void submitsSqlThroughApiServerAndDeserializesDataset() throws Exception {
        OfflineQueryResult result = client.offlineQuery(OfflineQueryParams.builder()
                .withOutputs("user.score")
                .withRequiredOutputs(List.of("user.id"))
                .withInputSql("select user.id from user")
                .withDatasetName("training")
                .withEnvironmentId("override-env")
                .withBranch("request-branch")
                .withLowerBound(Instant.parse("2026-01-01T00:00:00Z"))
                .withUpperBound(Instant.parse("2026-02-01T00:00:00Z"))
                .withNumShards(2)
                .withNumWorkers(1)
                .withUseMetaplanner(true)
                .withRecomputeFeatures(true)
                .withStoreOnline(true)
                .withStoreOffline(true)
                .withPlannerOptions(Map.of("test_option", true))
                .withTimeout(Duration.ofSeconds(5))
                .build());

        JsonNode body = submitted.get();
        assertEquals(List.of("user.score"), mapper.convertValue(body.get("output"), List.class));
        assertEquals("user.id", body.get("required_output").get(0).asText());
        assertEquals("PARQUET", body.get("destination_format").asText());
        assertEquals("select user.id from user", body.at("/input/input_sql").asText());
        assertEquals("training", body.get("dataset_name").asText());
        assertEquals("2026-01-01T00:00:00Z", body.get("observed_at_lower_bound").asText());
        assertEquals("2026-02-01T00:00:00Z", body.get("observed_at_upper_bound").asText());
        assertEquals(2, body.get("num_shards").asInt());
        assertEquals(1, body.get("num_workers").asInt());
        for (String key : List.of("use_multiple_computers", "use_metaplanner",
                "recompute_features", "store_online", "store_offline")) {
            assertTrue(body.get(key).asBoolean(), key);
        }
        assertTrue(body.at("/planner_options/test_option").asBoolean());
        assertFalse(body.has("environment_id"));
        assertFalse(body.has("timeout"));
        assertEquals("override-env", environment.get());
        assertEquals("request-branch", branch.get());
        assertEquals("Bearer test-token", authorization.get());

        assertFalse(result.isFinished());
        assertEquals("dataset-1", result.getDatasetId());
        assertEquals("training", result.getDatasetName());
        assertTrue(result.getErrors().isEmpty());
        assertEquals("job-1", result.getRevisions().get(0).getRevisionId());
        assertEquals(2, result.getRevisions().get(0).getNumPartitions());
        assertTrue(result.getRevisions().get(0).getErrors().isEmpty());
    }

    @Test
    void supportsParquetAndSamplingWithoutInputs() throws Exception {
        client.offlineQuery(OfflineQueryParams.builder()
                .withOutputs(List.of("user.score"))
                .withInputUri("s3://test/spine.parquet")
                .withRunAsynchronously(true)
                .build());
        assertEquals("s3://test/spine.parquet", submitted.get().at("/input/parquet_uri").asText());
        assertTrue(submitted.get().get("use_multiple_computers").asBoolean());
        assertEquals("default-env", environment.get());
        assertEquals("default-branch", branch.get());

        client.offlineQuery(OfflineQueryParams.builder()
                .withRequiredOutputs("user.id")
                .withMaxSamples(10)
                .build());
        assertFalse(submitted.get().has("input"));
        assertEquals(10, submitted.get().get("max_samples").asInt());
        assertEquals(0, submitted.get().get("output").size());
        assertFalse(submitted.get().has("use_metaplanner"));
        assertFalse(submitted.get().get("use_multiple_computers").asBoolean());
    }

    @Test
    void pollsConfiguredEngineAndReturnsSignedUrls() throws Exception {
        GetOfflineQueryStatusParams params = GetOfflineQueryStatusParams.builder()
                .withJobId("job-1")
                .withEnvironmentId("override-env")
                .withBranch("request-branch")
                .build();
        OfflineQueryStatus pending = client.getOfflineQueryStatus(params);
        assertFalse(pending.isFinished());
        assertTrue(pending.getErrors().isEmpty());
        assertTrue(pending.getUrls().isEmpty());
        assertEquals("job-1", polled.get().get("job_id").asText());
        assertEquals("override-env", environment.get());
        assertEquals("request-branch", branch.get());
        assertEquals("Bearer test-token", authorization.get());

        statusResponse.set("""
                {"is_finished":true,"version":1,
                 "urls":["https://storage.example/result.parquet?signature=test"],"errors":null}
                """);
        OfflineQueryStatus complete = client.getOfflineQueryStatus(params);
        assertTrue(complete.isFinished());
        assertTrue(complete.getErrors().isEmpty());
        assertEquals(List.of("https://storage.example/result.parquet?signature=test"), complete.getUrls());
    }

    @Test
    void preservesTerminalJobAndSubmissionErrors() throws Exception {
        for (ErrorCode code : List.of(ErrorCode.INTERNAL_SERVER_ERROR,
                ErrorCode.CANCELLED, ErrorCode.DEADLINE_EXCEEDED)) {
            statusResponse.set("""
                    {"is_finished":true,"urls":[],"errors":[{"code":"%s","message":"job failed"}]}
                    """.formatted(code.name()));
            OfflineQueryStatus status = client.getOfflineQueryStatus(
                    GetOfflineQueryStatusParams.builder().withJobId("job-1").build());
            assertTrue(status.isFinished());
            assertEquals(code, status.getErrors().get(0).getCode());
            assertEquals("job failed", status.getErrors().get(0).getMessage());
            assertTrue(status.getUrls().isEmpty());
        }

        submissionResponse.set("""
                {"is_finished":true,"revisions":[],
                 "errors":[{"code":"INVALID_QUERY","message":"invalid feature"}]}
                """);
        assertEquals(ErrorCode.INVALID_QUERY, client.offlineQuery(
                OfflineQueryParams.builder().withOutputs("user.missing").build())
                .getErrors().get(0).getCode());

        submissionStatus.set(400);
        submissionResponse.set("""
                {"detail":"invalid offline query","trace":"test-trace"}
                """);
        assertThrows(ServerException.class, () -> client.offlineQuery(
                OfflineQueryParams.builder().withOutputs("user.score").build()));
    }

    @Test
    void rejectsInvalidParametersBeforeSending() {
        assertThrows(ClientException.class, () -> client.offlineQuery(null));
        assertThrows(ClientException.class, () -> client.offlineQuery(OfflineQueryParams.builder().build()));
        assertThrows(ClientException.class, () -> client.offlineQuery(OfflineQueryParams.builder()
                .withOutputs("user.score").withInputSql("select 1").withInputUri("s3://input").build()));
        assertThrows(ClientException.class, () -> client.offlineQuery(OfflineQueryParams.builder()
                .withOutputs("user.score").withNumShards(0).build()));
        assertThrows(ClientException.class, () -> client.getOfflineQueryStatus(null));
        assertThrows(ClientException.class, () -> client.getOfflineQueryStatus(
                GetOfflineQueryStatusParams.builder().withJobId(" ").build()));
        assertNull(submitted.get());
        assertNull(polled.get());
    }

    private void captureHeaders(HttpExchange exchange) {
        environment.set(exchange.getRequestHeaders().getFirst("X-Chalk-Env-Id"));
        branch.set(exchange.getRequestHeaders().getFirst("X-Chalk-Branch-Id"));
        authorization.set(exchange.getRequestHeaders().getFirst("Authorization"));
    }

    private static String url(HttpServer server) {
        return "http://localhost:" + server.getAddress().getPort();
    }

    private static void respond(HttpExchange exchange, int code, String body) throws IOException {
        byte[] bytes = body.getBytes(StandardCharsets.UTF_8);
        exchange.getResponseHeaders().set("Content-Type", "application/json");
        exchange.sendResponseHeaders(code, bytes.length);
        exchange.getResponseBody().write(bytes);
        exchange.close();
    }
}
