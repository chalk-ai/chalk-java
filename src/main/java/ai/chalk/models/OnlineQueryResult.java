package ai.chalk.models;

import ai.chalk.exceptions.ClientException;
import ai.chalk.exceptions.ServerError;
import ai.chalk.features.FeaturesClass;
import ai.chalk.internal.arrow.Unmarshaller;
import lombok.Data;
import lombok.AllArgsConstructor;
import org.apache.arrow.memory.BufferAllocator;
import org.apache.arrow.vector.table.Table;

import java.util.Map;

/**
 * OnlineQueryResult holds the result of an online query.
 */
@Data
@AllArgsConstructor
public class OnlineQueryResult implements AutoCloseable {

    /**
     * scalarsTable is an Arrow Table containing scalar
     * features of the target feature class. For example, if
     * the target feature class "User" has the attributes
     * "email" and "name", then the scalarsTable will contain
     * these two columns. Each row in the table corresponds to
     * a single User in the query.
     */
    private final Table scalarsTable;

    /**
     * groupsTables is a map from a has-many feature to its
     * corresponding Arrow Table. For example, if the target
     * feature class "User" has an attribute "transactions"
     * which is a has-many feature, then all transactions
     * associated with any of the Users in the query will be
     * returned in the groupsTables map, under the key
     * "user.transactions".
     */
    private final Map<String, Table> groupsTables;

    /**
     * errors is a list of errors that occurred in the server
     * during the query.
     */
    private final ServerError[] errors;

    /**
     * meta contains execution metadata for the query. See QueryMeta for
     * details.
     */
    private final QueryMeta meta;

    /**
     * allocator associated with the arrow objects in the result.
     * Needs to be closed when the result is no longer needed.
     */
    private final BufferAllocator allocator;


    /**
     * close releases resources associated with the result.
     */
    public void close() {
        if (scalarsTable != null) {
            scalarsTable.close();
        }
        if (groupsTables != null) {
            for (Table table : groupsTables.values()) {
                table.close();
            }
        }
        allocator.close();
    }

    /*
     * unmarshal deserializes the underlying Arrow `Table` into an array of the target feature class.
     * This operation consumes the Arrow Table, so the `Table` objects should not be used after
     * calling this method. If needed, please make a copy of the `Table` beforehand.
     */
    public <T extends FeaturesClass> T[] unmarshal(Class<T> clazz) throws ClientException {
        return Unmarshaller.unmarshalOnlineQueryResult(this, clazz);
    }
}
