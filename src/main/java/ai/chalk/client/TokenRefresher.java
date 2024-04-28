package ai.chalk.client;

import ai.chalk.server.v1.AuthServiceGrpc;
import ai.chalk.server.v1.GetTokenRequest;
import ai.chalk.server.v1.GetTokenResponse;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;


public class TokenRefresher {
    public TokenRefresher(
            @NonNull String clientId,
            @NonNull String clientSecret,
            AuthServiceGrpc.AuthServiceBlockingStub blockingStub
    ) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.blockingStub = blockingStub;
        this.lastToken = null;
    }

    public @NonNull GetTokenResponse getToken() {
        if (
                this.lastToken == null ||
                        this.lastToken.getExpiresAt().getSeconds() < System.currentTimeMillis() / 1000 + 60
        ) {
            this.lastToken = this.blockingStub.getToken(
                    GetTokenRequest.newBuilder()
                            .setClientId(this.clientId)
                            .setClientSecret(this.clientSecret)
                            .build()
            );
        }
        return this.lastToken;
    }

    private final AuthServiceGrpc.AuthServiceBlockingStub blockingStub;

    @NonNull
    private final String clientId;

    @NonNull
    private final String clientSecret;

    @Nullable
    private GetTokenResponse lastToken;
}
