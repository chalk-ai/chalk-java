package ai.chalk.models;

import ai.chalk.exceptions.ServerError;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import org.apache.arrow.vector.VectorSchemaRoot;

import java.util.Map;

/**
 * OnlineQueryBulkResult holds the result of a bulk online query.
 */
@Data
@AllArgsConstructor
public class OnlineQueryBulkResult {

    /**
     * ScalarsDF is an Arrow Record containing
     * scalar features of the target feature class.
     */
    private final VectorSchemaRoot scalarsRoot;

    /**
     * GroupsDF is a map from a has-many feature to its
     * corresponding ArrowRecord.
     */
    private final Map<String, VectorSchemaRoot> groupsRoot;

    /**
     * Errors is a list of errors that occurred during the query.
     */
    private final ServerError[] errors;

    /**
     * Execution metadata for the query. See QueryMeta for details.
     */
    private final QueryMeta meta;
}