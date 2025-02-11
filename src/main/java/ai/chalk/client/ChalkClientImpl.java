package ai.chalk.client;


import ai.chalk.exceptions.ChalkException;
import ai.chalk.exceptions.ClientException;
import ai.chalk.internal.arrow.FeatherProcessor;
import ai.chalk.internal.bytes.BytesProducer;
import ai.chalk.internal.config.Loader;
import ai.chalk.internal.config.models.ProjectToken;
import ai.chalk.internal.config.models.SourcedConfig;
import ai.chalk.internal.request.RequestHandler;
import ai.chalk.internal.request.models.OnlineQueryBulkResponse;
import ai.chalk.internal.request.models.SendRequestParams;
import ai.chalk.models.OnlineQueryParamsComplete;
import ai.chalk.models.OnlineQueryResult;
import ai.chalk.models.UploadFeaturesParams;
import ai.chalk.models.UploadFeaturesResult;
import org.apache.arrow.memory.RootAllocator;

import java.net.http.HttpResponse;
import java.util.*;

public class ChalkClientImpl implements ChalkClient {
    private final SourcedConfig apiServer;
    private final SourcedConfig clientId;
    private final SourcedConfig environmentId;
    private final SourcedConfig clientSecret;
    private final RequestHandler handler;

    private static final System.Logger logger = System.getLogger(ChalkClientImpl.class.getName());
    private final RootAllocator allocator = new RootAllocator(FeatherProcessor.ALLOCATOR_SIZE_ROOT);

    public ChalkClientImpl(BuilderImpl config) throws ChalkException {
        ResolvedConfig resolvedConfig = this.resolveConfig(config);
        this.apiServer = resolvedConfig.apiServer();
        this.clientId = resolvedConfig.clientId();
        this.clientSecret = resolvedConfig.clientSecret();
        this.environmentId = resolvedConfig.environmentId();
        SourcedConfig initialEnvironment = resolvedConfig.environmentId();
        String branch = config.getBranch();
        String deploymentTag = config.getDeploymentTag();
        if (branch != null && deploymentTag != null) {
            throw new ClientException("Cannot set both branch and deploymentTag");
        }

        this.handler = new RequestHandler(
                config.getHttpClient(),
                this.apiServer,
                config.getQueryServerOverride(),
                this.environmentId,
                initialEnvironment,
                this.clientId,
                this.clientSecret,
                branch,
                deploymentTag
        );
    }

    public OnlineQueryResult onlineQuery(OnlineQueryParamsComplete params) throws ChalkException {
        byte[] bodyBytes;
        try (
            var childAllocator = allocator.newChildAllocator(
                "online_query_params",
                0,
                FeatherProcessor.ALLOCATOR_SIZE_REQUEST
            )
        ) {
            bodyBytes = BytesProducer.convertOnlineQueryParamsToBytes(params, childAllocator);
        } catch (Exception e) {
            throw new ClientException("Failed to serialize OnlineQueryParams", e);
        }

        SendRequestParams request = new SendRequestParams.Builder(params.getTimeout())
                .path("/v1/query/feather")
                .body(bodyBytes)
                .method("POST")
                .branch(params.getBranch())
                .isEngineRequest(true)
                .previewDeploymentId(params.getPreviewDeploymentId())
                .environmentOverride(params.getEnvironmentId())
                .queryName(params.getQueryName())
                .build();

        HttpResponse<byte[]> response = this.handler.sendRequest(request);
        var allocator = this.allocator.newChildAllocator(
            "online_query_response",
            0,
            FeatherProcessor.ALLOCATOR_SIZE_RESPONSE
        );
        // ignore the warning here, because we don't want to free the memory yet
        var bulkResponse = OnlineQueryBulkResponse.fromBytes(response.body(), allocator);
        return bulkResponse.toResult();
    }

    public UploadFeaturesResult uploadFeatures(UploadFeaturesParams params) throws ChalkException {
        byte[] tableBytes;
        try {
            tableBytes = FeatherProcessor.inputsToArrowBytes(params.getInputs(), this.allocator);
        } catch (Exception e) {
            throw new ClientException("Failed to convert inputs to Arrow bytes", e);
        }

        var attrs = new HashMap<String, Object>();
        attrs.put("features", params.getInputs().keySet().stream().toList());
        attrs.put("table_compression", "uncompressed");
        attrs.put("table_bytes", tableBytes);

        byte[] body;
        try {
            body = BytesProducer.chalkMarshal(attrs);
        } catch (Exception e) {
            throw new ClientException("Failed to serialize UploadFeaturesParams", e);
        }

        SendRequestParams request = new SendRequestParams.Builder(null)
                .path("/v1/upload_features/multi")
                .body(body)
                .method("POST")
                .environmentOverride(params.getEnvironmentId())
                .isEngineRequest(true)
                .build();

        HttpResponse<byte[]> response = this.handler.sendRequest(request);
        return this.handler.deserializeResponseBody(response.body(), UploadFeaturesResult.class);
    }

    private ResolvedConfig resolveConfig(BuilderImpl builder) throws ClientException {
        ProjectToken chalkYamlConfig = new ProjectToken();
        String projectRoot;

        Exception chalkYamlExc = null;
        try {
            projectRoot = Loader.loadProjectDirectory();
            chalkYamlConfig = Loader.getChalkYamlConfig(projectRoot);
        } catch (Exception deferredException) {
            chalkYamlExc = deferredException;
        }

        ResolvedConfig config = ResolvedConfig.fromBuilder(builder, chalkYamlConfig);

        if (config.clientId().value().isEmpty() ||
                config.clientSecret().value().isEmpty() ||
                config.apiServer().value().isEmpty() ||
                config.environmentId().value().isEmpty()) {
            System.err.println(this.getConfigStr());
            String msg = "Chalk's config variables are not set correctly. See error log or stacktrace for more details.";
            if (chalkYamlExc != null) {
                throw new ClientException(msg, chalkYamlExc);
            } else {
                throw new ClientException(msg);
            }
        }

        return config;
    }

    private String getConfigStr() {
        // At init time these non-nullable attributes might still be null
        SourcedConfig apiServer = Optional.ofNullable(this.apiServer).orElse(SourcedConfig.missing());
        SourcedConfig environmentId = Optional.ofNullable(this.environmentId).orElse(SourcedConfig.missing());
        SourcedConfig clientId = Optional.ofNullable(this.clientId).orElse(SourcedConfig.missing());
        SourcedConfig clientSecret = Optional.ofNullable(this.clientSecret).orElse(SourcedConfig.missing());
        return "ChalkClient's config variables and the source of these variables are displayed in the following table.\n\n" +
                SourcedConfig.getConfigTableStr(Map.of(
                        "Api Server", apiServer,
                        "Environment ID", environmentId,
                        "Client ID", clientId,
                        "Client Secret", new SourcedConfig(
                                clientSecret.source(),
                                clientSecret.value().replaceAll(".", "*")
                        )
                )) +
                """
                        For each variable, we take the first non-empty value, in order, from the following sources:
                          1. The value passed to ChalkClient's Builder
                          2. The value of the config's corresponding environment variable (see the class `ai.chalk.client.ConfigEnvVars`)
                          3. The value in your '~/.chalk.yml' file
                          4. A default value (if applicable)
                        """;
    }

    public void printConfig() {
        logger.log(System.Logger.Level.INFO, this.getConfigStr());
    }

    @Override
    public void close() {
        this.allocator.close();
    }
}
