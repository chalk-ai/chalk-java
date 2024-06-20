package ai.chalk.client;

import ai.chalk.protos.chalk.server.v1.GetTokenResponse;
import io.grpc.*;
import io.grpc.ForwardingClientCall.SimpleForwardingClientCall;
import io.grpc.stub.MetadataUtils;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.HashMap;
import java.util.Map;


public class AuthenticatedHeaderClientInterceptor implements ClientInterceptor {
    public AuthenticatedHeaderClientInterceptor(
            @NonNull ServerType serverType,
            @NonNull Map<String, String> additionalHeaders,
            @NonNull TokenRefresher tokenRefresher,
            @NonNull String environmentId
    ) {
        this.tokenRefresher = tokenRefresher;
        this.allHeaders = new HashMap<>(Map.of(
                GrpcHeaders.SERVER_TYPE_KEY, serverType.headerName(),
                GrpcHeaders.ENVIRONMENT_ID_KEY, environmentId
        ));
        for (Map.Entry<String, String> entry : additionalHeaders.entrySet()) {
            this.allHeaders.put(Metadata.Key.of(entry.getKey(), Metadata.ASCII_STRING_MARSHALLER), entry.getValue());
        }
    }

    private final Map<Metadata.Key<String>, String> allHeaders;
    private final TokenRefresher tokenRefresher;

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
                headers.put(GrpcHeaders.CONTENT_TYPE, "application/grpc");
                super.start(responseListener, headers);
            }
        };
    }
}