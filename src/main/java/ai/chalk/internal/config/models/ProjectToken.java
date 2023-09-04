package ai.chalk.internal.config.models;

import ai.chalk.internal.config.models.DeserializableLocalDateTime;
import ai.chalk.internal.config.models.JWT;

// ProjectToken class
public class ProjectToken {
    private String name;
    private String clientId;
    private String clientSecret;
    private DeserializableLocalDateTime validUntil;
    private String apiServer;
    private String activeEnvironment;
    private JWT jwt;


    public String getName() { return name; }

    public String getClientId() { return clientId; }

    public String getClientSecret() { return clientSecret; }

    public DeserializableLocalDateTime getValidUntil() { return validUntil; }

    public String getApiServer() { return apiServer; }

    public String getActiveEnvironment() { return activeEnvironment; }

    public JWT getJwt() { return jwt; }
}
