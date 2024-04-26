package ai.chalk.internal.request.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;
import java.util.Map;

@Data
@NoArgsConstructor
public class GetTokenResponse {
    private String accessToken;
    private String tokenType;
    private int expiresIn;
    private String apiServer;
    private String primaryEnvironment;
    private ZonedDateTime expiresAt;
    private Map<String, String> engines;
}