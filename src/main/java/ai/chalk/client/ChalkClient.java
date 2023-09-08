package ai.chalk.client;

import ai.chalk.exceptions.ChalkException;
import ai.chalk.models.OnlineQueryBulkResult;
import ai.chalk.models.OnlineQueryParams;

public interface ChalkClient {

    static Builder builder() {
        return new BuilderImpl();
    }
    OnlineQueryBulkResult OnlineQueryBulk(OnlineQueryParams params) throws ChalkException;
}



