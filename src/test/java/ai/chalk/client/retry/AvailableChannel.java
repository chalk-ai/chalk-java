package ai.chalk.client.retry;

import io.grpc.*;
import java.util.concurrent.TimeUnit;

public class AvailableChannel extends ManagedChannel  {
    private boolean isShutdown = false;
    private boolean isTerminated = false;

    public AvailableChannel() {}

    @Override
    public <RequestT, ResponseT> ClientCall<RequestT, ResponseT> newCall(
            MethodDescriptor<RequestT, ResponseT> methodDescriptor,
            CallOptions callOptions
    ) {
        ManagedChannel underlying = Grpc.newChannelBuilder("MockAvailableChannel", InsecureChannelCredentials.create()).build();
        return new ClientCall<>() {
            @Override
            public void start(Listener<ResponseT> responseListener, Metadata headers) {
                // TODO: It would be good to make this an actual mock server
                underlying.newCall(methodDescriptor, callOptions).start(responseListener, headers);
                responseListener.onClose(Status.OK.withDescription("Mocked Available"), new Metadata());
            }

            @Override
            public void request(int numMessages) {
                underlying.newCall(methodDescriptor, callOptions).request(numMessages);
            }

            @Override
            public void cancel(String message, Throwable cause) {
                underlying.newCall(methodDescriptor, callOptions).cancel(message, cause);
            }

            @Override
            public void halfClose() {
                underlying.newCall(methodDescriptor, callOptions).halfClose();
            }

            @Override
            public void sendMessage(RequestT message) {
                underlying.newCall(methodDescriptor, callOptions).sendMessage(message);
            }

            @Override
            public boolean isReady() {
                return underlying.newCall(methodDescriptor, callOptions).isReady();
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
