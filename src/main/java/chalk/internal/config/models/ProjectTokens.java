package chalk.internal.config.models;

import lombok.Data;

import java.util.HashMap;

@Data
public class ProjectTokens {

    private HashMap<String, ProjectToken> tokens;

}
