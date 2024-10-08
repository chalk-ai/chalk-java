package ai.chalk.internal.config.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
public class ProjectToken {
    private String name;
    private String clientId;
    private String clientSecret;
    private LocalDateTime validUntil;
    private String apiServer;
    private String activeEnvironment;
    private JWT jwt;
    private String rootCa;
}
