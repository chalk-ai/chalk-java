package ai.chalk.internal.request.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class GetTokenRequest {
    private String clientId;
    private String clientSecret;
    private String grantType;
}
