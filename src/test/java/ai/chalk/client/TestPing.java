package ai.chalk.client;

import ai.chalk.protos.chalk.engine.v1.PingRequest;
import ai.chalk.protos.chalk.engine.v1.PingResponse;
import ai.chalk.protos.chalk.engine.v1.QueryServiceGrpc;
import ai.chalk.protos.chalk.server.v1.AuthServiceGrpc;
import com.google.protobuf.Timestamp;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import io.grpc.Server;
import io.grpc.Metadata;
import io.grpc.ServerInterceptors;
import io.grpc.ServerCall;
import io.grpc.ServerCallHandler;
import io.grpc.ServerInterceptor;
import io.grpc.netty.shaded.io.grpc.netty.NettyServerBuilder;
import io.grpc.stub.StreamObserver;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import java.util.concurrent.atomic.AtomicReference;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestPing {
    private static final String ENVIRONMENT_ID = "test-environment";

    @Test
    public void testHttpPing() throws Exception {
        AtomicReference<String> pingBody = new AtomicReference<>();
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
        server.createContext("/ping", exchange -> {
            pingBody.set(new String(exchange.getRequestBody().readAllBytes(), StandardCharsets.UTF_8));
            respondJson(exchange, "{\"num\":37}");
        });
        server.start();

        String serverUrl = "http://localhost:" + server.getAddress().getPort();
        try (ChalkClient client = ChalkClient.builder()
                .withApiServer(serverUrl)
                .withQueryServer(serverUrl)
                .withClientId("test-client")
                .withClientSecret("test-secret")
                .withEnvironmentId(ENVIRONMENT_ID)
                .build()) {
            assertEquals(37, client.ping(37));
            assertEquals("{\"num\":37}", pingBody.get());
        } finally {
            server.stop(0);
        }
    }

    @Test
    public void testGrpcPing() throws Exception {
        AtomicReference<String> environmentHeader = new AtomicReference<>();
        AtomicReference<String> serverHeader = new AtomicReference<>();
        AtomicReference<String> deploymentTypeHeader = new AtomicReference<>();
        Metadata.Key<String> environmentHeaderKey = Metadata.Key.of(
                "x-chalk-env-id",
                Metadata.ASCII_STRING_MARSHALLER
        );
        Metadata.Key<String> serverHeaderKey = Metadata.Key.of(
                "x-chalk-server",
                Metadata.ASCII_STRING_MARSHALLER
        );
        Metadata.Key<String> deploymentTypeHeaderKey = Metadata.Key.of(
                "x-chalk-deployment-type",
                Metadata.ASCII_STRING_MARSHALLER
        );
        Server server = NettyServerBuilder.forPort(0)
                .addService(new AuthServiceGrpc.AuthServiceImplBase() {
                    @Override
                    public void getToken(
                            ai.chalk.protos.chalk.server.v1.GetTokenRequest request,
                            StreamObserver<ai.chalk.protos.chalk.server.v1.GetTokenResponse> responseObserver
                    ) {
                        responseObserver.onNext(ai.chalk.protos.chalk.server.v1.GetTokenResponse.newBuilder()
                                .setAccessToken("test-token")
                                .setExpiresAt(Timestamp.newBuilder()
                                        .setSeconds(Instant.now().plusSeconds(3600).getEpochSecond()))
                                .setPrimaryEnvironment(ENVIRONMENT_ID)
                                .putEnvironmentIdToName(ENVIRONMENT_ID, "test")
                                .build());
                        responseObserver.onCompleted();
                    }
                })
                .addService(ServerInterceptors.intercept(
                        new QueryServiceGrpc.QueryServiceImplBase() {
                            @Override
                            public void ping(PingRequest request, StreamObserver<PingResponse> responseObserver) {
                                responseObserver.onNext(PingResponse.newBuilder().setNum(request.getNum()).build());
                                responseObserver.onCompleted();
                            }
                        },
                        new ServerInterceptor() {
                            @Override
                            public <ReqT, RespT> ServerCall.Listener<ReqT> interceptCall(
                                    ServerCall<ReqT, RespT> call,
                                    Metadata headers,
                                    ServerCallHandler<ReqT, RespT> next
                            ) {
                                environmentHeader.set(headers.get(environmentHeaderKey));
                                serverHeader.set(headers.get(serverHeaderKey));
                                deploymentTypeHeader.set(headers.get(deploymentTypeHeaderKey));
                                return next.startCall(call, headers);
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
            assertEquals(41, client.ping(41));
            assertEquals(ENVIRONMENT_ID, environmentHeader.get());
            assertEquals("go-api", serverHeader.get());
            assertEquals("engine-grpc", deploymentTypeHeader.get());
            int randomEcho = client.ping();
            assertTrue(randomEcho >= 0 && randomEcho < 1000);
        } finally {
            server.shutdownNow();
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
