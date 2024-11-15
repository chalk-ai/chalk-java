package ai.chalk.models;


import ai.chalk.exceptions.ServerError;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UploadFeaturesResult {
    private String operationId;
    private List<ServerError> errors;
}
