package ai.chalk.client;

import ai.chalk.exceptions.ChalkException;
import ai.chalk.exceptions.ClientException;
import ai.chalk.exceptions.ServerError;
import ai.chalk.internal.Utils;
import ai.chalk.internal.arrow.FeatherProcessor;
import ai.chalk.internal.config.Loader;
import ai.chalk.internal.config.models.ProjectToken;
import ai.chalk.models.OnlineQueryMultiResult;
import ai.chalk.models.OnlineQueryParamsComplete;
import ai.chalk.models.OnlineQueryResult;
import ai.chalk.models.UploadFeaturesParams;
import ai.chalk.models.UploadFeaturesResult;
import ai.chalk.protos.chalk.common.v1.*;
import ai.chalk.protos.chalk.engine.v1.PingRequest;
import ai.chalk.protos.chalk.engine.v1.QueryServiceGrpc;
import ai.chalk.protos.chalk.server.v1.AuthServiceGrpc;
import ai.chalk.protos.chalk.server.v1.GetTokenResponse;
import com.google.protobuf.ByteString;
import com.google.protobuf.Timestamp;
import com.google.protobuf.Value;
import io.grpc.*;
import io.grpc.stub.MetadataUtils;
import lombok.NonNull;
import org.apache.arrow.memory.BufferAllocator;
import org.apache.arrow.memory.RootAllocator;
import org.apache.arrow.vector.table.Table;

import javax.annotation.Nullable;
import java.io.IOException;
import java.nio.file.Path;
import java.time.Duration;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

import static ai.chalk.internal.arrow.FeatherProcessor.inputsToArrowBytes;

public class GRPCClient implements ChalkClient, AutoCloseable {
    private static final Metadata.Key<String> CHALK_TRACE_ID_KEY = Metadata.Key.of("x-chalk-trace-id", Metadata.ASCII_STRING_MARSHALLER);
    private static final System.Logger logger = System.getLogger(GRPCClient.class.getName());
    private final RootAllocator allocator = new RootAllocator(FeatherProcessor.ALLOCATOR_SIZE_ROOT);

    private final String resolvedEnvironmentId;
    private final String branchId;
    private final Optional<Duration> timeout;

    private final StubsProvider stubsProvider;

    private final ManagedChannel unauthServerChannel;
    private final ManagedChannel engineChannel;

    public GRPCClient() throws ChalkException {
        this(new BuilderImpl());
    }

    public GRPCClient(BuilderImpl builder) throws ChalkException {
        ProjectToken chalkYamlConfig = new ProjectToken();
        String projectRoot;
        try {
            projectRoot = Loader.loadProjectDirectory();
            chalkYamlConfig = Loader.getChalkYamlConfig(projectRoot);
        } catch (Exception ignored) {
        }

        ResolvedConfig resolvedConfig = ResolvedConfig.fromBuilder(builder, chalkYamlConfig);
        if (resolvedConfig.clientId().value().isEmpty() || resolvedConfig.clientSecret().value().isEmpty()) {
            throw new IllegalArgumentException("Client ID and Client Secret are required");
        }

        String grpcHost = resolvedConfig.grpcHost();
        final ChannelCredentials channelCreds = getChannelCredentials(grpcHost, resolvedConfig);

        timeout = Optional.ofNullable(builder.getTimeout());
        unauthServerChannel = Grpc.newChannelBuilder(
            grpcHost,
            channelCreds
        )
        .maxInboundMessageSize(1024 * 1024 * 100)
        .intercept(
                new UnauthenticatedHeaderClientInterceptor(Map.of())
        ).build();
        TokenRefresher tokenRefresher = new TokenRefresher(
                resolvedConfig.clientId().value(),
                resolvedConfig.clientSecret().value(),
                AuthServiceGrpc.newBlockingStub(unauthServerChannel),
                this.timeout
        );

        GetTokenResponse token = tokenRefresher.getToken();
        String environmentId = resolvedConfig.environmentId().value();
        if (environmentId.isEmpty() && !token.getPrimaryEnvironment().isEmpty()) {
            environmentId = token.getPrimaryEnvironment();
        }

        if (environmentId.isEmpty()) {
            throw new IllegalArgumentException("Environment ID is required");
        }

        if (!token.containsEnvironmentIdToName(environmentId)) {
            List<String> environmentIds = new java.util.ArrayList<>();
            for (var entry : token.getEnvironmentIdToNameMap().entrySet()) {
                if (entry.getValue().equals(environmentId)) {
                    environmentIds.add(entry.getKey());
                }
            }
            if (environmentIds.isEmpty()) {
                throw new IllegalArgumentException("Environment name %s not found".formatted(environmentId));
            } else if (environmentIds.size() > 1) {
                throw new IllegalArgumentException("Environment name %s is ambiguous among %s".formatted(environmentId, environmentIds));
            }
            environmentId = environmentIds.get(0);
        }
        resolvedEnvironmentId = environmentId;
        branchId = builder.getBranch();

        String engineHost;
        if (builder.getQueryServerOverride() != null && !builder.getQueryServerOverride().isEmpty()) {
            engineHost = builder.getQueryServerOverride();
        } else {
            try {
                engineHost = token.getGrpcEnginesOrThrow(environmentId);
            } catch (Exception e) {
                throw new ClientException("Error getting engine URI for environment %s".formatted(environmentId), e);
            }
        }
        engineHost = engineHost.replaceFirst("^https?://", "");
        boolean queryThroughApiServer = engineHost.equals(grpcHost);

        /**
         * Create static retry policy (TODO: make it configurable)
         */
        Map<String, Object> defaultServiceConfig = new HashMap<>();
        Map<String, Object> methodConfig = new HashMap<>();
        Map<String, Object> retryPolicy = new HashMap<>();

        retryPolicy.put("maxAttempts", 3.0);
        retryPolicy.put("initialBackoff", "0.01s");
        retryPolicy.put("maxBackoff", "0.1s");
        retryPolicy.put("backoffMultiplier", 5.0);
        retryPolicy.put("retryableStatusCodes", Collections.singletonList("UNAVAILABLE"));

        methodConfig.put("name", Collections.singletonList(Map.of("service", "chalk.engine.v1.QueryService")));
        methodConfig.put("retryPolicy", retryPolicy);

        defaultServiceConfig.put("methodConfig", Collections.singletonList(methodConfig));

        engineChannel = Grpc.newChannelBuilder(engineHost, channelCreds)
                .maxInboundMessageSize(1024 * 1024 * 500)
                .intercept(
                        new AuthenticatedHeaderClientInterceptor(
                                queryThroughApiServer ? ServerType.SERVER : ServerType.ENGINE,
                                queryThroughApiServer
                                        ? Map.of(
                                                "x-chalk-env-id", resolvedEnvironmentId,
                                                "x-chalk-deployment-type", "engine-grpc"
                                        )
                                        : Map.of("x-chalk-env-id", resolvedEnvironmentId),
                                tokenRefresher,
                                builder.getDeploymentTag()
                        )
                )
                .defaultServiceConfig(defaultServiceConfig)
                .enableRetry()
                .build();

        var queryStub = QueryServiceGrpc.newBlockingStub(engineChannel);

        this.stubsProvider = new StubsProvider(queryStub, this.timeout);
    }

    private static ChannelCredentials getChannelCredentials(String grpcHost, ResolvedConfig resolvedConfig) throws ClientException {
        if (grpcHost.startsWith("localhost") || grpcHost.startsWith("127.0.0.1")) {
            return InsecureChannelCredentials.create();
        } else {
            var channelBuilder = TlsChannelCredentials.newBuilder();
            if (!resolvedConfig.rootCa().value().isEmpty()) {
                try {
                    channelBuilder.trustManager(Path.of(resolvedConfig.rootCa().value()).toFile());
                } catch (IOException ex) {
                    throw new ClientException("Error loading root CA file", ex);
                }
            }
            return channelBuilder.build();
        }
    }

    @Override
    public void printConfig() {
        logger.log(System.Logger.Level.ERROR, "Config printing for GRPC client not yet implemented");
    }

    private RequestHeaderInterceptor getRequestHeaderInterceptor(
        @Nullable String environmentIdOverride,
        @Nullable String queryName
    ) {
        return new RequestHeaderInterceptor(environmentIdOverride, this.resolvedEnvironmentId, queryName);
    }

    @Override
    public int ping(int num) {
        return this.stubsProvider.getQueryStub(Optional.empty())
                .withInterceptors(this.getRequestHeaderInterceptor(null, null))
                .ping(PingRequest.newBuilder().setNum(num).build())
                .getNum();
    }


    public OnlineQueryResult onlineQuery(OnlineQueryParamsComplete params) throws ChalkException {
        byte[] bodyBytes = serializeInputs(params, this.allocator, "grpc_online_query_params");
        OnlineQueryBulkRequest request = buildBulkRequest(params, bodyBytes, this.branchId);

        AtomicReference<Metadata> trailersRef = new AtomicReference<>();
        OnlineQueryBulkResponse response = queryStub(
                params.getTimeout(),
                params.getEnvironmentId(),
                params.getQueryName(),
                trailersRef
        ).onlineQueryBulk(request);

        return decodeBulkResponse(
                response,
                traceIdFrom(trailersRef),
                newResponseAllocator("grpc_online_query_response")
        );
    }

    /**
     * OnlineQueryMulti computes several independent online queries in parallel,
     * using a single request to the Chalk engine.
     */
    @Override
    public OnlineQueryMultiResult onlineQueryMulti(List<OnlineQueryParamsComplete> paramsList)
            throws ChalkException {
        validateMultiParams(paramsList);
        if (paramsList.isEmpty()) {
            return new OnlineQueryMultiResult(List.of(), new ServerError[0], null);
        }

        // Resolve the request-level settings before serializing anything, so a batch that
        // cannot be satisfied fails before doing the work of encoding its inputs.
        Duration deadline = resolveDeadline(paramsList).orElse(null);
        String environmentId = resolveEnvironment(paramsList);
        String queryName = resolveQueryName(paramsList);
        // Validated for agreement but deliberately unused: the gRPC client does not send the
        // "x-chalk-branch-id" header that the API server routes branches on, so branch
        // selection is inert on this path for single and multi queries alike. See the
        // branch/preview-deployment follow-up.
        resolveBranch(paramsList, this.branchId);

        OnlineQueryMultiRequest request = buildMultiRequest(paramsList, this.allocator, this.branchId);

        AtomicReference<Metadata> trailersRef = new AtomicReference<>();
        OnlineQueryMultiResponse response = queryStub(deadline, environmentId, queryName, trailersRef)
                .onlineQueryMulti(request);

        return decodeMultiResponse(
                response,
                paramsList.size(),
                traceIdFrom(trailersRef),
                this.allocator
        );
    }

    /**
     * Serializes the query's inputs to Arrow IPC bytes, using a short-lived
     * child allocator that is released before returning.
     */
    static byte[] serializeInputs(
            OnlineQueryParamsComplete params,
            BufferAllocator parentAllocator,
            String allocatorName
    ) throws ClientException {
        try (
                var childAllocator = parentAllocator.newChildAllocator(
                        allocatorName,
                        0,
                        FeatherProcessor.ALLOCATOR_SIZE_REQUEST
                )
        ) {
            return inputsToArrowBytes(params.getInputs(), childAllocator);
        } catch (Exception e) {
            throw new ClientException("Failed to serialize OnlineQueryParams", e);
        }
    }

    /*
     * Builds the bulk request for a single query. Shared by the single-query and
     * multi-query paths, so both produce byte-identical sub-requests.
     *
     * TODO: params.getStaleness() and params.isStorePlanStages() are not sent on the
     * gRPC path, even though OnlineQueryBulkRequest has a `staleness` field. Wiring
     * staleness up requires deciding how to encode a Duration as the bucket string
     * the server expects.
     */
    static OnlineQueryBulkRequest buildBulkRequest(
            OnlineQueryParamsComplete params,
            byte[] inputsFeather,
            @Nullable String clientBranchId
    ) {
        List<String> resolvedOutputs = params.getOutputs();
        if (resolvedOutputs == null) {
            resolvedOutputs = new ArrayList<>();
        }

        List<OutputExpr> outputs = new ArrayList<>();
        for (var output : resolvedOutputs) {
            outputs.add(OutputExpr.newBuilder().setFeatureFqn(output).build());
        }

        List<Timestamp> now = new ArrayList<>();
        if (params.getNow() != null) {
            for (var n : params.getNow()) {
                now.add(
                        Timestamp.newBuilder()
                                .setSeconds(n.toEpochSecond())
                                .setNanos(n.getNano())
                                .build()
                );
            }
        }

        var context = OnlineQueryContext.newBuilder();
        if (params.getBranch() != null && !params.getBranch().isEmpty()) {
            context.setBranchId(params.getBranch());
        } else if (clientBranchId != null && !clientBranchId.isEmpty()) {
            context.setBranchId(clientBranchId);
        }
        if (params.getCorrelationId() != null) {
            context.setCorrelationId(params.getCorrelationId());
        }
        if (params.getPreviewDeploymentId() != null) {
            context.setDeploymentId(params.getPreviewDeploymentId());
        }
        if (params.getEnvironmentId() != null) {
            context.setEnvironment(params.getEnvironmentId());
        }
        if (params.getQueryName() != null) {
            context.setQueryName(params.getQueryName());
        }
        if (params.getQueryNameVersion() != null) {
            context.setQueryNameVersion(params.getQueryNameVersion());
        }
        if (params.getTags() != null) {
            context.addAllTags(params.getTags());
        }
        if (params.getRequiredResolverTags() != null) {
            context.addAllRequiredResolverTags(params.getRequiredResolverTags());
        }
        var plannerOptions = new HashMap<String, Value>();
        if (params.getPlannerOptions() != null) {
            for (var entry : params.getPlannerOptions().entrySet()) {
                plannerOptions.put(entry.getKey(), Utils.toProto(entry.getValue()));
            }
        }
        context.putAllOptions(plannerOptions);

        var options = OnlineQueryResponseOptions.newBuilder()
                .setIncludeMeta(params.isIncludeMeta() || params.isExplain())
                .setEncodingOptions(
                        FeatureEncodingOptions.newBuilder()
                                .setEncodeStructsAsObjects(true)
                                .build()
                );
        if (params.isExplain()) {
            options.setExplain(ExplainOptions.newBuilder().build());
        }
        if (params.getMeta() != null) {
            options.putAllMetadata(params.getMeta());
        }

        return OnlineQueryBulkRequest.newBuilder()
                .setInputsFeather(ByteString.copyFrom(inputsFeather))
                .addAllOutputs(outputs)
                .addAllNow(now)
                .setBodyType(FeatherBodyType.FEATHER_BODY_TYPE_TABLE)
                .setContext(context)
                .setResponseOptions(options)
                .build();
    }

    /*
     * Wraps each set of params as a bulk sub-query, preserving order. The engine
     * rejects `single_request` outright ("OnlineQueryRequest is unsupported; Please
     * use OnlineQueryBulkRequest w/ a single row"), so every sub-query is a bulk
     * request, exactly as the reference Python client does.
     */
    static OnlineQueryMultiRequest buildMultiRequest(
            List<OnlineQueryParamsComplete> paramsList,
            BufferAllocator parentAllocator,
            @Nullable String clientBranchId
    ) throws ClientException {
        var request = OnlineQueryMultiRequest.newBuilder();
        for (int i = 0; i < paramsList.size(); i++) {
            OnlineQueryParamsComplete params = paramsList.get(i);
            byte[] inputsFeather = serializeInputs(
                    params, parentAllocator, "grpc_online_query_multi_params[" + i + "]"
            );
            request.addQueries(
                    GenericSingleQuery.newBuilder()
                            .setBulkRequest(buildBulkRequest(params, inputsFeather, clientBranchId))
                            .build()
            );
        }
        return request.build();
    }

    private QueryServiceGrpc.QueryServiceBlockingStub queryStub(
            @Nullable Duration timeout,
            @Nullable String environmentIdOverride,
            @Nullable String queryName,
            AtomicReference<Metadata> trailersRef
    ) {
        return this.stubsProvider.getQueryStub(Optional.ofNullable(timeout))
                .withInterceptors(
                        MetadataUtils.newCaptureMetadataInterceptor(new AtomicReference<>(), trailersRef),
                        this.getRequestHeaderInterceptor(environmentIdOverride, queryName)
                );
    }

    private static @Nullable String traceIdFrom(AtomicReference<Metadata> trailersRef) {
        Metadata trailers = trailersRef.get();
        return trailers == null ? null : trailers.get(CHALK_TRACE_ID_KEY);
    }

    private BufferAllocator newResponseAllocator(String name) {
        return this.allocator.newChildAllocator(name, 0, FeatherProcessor.ALLOCATOR_SIZE_RESPONSE);
    }

    /*
     * Decodes one bulk response.
     *
     * Takes ownership of responseAllocator: on success it is handed to the returned
     * OnlineQueryResult, which releases it when closed. On any failure this method
     * closes the tables it decoded along with the allocator, and rethrows, so no
     * Arrow memory is retained.
     */
    static OnlineQueryResult decodeBulkResponse(
            OnlineQueryBulkResponse response,
            @Nullable String traceId,
            BufferAllocator responseAllocator
    ) throws ChalkException {
        Table scalars = null;
        Map<String, Table> groups = new HashMap<>();
        try {
            var meta = GrpcSerializer.toQueryMeta(response.getResponseMeta(), traceId);

            ServerError[] errors = new ServerError[response.getErrorsCount()];
            for (int i = 0; i < response.getErrorsCount(); i++) {
                errors[i] = GrpcSerializer.toServerError(response.getErrors(i));
            }

            if (!response.getScalarsData().isEmpty()) {
                try {
                    scalars = FeatherProcessor.convertBytesToTable(
                            response.getScalarsData().toByteArray(),
                            responseAllocator
                    );
                } catch (Exception e) {
                    throw new ClientException("Failed to convert scalar data bytes to table", e);
                }
            }

            for (var entry : response.getGroupsDataMap().entrySet()) {
                String fqn = entry.getKey();
                try {
                    groups.put(
                            fqn,
                            FeatherProcessor.convertBytesToTable(entry.getValue().toByteArray(), responseAllocator)
                    );
                } catch (Exception e) {
                    throw new ClientException(
                            String.format("Failed to convert bytes to table for feature '%s'", fqn), e
                    );
                }
            }

            return new OnlineQueryResult(scalars, groups, errors, meta, responseAllocator);
        } catch (Exception e) {
            releaseQuietly(e, scalars, groups.values(), responseAllocator);
            throw asChalkException(e, "Failed to decode online query response");
        }
    }

    /*
     * Decodes a multi-query response into one OnlineQueryResult per sub-query.
     *
     * Each sub-result gets its own child allocator of rootAllocator, because
     * OnlineQueryResult.close() closes the allocator it is handed: sharing one
     * allocator across sub-results would release it while the other sub-results'
     * tables still held buffers. On any failure, every result decoded so far is
     * closed and the exception is rethrown, so no Arrow memory is retained.
     */
    static OnlineQueryMultiResult decodeMultiResponse(
            OnlineQueryMultiResponse response,
            int expectedCount,
            @Nullable String traceId,
            BufferAllocator rootAllocator
    ) throws ChalkException {
        ServerError[] globalErrors = new ServerError[response.getErrorsCount()];
        for (int i = 0; i < response.getErrorsCount(); i++) {
            globalErrors[i] = GrpcSerializer.toServerError(response.getErrors(i));
        }

        // The engine returns no sub-responses at all when the request failed before any
        // sub-query was dispatched; the global errors explain why. This is the one case
        // where the results are not 1:1 with the submitted queries.
        if (response.getResponsesCount() == 0 && globalErrors.length > 0) {
            return new OnlineQueryMultiResult(List.of(), globalErrors, traceId);
        }

        // Sub-responses are correlated with sub-queries only by position, so a count
        // mismatch leaves every result unattributable. Fail rather than guess.
        if (response.getResponsesCount() != expectedCount) {
            throw new ClientException(String.format(
                    "Expected %d sub-responses for %d queries, but got %d%s",
                    expectedCount,
                    expectedCount,
                    response.getResponsesCount(),
                    globalErrors.length == 0 ? "" : "; errors: " + describeErrors(globalErrors)
            ));
        }

        List<OnlineQueryResult> decoded = new ArrayList<>(expectedCount);
        try {
            for (int i = 0; i < response.getResponsesCount(); i++) {
                GenericSingleResponse single = response.getResponses(i);
                // The engine sets the bulk_response case up front for every bulk sub-query, so
                // this only fires if it rejected the sub-query's type outright -- which it does
                // for single_request, and this client only ever sends bulk_request.
                if (single.getQueryCase() != GenericSingleResponse.QueryCase.BULK_RESPONSE) {
                    throw new ClientException(String.format(
                            "Sub-response at index %d is not a bulk response (got %s); "
                                    + "the Java client only issues bulk sub-queries",
                            i, single.getQueryCase()
                    ));
                }
                BufferAllocator subAllocator = rootAllocator.newChildAllocator(
                        "grpc_online_query_multi_response[" + i + "]",
                        0,
                        FeatherProcessor.ALLOCATOR_SIZE_RESPONSE
                );
                try {
                    // decodeBulkResponse releases subAllocator itself if it throws.
                    decoded.add(decodeBulkResponse(single.getBulkResponse(), traceId, subAllocator));
                } catch (Exception e) {
                    throw new ClientException(
                            String.format("Failed to decode sub-response at index %d", i), e
                    );
                }
            }
        } catch (Exception e) {
            for (OnlineQueryResult result : decoded) {
                try {
                    result.close();
                } catch (Exception closeError) {
                    e.addSuppressed(closeError);
                }
            }
            throw asChalkException(e, "Failed to decode multi-query response");
        }

        return new OnlineQueryMultiResult(decoded, globalErrors, traceId);
    }

    /**
     * Validates the per-query parameters of a multi-query.
     */
    static void validateMultiParams(List<OnlineQueryParamsComplete> paramsList) throws ClientException {
        if (paramsList == null) {
            throw new ClientException("onlineQueryMulti requires a non-null list of queries");
        }
        for (int i = 0; i < paramsList.size(); i++) {
            OnlineQueryParamsComplete params = paramsList.get(i);
            if (params == null) {
                throw new ClientException(
                        String.format("onlineQueryMulti received a null query at index %d", i)
                );
            }
            if (!isBlank(params.getQueryNameVersion()) && isBlank(params.getQueryName())) {
                throw new ClientException(String.format(
                        "The query at index %d specifies a queryNameVersion without a queryName", i
                ));
            }
        }
    }

    /**
     * Resolves the deadline for the whole request as the longest of the per-query
     * timeouts, so that no sub-query is cancelled before the time its caller
     * allowed. Returns empty when no query sets one, which lets the client-level
     * timeout apply. Per-query timeouts are not independently enforced: a single
     * request carries a single deadline.
     */
    static Optional<Duration> resolveDeadline(List<OnlineQueryParamsComplete> paramsList) {
        Duration longest = null;
        for (OnlineQueryParamsComplete params : paramsList) {
            Duration timeout = params.getTimeout();
            if (timeout == null) {
                continue;
            }
            if (longest == null || timeout.compareTo(longest) > 0) {
                longest = timeout;
            }
        }
        return Optional.ofNullable(longest);
    }

    static @Nullable String resolveEnvironment(List<OnlineQueryParamsComplete> paramsList)
            throws ClientException {
        return requireAgreement(paramsList, OnlineQueryParamsComplete::getEnvironmentId, "environmentId");
    }

    static @Nullable String resolveBranch(
            List<OnlineQueryParamsComplete> paramsList,
            @Nullable String clientBranchId
    ) throws ClientException {
        return requireAgreement(
                paramsList,
                params -> isBlank(params.getBranch()) ? clientBranchId : params.getBranch(),
                "branch"
        );
    }

    static @Nullable String resolveQueryName(List<OnlineQueryParamsComplete> paramsList)
            throws ClientException {
        String queryName = requireAgreement(paramsList, OnlineQueryParamsComplete::getQueryName, "queryName");
        requireAgreement(paramsList, OnlineQueryParamsComplete::getQueryNameVersion, "queryNameVersion");
        return queryName;
    }

    /*
     * Returns the value that every query agrees on, or throws if two queries disagree.
     *
     * Branch, environment and query name are all carried by per-request headers, of
     * which a single request has exactly one set: the API server resolves one branch
     * to one deployment, and named queries are routed by an exact match on the
     * "x-chalk-query-name" header. A batch that mixed these values could not be
     * satisfied, and silently picking one would run a sub-query somewhere its caller
     * never asked for.
     */
    private static @Nullable String requireAgreement(
            List<OnlineQueryParamsComplete> paramsList,
            Function<OnlineQueryParamsComplete, String> getter,
            String settingName
    ) throws ClientException {
        if (paramsList.isEmpty()) {
            return null;
        }
        String resolved = blankToNull(getter.apply(paramsList.get(0)));
        for (int i = 1; i < paramsList.size(); i++) {
            String candidate = blankToNull(getter.apply(paramsList.get(i)));
            if (!Objects.equals(resolved, candidate)) {
                throw new ClientException(String.format(
                        "onlineQueryMulti requires every query to agree on %s, but found %s at "
                                + "index 0 and %s at index %d. A single request carries one %s for "
                                + "all of its queries, so run these as separate queries instead.",
                        settingName, describe(resolved), describe(candidate), i, settingName
                ));
            }
        }
        return resolved;
    }

    private static ChalkException asChalkException(Exception e, String fallbackMessage) {
        return e instanceof ChalkException ? (ChalkException) e : new ClientException(fallbackMessage, e);
    }

    private static void releaseQuietly(
            Throwable primary,
            @Nullable Table scalars,
            Collection<Table> groups,
            @Nullable BufferAllocator allocator
    ) {
        if (scalars != null) {
            try {
                scalars.close();
            } catch (Exception e) {
                primary.addSuppressed(e);
            }
        }
        for (Table table : groups) {
            try {
                table.close();
            } catch (Exception e) {
                primary.addSuppressed(e);
            }
        }
        if (allocator != null) {
            try {
                allocator.close();
            } catch (Exception e) {
                primary.addSuppressed(e);
            }
        }
    }

    private static String describeErrors(ServerError[] errors) {
        List<String> messages = new ArrayList<>();
        for (ServerError error : errors) {
            messages.add(error.getMessage() == null ? "(no message)" : error.getMessage());
        }
        return String.join("; ", messages);
    }

    private static String describe(@Nullable String value) {
        return value == null ? "none" : "'" + value + "'";
    }

    private static boolean isBlank(@Nullable String value) {
        return value == null || value.isEmpty();
    }

    private static @Nullable String blankToNull(@Nullable String value) {
        return isBlank(value) ? null : value;
    }

    public UploadFeaturesResult uploadFeatures(UploadFeaturesParams params) throws ChalkException {
        byte[] tableBytes;
        try {
            tableBytes = FeatherProcessor.inputsToArrowBytes(params.getInputs(), this.allocator);
        } catch (Exception e) {
            throw new ClientException("Failed to convert inputs to Arrow bytes", e);
        }

        // Only set fields that deviate from the server defaults, mirroring the Python client
        // (upload_features in client_grpc.py). write_online defaults to true server-side, so it is
        // sent only when the caller opts out; this keeps prior callers wire-identical.
        UploadFeaturesOptions.Builder optionsBuilder = UploadFeaturesOptions.newBuilder();
        if (params.isUpdateMataggs()) {
            optionsBuilder.setUpdateMataggs(true);
        }
        if (params.isWriteOffline()) {
            optionsBuilder.setWriteOffline(true);
        }
        if (!params.isWriteOnline()) {
            optionsBuilder.setWriteOnline(false);
        }
        UploadFeaturesOptions options = optionsBuilder.build();

        UploadFeaturesResponse response = this.stubsProvider.getQueryStub(Optional.ofNullable(params.getTimeout()))
            .withInterceptors(
                this.getRequestHeaderInterceptor(params.getEnvironmentId(), null)
            )
            .uploadFeatures(
                UploadFeaturesRequest.newBuilder()
                    .setInputsTable(ByteString.copyFrom(tableBytes))
                    .setOptions(options)
                    .build()
            );

        List<ServerError> errors = new ArrayList<>();
        for (int i = 0; i < response.getErrorsCount(); i++) {
            errors.add(GrpcSerializer.toServerError(response.getErrors(i)));
        }

        return new UploadFeaturesResult(response.getOperationId(), errors);
    }

    @Override
    public void close() throws InterruptedException {
        this.allocator.close();
        this.unauthServerChannel.shutdown().awaitTermination(600, java.util.concurrent.TimeUnit.SECONDS);
        this.engineChannel.shutdown().awaitTermination(600, java.util.concurrent.TimeUnit.SECONDS);
    }



    /*
     * Wrapper class around stubs so that we can provide them along with universal
     * configurations like timeouts.
     */
    public static class StubsProvider {
        private final @NonNull QueryServiceGrpc.QueryServiceBlockingStub queryStub;
        private final Optional<Duration> clientLevelTimeout;

        public StubsProvider(
            QueryServiceGrpc.QueryServiceBlockingStub queryStub,
            Optional<Duration> clientLevelTimeout
        ) {
            this.queryStub = queryStub;
            this.clientLevelTimeout = clientLevelTimeout;
        }

        public QueryServiceGrpc.QueryServiceBlockingStub getQueryStub(Optional<Duration> requestLevelTimeout) {
            Duration timeout = null;
            if (requestLevelTimeout.isPresent()) {
                timeout = requestLevelTimeout.get();
            } else if (this.clientLevelTimeout.isPresent()) {
                timeout = this.clientLevelTimeout.get();
            }
            if (timeout != null) {
                return queryStub.withDeadlineAfter(timeout.toMillis(), java.util.concurrent.TimeUnit.MILLISECONDS);
            }
            return queryStub;
        }
    }
}
