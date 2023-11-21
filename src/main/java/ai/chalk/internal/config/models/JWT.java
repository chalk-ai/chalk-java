package ai.chalk.internal.config.models;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JWT {
    private String value;
    private LocalDateTime validUntil;
}

