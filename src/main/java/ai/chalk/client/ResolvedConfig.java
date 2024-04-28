package ai.chalk.client;

import ai.chalk.internal.config.models.ProjectToken;
import ai.chalk.internal.config.models.SourcedConfig;

public record ResolvedConfig(
        SourcedConfig apiServer,
        SourcedConfig clientId,
        SourcedConfig clientSecret,
        SourcedConfig environmentId
) {

    public static ResolvedConfig fromBuilder(
            ChalkClient.Builder builder,
            ProjectToken chalkYamlConfig
    ) {
        return new ResolvedConfig(
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
    }
}
