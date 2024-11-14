package ai.chalk.models;


import ai.chalk.exceptions.ServerError;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
public class UploadFeaturesResult {
    private String operationId;
    private List<ServerError> errors;
}
