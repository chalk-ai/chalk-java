package ai.chalk.internal.config.models;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;

@Data
@NoArgsConstructor
public class ProjectToken {
    private String name;
    private String clientId;
    private String clientSecret;
    private ZonedDateTime validUntil;
    private String apiServer;
    private String activeEnvironment;
    private JWT jwt;
}
