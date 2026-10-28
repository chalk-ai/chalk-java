package ai.chalk.client;

import ai.chalk.exceptions.AggregateBackfillException;
import ai.chalk.exceptions.ClientException;
import ai.chalk.models.AggregateBackfillParams;
import ai.chalk.models.AggregateBackfillResponse;
import ai.chalk.models.AggregateBackfillStatus;
import ai.chalk.protos.chalk.aggregate.v1.AggregateBackfill;
import ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillCostEstimate;
import ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillJob;
import ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillMode;
import ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillWithCostEstimate;
import ai.chalk.protos.chalk.aggregate.v1.AggregateServiceGrpc;
import ai.chalk.protos.chalk.aggregate.v1.AggregateTimeSeries;
import ai.chalk.protos.chalk.aggregate.v1.AggregateTimeSeriesRule;
import ai.chalk.protos.chalk.aggregate.v1.CreateAggregateBackfillJobRequest;
import ai.chalk.protos.chalk.aggregate.v1.CreateAggregateBackfillJobResponse;
import ai.chalk.protos.chalk.aggregate.v1.CreateAggregateBackfillV2Request;
import ai.chalk.protos.chalk.aggregate.v1.CreateAggregateBackfillV2Response;
import ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobRequest;
import ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobResponse;
import ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest;
import ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillResponse;
import ai.chalk.protos.chalk.common.v1.ChalkError;
import com.google.protobuf.Timestamp;
import io.grpc.ManagedChannel;
import io.grpc.Server;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;
import io.grpc.netty.shaded.io.grpc.netty.NettyChannelBuilder;
import io.grpc.netty.shaded.io.grpc.netty.NettyServerBuilder;
import io.grpc.stub.StreamObserver;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.net.InetSocketAddress;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Tests for aggregate backfill planning and job creation, ported from the Python client's
 * {@code tests/client/test_trigger_aggregate_backfill.py}.
 *
 * <p> {@code triggerAggregateBackfill} issues a single CreateAggregateBackfillV2 call.
 * Servers that predate that RPC answer UNIMPLEMENTED, and the client falls back to planning
 * and creating one job per sub-backfill itself. Both paths decode into an
 * {@link AggregateBackfillResponse}. These run against a loopback AggregateService, so
 * requests and status codes go through real gRPC stubs.
 */
public class TestAggregateBackfill {
    private static final String AGG_BACKFILL_ID = "agg-backfill-123";
    private static final ZonedDateTime LOWER = ZonedDateTime.of(2024, 1, 1, 0, 0, 0, 0, ZoneOffset.UTC);
    private static final ZonedDateTime UPPER = ZonedDateTime.of(2024, 1, 2, 0, 0, 0, 0, ZoneOffset.UTC);

    private FakeAggregateService service;
    private Server server;
    private ManagedChannel channel;
    private AggregateServiceGrpc.AggregateServiceBlockingStub stub;

    @BeforeEach
    public void setUp() throws Exception {
        service = new FakeAggregateService();
        server = NettyServerBuilder.forAddress(new InetSocketAddress("localhost", 0))
                .addService(service)
                .build()
                .start();
        channel = NettyChannelBuilder.forAddress("localhost", server.getPort()).usePlaintext().build();
        stub = AggregateServiceGrpc.newBlockingStub(channel);
    }

    @AfterEach
    public void tearDown() {
        channel.shutdownNow();
        server.shutdownNow();
    }

    // ---------------------------------------------------------------- fake server

    /**
     * An AggregateService that records every request. By default it supports
     * CreateAggregateBackfillV2; set {@code v2Error} to UNIMPLEMENTED to act as a server
     * that predates it.
     */
    static class FakeAggregateService extends AggregateServiceGrpc.AggregateServiceImplBase {
        CreateAggregateBackfillV2Response v2Response = CreateAggregateBackfillV2Response.newBuilder()
                .setJob(AggregateBackfillJob.newBuilder().setId(AGG_BACKFILL_ID))
                .build();
        Status v2Error;
        PlanAggregateBackfillResponse planResponse = planResponse(defaultBackfills(), List.of());
        Deque<CreateAggregateBackfillJobResponse> createResponses = new ArrayDeque<>();
        CreateAggregateBackfillJobResponse defaultCreateResponse =
                CreateAggregateBackfillJobResponse.newBuilder().setJobId("job-1").build();
        GetAggregateBackfillJobResponse getResponse = GetAggregateBackfillJobResponse.newBuilder()
                .setJob(AggregateBackfillJob.newBuilder().setId(AGG_BACKFILL_ID))
                .build();
        Status getError;

        final List<CreateAggregateBackfillV2Request> v2Requests = new ArrayList<>();
        final List<PlanAggregateBackfillRequest> planRequests = new ArrayList<>();
        final List<CreateAggregateBackfillJobRequest> createRequests = new ArrayList<>();
        final List<GetAggregateBackfillJobRequest> getRequests = new ArrayList<>();

        void actAsLegacyServer() {
            this.v2Error = Status.UNIMPLEMENTED;
        }

        @Override
        public void createAggregateBackfillV2(
                CreateAggregateBackfillV2Request request,
                StreamObserver<CreateAggregateBackfillV2Response> observer
        ) {
            v2Requests.add(request);
            if (v2Error != null) {
                observer.onError(v2Error.asRuntimeException());
                return;
            }
            observer.onNext(v2Response);
            observer.onCompleted();
        }

        @Override
        public void planAggregateBackfill(
                PlanAggregateBackfillRequest request,
                StreamObserver<PlanAggregateBackfillResponse> observer
        ) {
            planRequests.add(request);
            observer.onNext(planResponse);
            observer.onCompleted();
        }

        @Override
        public void createAggregateBackfillJob(
                CreateAggregateBackfillJobRequest request,
                StreamObserver<CreateAggregateBackfillJobResponse> observer
        ) {
            createRequests.add(request);
            observer.onNext(createResponses.isEmpty() ? defaultCreateResponse : createResponses.poll());
            observer.onCompleted();
        }

        @Override
        public void getAggregateBackfillJob(
                GetAggregateBackfillJobRequest request,
                StreamObserver<GetAggregateBackfillJobResponse> observer
        ) {
            getRequests.add(request);
            if (getError != null) {
                observer.onError(getError.asRuntimeException());
                return;
            }
            observer.onNext(getResponse);
            observer.onCompleted();
        }
    }

    // ---------------------------------------------------------------- helpers

    private static AggregateBackfill.Builder backfill(String resolver, String datetimeFeature, String... features) {
        return AggregateBackfill.newBuilder()
                .setResolver(resolver)
                .setDatetimeFeature(datetimeFeature)
                .addSeries(AggregateTimeSeries.newBuilder()
                        .setNamespace("events")
                        .setAggregateOn("amount")
                        .addRules(AggregateTimeSeriesRule.newBuilder().addAllDependentFeatures(List.of(features))));
    }

    private static AggregateBackfillWithCostEstimate withEstimate(AggregateBackfill.Builder backfill, long maxBuckets) {
        return AggregateBackfillWithCostEstimate.newBuilder()
                .setBackfill(backfill)
                .setEstimate(AggregateBackfillCostEstimate.newBuilder().setMaxBuckets(maxBuckets))
                .build();
    }

    private static List<AggregateBackfillWithCostEstimate> defaultBackfills() {
        return List.of(withEstimate(backfill("aggregate_resolver", "events.ts", "user.spend_by_merchant_1d"), 1));
    }

    private static PlanAggregateBackfillResponse planResponse(
            List<AggregateBackfillWithCostEstimate> backfills,
            List<String> errors
    ) {
        return PlanAggregateBackfillResponse.newBuilder()
                .setAggregateBackfillId(AGG_BACKFILL_ID)
                .addAllBackfills(backfills)
                .addAllErrors(errors)
                .build();
    }

    private static AggregateBackfillParams.Builder params() {
        return AggregateBackfillParams.builder().withFeatures("user.spend_by_merchant_1d");
    }

    private AggregateBackfillResponse trigger(AggregateBackfillParams.Builder params) throws Exception {
        return AggregateBackfills.trigger(stub, params.build());
    }

    private static long seconds(ZonedDateTime value) {
        return value.toEpochSecond();
    }

    // ---------------------------------------------------------------- CreateAggregateBackfillV2

    @Test
    public void testSendsASingleV2Request() throws Exception {
        trigger(params()
                .withLowerBound(LOWER)
                .withUpperBound(UPPER)
                .withResolver("my_resolver")
                .withQueryTags(List.of("prod", "priority"))
                .withStoreOffline(true)
                .withExact(true)
                .withEnableProfiling(true)
                .withResourceGroup("batch-rg"));

        assertEquals(1, service.v2Requests.size());
        assertTrue(service.planRequests.isEmpty());
        assertTrue(service.createRequests.isEmpty());

        CreateAggregateBackfillV2Request req = service.v2Requests.get(0);
        assertEquals(List.of("user.spend_by_merchant_1d"), req.getFeaturesList());
        assertEquals("my_resolver", req.getResolver());
        assertEquals(List.of("prod", "priority"), req.getTagsList());
        assertTrue(req.getExact());
        assertEquals(seconds(LOWER), req.getLowerBound().getSeconds());
        assertEquals(seconds(UPPER), req.getUpperBound().getSeconds());
        assertTrue(req.getEnableProfiling());
        assertEquals("batch-rg", req.getResourceGroup());
        assertEquals(AggregateBackfillMode.AGGREGATE_BACKFILL_MODE_CREATE, req.getMode());
        assertFalse(req.hasNumShards());
        assertFalse(req.hasInputSql());
    }

    @Test
    public void testDecodesTheV2ResponseIntoTheModel() throws Exception {
        service.v2Response = CreateAggregateBackfillV2Response.newBuilder()
                .setJob(AggregateBackfillJob.newBuilder()
                        .setId(AGG_BACKFILL_ID)
                        .setStatus(ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillStatus.AGGREGATE_BACKFILL_STATUS_QUEUED)
                        .addFeatures("user.spend_by_merchant_1d")
                        .setCreatedAt(Timestamp.newBuilder().setSeconds(seconds(LOWER))))
                .addAllSubBackfills(List.of(withEstimate(
                        backfill("aggregate_resolver", "events.ts", "user.spend_by_merchant_1d")
                                .setLowerBound(Timestamp.newBuilder().setSeconds(seconds(LOWER)))
                                .setBucketDuration(com.google.protobuf.Duration.newBuilder().setSeconds(3600)),
                        1)))
                .build();

        AggregateBackfillResponse response = trigger(params());

        assertNotNull(response.getJob());
        assertEquals(AGG_BACKFILL_ID, response.getJob().getId());
        assertEquals(AggregateBackfillStatus.QUEUED, response.getJob().getStatus());
        assertEquals(List.of("user.spend_by_merchant_1d"), response.getJob().getFeatures());
        assertEquals(LOWER, response.getJob().getCreatedAt());
        assertNull(response.getJob().getUpdatedAt());
        assertNull(response.getJob().getEnvironmentId());
        // dependent_features is flattened out of series[].rules[] onto the sub-backfill.
        var sub = response.getSubBackfills().get(0);
        assertEquals(List.of("user.spend_by_merchant_1d"), sub.getFeatures());
        assertEquals(1, sub.getEstimate().getMaxBuckets());
        assertNull(sub.getEstimate().getExpectedRuntime());
        assertEquals("aggregate_resolver", sub.getResolver());
        assertEquals("events.ts", sub.getDatetimeFeature());
        assertEquals(LOWER, sub.getLowerBound());
        assertNull(sub.getUpperBound());
        assertEquals(java.time.Duration.ofHours(1), sub.getBucketDuration());
        assertNull(sub.getInputSql());
        assertNull(sub.getFiltersDescription());
        assertEquals(List.of("user.spend_by_merchant_1d"), response.getFeatures());
    }

    @Test
    public void testUnrecognizedStatusDecodesAsUnknown() throws Exception {
        service.v2Response = CreateAggregateBackfillV2Response.newBuilder()
                .setJob(AggregateBackfillJob.newBuilder().setId(AGG_BACKFILL_ID).setStatusValue(999))
                .build();

        AggregateBackfillResponse response = trigger(params());

        assertEquals(AggregateBackfillStatus.UNKNOWN, response.getJob().getStatus());
    }

    @Test
    public void testInputSqlIsForwarded() throws Exception {
        trigger(params().withInputSql("select 1"));

        assertEquals("select 1", service.v2Requests.get(0).getInputSql());
    }

    @Test
    public void testOmitsStoreOfflineByDefault() throws Exception {
        trigger(params());

        CreateAggregateBackfillV2Request req = service.v2Requests.get(0);
        assertFalse(req.hasStoreOffline());
        assertFalse(req.hasResourceGroup());
        assertFalse(req.hasResolver());
    }

    @Test
    public void testSetsStoreOfflineFalseWithoutBounds() throws Exception {
        trigger(params().withStoreOffline(false));

        CreateAggregateBackfillV2Request req = service.v2Requests.get(0);
        assertTrue(req.hasStoreOffline());
        assertFalse(req.getStoreOffline());
    }

    @Test
    public void testAllowEmptyTilesPassedThroughForOffline() throws Exception {
        trigger(params().withStoreOffline(true).withLowerBound(LOWER).withUpperBound(UPPER));

        CreateAggregateBackfillV2Request req = service.v2Requests.get(0);
        assertTrue(req.hasAllowEmptyTiles());
        assertTrue(req.getAllowEmptyTiles());
    }

    /**
     * The server rejects allow_empty_tiles without an offline target, and this parameter
     * defaults to true, so every default call would fail validation if it were sent verbatim.
     */
    @Test
    public void testAllowEmptyTilesCoercedToFalseWithoutOffline() throws Exception {
        trigger(params());

        CreateAggregateBackfillV2Request req = service.v2Requests.get(0);
        assertTrue(req.hasAllowEmptyTiles());
        assertFalse(req.getAllowEmptyTiles());
    }

    @ParameterizedTest
    @CsvSource({"false,false", "true,false", "false,true"})
    public void testRequiresBothBoundsForStoreOffline(boolean withLower, boolean withUpper) {
        var params = params().withStoreOffline(true);
        if (withLower) {
            params.withLowerBound(LOWER);
        }
        if (withUpper) {
            params.withUpperBound(UPPER);
        }

        var e = assertThrows(ClientException.class, () -> trigger(params));
        assertTrue(e.getMessage().contains("both lowerBound and upperBound must be specified"));
        assertTrue(service.v2Requests.isEmpty());
    }

    @ParameterizedTest
    @CsvSource({"1", "0", "-3"})
    public void testNumShardsMustExceedOneClientSide(int numShards) {
        var e = assertThrows(ClientException.class, () -> trigger(params().withNumShards(numShards)));
        assertTrue(e.getMessage().contains("numShards must be > 1"));
        assertTrue(service.v2Requests.isEmpty());
    }

    @Test
    public void testNumShardsIsForwarded() throws Exception {
        trigger(params().withNumShards(4));

        CreateAggregateBackfillV2Request req = service.v2Requests.get(0);
        assertTrue(req.hasNumShards());
        assertEquals(4, req.getNumShards());
    }

    @Test
    public void testFeaturesAreRequired() {
        assertThrows(ClientException.class, () -> trigger(AggregateBackfillParams.builder()));
        assertTrue(service.v2Requests.isEmpty());
    }

    // ---------------------------------------------------------------- plan mode

    @Test
    public void testPlanOnlySetsPlanModeAndChangesNothingElse() throws Exception {
        var params = params()
                .withResolver("my_resolver")
                .withQueryTags(List.of("prod"))
                .withStoreOffline(true)
                .withLowerBound(LOWER)
                .withUpperBound(UPPER)
                .withResourceGroup("batch-rg");

        trigger(params.withPlanOnly(true));
        trigger(params.withPlanOnly(false));

        CreateAggregateBackfillV2Request planReq = service.v2Requests.get(0);
        CreateAggregateBackfillV2Request createReq = service.v2Requests.get(1);
        assertEquals(AggregateBackfillMode.AGGREGATE_BACKFILL_MODE_PLAN, planReq.getMode());
        assertEquals(AggregateBackfillMode.AGGREGATE_BACKFILL_MODE_CREATE, createReq.getMode());

        // Only `mode` differs: a dry run has to exercise the same validation as a real run.
        assertEquals(
                createReq,
                planReq.toBuilder().setMode(AggregateBackfillMode.AGGREGATE_BACKFILL_MODE_CREATE).build()
        );
    }

    @Test
    public void testPlanOnlyReturnsSubBackfillsWithoutAJob() throws Exception {
        service.v2Response = CreateAggregateBackfillV2Response.newBuilder()
                .addAllSubBackfills(defaultBackfills())
                .build();

        AggregateBackfillResponse response = trigger(params().withPlanOnly(true));

        assertNull(response.getJob());
        assertEquals(1, response.getSubBackfills().size());
        assertEquals(List.of("user.spend_by_merchant_1d"), response.getSubBackfills().get(0).getFeatures());
    }

    /** Plan mode is new, so there is no old behavior to preserve by falling back. */
    @Test
    public void testPlanOnlyFailsAgainstAServerWithoutV2() {
        service.actAsLegacyServer();

        var e = assertThrows(ClientException.class, () -> trigger(params().withPlanOnly(true)));
        assertTrue(e.getMessage().contains("planOnly"));

        // A rejected dry run must not have started, or planned, anything.
        assertTrue(service.planRequests.isEmpty());
        assertTrue(service.createRequests.isEmpty());
        assertTrue(service.getRequests.isEmpty());
    }

    /** Sharding against an old server would silently run one unsharded job, so it fails. */
    @Test
    public void testNumShardsFailsAgainstAServerWithoutV2() {
        service.actAsLegacyServer();

        var e = assertThrows(ClientException.class, () -> trigger(params().withNumShards(4)));
        assertTrue(e.getMessage().contains("numShards"));
        assertTrue(service.planRequests.isEmpty());
        assertTrue(service.createRequests.isEmpty());
    }

    // ---------------------------------------------------------------- error translation

    /** The same validation runs in both modes, so the message must not claim the caller planned. */
    @ParameterizedTest
    @CsvSource({
            "true,Failed to plan aggregate backfill.",
            "false,Failed to create aggregate backfill. No jobs were created."
    })
    public void testInvalidArgumentNamesTheRequestedOperation(boolean planOnly, String expectedMessage) {
        service.v2Error = Status.INVALID_ARGUMENT.withDescription("invalid feature");

        var e = assertThrows(AggregateBackfillException.class, () -> trigger(params().withPlanOnly(planOnly)));
        assertTrue(e.getMessage().startsWith(expectedMessage), e.getMessage());
        assertEquals("invalid feature", e.getDetail());
        assertTrue(e.getCause() instanceof StatusRuntimeException);
    }

    @Test
    public void testInternalErrorIsWrapped() {
        service.v2Error = Status.INTERNAL.withDescription("Started 1 of 2 aggregate backfill jobs.");

        var e = assertThrows(AggregateBackfillException.class, () -> trigger(params()));
        assertTrue(e.getMessage().startsWith("Failed to create aggregate backfill jobs."));
        // The partial-launch detail has to reach the caller.
        assertEquals("Started 1 of 2 aggregate backfill jobs.", e.getDetail());
    }

    @Test
    public void testUnrelatedRpcErrorsPropagateWithoutFallingBack() {
        service.v2Error = Status.PERMISSION_DENIED.withDescription("nope");

        var e = assertThrows(StatusRuntimeException.class, () -> trigger(params()));
        assertEquals(Status.Code.PERMISSION_DENIED, e.getStatus().getCode());
        assertTrue(service.planRequests.isEmpty());
    }

    // ---------------------------------------------------------------- legacy fallback

    @Test
    public void testLegacyFallbackPlansThenCreatesJobs() throws Exception {
        service.actAsLegacyServer();
        service.planResponse = planResponse(List.of(
                withEstimate(
                        backfill("resolver_a", "events.ts", "user.spend_by_merchant_1d", "user.spend_by_merchant_7d")
                                .setLowerBound(Timestamp.newBuilder().setSeconds(seconds(LOWER)))
                                .setUpperBound(Timestamp.newBuilder().setSeconds(seconds(UPPER))),
                        1),
                withEstimate(backfill("resolver_b", "sessions.ts", "user.session_count_1d"), 2)
        ), List.of());
        service.createResponses.add(CreateAggregateBackfillJobResponse.newBuilder().setJobId("job-1").build());
        service.createResponses.add(CreateAggregateBackfillJobResponse.newBuilder().setJobId("job-2").build());

        AggregateBackfillResponse response = trigger(params()
                .withLowerBound(LOWER)
                .withUpperBound(UPPER)
                .withResolver("my_resolver")
                .withQueryTags(List.of("prod", "priority"))
                .withStoreOffline(true)
                .withAllowEmptyTiles(true)
                .withExact(true)
                .withEnableProfiling(true)
                .withResourceGroup("batch-rg"));

        var planParams = service.planRequests.get(0).getParams();
        assertEquals(List.of("user.spend_by_merchant_1d"), planParams.getFeaturesList());
        assertEquals("my_resolver", planParams.getResolver());
        assertEquals(List.of("prod", "priority"), planParams.getTagsList());
        assertTrue(planParams.getExact());

        assertEquals(2, service.createRequests.size());

        CreateAggregateBackfillJobRequest first = service.createRequests.get(0);
        assertEquals(List.of("user.spend_by_merchant_1d", "user.spend_by_merchant_7d"), first.getFeaturesList());
        assertEquals("resolver_a", first.getResolver());
        assertEquals("events.ts", first.getBucketFeature());
        assertTrue(first.getEnableProfiling());
        assertEquals(AGG_BACKFILL_ID, first.getAggregateBackfillId());
        assertEquals("batch-rg", first.getResourceGroup());
        assertEquals(List.of("prod", "priority"), first.getQueryTagsList());
        assertTrue(first.hasStoreOffline());
        assertTrue(first.getStoreOffline());
        assertTrue(first.hasAllowEmptyTiles());
        assertTrue(first.getAllowEmptyTiles());
        assertEquals(seconds(LOWER), first.getLowerBound().getSeconds());
        assertEquals(seconds(UPPER), first.getUpperBound().getSeconds());

        CreateAggregateBackfillJobRequest second = service.createRequests.get(1);
        assertEquals(List.of("user.session_count_1d"), second.getFeaturesList());
        assertEquals("resolver_b", second.getResolver());
        assertEquals("sessions.ts", second.getBucketFeature());
        assertFalse(second.hasLowerBound());
        assertFalse(second.hasUpperBound());

        // The caller sees the same model regardless of which path served the request.
        assertNotNull(response.getJob());
        assertEquals(AGG_BACKFILL_ID, response.getJob().getId());
        assertEquals(2, response.getSubBackfills().size());
    }

    @Test
    public void testLegacyFallbackCarriesAllowEmptyTilesCoercion() throws Exception {
        service.actAsLegacyServer();

        trigger(params());

        CreateAggregateBackfillJobRequest req = service.createRequests.get(0);
        assertTrue(req.hasAllowEmptyTiles());
        assertFalse(req.getAllowEmptyTiles());
    }

    @Test
    public void testLegacyFallbackReadsTheJobRowBack() throws Exception {
        service.actAsLegacyServer();
        service.getResponse = GetAggregateBackfillJobResponse.newBuilder()
                .setJob(AggregateBackfillJob.newBuilder()
                        .setId(AGG_BACKFILL_ID)
                        .addFeatures("user.spend_by_merchant_1d")
                        .addResolvers("aggregate_resolver")
                        .setStatus(ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillStatus.AGGREGATE_BACKFILL_STATUS_WORKING))
                .build();

        AggregateBackfillResponse response = trigger(params());

        assertEquals(AGG_BACKFILL_ID, service.getRequests.get(0).getAggregateBackfillId());
        assertEquals(AggregateBackfillStatus.WORKING, response.getJob().getStatus());
        assertEquals(List.of("aggregate_resolver"), response.getJob().getResolvers());
    }

    /**
     * The V1 handler concatenates features across the per-job inserts without
     * deduplicating, where V2 writes a deduplicated set. Both paths must agree.
     */
    @Test
    public void testLegacyFallbackDedupesAccumulatedFeatures() throws Exception {
        service.actAsLegacyServer();
        service.getResponse = GetAggregateBackfillJobResponse.newBuilder()
                .setJob(AggregateBackfillJob.newBuilder()
                        .setId(AGG_BACKFILL_ID)
                        .addAllFeatures(List.of("user.spend_1d", "user.spend_7d", "user.spend_1d"))
                        .addAllResolvers(List.of("resolver_a", "resolver_a")))
                .build();

        AggregateBackfillResponse response = trigger(AggregateBackfillParams.builder().withFeatures("user.spend_1d"));

        assertEquals(List.of("user.spend_1d", "user.spend_7d"), response.getJob().getFeatures());
        assertEquals(List.of("resolver_a"), response.getJob().getResolvers());
    }

    /** The jobs are already running, so a failed read must not fail the call. */
    @Test
    public void testLegacyFallbackSurvivesAFailedReadBack() throws Exception {
        service.actAsLegacyServer();
        service.getError = Status.NOT_FOUND.withDescription("gone");
        service.defaultCreateResponse = CreateAggregateBackfillJobResponse.newBuilder()
                .setJobId("job-1")
                .addFeatures("user.spend_by_merchant_1d")
                .build();

        AggregateBackfillResponse response = trigger(params());

        assertEquals(AGG_BACKFILL_ID, response.getJob().getId());
        assertEquals(List.of("user.spend_by_merchant_1d"), response.getJob().getFeatures());
        assertEquals(List.of("aggregate_resolver"), response.getJob().getResolvers());
        // The jobs did launch, so the reconstructed row says so rather than leaving the
        // status at the proto default, which would decode to UNKNOWN.
        assertEquals(AggregateBackfillStatus.QUEUED, response.getJob().getStatus());
        assertEquals(1, response.getSubBackfills().size());
    }

    /** An unset `job` reads back as an empty message, which must not be mistaken for a row. */
    @Test
    public void testLegacyFallbackHandlesAReadBackWithNoJob() throws Exception {
        service.actAsLegacyServer();
        service.getResponse = GetAggregateBackfillJobResponse.getDefaultInstance();
        service.defaultCreateResponse = CreateAggregateBackfillJobResponse.newBuilder()
                .setJobId("job-1")
                .addFeatures("user.spend_by_merchant_1d")
                .build();

        AggregateBackfillResponse response = trigger(params());

        assertEquals(AGG_BACKFILL_ID, response.getJob().getId());
        assertEquals(List.of("user.spend_by_merchant_1d"), response.getJob().getFeatures());
    }

    @Test
    public void testLegacyFallbackRaisesForPlanErrors() {
        service.actAsLegacyServer();
        service.planResponse = planResponse(defaultBackfills(), List.of("invalid feature"));

        var e = assertThrows(AggregateBackfillException.class, () -> trigger(params()));
        assertTrue(e.getMessage().startsWith("Failed to plan aggregate backfill."));
        assertEquals("invalid feature", e.getDetail());
        assertTrue(service.createRequests.isEmpty());
    }

    @Test
    public void testLegacyFallbackRaisesForCreateErrors() {
        service.actAsLegacyServer();
        service.defaultCreateResponse = CreateAggregateBackfillJobResponse.newBuilder()
                .addErrors(ChalkError.newBuilder().setMessage("job failed"))
                .build();

        var e = assertThrows(AggregateBackfillException.class, () -> trigger(params()));
        assertTrue(e.getMessage().startsWith("Failed to create aggregate backfill job."));
        assertEquals(1, e.getErrors().size());
        assertEquals("job failed", e.getErrors().get(0).getMessage());
    }
}
