package ai.chalk.client;

import io.grpc.*;
import io.grpc.ForwardingClientCall.SimpleForwardingClientCall;
import io.grpc.stub.MetadataUtils;

import java.util.logging.Logger;

/**
 * A client interceptor that adds the server type and environment ID to the headers of all outgoing
 */
public class UnauthenticatedHeaderClientInterceptor implements ClientInterceptor {
    private static final Logger logger = Logger.getLogger(UnauthenticatedHeaderClientInterceptor.class.getName());
    private final String serverType;
    private final String environmentId;

    public UnauthenticatedHeaderClientInterceptor(
            String environmentId,
            String serverType
    ) {
        this.environmentId = environmentId;
        this.serverType = serverType;
    }

    @Override
    public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(
            MethodDescriptor<ReqT, RespT> method,
            CallOptions callOptions, Channel next
    ) {
        return new SimpleForwardingClientCall<ReqT, RespT>(next.newCall(method, callOptions)) {

            @Override
            public void start(Listener<RespT> responseListener, Metadata headers) {
                headers.put(GrpcHeaders.SERVER_TYPE_KEY, serverType);
                headers.put(GrpcHeaders.ENVIRONMENT_ID_KEY, environmentId);

                MetadataUtils.newAttachHeadersInterceptor(headers).interceptCall(
                        method,
                        callOptions,
                        next
                );

            }
        };
    }
}