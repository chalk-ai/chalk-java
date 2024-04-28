package ai.chalk.client;

import ai.chalk.exceptions.ChalkException;
import ai.chalk.models.OnlineQueryParams;
import ai.chalk.models.OnlineQueryParamsComplete;
import ai.chalk.models.OnlineQueryResult;

import java.net.http.HttpClient;

public interface ChalkClient {

    /**
     * Creates a new ChalkClient builder that can be used
     * to create a ChalkClient instance with custom configuration.
     *
     * <p> Example:
     *
     * <pre>
     *    {@code
     *    client = ChalkClient.builder()
     *            .withEnvironmentId("socmc8beyufew")
     *            .withClientId("98wrasfg7dge7wdasg709")
     *            .withClientSecret("h23lkj4h23lkj4z9s78fg908as7fkjh324klj23")
     *            .build();
     *    }
     * </pre>
     *
     * @return a new ChalkClient builder
     */
    static Builder builder() {
        return new BuilderImpl();
    }


    /**
     * <p> Creates a new default ChalkClient instance.
     * The default ChalkClient instance is configured with config variables sourced as such:
     *
     * <p> For each variable, we take the first non-empty value, in order, from the following sources:
     * <p>  1. The value of the config's corresponding environment variable (see {@link ConfigEnvVars}).
     * <p>  2. The value in the project root's 'chalk.yaml' or 'chalk.yml' file.
     *
     * <p> To override the settings above with custom configuration, use {@link ChalkClient#builder()}.
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
     *
     * <p>
     * Example usage:
     * <pre>
     *         {@code
     *         OnlineQueryParamsComplete params = OnlineQueryParams.builder()
     *         .withInput("user.id", Arrays.asList(1, 2, 3))
     *         .withOutputs("user.email", "user.transactions")
     *         .build();
     *
     *         try (OnlineQueryResult result = client.onlineQuery(params)) {
     *             // do something with the result
     *         }
     *     </pre>
     * </p>
     *
     * @return {@link OnlineQueryResult }
     * @throws ChalkException
     * @see <a href="https://docs.chalk.ai/docs/query-basics">query basics</a>
     */
    OnlineQueryResult onlineQuery(OnlineQueryParamsComplete params) throws ChalkException;

    /**
     * Prints the current ChalkClient configuration and its sources to stdout.
     */
    void printConfig();


    public interface Builder {

        /**
         * Sets the client ID. Used for authentication.
         */
        public Builder withClientId(String clientId);

        /**
         * Sets the client secret. Used for authentication.
         */
        public Builder withClientSecret(String clientSecret);

        /**
         * Sets the API server URL. Defaults to "https://api.chalk.ai".
         */
        public Builder withApiServer(String apiServer);

        /**
         * Sets the environment ID. This is the identifier
         * that distinguishes between different environments
         * in your Chalk project.
         */
        public Builder withEnvironmentId(String environmentId);

        /**
         * Sets the branch name. This is the identifier
         * that distinguishes between different branches
         * of a particular environment.
         */
        public Builder withBranch(String branch);

        /**
         * Sets the HTTP client. This is useful for setting
         * custom timeouts, etc.
         */
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



