package ai.chalk.client;


import ai.chalk.internal.config.JWT;
import ai.chalk.internal.config.Loader;
import ai.chalk.internal.config.ProjectToken;
import ai.chalk.internal.config.SourcedConfig;

import java.net.http.HttpClient;
import java.util.HashMap;
import java.util.Map;

public class ChalkClientImpl implements ChalkClient {
    private SourcedConfig apiServer;
    private SourcedConfig clientId;
    private SourcedConfig environmentId;
    private SourcedConfig initialEnvironment;
    private SourcedConfig clientSecret;
    private String branch;
    private JWT jwt;
    private HttpClient httpClient;

    public ChalkClientImpl() {
        this(null);
    }

    public ChalkClientImpl(BuilderImpl config) {
        this.resolveConfig(config);
    }


    private void resolveConfig(BuilderImpl builder) {
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
            this.displayConfigError();
        }
    }

    private void displayConfigError() {
        String preTable = """
ChalkClient's config variables and the source of these variables are displayed in the following table.
""";
        String postTable = """

For each variable, we take the first non-empty value, in order, from the following sources:
  1. The value passed to the ChalkClient's Builder
  2. The value of the config's corresponding environment variable (see the class `ai.chalk.client.ConfigEnvVars`)
  3. The value in the project root's 'chalk.yaml' or 'chalk.yml' file
""";
        System.err.println(preTable);

        Map<String, SourcedConfig> configMap = new HashMap<>();
        configMap.put("Api Server", this.apiServer);
        configMap.put("Client ID", this.clientId);

        configMap.put("Client Secret", new SourcedConfig(this.clientSecret.getSource(), this.clientSecret.getValue().replaceAll(".", "*")));
        configMap.put("Environment ID", this.environmentId);

        SourcedConfig.displayConfigs(configMap);

        System.err.println(postTable);
    }
}
