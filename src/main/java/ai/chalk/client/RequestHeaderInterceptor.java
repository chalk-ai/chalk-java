package ai.chalk.client;

import io.grpc.*;
import io.grpc.ForwardingClientCall.SimpleForwardingClientCall;
import org.checkerframework.checker.nullness.qual.NonNull;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/**
 * A client interceptor that gets tacked on with every request to
 * allow for request-level header overrides such as environment ID.
 */
public class RequestHeaderInterceptor implements ClientInterceptor {
    public RequestHeaderInterceptor(
        @Nullable String requestEnvironmentId,
        @NonNull String clientEnvironmentId
    ) {
        this.allHeaders = new HashMap<>();
        if (requestEnvironmentId != null && !requestEnvironmentId.isEmpty()) {
            this.allHeaders.put(GrpcHeaders.ENVIRONMENT_ID_KEY, requestEnvironmentId);
        } else {
            this.allHeaders.put(GrpcHeaders.ENVIRONMENT_ID_KEY, clientEnvironmentId);
        }
    }

    private final @NonNull Map<Metadata.Key<String>, String> allHeaders;

    @Override
    public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(
            MethodDescriptor<ReqT, RespT> method,
            CallOptions callOptions, Channel next
    ) {
        return new SimpleForwardingClientCall<>(next.newCall(method, callOptions)) {
            @Override
            public void start(Listener<RespT> responseListener, Metadata headers) {
                for (Map.Entry<Metadata.Key<String>, String> entry : allHeaders.entrySet()) {
                    headers.put(entry.getKey(), entry.getValue());
                }
                super.start(responseListener, headers);
            }
        };
    }
}