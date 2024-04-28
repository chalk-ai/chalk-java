package ai.chalk.client;


import ai.chalk.exceptions.ChalkException;
import ai.chalk.exceptions.ClientException;
import ai.chalk.internal.bytes.BytesProducer;
import ai.chalk.internal.config.Loader;
import ai.chalk.internal.config.models.ProjectToken;
import ai.chalk.internal.config.models.SourcedConfig;
import ai.chalk.internal.request.RequestHandler;
import ai.chalk.internal.request.models.OnlineQueryBulkResponse;
import ai.chalk.internal.request.models.SendRequestParams;
import ai.chalk.models.OnlineQueryParamsComplete;
import ai.chalk.models.OnlineQueryResult;

import java.util.Map;

public class ChalkClientImpl implements ChalkClient {
    private final SourcedConfig apiServer;
    private final SourcedConfig clientId;
    private final SourcedConfig environmentId;
    private final SourcedConfig clientSecret;
    private final RequestHandler handler;

    public ChalkClient ChalkClient() throws ChalkException {
        return ChalkClient.builder().build();
    }


    public ChalkClientImpl(BuilderImpl config) throws ChalkException {
        ResolvedConfig resolvedConfig = this.resolveConfig(config);
        this.apiServer = resolvedConfig.apiServer;
        this.clientId = resolvedConfig.clientId;
        this.clientSecret = resolvedConfig.clientSecret;
        this.environmentId = resolvedConfig.environmentId;
        SourcedConfig initialEnvironment = resolvedConfig.environmentId;
        String branch = config.getBranch();

        this.handler = new RequestHandler(
                config.getHttpClient(),
                this.apiServer,
                this.environmentId,
                initialEnvironment,
                this.clientId,
                this.clientSecret,
                branch
        );
    }

    public OnlineQueryResult onlineQuery(OnlineQueryParamsComplete params) throws ChalkException {
        byte[] bodyBytes;
        try {
            bodyBytes = BytesProducer.convertOnlineQueryParamsToBytes(params);
        } catch (Exception e) {
            throw new ClientException("Failed to serialize OnlineQueryParams", e);
        }

        SendRequestParams<OnlineQueryBulkResponse> request = new SendRequestParams.Builder<OnlineQueryBulkResponse>()
                .path("/v1/query/feather")
                .responseClass(OnlineQueryBulkResponse.class)
                .body(bodyBytes)
                .method("POST")
                .branch(params.getBranch())
                .isEngineRequest(true)
                .previewDeploymentId(params.getPreviewDeploymentId())
                .environmentOverride(params.getEnvironmentId())
                .queryName(params.getQueryName())
                .build();

        return this.handler.sendRequest(request).toResult();
    }

    public record ResolvedConfig(SourcedConfig apiServer, SourcedConfig clientId, SourcedConfig clientSecret,
                                 SourcedConfig environmentId) {
    }

    private ResolvedConfig resolveConfig(BuilderImpl builder) throws ClientException {
        ProjectToken chalkYamlConfig = new ProjectToken();

        String projectRoot;
        try {
            projectRoot = Loader.loadProjectDirectory();
            chalkYamlConfig = Loader.getChalkYamlConfig(projectRoot);
        } catch (Exception ignored) {
            // TODO: Add some logging here
        }

        ResolvedConfig config = new ResolvedConfig(
                SourcedConfig.firstNonEmpty(
                        SourcedConfig.fromBuilder(builder.getApiServer()),
                        SourcedConfig.fromEnvVar(ConfigEnvVars.apiServerKey),
                        SourcedConfig.fromConfigFile(chalkYamlConfig.getApiServer()),
                        new SourcedConfig("default", "https://api.chalk.ai")
                ),
                SourcedConfig.firstNonEmpty(
                        SourcedConfig.fromBuilder(builder.getClientId()),
                        SourcedConfig.fromEnvVar(ConfigEnvVars.clientIdKey),
                        SourcedConfig.fromConfigFile(chalkYamlConfig.getClientId())
                ),
                SourcedConfig.firstNonEmpty(
                        SourcedConfig.fromBuilder(builder.getClientSecret()),
                        SourcedConfig.fromEnvVar(ConfigEnvVars.clientSecretKey),
                        SourcedConfig.fromConfigFile(chalkYamlConfig.getClientSecret())
                ),
                SourcedConfig.firstNonEmpty(
                        SourcedConfig.fromBuilder(builder.getEnvironmentId()),
                        SourcedConfig.fromEnvVar(ConfigEnvVars.environmentIdKey),
                        SourcedConfig.fromConfigFile(chalkYamlConfig.getActiveEnvironment())
                )
        );

        if (config.clientId.getValue().isEmpty() ||
                config.clientSecret.getValue().isEmpty() ||
                config.apiServer.getValue().isEmpty() ||
                config.environmentId.getValue().isEmpty()) {
            System.err.println(this.getConfigStr());
            throw new ClientException("Chalk's config variables are not set correctly. See error log for more details.");
        }

        return config;
    }

    private String getConfigStr() {
        return "ChalkClient's config variables and the source of these variables are displayed in the following table.\n\n" +
                SourcedConfig.getConfigTableStr(Map.of(
                        "Api Server", this.apiServer,
                        "Environment ID", this.environmentId,
                        "Client ID", this.clientId,
                        "Client Secret", new SourcedConfig(
                                this.clientSecret.getSource(),
                                this.clientSecret.getValue().replaceAll(".", "*")
                        )
                )) +
                """
                        For each variable, we take the first non-empty value, in order, from the following sources:
                          1. The value passed to ChalkClient's Builder
                          2. The value of the config's corresponding environment variable (see the class `ai.chalk.client.ConfigEnvVars`)
                          3. The value in the project root's 'chalk.yaml' or 'chalk.yml' file
                          4. A default value (if applicable)
                        """;
    }

    public void printConfig() {
        System.out.println(this.getConfigStr());
    }
}
