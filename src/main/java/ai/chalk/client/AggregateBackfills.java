package ai.chalk.client;

import ai.chalk.exceptions.AggregateBackfillException;
import ai.chalk.exceptions.ChalkException;
import ai.chalk.exceptions.ClientException;
import ai.chalk.exceptions.ServerError;
import ai.chalk.models.AggregateBackfillParams;
import ai.chalk.models.AggregateBackfillResponse;
import ai.chalk.protos.chalk.aggregate.v1.AggregateBackfill;
import ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillJob;
import ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillMode;
import ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillStatus;
import ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillUserParams;
import ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillWithCostEstimate;
import ai.chalk.protos.chalk.aggregate.v1.AggregateServiceGrpc;
import ai.chalk.protos.chalk.aggregate.v1.CreateAggregateBackfillJobRequest;
import ai.chalk.protos.chalk.aggregate.v1.CreateAggregateBackfillJobResponse;
import ai.chalk.protos.chalk.aggregate.v1.CreateAggregateBackfillV2Request;
import ai.chalk.protos.chalk.aggregate.v1.CreateAggregateBackfillV2Response;
import ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobRequest;
import ai.chalk.protos.chalk.aggregate.v1.GetAggregateBackfillJobResponse;
import ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillRequest;
import ai.chalk.protos.chalk.aggregate.v1.PlanAggregateBackfillResponse;
import io.grpc.Status;
import io.grpc.StatusRuntimeException;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/**
 * Triggers aggregate backfills against the API server's AggregateService. Mirrors
 * {@code ChalkGRPCClient.trigger_aggregate_backfill} in the Python client.
 *
 * <p> A single CreateAggregateBackfillV2 call plans and creates every job server-side.
 * Servers that predate that RPC answer UNIMPLEMENTED, and the client falls back to
 * planning and creating one job per sub-backfill itself. Both paths decode into the same
 * {@link AggregateBackfillResponse}, so callers see one type regardless of server version.
 */
final class AggregateBackfills {
    private static final System.Logger logger = System.getLogger(AggregateBackfills.class.getName());

    private AggregateBackfills() {}

    static AggregateBackfillResponse trigger(
            AggregateServiceGrpc.AggregateServiceBlockingStub stub,
            AggregateBackfillParams params
    ) throws ChalkException {
        validate(params);

        CreateAggregateBackfillV2Request request = buildV2Request(params);
        CreateAggregateBackfillV2Response response = createV2(stub, request);
        if (response != null) {
            return AggregateBackfillConverter.responseDecode(response);
        }

        // The server predates CreateAggregateBackfillV2. Plan mode has no behavior to
        // preserve on such servers, so it fails rather than degrading.
        if (params.isPlanOnly()) {
            throw new ClientException(
                    "This Chalk server does not support plan-only aggregate backfills. Upgrade your "
                            + "Chalk server, or omit planOnly to run the backfill."
            );
        }
        // Same for sharding: a server this old would silently run one unsharded job, which
        // defeats the reason to pass numShards (avoiding OOM), so fail instead.
        if (params.getNumShards() != null) {
            throw new ClientException(
                    "This Chalk server does not support sharded aggregate backfills. Upgrade your "
                            + "Chalk server, or omit numShards to run the backfill as a single job."
            );
        }
        logger.log(
                System.Logger.Level.WARNING,
                "This Chalk server does not support server-side aggregate backfill planning. "
                        + "Falling back to client-side planning."
        );
        return triggerLegacy(stub, params, request.getAllowEmptyTiles());
    }

    static void validate(AggregateBackfillParams params) throws ClientException {
        if (params.getFeatures() == null) {
            throw new ClientException("features is required to trigger an aggregate backfill.");
        }
        if (Boolean.TRUE.equals(params.getStoreOffline())
                && (params.getLowerBound() == null || params.getUpperBound() == null)) {
            throw new ClientException(
                    "When storeOffline is true, both lowerBound and upperBound must be specified."
            );
        }
        if (params.getNumShards() != null && params.getNumShards() <= 1) {
            throw new ClientException(
                    "numShards must be > 1 when provided; omit it to run the backfill as a single job."
            );
        }
    }

    static CreateAggregateBackfillV2Request buildV2Request(AggregateBackfillParams params) {
        var request = CreateAggregateBackfillV2Request.newBuilder()
                .addAllFeatures(params.getFeatures())
                .setExact(params.isExact())
                .setEnableProfiling(params.isEnableProfiling())
                .setMode(
                        params.isPlanOnly()
                                ? AggregateBackfillMode.AGGREGATE_BACKFILL_MODE_PLAN
                                : AggregateBackfillMode.AGGREGATE_BACKFILL_MODE_CREATE
                );
        if (params.getQueryTags() != null) {
            request.addAllTags(params.getQueryTags());
        }
        if (params.getLowerBound() != null) {
            request.setLowerBound(AggregateBackfillConverter.timestampEncode(params.getLowerBound()));
        }
        if (params.getUpperBound() != null) {
            request.setUpperBound(AggregateBackfillConverter.timestampEncode(params.getUpperBound()));
        }
        if (params.getResolver() != null) {
            request.setResolver(params.getResolver());
        }
        if (params.getInputSql() != null) {
            request.setInputSql(params.getInputSql());
        }
        if (params.getStoreOffline() != null) {
            request.setStoreOffline(params.getStoreOffline());
        }
        if (params.getResourceGroup() != null) {
            request.setResourceGroup(params.getResourceGroup());
        }
        if (params.getNumShards() != null) {
            request.setNumShards(params.getNumShards());
        }
        // The server rejects allow_empty_tiles without an offline target, and this parameter
        // defaults to true, so every default call would fail validation if it were sent
        // verbatim. The flag has no effect off the offline path anyway.
        request.setAllowEmptyTiles(
                params.isAllowEmptyTiles() && Boolean.TRUE.equals(params.getStoreOffline())
        );
        return request.build();
    }

    /*
     * Calls CreateAggregateBackfillV2, returning null if the server predates it.
     *
     * Only the RPC itself is guarded, so an UNIMPLEMENTED raised by anything else is never
     * mistaken for version skew.
     */
    private static @Nullable CreateAggregateBackfillV2Response createV2(
            AggregateServiceGrpc.AggregateServiceBlockingStub stub,
            CreateAggregateBackfillV2Request request
    ) throws AggregateBackfillException {
        try {
            return stub.createAggregateBackfillV2(request);
        } catch (StatusRuntimeException e) {
            Status.Code code = e.getStatus().getCode();
            if (code == Status.Code.UNIMPLEMENTED) {
                return null;
            }
            if (code == Status.Code.INVALID_ARGUMENT) {
                // Both modes run the same validation and neither creates anything when it
                // fails, so name the operation the caller actually asked for.
                throw new AggregateBackfillException(
                        request.getMode() == AggregateBackfillMode.AGGREGATE_BACKFILL_MODE_PLAN
                                ? "Failed to plan aggregate backfill."
                                : "Failed to create aggregate backfill. No jobs were created.",
                        e.getStatus().getDescription(),
                        List.of(),
                        e
                );
            }
            if (code == Status.Code.INTERNAL) {
                // Includes the partial-launch case, where some jobs did start. The server's
                // detail says how many, so it has to reach the caller.
                throw new AggregateBackfillException(
                        "Failed to create aggregate backfill jobs.",
                        e.getStatus().getDescription(),
                        List.of(),
                        e
                );
            }
            throw e;
        }
    }

    /*
     * Plans and creates one job per sub-backfill, for servers without V2.
     *
     * Returns the same AggregateBackfillResponse the V2 path does. The per-sub-backfill
     * responses are used only to check for errors and to reconstruct the job row if it
     * cannot be read back.
     */
    private static AggregateBackfillResponse triggerLegacy(
            AggregateServiceGrpc.AggregateServiceBlockingStub stub,
            AggregateBackfillParams params,
            boolean allowEmptyTiles
    ) throws AggregateBackfillException {
        List<String> queryTags = params.getQueryTags() == null ? List.of() : params.getQueryTags();

        var userParams = AggregateBackfillUserParams.newBuilder()
                .addAllFeatures(params.getFeatures())
                .setExact(params.isExact())
                .addAllTags(queryTags);
        if (params.getLowerBound() != null) {
            userParams.setLowerBound(AggregateBackfillConverter.timestampEncode(params.getLowerBound()));
        }
        if (params.getUpperBound() != null) {
            userParams.setUpperBound(AggregateBackfillConverter.timestampEncode(params.getUpperBound()));
        }
        if (params.getResolver() != null) {
            userParams.setResolver(params.getResolver());
        }
        if (params.getInputSql() != null) {
            userParams.setInputSql(params.getInputSql());
        }

        PlanAggregateBackfillResponse planResponse = stub.planAggregateBackfill(
                PlanAggregateBackfillRequest.newBuilder().setParams(userParams).build()
        );
        if (planResponse.getErrorsCount() > 0) {
            throw new AggregateBackfillException(
                    "Failed to plan aggregate backfill.",
                    String.join("\n", planResponse.getErrorsList())
            );
        }

        String aggregateBackfillId = planResponse.getAggregateBackfillId();
        List<CreateAggregateBackfillJobResponse> createResponses = new ArrayList<>();
        for (AggregateBackfillWithCostEstimate backfillWithEstimate : planResponse.getBackfillsList()) {
            AggregateBackfill backfill = backfillWithEstimate.getBackfill();
            var createRequest = CreateAggregateBackfillJobRequest.newBuilder()
                    .addAllFeatures(AggregateBackfillConverter.dependentFeatures(backfill))
                    .setBucketFeature(backfill.getDatetimeFeature())
                    .setEnableProfiling(params.isEnableProfiling())
                    .setAggregateBackfillId(aggregateBackfillId)
                    .addAllQueryTags(queryTags)
                    .setAllowEmptyTiles(allowEmptyTiles);
            if (!backfill.getResolver().isEmpty()) {
                createRequest.setResolver(backfill.getResolver());
            }
            if (backfill.hasInputSql()) {
                createRequest.setInputSql(backfill.getInputSql());
            }
            if (backfill.hasLowerBound()) {
                createRequest.setLowerBound(backfill.getLowerBound());
            }
            if (backfill.hasUpperBound()) {
                createRequest.setUpperBound(backfill.getUpperBound());
            }
            if (params.getStoreOffline() != null) {
                createRequest.setStoreOffline(params.getStoreOffline());
            }
            if (params.getResourceGroup() != null) {
                createRequest.setResourceGroup(params.getResourceGroup());
            }

            CreateAggregateBackfillJobResponse createResponse = stub.createAggregateBackfillJob(createRequest.build());
            if (createResponse.getErrorsCount() > 0) {
                List<ServerError> errors = new ArrayList<>();
                for (var error : createResponse.getErrorsList()) {
                    errors.add(GrpcSerializer.toServerError(error));
                }
                throw new AggregateBackfillException("Failed to create aggregate backfill job.", errors);
            }
            createResponses.add(createResponse);
        }

        AggregateBackfillJob job = null;
        try {
            GetAggregateBackfillJobResponse getResponse = stub.getAggregateBackfillJob(
                    GetAggregateBackfillJobRequest.newBuilder().setAggregateBackfillId(aggregateBackfillId).build()
            );
            // An unset `job` reads back as an empty message, which would otherwise be
            // returned as a job with no id.
            if (getResponse.hasJob()) {
                job = getResponse.getJob();
            }
        } catch (StatusRuntimeException e) {
            // The jobs are already running, so a failed read must not fail the call.
            logger.log(
                    System.Logger.Level.WARNING,
                    "Could not read back aggregate backfill " + aggregateBackfillId + ": " + e.getStatus(),
                    e
            );
        }

        if (job == null) {
            // The jobs did launch, so describe them rather than returning nothing. Only the
            // fields this path can know are set; the rest stay unset and decode to null.
            var reconstructed = AggregateBackfillJob.newBuilder()
                    .setId(aggregateBackfillId)
                    .setStatus(AggregateBackfillStatus.AGGREGATE_BACKFILL_STATUS_QUEUED)
                    .addAllQueryTags(queryTags);
            for (CreateAggregateBackfillJobResponse createResponse : createResponses) {
                reconstructed.addAllFeatures(createResponse.getFeaturesList());
            }
            for (AggregateBackfillWithCostEstimate backfillWithEstimate : planResponse.getBackfillsList()) {
                if (!backfillWithEstimate.getBackfill().getResolver().isEmpty()) {
                    reconstructed.addResolvers(backfillWithEstimate.getBackfill().getResolver());
                }
            }
            job = reconstructed.build();
        }

        // Decoding both branches through the converter is what makes the two server paths
        // agree: it is the single place features and resolvers are deduplicated.
        return new AggregateBackfillResponse(
                AggregateBackfillConverter.jobDecode(job),
                AggregateBackfillConverter.plansDecode(planResponse.getBackfillsList())
        );
    }
}
