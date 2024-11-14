package ai.chalk.client;

import ai.chalk.exceptions.ChalkException;
import ai.chalk.exceptions.ClientException;
import ai.chalk.exceptions.ServerError;
import ai.chalk.internal.arrow.FeatherProcessor;
import ai.chalk.internal.config.Loader;
import ai.chalk.internal.config.models.ProjectToken;
import ai.chalk.models.OnlineQueryParamsComplete;
import ai.chalk.models.OnlineQueryResult;
import ai.chalk.models.UploadFeaturesParams;
import ai.chalk.models.UploadFeaturesResult;
import ai.chalk.protos.chalk.common.v1.*;
import ai.chalk.protos.chalk.engine.v1.QueryServiceGrpc;
import ai.chalk.protos.chalk.server.v1.AuthServiceGrpc;
import ai.chalk.protos.chalk.server.v1.GetTokenResponse;
import ai.chalk.protos.chalk.server.v1.TeamServiceGrpc;
import com.google.protobuf.ByteString;
import com.google.protobuf.Timestamp;
import io.grpc.Channel;
import io.grpc.ChannelCredentials;
import io.grpc.Grpc;
import io.grpc.InsecureChannelCredentials;
import io.grpc.ManagedChannelBuilder;
import io.grpc.Metadata;
import io.grpc.TlsChannelCredentials;
import io.grpc.stub.MetadataUtils;
import org.apache.arrow.memory.RootAllocator;
import org.apache.arrow.vector.table.Table;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

import static ai.chalk.internal.arrow.FeatherProcessor.inputsToArrowBytes;

public class GRPCClient implements ChalkClient, AutoCloseable {
    private final AuthServiceGrpc.AuthServiceBlockingStub authStub;
    private final TeamServiceGrpc.TeamServiceBlockingStub teamStub;
    private final QueryServiceGrpc.QueryServiceBlockingStub queryStub;

    private static final Metadata.Key<String> CHALK_TRACE_ID_KEY = Metadata.Key.of("x-chalk-trace-id", Metadata.ASCII_STRING_MARSHALLER);
    private static final System.Logger logger = System.getLogger(GRPCClient.class.getName());
    private final RootAllocator allocator = new RootAllocator(FeatherProcessor.ALLOCATOR_SIZE_ROOT);

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
        ManagedChannelBuilder<?> unauthenticatedChannelBuilder = Grpc.newChannelBuilder(
                grpcHost,
                channelCreds
        ).maxInboundMessageSize(1024 * 1024 * 100);
        this.authStub = AuthServiceGrpc.newBlockingStub(
                unauthenticatedChannelBuilder.intercept(new UnauthenticatedHeaderClientInterceptor(Map.of())).build()
        );

        TokenRefresher tokenRefresher = new TokenRefresher(
                resolvedConfig.clientId().value(),
                resolvedConfig.clientSecret().value(),
                this.authStub
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

        Channel authenticatedServerChannel = Grpc.newChannelBuilder(grpcHost, channelCreds)
                .maxInboundMessageSize(1024 * 1024 * 100)
                .intercept(
                        new AuthenticatedHeaderClientInterceptor(
                                ServerType.SERVER,
                                Map.of(),
                                tokenRefresher,
                                environmentId,
                                null
                        )
                )
                .build();
        this.teamStub = TeamServiceGrpc.newBlockingStub(authenticatedServerChannel);

        String engineHost;
        try {
            engineHost = token
                    .getEnginesOrThrow(environmentId)
                    .replaceFirst("^https?://", "");
        } catch (Exception e) {
            throw new ClientException("Error getting engine URI for environment %s".formatted(environmentId), e);
        }
        Channel authenticatedEngineChannel = Grpc.newChannelBuilder(engineHost, channelCreds)
                .maxInboundMessageSize(1024 * 1024 * 500)
                .intercept(
                        new AuthenticatedHeaderClientInterceptor(
                                ServerType.ENGINE,
                                Map.of(),
                                tokenRefresher,
                                environmentId,
                                builder.getDeploymentTag()
                        )
                )
                .build();
        this.queryStub = QueryServiceGrpc.newBlockingStub(authenticatedEngineChannel);
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

    private QueryServiceGrpc.QueryServiceBlockingStub queryStubWithTrailers(AtomicReference<Metadata> trailersRef) {
        AtomicReference<Metadata> headersRef = new AtomicReference<>();
        return this.queryStub.withInterceptors(
                MetadataUtils.newCaptureMetadataInterceptor(headersRef, trailersRef)
        );
    }

    @Override
    public void printConfig() {
        logger.log(System.Logger.Level.ERROR, "Config printing for GRPC client not yet implemented");
    }

    public OnlineQueryResult onlineQuery(OnlineQueryParamsComplete params) throws ChalkException {
        byte[] bodyBytes;
        try (
                var childAllocator = allocator.newChildAllocator(
                        "grpc_online_query_params",
                        0,
                        FeatherProcessor.ALLOCATOR_SIZE_REQUEST
                )
        ) {
            bodyBytes = inputsToArrowBytes(params.getInputs(), childAllocator);
        } catch (Exception e) {
            throw new ClientException("Failed to serialize OnlineQueryParams", e);
        }

        List<OutputExpr> outputs = new ArrayList<>();
        for (var output : params.getOutputs()) {
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
        if (params.getBranch() != null) {
            context.setBranchId(params.getBranch());
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

        var request = OnlineQueryBulkRequest.newBuilder()
                .setInputsFeather(ByteString.copyFrom(bodyBytes))
                .addAllOutputs(outputs)
                .addAllNow(now)
                .setBodyType(FeatherBodyType.FEATHER_BODY_TYPE_TABLE)
                .setContext(context)
                .setResponseOptions(options)
                .build();

        AtomicReference<Metadata> trailersRef = new AtomicReference<>();
        OnlineQueryBulkResponse response = this.queryStubWithTrailers(trailersRef).onlineQueryBulk(request);

        var meta = GrpcSerializer.toQueryMeta(
                response.getResponseMeta(),
                trailersRef.get().get(CHALK_TRACE_ID_KEY)
        );

        ServerError[] errors = new ServerError[response.getErrorsCount()];
        for (int i = 0; i < response.getErrorsCount(); i++) {
            errors[i] = GrpcSerializer.toServerError(response.getErrors(i));
        }

        Table scalars = null;
        Map<String, Table> groups = new HashMap<>();
        var responseAlloc = this.allocator.newChildAllocator(
                "grpc_online_query_response", 0, FeatherProcessor.ALLOCATOR_SIZE_RESPONSE
        );
        try {
            if (!response.getScalarsData().isEmpty()) {
                try {
                    scalars = FeatherProcessor.convertBytesToTable(
                            response.getScalarsData().toByteArray(),
                            responseAlloc
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
                            FeatherProcessor.convertBytesToTable(entry.getValue().toByteArray(), responseAlloc)
                    );
                } catch (Exception e) {
                    throw new ClientException(
                            String.format("Failed to convert bytes to table for feature '%s'", fqn), e
                    );
                }
            }
        } catch (Exception e) {
            if (scalars != null) {
                scalars.close();
            }
            for (var table : groups.values()) {
                table.close();
            }
            responseAlloc.close();
        }

        return new OnlineQueryResult(
                scalars,
                groups,
                errors,
                meta,
                responseAlloc
        );
    }

    public UploadFeaturesResult uploadFeatures(UploadFeaturesParams params) throws ChalkException {
        if (params.getEnvironmentId() != null) {
            throw new UnsupportedOperationException("Environment ID override via param is not yet supported");
        }
        byte[] tableBytes;
        try {
            tableBytes = FeatherProcessor.inputsToArrowBytes(params.getInputs(), this.allocator);
        } catch (Exception e) {
            throw new ClientException("Failed to convert inputs to Arrow bytes", e);
        }
        var request = UploadFeaturesRequest.newBuilder().setInputsTable(ByteString.copyFrom(tableBytes)).build();
        UploadFeaturesResponse response = this.queryStub.uploadFeatures(request);
        List<ServerError> errors = new ArrayList<>();
        for (int i = 0; i < response.getErrorsCount(); i++) {
            errors.add(GrpcSerializer.toServerError(response.getErrors(i)));
        }
        return new UploadFeaturesResult(response.getOperationId(), errors);
    }

    @Override
    public void close() {
        this.allocator.close();
    }
}
