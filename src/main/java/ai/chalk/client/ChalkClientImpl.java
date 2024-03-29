package ai.chalk.client;


import ai.chalk.internal.request.RequestHandler;
import ai.chalk.models.OnlineQueryParamsComplete;
import ai.chalk.models.OnlineQueryResult;
import ai.chalk.exceptions.ChalkException;
import ai.chalk.exceptions.ClientException;
import ai.chalk.internal.bytes.BytesProducer;
import ai.chalk.internal.config.Loader;
import ai.chalk.internal.config.models.ProjectToken;
import ai.chalk.internal.config.models.SourcedConfig;
import ai.chalk.internal.request.models.SendRequestParams;
import ai.chalk.internal.request.models.OnlineQueryBulkResponse;
import lombok.Data;

import java.util.HashMap;
import java.util.Map;

public class ChalkClientImpl implements ChalkClient {
    private SourcedConfig apiServer;
    private SourcedConfig clientId;
    private SourcedConfig environmentId;
    private SourcedConfig initialEnvironment;
    private SourcedConfig clientSecret;
    private String branch;
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
        this.initialEnvironment = resolvedConfig.environmentId;
        this.branch = config.getBranch();

        this.handler = new RequestHandler(
                config.getHttpClient(),
                this.apiServer,
                this.environmentId,
                this.initialEnvironment,
                this.clientId,
                this.clientSecret,
                this.branch
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

    public record ResolvedConfig(SourcedConfig apiServer, SourcedConfig clientId, SourcedConfig clientSecret, SourcedConfig environmentId) {}

    private ResolvedConfig resolveConfig(BuilderImpl builder) throws ClientException {
        ProjectToken chalkYamlConfig = new ProjectToken();

        String projectRoot;
        try {
            projectRoot = Loader.loadProjectDirectory();
            chalkYamlConfig = Loader.getChalkYamlConfig(projectRoot);
        } catch (Exception ignored) {
            // TODO: Add some logging here
        }

        SourcedConfig apiServerBuilder = SourcedConfig.fromBuilder(builder.getApiServer());
        SourcedConfig clientIdBuilder = SourcedConfig.fromBuilder(builder.getClientId());
        SourcedConfig clientSecretBuilder = SourcedConfig.fromBuilder(builder.getClientSecret());
        SourcedConfig environmentIdBuilder = SourcedConfig.fromBuilder(builder.getEnvironmentId());

        SourcedConfig apiServerEnvVar = SourcedConfig.fromEnvVar(ConfigEnvVars.apiServerKey);
        SourcedConfig clientIdEnvVar = SourcedConfig.fromEnvVar(ConfigEnvVars.clientIdKey);
        SourcedConfig clientSecretEnvVar = SourcedConfig.fromEnvVar(ConfigEnvVars.clientSecretKey);
        SourcedConfig environmentIdEnvVar = SourcedConfig.fromEnvVar(ConfigEnvVars.environmentIdKey);

        SourcedConfig apiServerChalkYaml = SourcedConfig.fromConfigFile(chalkYamlConfig.getApiServer());
        SourcedConfig clientIdChalkYaml = SourcedConfig.fromConfigFile(chalkYamlConfig.getClientId());
        SourcedConfig clientSecretChalkYaml = SourcedConfig.fromConfigFile(chalkYamlConfig.getClientSecret());
        SourcedConfig environmentIdChalkYaml = SourcedConfig.fromConfigFile(chalkYamlConfig.getActiveEnvironment());

        SourcedConfig apiServer = SourcedConfig.firstNonEmpty(apiServerBuilder, apiServerEnvVar, apiServerChalkYaml, new SourcedConfig("default", "https://api.chalk.ai"));
        SourcedConfig clientId = SourcedConfig.firstNonEmpty(clientIdBuilder, clientIdEnvVar, clientIdChalkYaml);
        SourcedConfig clientSecret = SourcedConfig.firstNonEmpty(clientSecretBuilder, clientSecretEnvVar, clientSecretChalkYaml);
        SourcedConfig environmentId = SourcedConfig.firstNonEmpty(environmentIdBuilder, environmentIdEnvVar, environmentIdChalkYaml);


        if (clientId.getValue().isEmpty() || clientSecret.getValue().isEmpty() || apiServer.getValue().isEmpty() || environmentId.getValue().isEmpty()) {
            System.err.println(this.getConfigStr());
            throw new ClientException("Chalk's config variables are not set correctly. See error log for more details.");
        }

        return new ResolvedConfig(apiServer, clientId, clientSecret, environmentId);
    }

    private String getConfigStr() {
        String preTable = """


ChalkClient's config variables and the source of these variables are displayed in the following table.
""";
        String postTable = """

For each variable, we take the first non-empty value, in order, from the following sources:
  1. The value passed to ChalkClient's Builder
  2. The value of the config's corresponding environment variable (see the class `ai.chalk.client.ConfigEnvVars`)
  3. The value in the project root's 'chalk.yaml' or 'chalk.yml' file
  
  
""";

        Map<String, SourcedConfig> configMap = new HashMap<>();
        configMap.put("Api Server", this.apiServer);
        configMap.put("Client ID", this.clientId);
        configMap.put("Client Secret", new SourcedConfig(this.clientSecret.getSource(), this.clientSecret.getValue().replaceAll(".", "*")));
        configMap.put("Environment ID", this.environmentId);

        String configTable = SourcedConfig.getConfigTableStr(configMap);

        return preTable + configTable + postTable;
    }

    public void printConfig() {
        System.out.println(this.getConfigStr());
    }
}
