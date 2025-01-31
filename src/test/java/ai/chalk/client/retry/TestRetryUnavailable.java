package ai.chalk.client.retry;

import ai.chalk.client.*;
import ai.chalk.client.e2e.FraudTemplateFeatures;
import ai.chalk.client.e2e.User;
import ai.chalk.exceptions.ClientException;
import ai.chalk.internal.config.Loader;
import ai.chalk.internal.config.models.ProjectToken;
import ai.chalk.models.OnlineQueryParams;
import ai.chalk.models.OnlineQueryResult;
import ai.chalk.protos.chalk.engine.v1.PingRequest;
import ai.chalk.protos.chalk.engine.v1.PingResponse;
import ai.chalk.protos.chalk.engine.v1.QueryServiceGrpc;
import ai.chalk.protos.chalk.server.v1.AuthServiceGrpc;
import ai.chalk.protos.chalk.server.v1.GetTokenResponse;
import ai.chalk.protos.chalk.server.v1.TeamServiceGrpc;
import io.grpc.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

public class TestRetryUnavailable {

    private static Supplier<ManagedChannel> availableChannelSupplier;
    private static Supplier<QueryServiceGrpc.QueryServiceBlockingStub> queryStubSupplier;

    private static AtomicReference<ManagedChannel> currentChannel;

    private static RefreshingRetryInterceptor retryInterceptor;

    @BeforeAll
    public static void setUpClass() {
        availableChannelSupplier = AvailableChannel::new;
        currentChannel = new AtomicReference<>(new UnavailableChannel());

        // The first channel is, however, one that is UNAVAILABLE
        queryStubSupplier = () -> QueryServiceGrpc.newBlockingStub(currentChannel.get());

        retryInterceptor = new RefreshingRetryInterceptor(
            availableChannelSupplier,
            currentChannel,
            1,
            2000,
            2.0
        );
    }

    @Test
    public void testOneRetry() {
        try {
            PingResponse resp = queryStubSupplier.get().ping(PingRequest.newBuilder().build());
        } catch (StatusRuntimeException e) {
            assert e.getStatus().getCode() == Status.Code.UNAVAILABLE;
        }
        long startTime = System.currentTimeMillis();
        try {
            PingResponse resp = queryStubSupplier.get().withInterceptors(retryInterceptor).ping(PingRequest.newBuilder().build());
        } catch (StatusRuntimeException e) {
            // TODO: Make this not fail: create an actual mock server
            assert e.getStatus().getCode() == Status.Code.INTERNAL;
        }
        long endTime = System.currentTimeMillis();
        assert endTime - startTime > 2000;
    }

}
