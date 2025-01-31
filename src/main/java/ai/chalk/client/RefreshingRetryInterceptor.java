package ai.chalk.client;

import io.grpc.*;
import io.grpc.ForwardingClientCall.SimpleForwardingClientCall;

import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

public class RefreshingRetryInterceptor implements ClientInterceptor {
    private final Supplier<ManagedChannel> channelSupplier;
    private final AtomicReference<ManagedChannel> channel;

    private final int retryAttempts;
    private final long retryIntervalMillis;
    private final double retryBackoffMultiplier;

    private final Object channelLock = new Object();

    public RefreshingRetryInterceptor(
        Supplier<ManagedChannel> channelSupplier,
        AtomicReference<ManagedChannel> currentChannel,
        int retryAttempts,
        long retryIntervalMillis,
        double retryBackoffMultiplier
    ) {
        this.channelSupplier = channelSupplier;
        this.channel = currentChannel;
        this.retryAttempts = retryAttempts;
        this.retryIntervalMillis = retryIntervalMillis;
        this.retryBackoffMultiplier = retryBackoffMultiplier;
    }

    @Override
    public <ReqT, RespT> ClientCall<ReqT, RespT> interceptCall(
            MethodDescriptor<ReqT, RespT> method, CallOptions callOptions, Channel next) {
        return new SimpleForwardingClientCall<>(next.newCall(method, callOptions)) {

            @Override
            public void start(Listener<RespT> responseListener, Metadata headers) {
                super.start(new Listener<>() {
                    private int attempt = 0;

                    @Override
                    public void onMessage(RespT message) {
                        responseListener.onMessage(message);
                    }

                    @Override
                    public void onReady() {
                        responseListener.onReady();
                    }

                    @Override
                    public void onHeaders(Metadata headers) {
                        responseListener.onHeaders(headers);
                    }

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

                            ManagedChannel oldChannel = channel.get();
                            synchronized (channelLock) {
                                if (channel.get() == oldChannel) {
                                    ManagedChannel newChannel = channelSupplier.get();
                                    if (channel.compareAndSet(oldChannel, newChannel)) {
                                        oldChannel.shutdownNow();
                                    } else {
                                        // not sure if we can ever get here, better safe than sorry
                                        newChannel.shutdownNow();
                                    }
                                }
                            }
                            ClientCall<ReqT, RespT> retryCall = channel.get().newCall(method, callOptions);
                            retryCall.start(this, headers);
                        } else {
                            responseListener.onClose(status, trailers);
                        }
                    }
                }, headers);
            }
        };
    }

    public ManagedChannel getChannel() {
        return channel.get();
    }
}