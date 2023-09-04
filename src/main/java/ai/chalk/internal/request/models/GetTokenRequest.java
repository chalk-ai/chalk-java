package ai.chalk.internal.request.models;

import lombok.Data;

@Data
public class GetTokenRequest {
    private String clientId;
    private String clientSecret;
    private String grantType;
}
