package ai.chalk.models;


import ai.chalk.exceptions.ServerError;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.Nullable;
import java.util.List;

/**
 * Holds any errors that occurred during the deletion request.
 * Deletion of a feature may partially succeed.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DeleteFeaturesResult {
    private List<ServerError> errors;
    /** Online store entries removed when {@code retainMaterializedAggregates} is false, else null. */
    @Nullable
    private Long materializedAggregateKeysDeleted;

    public DeleteFeaturesResult(List<ServerError> errors) {
        this(errors, null);
    }
}
