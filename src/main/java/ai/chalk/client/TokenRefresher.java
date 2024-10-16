package ai.chalk.client;

import ai.chalk.protos.chalk.server.v1.AuthServiceGrpc;
import ai.chalk.protos.chalk.server.v1.GetTokenRequest;
import ai.chalk.protos.chalk.server.v1.GetTokenResponse;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;


public class TokenRefresher {
    private final AuthServiceGrpc.@NonNull AuthServiceBlockingStub blockingStub;

    @NonNull
    private final String clientId;

    @NonNull
    private final String clientSecret;

    @Nullable
    private volatile GetTokenResponse lastToken;

    public TokenRefresher(
            @NonNull String clientId,
            @NonNull String clientSecret,
            AuthServiceGrpc.AuthServiceBlockingStub blockingStub
    ) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.blockingStub = blockingStub;
        lastToken = null;
    }

    public @NonNull GetTokenResponse getToken() {
        if (isTokenExpired()) {
            refreshToken();
        }
        return lastToken;
    }

    private boolean isTokenExpired() {
        return lastToken == null || (lastToken.getExpiresAt().getSeconds() - (System.currentTimeMillis() / 1000) < 60);
    }

    private synchronized void refreshToken() {
        if (isTokenExpired()) {
            lastToken = blockingStub.getToken(
                    GetTokenRequest.newBuilder()
                            .setClientId(clientId)
                            .setClientSecret(clientSecret)
                            .build()
            );
        }
    }
}
