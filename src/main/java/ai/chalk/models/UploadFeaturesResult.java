package ai.chalk.models;


import ai.chalk.exceptions.ServerError;
import lombok.Data;

import java.util.List;

@Data
public class UploadFeaturesResult {
    private final String operationId;
    private final List<ServerError> errors;
}
