package ai.chalk.client;

import ai.chalk.exceptions.ChalkException;
import ai.chalk.models.OnlineQueryParamsComplete;
import ai.chalk.models.OnlineQueryResult;
import ai.chalk.models.OnlineQueryParams;

import java.net.http.HttpClient;

public interface ChalkClient {

    static Builder builder() {
        return new BuilderImpl();
    }


    /**
     * <p> Creates a new default ChalkClient instance.
     *
     * @return a new default ChalkClient instance
     * @throws ChalkException
     */
    static ChalkClient create() throws ChalkException {
        return builder().build();
    }

    /**
     * OnlineQuery computes features values using online resolvers.
     * <p> See {@link OnlineQueryParams} for more details on the parameters.
     * <p> See {@link OnlineQueryResult} for more details on the result.
     *
     * <p> Example:
     *
     * <pre>
     * client = ChalkClient.create();
     * result = client.OnlineQuery(OnlineQueryParams.builder()
     *    .input("user.id", new int[] {1, 2, 3})
     *    .outputs("user.socure_score", "user.email", "user.age")
     *    .build()
     * );
     *
     * </pre>
     *
     * @see <a href="https://docs.chalk.ai/docs/query-basics">query basics</a>
     */
    OnlineQueryResult OnlineQuery(OnlineQueryParamsComplete params) throws ChalkException;

    /**
     * Prints the current ChalkClient configuration and its sources to stdout.
     */
    void printConfig();


    public interface Builder {
        public Builder withClientId(String clientId);
        public Builder withClientSecret(String clientSecret);
        public Builder withApiServer(String apiServer);
        public Builder withEnvironmentId(String environmentId);
        public Builder withBranch(String branch);
        public Builder withHttpClient(HttpClient httpClient);

        public String getClientId();
        public String getClientSecret();
        public String getApiServer();
        public String getEnvironmentId();
        public String getBranch();
        public HttpClient getHttpClient();

        ChalkClient build() throws ChalkException;
    }
}



