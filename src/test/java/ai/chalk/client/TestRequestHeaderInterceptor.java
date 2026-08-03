package ai.chalk.client;

import ai.chalk.models.UploadFeaturesParams;
import io.grpc.CallOptions;
import io.grpc.Channel;
import io.grpc.ClientCall;
import io.grpc.Metadata;
import io.grpc.MethodDescriptor;
import org.junit.jupiter.api.Test;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TestRequestHeaderInterceptor {

    /** Captures the metadata the interceptor writes, without opening a connection. */
    private static Metadata startCall(RequestHeaderInterceptor interceptor) {
        MethodDescriptor<byte[], byte[]> method = MethodDescriptor.<byte[], byte[]>newBuilder()
                .setType(MethodDescriptor.MethodType.UNARY)
                .setFullMethodName("chalk.engine.v1.QueryService/UploadFeatures")
                .setRequestMarshaller(new PassthroughMarshaller())
                .setResponseMarshaller(new PassthroughMarshaller())
                .build();

        NoopClientCall<byte[], byte[]> delegateCall = new NoopClientCall<>();
        Channel channel = new Channel() {
            @Override
            public <ReqT, RespT> ClientCall<ReqT, RespT> newCall(
                    MethodDescriptor<ReqT, RespT> methodDescriptor, CallOptions callOptions
            ) {
                @SuppressWarnings("unchecked")
                ClientCall<ReqT, RespT> call = (ClientCall<ReqT, RespT>) delegateCall;
                return call;
            }

            @Override
            public String authority() {
                return "test";
            }
        };

        Metadata headers = new Metadata();
        interceptor.interceptCall(method, CallOptions.DEFAULT, channel)
                .start(new ClientCall.Listener<>() {}, headers);
        return headers;
    }

    @Test
    public void testResourceGroupHeaderSet() {
        Metadata headers = startCall(
                new RequestHeaderInterceptor(null, "env-1", null, "uploads")
        );
        assertEquals("uploads", headers.get(GrpcHeaders.RESOURCE_GROUP_KEY));
        // A duplicated routing header gets comma-joined by the ingress, which breaks routing.
        int occurrences = 0;
        for (String ignored : headers.getAll(GrpcHeaders.RESOURCE_GROUP_KEY)) {
            occurrences++;
        }
        assertEquals(1, occurrences);
        assertEquals("env-1", headers.get(GrpcHeaders.ENVIRONMENT_ID_KEY));
    }

    @Test
    public void testResourceGroupHeaderOmittedWhenUnset() {
        assertNull(startCall(
                new RequestHeaderInterceptor(null, "env-1", null, null)
        ).get(GrpcHeaders.RESOURCE_GROUP_KEY));
        assertNull(startCall(
                new RequestHeaderInterceptor(null, "env-1", null, "")
        ).get(GrpcHeaders.RESOURCE_GROUP_KEY));
        // The three-arg constructor stays resource-group-free.
        assertNull(startCall(
                new RequestHeaderInterceptor(null, "env-1", "my_query")
        ).get(GrpcHeaders.RESOURCE_GROUP_KEY));
    }

    @Test
    public void testUploadFeaturesParamsResourceGroup() {
        UploadFeaturesParams withGroup = UploadFeaturesParams.builder()
                .withInput("user.id", List.of("1"))
                .withResourceGroup("uploads")
                .build();
        assertEquals("uploads", withGroup.getResourceGroup());

        UploadFeaturesParams withoutGroup = UploadFeaturesParams.builder()
                .withInputs(Map.of("user.id", List.of("1")))
                .build();
        assertNull(withoutGroup.getResourceGroup());
        // Defaults are otherwise unchanged.
        assertFalse(withoutGroup.isWriteOffline());
    }

    private static final class PassthroughMarshaller implements MethodDescriptor.Marshaller<byte[]> {
        @Override
        public InputStream stream(byte[] value) {
            return new java.io.ByteArrayInputStream(value);
        }

        @Override
        public byte[] parse(InputStream stream) {
            throw new UnsupportedOperationException();
        }
    }

    private static final class NoopClientCall<ReqT, RespT> extends ClientCall<ReqT, RespT> {
        @Override
        public void start(Listener<RespT> responseListener, Metadata headers) {}

        @Override
        public void request(int numMessages) {}

        @Override
        public void cancel(String message, Throwable cause) {}

        @Override
        public void halfClose() {}

        @Override
        public void sendMessage(ReqT message) {}
    }
}
