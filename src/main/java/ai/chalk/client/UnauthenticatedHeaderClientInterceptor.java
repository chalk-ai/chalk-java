package ai.chalk.client;

import io.grpc.*;
import io.grpc.ForwardingClientCall.SimpleForwardingClientCall;
import io.grpc.stub.MetadataUtils;
import org.checkerframework.checker.nullness.qual.NonNull;

import java.util.HashMap;
import java.util.Map;

/**
 * A client interceptor that adds the server type and environment ID to the headers of all outgoing
 */
public class UnauthenticatedHeaderClientInterceptor implements ClientInterceptor {
    public UnauthenticatedHeaderClientInterceptor(@NonNull Map<String, String> additionalHeaders) {
        this.allHeaders = new HashMap<>(Map.of(
                GrpcHeaders.SERVER_TYPE_KEY,
                ServerType.SERVER.headerName()
        ));
        for (Map.Entry<String, String> entry : additionalHeaders.entrySet()) {
            this.allHeaders.put(Metadata.Key.of(entry.getKey(), Metadata.ASCII_STRING_MARSHALLER), entry.getValue());
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