package ai.chalk.client;

import ai.chalk.protos.chalk.server.v1.GetTokenResponse;
import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.ClientInterceptor;
import io.grpc.ForwardingClientCall.SimpleForwardingClientCall;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import org.checkerframework.checker.nullness.qual.NonNull;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.util.HashMap;
import java.util.Map;


public class AuthenticatedHeaderClientInterceptor implements ClientInterceptor {
    private final Map<Metadata.Key<String>, String> allHeaders;
    private final TokenRefresher tokenRefresher;

    public AuthenticatedHeaderClientInterceptor(
            @NonNull ServerType serverType,
            @NonNull Map<String, String> additionalHeaders,
            @NonNull TokenRefresher tokenRefresher,
            @NonNull String environmentId,
            @Nullable String deploymentTag
    ) {
        this.tokenRefresher = tokenRefresher;
        allHeaders = new HashMap<>(Map.of(
                GrpcHeaders.SERVER_TYPE_KEY, serverType.headerName(),
                GrpcHeaders.ENVIRONMENT_ID_KEY, environmentId
        ));
        for (Map.Entry<String, String> entry : additionalHeaders.entrySet()) {
            allHeaders.put(Metadata.Key.of(entry.getKey(), Metadata.ASCII_STRING_MARSHALLER), entry.getValue());
        }
        if (serverType.equals(ServerType.ENGINE)) {
            allHeaders.put(GrpcHeaders.DEPLOYMENT_TYPE, "engine-grpc");
        }
        if (deploymentTag != null) {
            allHeaders.put(GrpcHeaders.DEPLOYMENT_TAG, deploymentTag);
        }
    }

    @Override
    public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(
            MethodDescriptor<ReqT, RespT> method,
            CallOptions callOptions, Channel next
    ) {
        return new SimpleForwardingClientCall<>(next.newCall(method, callOptions)) {
            @Override
            public void start(Listener<RespT> responseListener, Metadata headers) {
                GetTokenResponse token = tokenRefresher.getToken();
                for (Map.Entry<Metadata.Key<String>, String> entry : allHeaders.entrySet()) {
                    headers.put(entry.getKey(), entry.getValue());
                }
                headers.put(GrpcHeaders.AUTHORIZATION_KEY, "Bearer " + token.getAccessToken());
                super.start(responseListener, headers);
            }
        };
    }
}
