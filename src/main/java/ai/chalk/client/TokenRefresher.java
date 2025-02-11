package ai.chalk.client;

import ai.chalk.protos.chalk.server.v1.AuthServiceGrpc;
import ai.chalk.protos.chalk.server.v1.GetTokenRequest;
import ai.chalk.protos.chalk.server.v1.GetTokenResponse;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.time.Duration;
import java.util.Optional;


public class TokenRefresher {
    private final AuthServiceGrpc.AuthServiceBlockingStub blockingStub;

    @NonNull
    private final String clientId;

    @NonNull
    private final String clientSecret;

    @Nullable
    private GetTokenResponse lastToken;

    @Nullable
    private final Optional<Duration> timeout;

    public TokenRefresher(
            @NonNull String clientId,
            @NonNull String clientSecret,
            AuthServiceGrpc.AuthServiceBlockingStub blockingStub,
            Optional<Duration> timeout
    ) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.blockingStub = blockingStub;
        this.lastToken = null;
        this.timeout = timeout;
    }

    public @NonNull GetTokenResponse getToken() {
        if (
                this.lastToken == null ||
                        this.lastToken.getExpiresAt().getSeconds() < System.currentTimeMillis() / 1000 + 60
        ) {
            var stub = this.blockingStub;
            if (this.timeout.isPresent()) {
                stub = stub.withDeadlineAfter(this.timeout.get().toMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
            }
            this.lastToken = stub
                    .getToken(
                        GetTokenRequest.newBuilder()
                            .setClientId(this.clientId)
                            .setClientSecret(this.clientSecret)
                            .build()
                    );
        }
        return this.lastToken;
    }
}
