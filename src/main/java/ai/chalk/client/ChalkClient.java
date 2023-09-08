package ai.chalk.client;

import ai.chalk.exceptions.ChalkException;
import ai.chalk.models.OnlineQueryBulkResult;
import ai.chalk.models.OnlineQueryParams;

public interface ChalkClient {

    static Builder builder() {
        return new BuilderImpl();
    }

    static ChalkClient create() throws ChalkException {
        return new BuilderImpl().build();
    }

    OnlineQueryBulkResult OnlineQueryBulk(OnlineQueryParams params) throws ChalkException;

    /**
     * Prints the current ChalkClient configuration and its sources to stdout.
     */
    void printConfig();
}



