package ai.chalk.models;

import lombok.Builder;

import java.util.List;
import java.util.Map;

@Builder(setterPrefix = "with")
public class UploadFeaturesParams {
    private final Map<String, List<?>> inputs;
    private final String environmentId;
}


