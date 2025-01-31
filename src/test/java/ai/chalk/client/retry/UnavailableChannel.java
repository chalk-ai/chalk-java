package ai.chalk.client.retry;

import io.grpc.*;
import java.util.concurrent.TimeUnit;

public class UnavailableChannel extends ManagedChannel {
    private boolean isShutdown = false;
    private boolean isTerminated = false;

    public UnavailableChannel() {
    }

    @Override
    public <RequestT, ResponseT> ClientCall<RequestT, ResponseT> newCall(
            MethodDescriptor<RequestT, ResponseT> methodDescriptor,
            CallOptions callOptions
    ) {
        return new ClientCall<>() {
            @Override
            public void start(Listener<ResponseT> responseListener, Metadata headers) {
                responseListener.onClose(Status.UNAVAILABLE.withDescription("Mocked Unavailable"), new Metadata());
            }

            @Override
            public void request(int numMessages) {
            }

            @Override
            public void cancel(String message, Throwable cause) {
            }

            @Override
            public void halfClose() {
            }

            @Override
            public void sendMessage(Object message) {
            }

            @Override
            public boolean isReady() {
                return false;
            }
        };
    }


    @Override
    public ManagedChannel shutdown() {
        this.isShutdown = true;
        return this;
    }

    @Override
    public boolean isShutdown() {
        return this.isShutdown;
    }

    @Override
    public ManagedChannel shutdownNow() {
        this.isShutdown = true;
        return this;
    }

    @Override
    public boolean awaitTermination(long timeout, TimeUnit unit) throws InterruptedException {
        this.isTerminated = true;
        return true;
    }


    @Override
    public boolean isTerminated() {
        return this.isTerminated;
    }

    @Override
    public String authority() {
        return "MockAvailableChannel";
    }
}
