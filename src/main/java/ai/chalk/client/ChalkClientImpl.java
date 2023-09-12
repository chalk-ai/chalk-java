package ai.chalk.client;


import ai.chalk.exceptions.ChalkException;
import ai.chalk.exceptions.ClientException;
import ai.chalk.internal.bytes.BytesProducer;
import ai.chalk.internal.config.Loader;
import ai.chalk.internal.config.models.ProjectToken;
import ai.chalk.internal.config.models.SourcedConfig;
import ai.chalk.internal.request.RequestHandler;
import ai.chalk.internal.request.models.SendRequestParams;
import ai.chalk.models.OnlineQueryBulkResponse;
import ai.chalk.models.OnlineQueryParamsComplete;
import ai.chalk.models.OnlineQueryResult;

import java.util.HashMap;
import java.util.Map;

public class ChalkClientImpl implements ChalkClient {
    private SourcedConfig apiServer;
    private SourcedConfig clientId;
    private SourcedConfig environmentId;
    private SourcedConfig initialEnvironment;
    private SourcedConfig clientSecret;
    private String branch;
    private final RequestHandler r;

    public ChalkClient ChalkClient() throws ChalkException {
        return ChalkClient.builder().build();
    }

    public ChalkClientImpl(BuilderImpl config) throws ChalkException {
        // Side effect of populating instance config variables
        this.resolveConfig(config);
        this.r = new RequestHandler(config.getHttpClient(), this.apiServer, this.environmentId, this.initialEnvironment, this.clientId, this.clientSecret, this.branch);
    }

    public OnlineQueryResult OnlineQuery(OnlineQueryParamsComplete params) throws ChalkException {
        byte[] bodyBytes;
        try {
            bodyBytes = BytesProducer.convertOnlineQueryParamsToBytes(params);
        } catch (Exception e) {
            throw new ClientException("Failed to serialize OnlineQueryParams", e);
        }

        SendRequestParams.Builder<OnlineQueryBulkResponse> builder = new SendRequestParams.Builder<>();
        SendRequestParams<OnlineQueryBulkResponse> request = builder.URL("/v1/query/feather")
                .responseClass(OnlineQueryBulkResponse.class)
                .body(bodyBytes)
                .method("POST")
                .branch(params.getBranch())
                .previewDeploymentId(params.getPreviewDeploymentId())
                .environmentOverride(params.getEnvironmentId())
                .build();


        OnlineQueryBulkResponse response = this.sendRequest(request);
        return response.toResult();
    }


    public <T> T sendRequest(SendRequestParams<T> args) throws ChalkException {
        return this.r.sendRequest(args);
    }


    private void resolveConfig(BuilderImpl builder) throws ClientException {
        ProjectToken chalkYamlConfig = new ProjectToken();
        Exception chalkYamlConfigErr = null;
        try {
            chalkYamlConfig = Loader.GetChalkYamlConfig();
        } catch (Exception e) {
            chalkYamlConfigErr = e;
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

        SourcedConfig apiServer = SourcedConfig.firstNonEmpty(apiServerBuilder, apiServerEnvVar, apiServerChalkYaml);
        SourcedConfig clientId = SourcedConfig.firstNonEmpty(clientIdBuilder, clientIdEnvVar, clientIdChalkYaml);
        SourcedConfig clientSecret = SourcedConfig.firstNonEmpty(clientSecretBuilder, clientSecretEnvVar, clientSecretChalkYaml);
        SourcedConfig environmentId = SourcedConfig.firstNonEmpty(environmentIdBuilder, environmentIdEnvVar, environmentIdChalkYaml);

        this.apiServer = apiServer;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.environmentId = environmentId;
        this.initialEnvironment = environmentId;

        if (chalkYamlConfigErr != null && this.clientId.getValue().isEmpty() && this.clientSecret.getValue().isEmpty()) {
            System.err.println(this.getConfigStr());
            throw new ClientException("Chalk's config variables are not set correctly. See error log for more details.");
        }
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
