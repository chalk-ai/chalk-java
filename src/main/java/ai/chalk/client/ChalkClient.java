package ai.chalk.client;

public interface ChalkClient {
//    OnlineQueryResult onlineQuery(OnlineQueryParamsComplete args, Object resultHolder) throws ErrorResponse;

//    OnlineQueryBulkResult onlineQueryBulk(OnlineQueryParamsComplete args) throws ErrorResponse;

    static Builder builder() {
        return new BuilderImpl();
    }
}



