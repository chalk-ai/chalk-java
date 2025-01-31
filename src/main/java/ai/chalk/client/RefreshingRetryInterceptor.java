package ai.chalk.client;

import io.grpc.*;
import io.grpc.ForwardingClientCall.SimpleForwardingClientCall;

import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import java.util.Queue;

public class RefreshingRetryInterceptor implements ClientInterceptor {
    private final Supplier<ManagedChannel> channelSupplier;
    private final AtomicReference<ManagedChannel> channel;

    private final int retryAttempts;
    private final long retryIntervalMillis;
    private final double retryBackoffMultiplier;

    private static final System.Logger logger = System.getLogger(RefreshingRetryInterceptor.class.getName());

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
        AtomicInteger attempt = new AtomicInteger(0);

        return new SimpleForwardingClientCall<>(next.newCall(method, callOptions)) {
            // Maintain a queue of messages sent, in case we need to retry.
            private final Queue<ReqT> messageQueue = new ConcurrentLinkedQueue<>();

            // Maintain a flag to indicate if the call has been half-closed. This allows to half-close the retry call
            // after sending the previous messages.
            private boolean halfClosed = false;

            @Override
            public void sendMessage(ReqT message) {
                messageQueue.offer(message);
                super.sendMessage(message);
            }

            @Override
            public void halfClose() {
                halfClosed = true;
                super.halfClose();
            }

            @Override
            public void start(Listener<RespT> responseListener, Metadata headers) {
                super.start(new ForwardingClientCallListener.SimpleForwardingClientCallListener<>(responseListener) {

                    @Override
                    public void onClose(Status status, Metadata trailers) {
                        if (status.getCode() == Status.Code.UNAVAILABLE && attempt.get() < retryAttempts) {
                            long backOffMillis = (long) (retryIntervalMillis * Math.pow(retryBackoffMultiplier, attempt.get()));
                            attempt.set(attempt.get() + 1);
                            logger.log(System.Logger.Level.INFO, "Server was UNAVAILABLE, performing manual channel refresh in " + backOffMillis + "ms...");
                            try {
                                Thread.sleep(backOffMillis);
                            } catch (InterruptedException e) {
                                Thread.currentThread().interrupt();
                            }

                            ManagedChannel oldChannel = channel.get();
                            synchronized (channelLock) {
                                if (channel.get() == oldChannel) {
                                    ManagedChannel newChannel = channelSupplier.get();
                                    logger.log(System.Logger.Level.INFO, "Channel refreshed. Attempting retry...");
                                    if (channel.compareAndSet(oldChannel, newChannel)) {
                                        oldChannel.shutdownNow();
                                    } else {
                                        // not sure if we can ever get here, better safe than sorry
                                        newChannel.shutdownNow();
                                    }
                                } else {
                                    logger.log(System.Logger.Level.INFO, "Channel was not refreshed, as it was refreshed by a different call. Attempting retry...");
                                }
                            }
                            ManagedChannel newChannel = channel.get();
                            ClientCall<ReqT, RespT> retryCall = newChannel.newCall(method, callOptions);
                            retryCall.start(this, headers);

                            for (ReqT queuedMessage : messageQueue) {
                                retryCall.sendMessage(queuedMessage);
                            }
                            if (halfClosed) {
                                retryCall.halfClose();
                            }
                            // TODO: It is probably more correct to also call request() on the retryCall with the number of messages
                            // TODO: originally requested. Fortunately all of our calls are unary right now.
                            retryCall.request(1);

                        } else {
                            super.onClose(status, trailers);
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