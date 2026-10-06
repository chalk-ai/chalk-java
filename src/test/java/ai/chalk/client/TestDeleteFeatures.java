package ai.chalk.client;

import ai.chalk.exceptions.ClientException;
import ai.chalk.models.DeleteFeaturesParams;
import ai.chalk.models.DeleteFeaturesResult;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestDeleteFeatures {
    private static final String ENVIRONMENT_ID = "test-environment";

    @Test
    public void testHttpDeleteFeatures() throws Exception {
        AtomicReference<String> method = new AtomicReference<>();
        AtomicReference<String> body = new AtomicReference<>();
        AtomicReference<String> authorization = new AtomicReference<>();
        AtomicReference<String> environmentHeader = new AtomicReference<>();
        HttpServer server = HttpServer.create(new InetSocketAddress("localhost", 0), 0);
        server.createContext("/v1/oauth/token", exchange -> respondJson(
                exchange,
                """
                {
                  "access_token": "test-token",
                  "expires_in": 3600,
                  "primary_environment": "%s",
                  "engines": {}
                }
                """.formatted(ENVIRONMENT_ID)
        ));
        server.createContext("/v1/features/rows", exchange -> {
            method.set(exchange.getRequestMethod());
            body.set(new String(exchange.getRequestBody().readAllBytes(), StandardCharsets.UTF_8));
            authorization.set(exchange.getRequestHeaders().getFirst("Authorization"));
            environmentHeader.set(exchange.getRequestHeaders().getFirst("X-Chalk-Env-Id"));
            respondJson(exchange, """
                    {"errors": [{"code": "INTERNAL_SERVER_ERROR", "category": "REQUEST", "message": "partial failure"}]}
                    """);
        });
        server.start();

        String serverUrl = "http://localhost:" + server.getAddress().getPort();
        try (ChalkClient client = ChalkClient.builder()
                .withApiServer(serverUrl)
                .withClientId("test-client")
                .withClientSecret("test-secret")
                .withEnvironmentId(ENVIRONMENT_ID)
                .build()) {
            DeleteFeaturesResult result = client.deleteFeatures(DeleteFeaturesParams.builder()
                    .withNamespace("user")
                    .withFeatures(List.of("name", "email"))
                    .withPrimaryKeys(List.of("1", "2"))
                    .build());

            assertEquals("DELETE", method.get());
            assertEquals(
                    "{\"namespace\":\"user\",\"features\":[\"name\",\"email\"],\"tags\":null,"
                            + "\"primary_keys\":[\"1\",\"2\"],\"retain_offline\":false,\"retain_online\":false}",
                    body.get()
            );
            assertEquals("Bearer test-token", authorization.get());
            assertEquals(ENVIRONMENT_ID, environmentHeader.get());
            assertEquals(1, result.getErrors().size());
            assertEquals("partial failure", result.getErrors().get(0).getMessage());
        } finally {
            server.stop(0);
        }
    }

    @Test
    public void testHttpDeleteFeaturesRejectsBranch() throws Exception {
        AtomicReference<Boolean> deleteCalled = new AtomicReference<>(false);
        HttpServer server = HttpServer.create(new InetSocketAddress("localhost", 0), 0);
        server.createContext("/v1/features/rows", exchange -> {
            deleteCalled.set(true);
            respondJson(exchange, "{\"errors\": []}");
        });
        server.start();

        String serverUrl = "http://localhost:" + server.getAddress().getPort();
        try (ChalkClient client = ChalkClient.builder()
                .withApiServer(serverUrl)
                .withClientId("test-client")
                .withClientSecret("test-secret")
                .withEnvironmentId(ENVIRONMENT_ID)
                .withBranch("my-branch")
                .build()) {
            ClientException e = assertThrows(ClientException.class, () -> client.deleteFeatures(
                    DeleteFeaturesParams.builder()
                            .withNamespace("user")
                            .withPrimaryKeys(List.of("1"))
                            .build()
            ));
            assertTrue(e.getMessage().contains("my-branch"));
            assertFalse(deleteCalled.get());
        } finally {
            server.stop(0);
        }
    }

    private static void respondJson(HttpExchange exchange, String body) throws IOException {
        byte[] response = body.getBytes(StandardCharsets.UTF_8);
        exchange.getResponseHeaders().set("Content-Type", "application/json");
        exchange.sendResponseHeaders(200, response.length);
        exchange.getResponseBody().write(response);
        exchange.close();
    }
}
