package ai.chalk.internal.request.models;

import lombok.Data;

@Data
public class GetTokenResponse {
    private String accessToken;
    private String tokenType;
    private int expiresIn;
    private String apiServer;
    private String primaryEnvironment;
}