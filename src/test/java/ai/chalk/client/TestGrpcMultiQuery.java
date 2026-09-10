package ai.chalk.client;

import ai.chalk.exceptions.ClientException;
import ai.chalk.internal.arrow.FeatherProcessor;
import ai.chalk.models.OnlineQueryMultiResult;
import ai.chalk.models.OnlineQueryParams;
import ai.chalk.models.OnlineQueryParamsComplete;
import ai.chalk.models.OnlineQueryResult;
import ai.chalk.protos.chalk.common.v1.ChalkError;
import ai.chalk.protos.chalk.common.v1.ErrorCode;
import ai.chalk.protos.chalk.common.v1.ErrorCodeCategory;
import ai.chalk.protos.chalk.common.v1.FeatherBodyType;
import ai.chalk.protos.chalk.common.v1.GenericSingleResponse;
import ai.chalk.protos.chalk.common.v1.OnlineQueryBulkResponse;
import ai.chalk.protos.chalk.common.v1.OnlineQueryMetadata;
import ai.chalk.protos.chalk.common.v1.OnlineQueryMultiResponse;
import ai.chalk.protos.chalk.common.v1.OnlineQueryResponse;
import com.google.protobuf.ByteString;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Offline tests for the gRPC multi-query request builders and response decoders.
 * These exercise the pure helpers in {@link GRPCClient} without a live engine.
 *
 * <p> Every test inherits {@link AllocatorTest}'s teardown, which closes the root
 * allocator and therefore fails any case that leaked Arrow memory.
 */
public class TestGrpcMultiQuery extends AllocatorTest {

    private static final String TRACE_ID = "trace-abc";

    // ---------------------------------------------------------------- helpers

    private static OnlineQueryParamsComplete params(String queryName) {
        var builder = OnlineQueryParams.builder()
                .withInput("user.id", List.of(1, 2, 3))
                .withOutputs("user.socure_score");
        if (queryName != null) {
            builder = builder.withQueryName(queryName);
        }
        return builder.build();
    }

    private static OnlineQueryParamsComplete simpleParams() {
        return params(null);
    }

    /** Real Arrow IPC bytes for a one-column table with {@code rowCount} rows. */
    private byte[] scalarBytes(int rowCount) throws Exception {
        List<Integer> ids = new ArrayList<>();
        for (int i = 0; i < rowCount; i++) {
            ids.add(i);
        }
        Map<String, List<?>> inputs = new HashMap<>();
        inputs.put("user.id", ids);
        return FeatherProcessor.inputsToArrowBytes(inputs, this.allocator);
    }

    private OnlineQueryBulkResponse bulkResponse(int rowCount) throws Exception {
        return OnlineQueryBulkResponse.newBuilder()
                .setScalarsData(ByteString.copyFrom(scalarBytes(rowCount)))
                .setResponseMeta(OnlineQueryMetadata.newBuilder().setQueryId("q-" + rowCount).build())
                .build();
    }

    private static GenericSingleResponse wrap(OnlineQueryBulkResponse bulk) {
        return GenericSingleResponse.newBuilder().setBulkResponse(bulk).build();
    }

    private static ChalkError error(String message) {
        return ChalkError.newBuilder()
                .setCode(ErrorCode.ERROR_CODE_RESOLVER_FAILED)
                .setCategory(ErrorCodeCategory.ERROR_CODE_CATEGORY_REQUEST)
                .setMessage(message)
                .build();
    }

    // ------------------------------------------------------- request building

    @Test
    public void testBuildBulkRequestGolden() throws Exception {
        var now = List.of(ZonedDateTime.now(), ZonedDateTime.now().minusDays(1));
        Map<String, Object> plannerOptions = new HashMap<>();
        plannerOptions.put("planner_version", "2");
        OnlineQueryParamsComplete p = OnlineQueryParams.builder()
                .withInput("user.id", List.of(1, 2, 3))
                .withOutputs("user.socure_score", "user.email")
                .withTags(List.of("tag1", "tag2"))
                .withRequiredResolverTags(List.of("rrt1"))
                .withMeta(Map.of("metaKey", "metaValue"))
                .withCorrelationId("corr-1")
                .withPreviewDeploymentId("preview-1")
                .withEnvironmentId("env-1")
                .withQueryName("my_query")
                .withQueryNameVersion("2")
                .withNow(now)
                .withPlannerOptions(plannerOptions)
                .withIncludeMeta(true)
                .build();

        byte[] feather = FeatherProcessor.inputsToArrowBytes(p.getInputs(), this.allocator);
        var request = GRPCClient.buildBulkRequest(p, feather, null);

        assertEquals(FeatherBodyType.FEATHER_BODY_TYPE_TABLE, request.getBodyType());
        assertEquals(ByteString.copyFrom(feather), request.getInputsFeather());

        assertEquals(2, request.getOutputsCount());
        assertEquals("user.socure_score", request.getOutputs(0).getFeatureFqn());
        assertEquals("user.email", request.getOutputs(1).getFeatureFqn());

        assertEquals(2, request.getNowCount());
        assertEquals(now.get(0).toEpochSecond(), request.getNow(0).getSeconds());
        assertEquals(now.get(0).getNano(), request.getNow(0).getNanos());

        var context = request.getContext();
        assertEquals(List.of("tag1", "tag2"), context.getTagsList());
        assertEquals(List.of("rrt1"), context.getRequiredResolverTagsList());
        assertEquals("corr-1", context.getCorrelationId());
        assertEquals("preview-1", context.getDeploymentId());
        assertEquals("env-1", context.getEnvironment());
        assertEquals("my_query", context.getQueryName());
        assertEquals("2", context.getQueryNameVersion());
        assertEquals("2", context.getOptionsOrThrow("planner_version").getStringValue());

        var options = request.getResponseOptions();
        assertTrue(options.getIncludeMeta());
        assertTrue(options.getEncodingOptions().getEncodeStructsAsObjects());
        assertEquals("metaValue", options.getMetadataOrThrow("metaKey"));
    }

    @Test
    public void testBuildBulkRequestExplainForcesIncludeMeta() throws Exception {
        OnlineQueryParamsComplete p = OnlineQueryParams.builder()
                .withInput("user.id", List.of(1))
                .withOutputs("user.socure_score")
                .withExplain(true)
                .build();

        byte[] feather = FeatherProcessor.inputsToArrowBytes(p.getInputs(), this.allocator);
        var request = GRPCClient.buildBulkRequest(p, feather, null);

        assertTrue(request.getResponseOptions().getIncludeMeta());
        assertTrue(request.getResponseOptions().hasExplain());
    }

    @Test
    public void testBuildBulkRequestBranchFallback() throws Exception {
        byte[] feather = FeatherProcessor.inputsToArrowBytes(
                simpleParams().getInputs(), this.allocator);

        OnlineQueryParamsComplete withBranch = OnlineQueryParams.builder()
                .withInput("user.id", List.of(1))
                .withOutputs("user.socure_score")
                .withBranch("params-branch")
                .build();

        // params branch wins over the client branch
        assertEquals(
                "params-branch",
                GRPCClient.buildBulkRequest(withBranch, feather, "client-branch").getContext().getBranchId());
        // client branch is used when the params do not set one
        assertEquals(
                "client-branch",
                GRPCClient.buildBulkRequest(simpleParams(), feather, "client-branch").getContext().getBranchId());
        // neither set
        assertEquals(
                "",
                GRPCClient.buildBulkRequest(simpleParams(), feather, null).getContext().getBranchId());
    }

    @Test
    public void testBuildMultiRequestPreservesOrderAndUsesBulk() throws Exception {
        OnlineQueryParamsComplete a = OnlineQueryParams.builder()
                .withInput("user.id", List.of(1))
                .withOutputs("user.socure_score")
                .build();
        OnlineQueryParamsComplete b = OnlineQueryParams.builder()
                .withInput("merchant.id", List.of("m1", "m2"))
                .withOutputs("merchant.risk_score")
                .build();

        var request = GRPCClient.buildMultiRequest(List.of(a, b), this.allocator, null);

        assertEquals(2, request.getQueriesCount());
        assertTrue(request.getQueries(0).hasBulkRequest());
        assertTrue(request.getQueries(1).hasBulkRequest());

        // Order is preserved: each sub-request matches the params at the same index.
        assertEquals(
                "user.socure_score",
                request.getQueries(0).getBulkRequest().getOutputs(0).getFeatureFqn());
        assertEquals(
                "merchant.risk_score",
                request.getQueries(1).getBulkRequest().getOutputs(0).getFeatureFqn());
    }

    // ------------------------------------------------------- settings resolvers

    private static OnlineQueryParamsComplete paramsWithTimeout(Duration timeout) {
        return OnlineQueryParams.builder()
                .withInput("user.id", List.of(1))
                .withOutputs("user.socure_score")
                .withTimeout(timeout)
                .build();
    }

    @Test
    public void testResolveDeadlineTakesTheLongest() {
        var noClientTimeout = Optional.<Duration>empty();

        // nothing set anywhere -> no deadline
        assertTrue(GRPCClient.resolveDeadline(
                List.of(simpleParams(), simpleParams()), noClientTimeout).isEmpty());

        var shortTimeout = paramsWithTimeout(Duration.ofSeconds(1));
        var longTimeout = paramsWithTimeout(Duration.ofSeconds(30));

        assertEquals(
                Duration.ofSeconds(30),
                GRPCClient.resolveDeadline(List.of(shortTimeout, longTimeout), noClientTimeout)
                        .orElseThrow());
    }

    /**
     * A query that sets no timeout is bounded by the client-level timeout, so that is
     * its effective timeout. Ignoring it would let one query's short timeout cut short
     * a query that was relying on a longer client default.
     */
    @Test
    public void testResolveDeadlineHonoursClientLevelTimeout() {
        var fast = paramsWithTimeout(Duration.ofSeconds(1));
        var clientTimeout = Optional.of(Duration.ofMinutes(5));

        // `fast` wants 1s, the unset one is entitled to the client's 5m -> 5m wins
        assertEquals(
                Duration.ofMinutes(5),
                GRPCClient.resolveDeadline(List.of(fast, simpleParams()), clientTimeout).orElseThrow());

        // every query explicit -> the client default is irrelevant
        assertEquals(
                Duration.ofSeconds(30),
                GRPCClient.resolveDeadline(
                        List.of(fast, paramsWithTimeout(Duration.ofSeconds(30))), clientTimeout)
                        .orElseThrow());

        // an unset query with no client timeout is unbounded, so the request cannot
        // carry a deadline at all
        assertTrue(GRPCClient.resolveDeadline(
                List.of(fast, simpleParams()), Optional.empty()).isEmpty());
    }

    @Test
    public void testResolveQueryNameRequiresAgreement() throws Exception {
        assertEquals("same", GRPCClient.resolveQueryName(List.of(params("same"), params("same"))));
        assertNull(GRPCClient.resolveQueryName(List.of(simpleParams(), simpleParams())));

        var conflict = assertThrows(
                ClientException.class,
                () -> GRPCClient.resolveQueryName(List.of(params("a"), params("b"))));
        assertTrue(conflict.getMessage().contains("queryName"));
        assertTrue(conflict.getMessage().contains("index 1"));

        // an unset name conflicts with a set one, because the header is per-request
        assertThrows(
                ClientException.class,
                () -> GRPCClient.resolveQueryName(List.of(params("a"), simpleParams())));
    }

    @Test
    public void testResolveEnvironmentRequiresAgreement() throws Exception {
        OnlineQueryParamsComplete envA = OnlineQueryParams.builder()
                .withInput("user.id", List.of(1))
                .withOutputs("user.socure_score")
                .withEnvironmentId("env-a")
                .build();
        OnlineQueryParamsComplete envB = OnlineQueryParams.builder()
                .withInput("user.id", List.of(1))
                .withOutputs("user.socure_score")
                .withEnvironmentId("env-b")
                .build();

        assertEquals("env-a", GRPCClient.resolveEnvironment(List.of(envA, envA), null));

        var conflict = assertThrows(
                ClientException.class,
                () -> GRPCClient.resolveEnvironment(List.of(envA, envB), null));
        assertTrue(conflict.getMessage().contains("environmentId"));
        assertTrue(conflict.getMessage().contains("'env-a'"));
        assertTrue(conflict.getMessage().contains("'env-b'"));

        // An unset environmentId means the client's environment, so naming that same
        // environment explicitly on one query is not a conflict.
        assertEquals(
                "env-a",
                GRPCClient.resolveEnvironment(List.of(envA, simpleParams()), "env-a"));
        assertThrows(
                ClientException.class,
                () -> GRPCClient.resolveEnvironment(List.of(envA, simpleParams()), "env-other"));
    }

    /**
     * The version rides along in each sub-request's own context and has no header of
     * its own, so queries that differ only by version are satisfiable.
     */
    @Test
    public void testResolveQueryNameAllowsDifferingVersions() throws Exception {
        OnlineQueryParamsComplete v1 = OnlineQueryParams.builder()
                .withInput("user.id", List.of(1))
                .withOutputs("user.socure_score")
                .withQueryName("same")
                .withQueryNameVersion("1")
                .build();
        OnlineQueryParamsComplete v2 = OnlineQueryParams.builder()
                .withInput("user.id", List.of(1))
                .withOutputs("user.socure_score")
                .withQueryName("same")
                .withQueryNameVersion("2")
                .build();

        assertEquals("same", GRPCClient.resolveQueryName(List.of(v1, v2)));
    }

    @Test
    public void testResolveBranchUsesEffectiveValue() throws Exception {
        OnlineQueryParamsComplete branchA = OnlineQueryParams.builder()
                .withInput("user.id", List.of(1))
                .withOutputs("user.socure_score")
                .withBranch("a")
                .build();

        // the client-level branch fills in for the query that does not set one
        assertEquals("a", GRPCClient.resolveBranch(List.of(branchA, simpleParams()), "a"));
        // and a per-query branch that disagrees with it is rejected
        assertThrows(
                ClientException.class,
                () -> GRPCClient.resolveBranch(List.of(branchA, simpleParams()), "other"));
    }

    // -------------------------------------------------------------- validation

    @Test
    public void testValidateMultiParams() {
        assertThrows(ClientException.class, () -> GRPCClient.validateMultiParams(null));

        List<OnlineQueryParamsComplete> withNull = new ArrayList<>();
        withNull.add(simpleParams());
        withNull.add(null);
        var nullError = assertThrows(
                ClientException.class, () -> GRPCClient.validateMultiParams(withNull));
        assertTrue(nullError.getMessage().contains("index 1"));

        OnlineQueryParamsComplete versionWithoutName = OnlineQueryParams.builder()
                .withInput("user.id", List.of(1))
                .withOutputs("user.socure_score")
                .withQueryNameVersion("3")
                .build();
        var versionError = assertThrows(
                ClientException.class,
                () -> GRPCClient.validateMultiParams(List.of(simpleParams(), versionWithoutName)));
        assertTrue(versionError.getMessage().contains("queryNameVersion"));
        assertTrue(versionError.getMessage().contains("index 1"));
    }

    // ---------------------------------------------------------- response decode

    @Test
    public void testDecodeMultiResponseHappyPath() throws Exception {
        var response = OnlineQueryMultiResponse.newBuilder()
                .addResponses(wrap(bulkResponse(3)))
                .addResponses(wrap(bulkResponse(5)))
                .build();

        try (OnlineQueryMultiResult multi =
                     GRPCClient.decodeMultiResponse(response, 2, TRACE_ID, this.allocator)) {
            assertEquals(2, multi.getResults().size());
            assertEquals(0, multi.getGlobalErrors().length);
            assertEquals(TRACE_ID, multi.getTraceId());

            // positional: the 3-row response first, then the 5-row one
            assertEquals(3, multi.getResults().get(0).getScalarsTable().getRowCount());
            assertEquals(5, multi.getResults().get(1).getScalarsTable().getRowCount());

            // the trace id is copied onto every sub-result
            assertEquals(TRACE_ID, multi.getResults().get(0).getMeta().getTraceId());
            assertEquals(TRACE_ID, multi.getResults().get(1).getMeta().getTraceId());

            // each sub-result owns a distinct allocator, so closing one cannot
            // release the buffers of another
            assertNotSame(
                    multi.getResults().get(0).getAllocator(),
                    multi.getResults().get(1).getAllocator());
        }

        // closing the wrapper released everything
        assertEquals(0, this.allocator.getAllocatedMemory());
    }

    @Test
    public void testDecodeMultiResponseCarriesPerQueryErrors() throws Exception {
        var failing = OnlineQueryBulkResponse.newBuilder()
                .addErrors(error("resolver exploded"))
                .build();
        var response = OnlineQueryMultiResponse.newBuilder()
                .addResponses(wrap(bulkResponse(2)))
                .addResponses(wrap(failing))
                .build();

        try (OnlineQueryMultiResult multi =
                     GRPCClient.decodeMultiResponse(response, 2, TRACE_ID, this.allocator)) {
            // the batch as a whole succeeded
            assertEquals(0, multi.getGlobalErrors().length);
            // query 0 is unaffected by query 1's failure
            assertEquals(0, multi.getResults().get(0).getErrors().length);
            assertEquals(2, multi.getResults().get(0).getScalarsTable().getRowCount());
            // query 1 carries its own error
            assertEquals(1, multi.getResults().get(1).getErrors().length);
            assertEquals("resolver exploded", multi.getResults().get(1).getErrors()[0].getMessage());
        }
        assertEquals(0, this.allocator.getAllocatedMemory());
    }

    @Test
    public void testDecodeMultiResponseGlobalErrorsWithNoResponses() throws Exception {
        var response = OnlineQueryMultiResponse.newBuilder()
                .addErrors(error("planner blew up"))
                .build();

        try (OnlineQueryMultiResult multi =
                     GRPCClient.decodeMultiResponse(response, 2, TRACE_ID, this.allocator)) {
            assertTrue(multi.getResults().isEmpty());
            assertEquals(1, multi.getGlobalErrors().length);
            assertEquals("planner blew up", multi.getGlobalErrors()[0].getMessage());
            assertEquals(TRACE_ID, multi.getTraceId());
        }
        assertEquals(0, this.allocator.getAllocatedMemory());
    }

    /**
     * The shape the engine produces when a sub-query fails to execute at all: every
     * slot is present, the failed one is an empty bulk response carrying no errors of
     * its own, and the reason is a global error naming the query by position. The
     * empty result must not be mistaken for a successful one.
     */
    @Test
    public void testDecodeMultiResponseExecutionFailureIsGlobalWithEmptySlot() throws Exception {
        var response = OnlineQueryMultiResponse.newBuilder()
                .addResponses(wrap(bulkResponse(2)))
                .addResponses(wrap(OnlineQueryBulkResponse.newBuilder().build()))
                .addErrors(error("Encountered an error occurred while executing query 2/2: rate limited"))
                .build();

        try (OnlineQueryMultiResult multi =
                     GRPCClient.decodeMultiResponse(response, 2, TRACE_ID, this.allocator)) {
            // positional alignment is preserved
            assertEquals(2, multi.getResults().size());

            assertEquals(2, multi.getResults().get(0).getScalarsTable().getRowCount());
            assertEquals(0, multi.getResults().get(0).getErrors().length);

            // the failed sub-query's slot looks empty rather than failed ...
            assertNull(multi.getResults().get(1).getScalarsTable());
            assertEquals(0, multi.getResults().get(1).getErrors().length);

            // ... and the reason lives in the global errors, naming the query
            assertEquals(1, multi.getGlobalErrors().length);
            assertTrue(multi.getGlobalErrors()[0].getMessage().contains("query 2/2"));
        }
        assertEquals(0, this.allocator.getAllocatedMemory());
    }

    /**
     * Unmarshalling the empty slot left by a query that failed to execute must explain
     * itself rather than surfacing an opaque NPE from deep inside the Arrow reader.
     */
    @Test
    public void testUnmarshalEmptySlotExplainsItself() throws Exception {
        var response = OnlineQueryMultiResponse.newBuilder()
                .addResponses(wrap(OnlineQueryBulkResponse.newBuilder().build()))
                .addErrors(error("Encountered an error occurred while executing query 1/1: rate limited"))
                .build();

        try (OnlineQueryMultiResult multi =
                     GRPCClient.decodeMultiResponse(response, 1, TRACE_ID, this.allocator)) {
            OnlineQueryResult empty = multi.getResults().get(0);
            assertNull(empty.getScalarsTable());

            var thrown = assertThrows(
                    ClientException.class, () -> empty.unmarshal(TestGrpcMultiQueryUser.class));
            assertTrue(thrown.getMessage().contains("no scalar data"));
            assertTrue(thrown.getMessage().contains("getGlobalErrors()"));
        }
        assertEquals(0, this.allocator.getAllocatedMemory());
    }

    @Test
    public void testDecodeMultiResponseCountMismatch() throws Exception {
        var tooFew = OnlineQueryMultiResponse.newBuilder()
                .addResponses(wrap(bulkResponse(1)))
                .build();
        var tooFewError = assertThrows(
                ClientException.class,
                () -> GRPCClient.decodeMultiResponse(tooFew, 2, TRACE_ID, this.allocator));
        assertTrue(tooFewError.getMessage().contains("Expected 2 sub-responses"));
        assertEquals(0, this.allocator.getAllocatedMemory());

        var tooMany = OnlineQueryMultiResponse.newBuilder()
                .addResponses(wrap(bulkResponse(1)))
                .addResponses(wrap(bulkResponse(1)))
                .addResponses(wrap(bulkResponse(1)))
                .build();
        assertThrows(
                ClientException.class,
                () -> GRPCClient.decodeMultiResponse(tooMany, 2, TRACE_ID, this.allocator));
        assertEquals(0, this.allocator.getAllocatedMemory());
    }

    @Test
    public void testDecodeMultiResponseRejectsSingleResponse() throws Exception {
        var response = OnlineQueryMultiResponse.newBuilder()
                .addResponses(wrap(bulkResponse(1)))
                .addResponses(GenericSingleResponse.newBuilder()
                        .setSingleResponse(OnlineQueryResponse.newBuilder().build())
                        .build())
                .build();

        var error = assertThrows(
                ClientException.class,
                () -> GRPCClient.decodeMultiResponse(response, 2, TRACE_ID, this.allocator));
        assertTrue(error.getMessage().contains("index 1"));
        assertTrue(error.getMessage().contains("SINGLE_RESPONSE"));
        // the sub-result decoded at index 0 was released
        assertEquals(0, this.allocator.getAllocatedMemory());
    }

    @Test
    public void testDecodeMultiResponseRejectsUnsetOneof() throws Exception {
        var response = OnlineQueryMultiResponse.newBuilder()
                .addResponses(GenericSingleResponse.newBuilder().build())
                .build();

        var error = assertThrows(
                ClientException.class,
                () -> GRPCClient.decodeMultiResponse(response, 1, TRACE_ID, this.allocator));
        assertTrue(error.getMessage().contains("QUERY_NOT_SET"));
        assertEquals(0, this.allocator.getAllocatedMemory());
    }

    /**
     * A sub-response whose Arrow payload cannot be decoded must fail the batch
     * without leaking the results decoded before it. This is the case that the
     * old non-rethrowing decode path got wrong.
     */
    @Test
    public void testDecodeMultiResponseDecodeFailureLeaksNothing() throws Exception {
        var garbage = OnlineQueryBulkResponse.newBuilder()
                .setScalarsData(ByteString.copyFromUtf8("this is not arrow data"))
                .build();
        var response = OnlineQueryMultiResponse.newBuilder()
                .addResponses(wrap(bulkResponse(4)))
                .addResponses(wrap(garbage))
                .build();

        var error = assertThrows(
                ClientException.class,
                () -> GRPCClient.decodeMultiResponse(response, 2, TRACE_ID, this.allocator));
        assertTrue(error.getMessage().contains("index 1"));
        assertEquals(0, this.allocator.getAllocatedMemory());
    }

    @Test
    public void testDecodeBulkResponseReleasesAllocatorOnFailure() throws Exception {
        var garbage = OnlineQueryBulkResponse.newBuilder()
                .setScalarsData(ByteString.copyFromUtf8("not arrow"))
                .build();
        var childAllocator = this.allocator.newChildAllocator(
                "test_decode_failure", 0, FeatherProcessor.ALLOCATOR_SIZE_RESPONSE);

        assertThrows(
                ClientException.class,
                () -> GRPCClient.decodeBulkResponse(garbage, TRACE_ID, childAllocator));
        // decodeBulkResponse owns the allocator it is handed and must release it
        assertEquals(0, this.allocator.getAllocatedMemory());
    }

    // ------------------------------------------------------------ result wrapper

    @Test
    public void testMultiResultCloseIsIdempotent() throws Exception {
        var response = OnlineQueryMultiResponse.newBuilder()
                .addResponses(wrap(bulkResponse(2)))
                .build();

        OnlineQueryMultiResult multi =
                GRPCClient.decodeMultiResponse(response, 1, TRACE_ID, this.allocator);
        multi.close();
        multi.close();
        assertEquals(0, this.allocator.getAllocatedMemory());
    }

    @Test
    public void testMultiResultCloseClosesEveryResultDespiteFailure() {
        var failing = new OnlineQueryResult(null, Map.of(), null, null, null) {
            @Override
            public void close() {
                throw new IllegalStateException("boom");
            }
        };
        List<Boolean> closed = new ArrayList<>();
        var tracking = new OnlineQueryResult(null, Map.of(), null, null, null) {
            @Override
            public void close() {
                closed.add(true);
            }
        };

        var multi = new OnlineQueryMultiResult(List.of(failing, tracking), new ai.chalk.exceptions.ServerError[0], null);

        var thrown = assertThrows(IllegalStateException.class, multi::close);
        assertEquals("boom", thrown.getMessage());
        // the failure at index 0 did not stop index 1 from being closed
        assertEquals(1, closed.size());
    }
}
