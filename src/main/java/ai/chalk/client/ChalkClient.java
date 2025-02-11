package ai.chalk.client;

import ai.chalk.exceptions.ChalkException;
import ai.chalk.models.*;

import java.net.http.HttpClient;
import java.nio.file.Path;
import java.time.Duration;

public interface ChalkClient extends AutoCloseable {

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
     * <p> Creates a new ChalkClient instance that uses gRPC for communication.
     * The gRPC ChalkClient instance is configured with config variables
     * sourced the same way as the default ChalkClient instance.
     *
     * @return a new ChalkClient instance that uses gRPC
     * @throws ChalkException
     */
    static ChalkClient createGrpc() throws ChalkException {
        return builder().withGrpc().build();
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
     *             .withInput("user.id", Arrays.asList(1, 2, 3))
     *             .withOutputs("user.email", "user.transactions")
     *             .build();
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
     * UploadFeatures synchronously persists feature values to the online store and
     * offline store.
     * <p> See {@link UploadFeaturesParams} for more details on the parameters.
     *
     * <p>
     * Example usage:
     *     <pre>
     *         {@code
     *         var userIds = Arrays.asList("777", "888", "999");
     *         var scoreList = Arrays.asList(600, 700, 800);
     *         UploadFeaturesParams params = UploadFeaturesParams.builder()
     *             .withInputs(Map.of("user.id", userIds,"user.credit_score", scoreList))
     *             .withInput(Features.user.email, List.of("user1@email.com", "user2@email.com", "user3@email.com"))
     *             .build();
     *         UploadFeaturesResult res = client.uploadFeatures(params);
     *         if (client.uploadFeatures(params).getErrors().size() > 0) {
     *             throw new Exception("upload failed");
     *         }
     *
     *     </pre>
     * </p>
     *
     */
    UploadFeaturesResult uploadFeatures(UploadFeaturesParams params) throws ChalkException;




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
         * Chalk routes performance sensitive requests like online query
         * directly to the query server that runs the engine. Populate
         * this field if you would like to route these requests to a
         * different query server than the one automatically resolved
         * by Chalk.
         */
        public Builder withQueryServer(String queryServer);

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
         * Sets the deployment Tag. This is the identifier
         * that distinguishes between different tagged
         * deployments in a particular environment.
         */
        public Builder withDeploymentTag(String deploymentTag);

        /**
         * Sets the HTTP client. This is useful for setting
         * custom timeouts, etc.
         */
        public Builder withHttpClient(HttpClient httpClient);

        public Builder withGrpc();

        /**
         * Sets the timeout for all requests. Defaults to no timeout.
         * Timeout of 0 means the query times out immediately. Request
         * level timeouts takes precedence over this timeout.
         * @param timeout The timeout duration
         */
        public Builder withTimeout(Duration timeout);

        /**
         * Sets the root CA certificate file.
         * @param rootCa The path to the root CA
         */
        public Builder withRootCa(Path rootCa);

        public String getClientId();

        public String getClientSecret();

        public String getApiServer();

        public String getEnvironmentId();

        public String getBranch();

        public String getDeploymentTag();

        public Path getRootCa();

        public HttpClient getHttpClient();

        public Duration getTimeout();

        ChalkClient build() throws ChalkException;
    }
}
