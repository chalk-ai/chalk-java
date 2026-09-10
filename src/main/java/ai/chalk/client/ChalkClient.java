package ai.chalk.client;

import ai.chalk.exceptions.ChalkException;
import ai.chalk.exceptions.ClientException;
import ai.chalk.models.*;

import java.net.http.HttpClient;
import java.nio.file.Path;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

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
     * Pings the Chalk engine with a random number and returns the number echoed
     * by the engine.
     *
     * @return the number echoed by the engine
     * @throws ChalkException if the engine cannot be reached
     */
    default int ping() throws ChalkException {
        return ping(ThreadLocalRandom.current().nextInt(1000));
    }

    /**
     * Pings the Chalk engine with {@code num} and returns the number echoed by
     * the engine.
     *
     * @param num the number to send to the engine
     * @return the number echoed by the engine
     * @throws ChalkException if the engine cannot be reached
     */
    int ping(int num) throws ChalkException;

    /**
     * OnlineQuery computes features values using online resolvers.
     * <p> See {@link OnlineQueryParams} for more details on the parameters.
     *
     * <p>
     * Example usage for bulk queries:
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
     * <p>
     * Example usage for single-row queries using SingleRowInput:
     * <pre>
     *         {@code
     *         var singleRow = new OnlineQueryParams.SingleRowInput()
     *             .withInput("user.id", 123)
     *             .withInput("user.email", "test@example.com")
     *             .withInput("user.favorite_foods", Arrays.asList("pizza", "pasta"));
     *
     *         OnlineQueryParamsComplete params = OnlineQueryParams.builder()
     *             .withInput(singleRow)
     *             .withOutputs("user.credit_score", "user.transactions")
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
     * OnlineQueryMulti computes several independent online queries in parallel,
     * using a single request to the Chalk engine. Use it when the queries are
     * rooted in different feature classes, or otherwise ask for unrelated
     * outputs, and you would rather not pay a round trip for each one. To run
     * one query over many rows of input, use {@link #onlineQuery} instead,
     * which is already a bulk operation.
     *
     * <p> This is supported only by the gRPC client; see {@link ChalkClient#createGrpc()}.
     *
     * <p>
     * Example usage:
     * <pre>
     *         {@code
     *         OnlineQueryParamsComplete users = OnlineQueryParams.builder()
     *             .withInput("user.id", Arrays.asList(1, 2, 3))
     *             .withOutputs("user.email")
     *             .build();
     *         OnlineQueryParamsComplete merchants = OnlineQueryParams.builder()
     *             .withInput("merchant.id", Arrays.asList("a", "b"))
     *             .withOutputs("merchant.risk_score")
     *             .build();
     *
     *         try (OnlineQueryMultiResult multi = client.onlineQueryMulti(List.of(users, merchants))) {
     *             for (OnlineQueryResult result : multi.getResults()) {
     *                 if (result.getErrors().length > 0) {
     *                     // handle this query's failure; the other queries are unaffected
     *                     continue;
     *                 }
     *                 // do something with the result
     *             }
     *         }
     *         }
     *     </pre>
     * </p>
     *
     * <p> <b>Results are positional.</b> {@link OnlineQueryMultiResult#getResults()}
     * holds one result per query, in the order the queries were passed in.
     *
     * <p> <b>Queries fail independently.</b> A resolver that fails while computing
     * one query is reported on that query's own result, via
     * {@link OnlineQueryResult#getErrors()}, and leaves the other queries' results
     * intact. {@link OnlineQueryMultiResult#getGlobalErrors()} holds the errors the
     * engine did not attach to a specific result -- including the case where a query
     * failed to run at all, which is reported there with the query's 1-based position
     * in the message rather than on the result. That query still occupies its slot,
     * but its result is empty and reports no errors of its own, so check the global
     * errors as well before treating an empty result as a successful one.
     *
     * <p> <b>Resources.</b> Closing the returned {@link OnlineQueryMultiResult}
     * closes every one of its results and releases all of their Arrow memory.
     * Do not close the individual results yourself.
     *
     * <p> <b>Some settings apply to the whole request.</b> A request carries one
     * deadline and one set of headers, so:
     * <ul>
     *   <li>Every query must agree on {@code environmentId}, {@code branch} and
     *       {@code queryName}. A disagreement throws
     *       {@link ai.chalk.exceptions.ClientException}, because a request resolves
     *       one branch to one deployment and routes named queries by an exact match
     *       on the query name, so a mixed batch could not be honored. Run those as
     *       separate queries. A query that leaves one of these unset simply takes the
     *       client's value, which is not a disagreement. {@code queryNameVersion} may
     *       differ freely: each query carries its own.</li>
     *   <li>The deadline is the longest of the effective per-query timeouts, where a
     *       query that sets none is bounded by the client-level timeout. Per-query
     *       timeouts are not independently enforced.</li>
     *   <li>Branch selection is currently inert on the gRPC path for both single and
     *       multi queries: the client does not yet send the header the API server
     *       routes branches on.</li>
     * </ul>
     *
     * @param params the queries to run, one result per query
     * @return {@link OnlineQueryMultiResult}
     * @throws ChalkException if the request fails, or if the queries disagree on a
     *                        setting that applies to the whole request
     * @see <a href="https://docs.chalk.ai/docs/query-basics">query basics</a>
     */
    default OnlineQueryMultiResult onlineQueryMulti(List<OnlineQueryParamsComplete> params)
            throws ChalkException {
        throw new ClientException(
                "onlineQueryMulti is only supported by the gRPC client. Build one with "
                        + "ChalkClient.builder().withGrpc().build() or ChalkClient.createGrpc()."
        );
    }

    /**
     * OnlineQueryMulti computes several independent online queries in parallel,
     * using a single request to the Chalk engine.
     *
     * <p> See {@link #onlineQueryMulti(List)} for details and for the settings that
     * every query must agree on.
     *
     * @return {@link OnlineQueryMultiResult}
     * @throws ChalkException
     */
    default OnlineQueryMultiResult onlineQueryMulti(OnlineQueryParamsComplete... params)
            throws ChalkException {
        return onlineQueryMulti(params == null ? null : Arrays.asList(params));
    }

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
