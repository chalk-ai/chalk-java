package ai.chalk.client;

import ai.chalk.server.v1.AuthServiceGrpc;
import ai.chalk.server.v1.GetTokenResponse;
import ai.chalk.server.v1.TeamServiceGrpc;
import io.grpc.*;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.Map;
import java.util.Optional;

public class GRPCClient {
    private final AuthServiceGrpc.AuthServiceBlockingStub authStub;
    private final TeamServiceGrpc.TeamServiceBlockingStub teamStub;

    public GRPCClient(BuilderImpl builder) {
        String grpcHost = builder.getApiServer().replaceFirst("^https?://", "");
        ChannelCredentials channelCreds = grpcHost.startsWith("localhost") || grpcHost.startsWith("127.0.0.1")
                ? InsecureChannelCredentials.create()
                : TlsChannelCredentials.create();
        ManagedChannelBuilder<?> unauthenticatedChannelBuilder = Grpc.newChannelBuilder(
                grpcHost,
                channelCreds
        ).maxInboundMessageSize(1024 * 1024 * 100);
        this.authStub = AuthServiceGrpc.newBlockingStub(
                unauthenticatedChannelBuilder.intercept(new UnauthenticatedHeaderClientInterceptor(Map.of())).build()
        );

        TokenRefresher tokenRefresher = new TokenRefresher(
                builder.getClientId(),
                builder.getClientSecret(),
                this.authStub
        );

        GetTokenResponse token = tokenRefresher.getToken();

        @Nullable Optional<String> environmentIdMaybe = Optional.ofNullable(builder.getEnvironmentId());

        if (environmentIdMaybe.isEmpty() && !token.getPrimaryEnvironment().isEmpty()) {
            environmentIdMaybe = Optional.of(token.getPrimaryEnvironment());
        }

        if (environmentIdMaybe.isEmpty()) {
            throw new IllegalArgumentException("Environment ID is required");
        }

        @NonNull String environmentId = environmentIdMaybe.get();

        token.getGrpcEnginesMap();


        Channel authenticatedServerChannel = Grpc.newChannelBuilder(
                grpcHost,
                channelCreds
        ).maxInboundMessageSize(1024 * 1024 * 100).intercept(
                new AuthenticatedHeaderClientInterceptor(
                        ServerType.SERVER,
                        Map.of(),
                        tokenRefresher,
                        builder.getEnvironmentId()
                )
        ).build();


        this.teamStub = TeamServiceGrpc.newBlockingStub(authenticatedServerChannel);


    }

}
