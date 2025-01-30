package ai.chalk.client;

import io.grpc.*;
import io.grpc.ForwardingClientCall.SimpleForwardingClientCall;

import java.util.function.Supplier;

public class RefreshingRetryInterceptor implements ClientInterceptor {
    private final Supplier<ManagedChannel> channelSupplier;
    private volatile ManagedChannel channel;

    private final int retryAttempts;
    private final long retryIntervalMillis;
    private final double retryBackoffMultiplier;

    public RefreshingRetryInterceptor(
            Supplier<ManagedChannel> channelSupplier,
            int retryAttempts,
            long retryIntervalMillis,
            double retryBackoffMultiplier
    ) {
        this.channelSupplier = channelSupplier;
        this.channel = channelSupplier.get();
        this.retryAttempts = retryAttempts;
        this.retryIntervalMillis = retryIntervalMillis;
        this.retryBackoffMultiplier = retryBackoffMultiplier;
    }

    @Override
    public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(
            MethodDescriptor<ReqT, RespT> method, CallOptions callOptions, Channel next) {
        return new RetryingClientCall<>(method, callOptions, next, retryAttempts, retryIntervalMillis, retryBackoffMultiplier);
    }

    private class RetryingClientCall<ReqT, RespT> extends SimpleForwardingClientCall<ReqT, RespT> {
        private final MethodDescriptor<ReqT, RespT> method;
        private final CallOptions callOptions;
        private final int retryAttempts;
        private final long retryIntervalMillis;
        private final double retryBackoffMultiplier;

        protected RetryingClientCall(
                MethodDescriptor<ReqT, RespT> method,
                CallOptions callOptions,
                Channel next,
                int retryAttempts,
                long retryIntervalMillis,
                double retryBackoffMultiplier
        ) {
            super(next.newCall(method, callOptions));
            this.method = method;
            this.callOptions = callOptions;
            this.retryAttempts = retryAttempts;
            this.retryIntervalMillis = retryIntervalMillis;
            this.retryBackoffMultiplier = retryBackoffMultiplier;
        }

        @Override
        public void start(Listener<RespT> responseListener, Metadata headers) {
            super.start(new Listener<>() {
                private int attempt = 0;

                @Override
                public void onClose(Status status, Metadata trailers) {
                    if (status.getCode() == Status.Code.UNAVAILABLE && attempt < retryAttempts) {
                        long backOffMillis = (long) (retryIntervalMillis * Math.pow(retryBackoffMultiplier, attempt));
                        attempt++;
                        try {
                            Thread.sleep(backOffMillis);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                        ManagedChannel oldChannel = channel;
                        channel = channelSupplier.get(); // Recreate channel
                        oldChannel.shutdownNow();
                        ClientCall<ReqT, RespT> retryCall = channel.newCall(method, callOptions);
                        retryCall.start(this, headers);
                    } else {
                        responseListener.onClose(status, trailers);
                    }
                }
            }, headers);
        }
    }

    public ManagedChannel getChannel() {
        return channel;
    }
}