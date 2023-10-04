package chalk.models;

import chalk.exceptions.ServerError;
import lombok.Data;
import lombok.AllArgsConstructor;
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
     * close releases resources associated with the result.
     */
    public void close() {
        scalarsTable.close();
        for (Table table : groupsTables.values()) {
            table.close();
        }
    }

//    /**
//     * UnmarshalInto unmarshals the result into the provided
//     * object. The object must be a FeaturesClass instance.
//     */
//    public <T> T getUnmarshaled() {
//        // Let's do a simple one. User ID.
//        // Find out what this T class has as attributes,
//        // say it has a String ID, and a String name.
//        // we take the ID and say hey let's look for this FQN.
//        // Also we gotta keep track of a pkey to root class map.
//        // How do we know which the pkey is?
//        // Nah, let's just do row by row, construct the object,
//        // and then add it to the result list.
//        // What are our inputs? The result OnlineQueryResult, and the class T.
//        // Let's try to do this on a user id class.
//    }
}
