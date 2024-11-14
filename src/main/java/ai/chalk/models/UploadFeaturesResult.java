package ai.chalk.models;


import ai.chalk.exceptions.ServerError;

import java.util.List;

public record UploadFeaturesResult(String operationId, List<ServerError> errors) {}
