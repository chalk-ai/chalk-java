package ai.chalk.client;

import ai.chalk.exceptions.ClientException;
import ai.chalk.models.AggregateBackfillParams;
import ai.chalk.models.AggregateBackfillResponse;
import ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillJob;
import ai.chalk.protos.chalk.aggregate.v1.AggregateServiceGrpc;
import ai.chalk.protos.chalk.aggregate.v1.CreateAggregateBackfillV2Request;
import ai.chalk.protos.chalk.aggregate.v1.CreateAggregateBackfillV2Response;
import ai.chalk.protos.chalk.server.v1.AuthServiceGrpc;
import ai.chalk.protos.chalk.server.v1.GetTokenRequest;
import ai.chalk.protos.chalk.server.v1.GetTokenResponse;
import com.google.protobuf.Timestamp;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import io.grpc.Metadata;
import io.grpc.Server;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;
import io.grpc.ServerInterceptors;
import io.grpc.netty.shaded.io.grpc.netty.NettyServerBuilder;
import io.grpc.stub.StreamObserver;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Exercises {@link ChalkClient#triggerAggregateBackfill} through the public client, to check
 * that the request reaches the API server's AggregateService with credentials attached.
 */
public class TestAggregateBackfillClient {
    private static final String ENVIRONMENT_ID = "test-environment";
    private static final Metadata.Key<String> AUTHORIZATION = key("authorization");
    private static final Metadata.Key<String> ENVIRONMENT = key("x-chalk-env-id");
    private static final Metadata.Key<String> SERVER = key("x-chalk-server");

    private static Metadata.Key<String> key(String name) {
        return Metadata.Key.of(name, Metadata.ASCII_STRING_MARSHALLER);
    }

    @Test
    public void testGrpcClientCallsTheApiServerWithCredentials() throws Exception {
        AtomicReference<Metadata> headers = new AtomicReference<>();
        AtomicReference<CreateAggregateBackfillV2Request> received = new AtomicReference<>();
        Server server = NettyServerBuilder.forPort(0)
                .addService(new AuthServiceGrpc.AuthServiceImplBase() {
                    @Override
                    public void getToken(GetTokenRequest request, StreamObserver<GetTokenResponse> observer) {
                        observer.onNext(GetTokenResponse.newBuilder()
                                .setAccessToken("test-token")
                                .setExpiresAt(Timestamp.newBuilder()
                                        .setSeconds(Instant.now().plusSeconds(3600).getEpochSecond()))
                                .setPrimaryEnvironment(ENVIRONMENT_ID)
                                .putEnvironmentIdToName(ENVIRONMENT_ID, "test")
                                .build());
                        observer.onCompleted();
                    }
                })
                .addService(ServerInterceptors.intercept(
                        new AggregateServiceGrpc.AggregateServiceImplBase() {
                            @Override
                            public void createAggregateBackfillV2(
                                    CreateAggregateBackfillV2Request request,
                                    StreamObserver<CreateAggregateBackfillV2Response> observer
                            ) {
                                received.set(request);
                                observer.onNext(CreateAggregateBackfillV2Response.newBuilder()
                                        .setJob(AggregateBackfillJob.newBuilder().setId("agg-backfill-123"))
                                        .build());
                                observer.onCompleted();
                            }
                        },
                        new ServerInterceptor() {
                            @Override
                            public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(
                                    ServerCall<ReqT, RespT> call,
                                    Metadata requestHeaders,
                                    ServerCallHandler<ReqT, RespT> next
                            ) {
                                headers.set(requestHeaders);
                                return next.startCall(call, requestHeaders);
                            }
                        }
                ))
                .build()
                .start();

        String grpcHost = "localhost:" + server.getPort();
        try (ChalkClient client = ChalkClient.builder()
                .withApiServer("http://" + grpcHost)
                .withQueryServer(grpcHost)
                .withClientId("test-client")
                .withClientSecret("test-secret")
                .withEnvironmentId(ENVIRONMENT_ID)
                .withGrpc()
                .build()) {
            AggregateBackfillResponse response = client.triggerAggregateBackfill(
                    AggregateBackfillParams.builder().withFeatures("user.spend_30d").build()
            );

            assertEquals("agg-backfill-123", response.getJob().getId());
            assertEquals(List.of("user.spend_30d"), received.get().getFeaturesList());
            assertEquals("Bearer test-token", headers.get().get(AUTHORIZATION));
            assertEquals(ENVIRONMENT_ID, headers.get().get(ENVIRONMENT));
            assertEquals("go-api", headers.get().get(SERVER));

            // A per-request environment overrides the client's.
            client.triggerAggregateBackfill(
                    AggregateBackfillParams.builder()
                            .withFeatures("user.spend_30d")
                            .withEnvironmentId("other-environment")
                            .build()
            );
            assertEquals("other-environment", headers.get().get(ENVIRONMENT));
        } finally {
            server.shutdownNow();
        }
    }

    @Test
    public void testHttpClientDirectsCallersToTheGrpcClient() throws Exception {
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
        server.start();

        String serverUrl = "http://localhost:" + server.getAddress().getPort();
        try (ChalkClient client = ChalkClient.builder()
                .withApiServer(serverUrl)
                .withQueryServer(serverUrl)
                .withClientId("test-client")
                .withClientSecret("test-secret")
                .withEnvironmentId(ENVIRONMENT_ID)
                .build()) {
            var e = assertThrows(
                    ClientException.class,
                    () -> client.triggerAggregateBackfill(
                            AggregateBackfillParams.builder().withFeatures("user.spend_30d").build()
                    )
            );
            assertTrue(e.getMessage().contains("only supported by the gRPC client"));
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
