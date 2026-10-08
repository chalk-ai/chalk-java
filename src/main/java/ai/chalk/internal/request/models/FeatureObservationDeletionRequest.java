package ai.chalk.internal.request.models;

import java.util.List;

public record FeatureObservationDeletionRequest(
        String namespace,
        List<String> features,
        List<String> tags,
        List<String> primaryKeys,
        boolean retainOffline,
        boolean retainOnline
) {
}
