package ai.chalk.models;

import ai.chalk.features.Feature;
import ai.chalk.features.FeaturesBase;
import ai.chalk.features.StructFeaturesClass;
import ai.chalk.features.WindowedFeaturesClass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;
import java.util.*;
import java.time.Duration;


/**
 * OnlineQueryParams holds the parameters for an online query.
 * It is the starting point for constructing an instance of
 * OnlineQueryParamsComplete. Both `withInput` and `withOutput`
 * must be called at least once.
 *
 * <p>
 *     Example usage:
 *     <pre>
 *         {@code
 *         OnlineQueryParamsComplete params = OnlineQueryParams.builder()
 *         .withInput("user.id", Arrays.asList(1, 2, 3))
 *         .withOutputs("user.email", "user.transactions")
 *         .build();
 *
 *         try (OnlineQueryResult result = client.onlineQuery(params)) {
 *               // do something with the result
 *         }
 *         }
 *     </pre>
 * </p>
 */
@AllArgsConstructor @Getter
public class OnlineQueryParams {
    /**
     * The features for which there are known values, mapped
     * to those values. Set by
     * `OnlineQueryParams.builder().withInput`.
    **/
    private Map<String, List<?>> inputs;

    /**
     * The features that you'd like to compute from the inputs.
     * Set by `OnlineQueryParams.builder().withOutputs`.
     */
    private List<String> outputs;

    /**
     * Maximum staleness overrides for any output features or intermediate features.
     * Set by `OnlineQueryParams.builder().withStaleness`.
     */
    private Map<String, Duration> staleness;

    /**
     * Metadata to attach to the query. Set by `OnlineQueryParams.builder().withMeta`.
     */
    private Map<String, String> meta;

    private List<String> tags;

    /**
     * Triggers returning metadata about the query execution. This could make the query slightly
     * slower. For more information, see https://docs.chalk.ai/docs/query-basics.
     */
    private boolean includeMeta;

    /**
     * If true, the output of each of the query plan stages will be stored
     * in S3/GCS. This will dramatically impact the performance of the query,
     * so it should only be used for debugging.
     * These files will be visible in the web dashboard's query detail view, and
     * can be downloaded in full by clicking on a plan node in the query plan visualizer.
     */
    private boolean storePlanStages;

    /**
     * Log the query execution plan. Requests using `explain=True` will be slower
     * than requests using `explain=False`.
     * If `True`, 'includeMeta' will be set to `True` as well.
     */
    private boolean explain;

    /**
     * The environment under which to run the resolvers.
     */
    private String environmentId;

    /**
     * If specified, Chalk will route your request to the relevant preview deployment.
     */
    private String previewDeploymentId;

    /**
     * The semantic name for the query you're making, for example, `"loan_application_model"`.
     * Typically, each query that you make from your application should have a name.
     * Chalk will present metrics and dashboard functionality grouped by 'query_name'.
     */
    private String queryName;

    private String queryNameVersion;

    /**
     * You can specify a correlation ID to be used in logs and web interfaces.
     * This should be globally unique, i.e. a `uuid` or similar. Logs generated
     * during the execution of your query will be tagged with this correlation id.
     */
    private String correlationId;

    /**
     * If specified, Chalk will route your request to the relevant branch.
     */
    private String branch;

    /**
     * The time at which to evaluate the query. If not specified, the current time will be used.
     * The length of this list must be the same as the length of the values in `inputs`.
     */
     private List<ZonedDateTime> now;

    /**
     * If specified, *all* required_resolver_tags must be present on a resolver for it to be
     * considered eligible to execute.
     */
    private List<String> requiredResolverTags;

    /**
     * Map of additional options to pass to the Chalk query engine. Values may be provided
     * as part of conversations with Chalk Support to enable or disable specific functionality.
     */
    private Map<String, Object> plannerOptions;

    /**
     * Timeout for the query. Defaults to no timeout.
     */
    private Duration timeout;


    @AllArgsConstructor
    @NoArgsConstructor
    public static class Builder<T extends Builder<T>> {
        protected Map<String, List<?>> inputs;
        protected List<String> outputs;
        protected Map<String, Duration> staleness;
        protected Map<String, String> meta;
        protected List<String> tags;
        protected boolean includeMeta;
        protected boolean storePlanStages;
        protected boolean explain;
        protected String environmentId;
        protected String previewDeploymentId;
        protected String queryName;
        protected String queryNameVersion;
        protected String correlationId;
        protected String branch;
        protected List<ZonedDateTime> now;
        protected List<String> requiredResolverTags;
        protected Map<String, Object> plannerOptions;
        protected Duration timeout;

        protected T _withInput(String fqn, List<?> values) {
            if (this.inputs == null) {
                this.inputs = new HashMap<>();
            }
            this.inputs.put(fqn, values);
            return (T) this;
        }

        public <K> T _withInput(Feature<K> feature, K... value) {
            return this._withInput(feature.getFqn(), Arrays.asList(value));
        }

        public <K> T _withInput(Feature<K> feature, List<K> value) {
            return this._withInput(feature.getFqn(), value);
        }

        protected T _withInputs(Map<String, List<?>> inputs) {
            if (this.inputs == null) {
                this.inputs = new HashMap<>();
            }
            this.inputs.putAll(inputs);
            return (T) this;
        }

        protected T _withOutputs(String... outputs) {
            if (this.outputs == null) {
                this.outputs = new ArrayList<>();
            }
            this.outputs.addAll(Arrays.asList(outputs));
            return (T) this;
        }

        protected T _withOutputs(List<String> outputs) {
            if (this.outputs == null) {
                this.outputs = new ArrayList<>();
            }
            this.outputs.addAll(outputs);
            return (T) this;
        }

        public T _withOutputs(Feature<?>... outputs) {
            var outputFqns = new String[outputs.length];
            for (int i = 0; i < outputs.length; i++) {
                outputFqns[i] = outputs[i].getFqn();
            }
            return this._withOutputs(outputFqns);
        }

        public T _withOutputs(FeaturesBase... outputs) {
            var outputFqns = new String[outputs.length];
            for (int i = 0; i < outputs.length; i++) {
                outputFqns[i] = outputs[i].getFqn();
            }
            return this._withOutputs(outputFqns);
        }

        // withStaleness takes a map of feature FQN to duration and adds them to the staleness map
        public T withStaleness(Map<String, Duration> staleness) {
            if (this.staleness == null) {
                this.staleness = new HashMap<>();
            }
            this.staleness.putAll(staleness);
            return (T) this;
        }

        // withMeta takes a map of meta key to meta value and adds them to the meta map
        public T withMeta(Map<String, String> meta) {
            if (this.meta == null) {
                this.meta = new HashMap<>();
            }
            this.meta.putAll(meta);
            return (T) this;
        }

        // withTags takes a List of tags and adds them to the tags list
        public T withTags(List<String> tags) {
            if (this.tags == null) {
                this.tags = new ArrayList<>();
            }
            this.tags.addAll(tags);
            return (T) this;
        }

        // withTags takes a one or more tags and adds them to the tags list
        public T withTags(String... tags) {
            return this.withTags(Arrays.asList(tags));
        }

        // withTag adds a single tag to the tags list
        public T withTag(String tag) {
            return this.withTags(Arrays.asList(tag));
        }

        public T withRequiredResolverTags(List<String> requiredResolverTags) {
            if (this.requiredResolverTags == null) {
                this.requiredResolverTags = new ArrayList<>();
            }
            this.requiredResolverTags.addAll(requiredResolverTags);
            return (T) this;
        }

        public T withRequiredResolverTags(String... requiredResolverTags) {
            return this.withRequiredResolverTags(Arrays.asList(requiredResolverTags));
        }

        public T withRequiredResolverTag(String requiredResolverTag) {
            return this.withRequiredResolverTags(Arrays.asList(requiredResolverTag));
        }

        public T withPlannerOptions(Map<String, Object> plannerOptions) {
            if (this.plannerOptions == null) {
                this.plannerOptions = new HashMap<>();
            }
            this.plannerOptions.putAll(plannerOptions);
            return (T) this;
        }

        public T withPlannerOption(String key, Object value) {
            if (this.plannerOptions == null) {
                this.plannerOptions = new HashMap<>();
            }
            this.plannerOptions.put(key, value);
            return (T) this;
        }

        public T withTimeout(Duration timeout) {
            this.timeout = timeout;
            return (T) this;
        }

        // withNow takes a list of ZonedDateTimes and adds them to the now list
        public T withNow(List<ZonedDateTime> now) {
            if (this.now == null) {
                this.now = new ArrayList<>();
            }
            this.now.addAll(now);
            return (T) this;
        }

        // withIncludeMeta sets the includeMeta flag
        public T withIncludeMeta(boolean includeMeta) {
            this.includeMeta = includeMeta;
            return (T) this;
        }

        // withStorePlanStages sets the storePlanStages flag
        public T withStorePlanStages(boolean storePlanStages) {
            this.storePlanStages = storePlanStages;
            return (T) this;
        }

        // withExplain sets the explain flag
        public T withExplain(boolean explain) {
            this.explain = explain;
            return (T) this;
        }

        // withEnvironmentId sets the environmentId
        public T withEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return (T) this;
        }

        // withPreviewDeploymentId sets the previewDeploymentId
        public T withPreviewDeploymentId(String previewDeploymentId) {
            this.previewDeploymentId = previewDeploymentId;
            return (T) this;
        }

        // withQueryName sets the queryName
        public T withQueryName(String queryName) {
            this.queryName = queryName;
            return (T) this;
        }

        // withQueryNameVersion sets the queryNameVersion
        public T withQueryNameVersion(String queryNameVersion) {
            this.queryNameVersion = queryNameVersion;
            return (T) this;
        }

        // withCorrelationId sets the correlationId
        public T withCorrelationId(String correlationId) {
            this.correlationId = correlationId;
            return (T) this;
        }

        // withBranch sets the branch
        public T withBranch(String branch) {
            this.branch = branch;
            return (T) this;
        }

        public OnlineQueryParams build() {
            return new OnlineQueryParams(
                    inputs,
                    outputs,
                    staleness,
                    meta,
                    tags,
                    includeMeta,
                    storePlanStages,
                    explain,
                    environmentId,
                    previewDeploymentId,
                    queryName,
                    queryNameVersion,
                    correlationId,
                    branch,
                    now,
                    requiredResolverTags,
                    plannerOptions,
                    timeout
            );
        }
    }

    public static class BuilderComplete extends Builder<BuilderComplete> {
        public BuilderComplete(
            Map<String, List<?>> inputs,
            List<String> outputs,
            Map<String, Duration> staleness,
            Map<String, String> meta,
            List<String> tags,
            boolean includeMeta,
            boolean storePlanStages,
            boolean explain,
            String environmentId,
            String previewDeploymentId,
            String queryName,
            String queryNameVersion,
            String correlationId,
            String branch,
            List<ZonedDateTime> now,
            List<String> requiredResolverTags,
            Map<String, Object> plannerOptions,
            Duration timeout
        ) {
            super(
                inputs,
                outputs,
                staleness,
                meta,
                tags,
                includeMeta,
                storePlanStages,
                explain,
                environmentId,
                previewDeploymentId,
                queryName,
                queryNameVersion,
                correlationId,
                branch,
                now,
                requiredResolverTags,
                plannerOptions,
                timeout
            );
        }

        public BuilderComplete withInput(String fqn, List<?> values) {
            return this._withInput(fqn, values);
        }

        public BuilderComplete withInputs(Map<String, List<?>> inputs) {
            return this._withInputs(inputs);
        }

        @SafeVarargs
        public final <T> BuilderComplete withInput(Feature<T> feature, T... values) {
            return this._withInput(feature, values);
        }

        public final <T> BuilderComplete withInput(Feature<T> feature, List<T> values) {
            return this._withInput(feature, values);
        }

        public BuilderComplete withOutputs(String... outputs) {
            return this._withOutputs(outputs);
        }

        public BuilderComplete withOutputs(List<String> outputs) {
            return this._withOutputs(outputs);
        }

        public BuilderComplete withOutputs(Feature<?>... outputs) {
            return this._withOutputs(outputs);
        }

        public BuilderComplete withOutputs(FeaturesBase... outputs) {
            return this._withOutputs(outputs);
        }

        public OnlineQueryParamsComplete build() {
            return new OnlineQueryParamsComplete(
                inputs,
                outputs,
                staleness,
                meta,
                tags,
                includeMeta,
                storePlanStages,
                explain,
                environmentId,
                previewDeploymentId,
                queryName,
                queryNameVersion,
                correlationId,
                branch,
                now,
                requiredResolverTags,
                plannerOptions,
                timeout
            );
        }
    }

    public static class BuilderWithInputs extends Builder<BuilderWithInputs> {
        public BuilderWithInputs(
            Map<String, List<?>> inputs,
            List<String> outputs,
            Map<String, Duration> staleness,
            Map<String, String> meta,
            List<String> tags,
            boolean includeMeta,
            boolean storePlanStages,
            boolean explain,
            String environmentId,
            String previewDeploymentId,
            String queryName,
            String queryNameVersion,
            String correlationId,
            String branch,
            List<ZonedDateTime> now,
            List<String> requiredResolverTags,
            Map<String, Object> plannerOptions,
            Duration timeout
        ) {
            super(
                inputs,
                outputs,
                staleness,
                meta,
                tags,
                includeMeta,
                storePlanStages,
                explain,
                environmentId,
                previewDeploymentId,
                queryName,
                queryNameVersion,
                correlationId,
                branch,
                now,
                requiredResolverTags,
                plannerOptions,
                timeout
            );
        }

        private BuilderComplete newBuilderComplete() {
            return new BuilderComplete(
                inputs,
                outputs,
                staleness,
                meta,
                tags,
                includeMeta,
                storePlanStages,
                explain,
                environmentId,
                previewDeploymentId,
                queryName,
                queryNameVersion,
                correlationId,
                branch,
                now,
                requiredResolverTags,
                plannerOptions,
                timeout
                );
        }

        public BuilderWithInputs withInput(String fqn, List<?> values) {
            return this._withInput(fqn, values);
        }

        public BuilderWithInputs withInputs(Map<String, List<?>> inputs) {
            return this._withInputs(inputs);
        }

        @SafeVarargs
        public final <T> BuilderWithInputs withInput(Feature<T> feature, T... values) {
            return this._withInput(feature, values);
        }

        public final <T> BuilderWithInputs withInput(Feature<T> feature, List<T> values) {
            return this._withInput(feature, values);
        }

        public BuilderComplete withOutputs(String... outputs) {
            return this.newBuilderComplete()._withOutputs(outputs);
        }

        public BuilderComplete withOutputs(List<String> outputs) {
            return this.newBuilderComplete()._withOutputs(outputs);
        }

        public BuilderComplete withOutputs(Feature<?>... outputs) {
            return this.newBuilderComplete()._withOutputs(outputs);
        }

        public BuilderComplete withOutputs(FeaturesBase... outputs) {
            return this.newBuilderComplete()._withOutputs(outputs);
        }
    }

    public static class BuilderWithOutputs extends Builder<BuilderWithOutputs> {
        public BuilderWithOutputs(
                Map<String, List<?>> inputs,
                List<String> outputs,
                Map<String, Duration> staleness,
                Map<String, String> meta,
                List<String> tags,
                boolean includeMeta,
                boolean storePlanStages,
                boolean explain,
                String environmentId,
                String previewDeploymentId,
                String queryName,
                String queryNameVersion,
                String correlationId,
                String branch,
                List<ZonedDateTime> now,
                List<String> requiredResolverTags,
                Map<String, Object> plannerOptions,
                Duration timeout
        ) {
            super(
                inputs,
                outputs,
                staleness,
                meta,
                tags,
                includeMeta,
                storePlanStages,
                explain,
                environmentId,
                previewDeploymentId,
                queryName,
                queryNameVersion,
                correlationId,
                branch,
                now,
                requiredResolverTags,
                plannerOptions,
                timeout
            );
        }


        public BuilderComplete newBuilderComplete() {
            return new BuilderComplete(
                inputs,
                outputs,
                staleness,
                meta,
                tags,
                includeMeta,
                storePlanStages,
                explain,
                environmentId,
                previewDeploymentId,
                queryName,
                queryNameVersion,
                correlationId,
                branch,
                now,
                requiredResolverTags,
                plannerOptions,
                timeout
            );
        }

        public BuilderComplete withInput(String fqn, List<?> values) {
            return newBuilderComplete()._withInput(fqn, values);
        }

        @SafeVarargs
        public final <T> BuilderComplete withInput(Feature<T> feature, T... values) {
            return newBuilderComplete().withInput(feature, values);
        }

        public final <T> BuilderComplete withInput(Feature<T> feature, List<T> values) {
            return newBuilderComplete().withInput(feature, values);
        }


        public final <T> BuilderComplete withInputs(Map<String, List<?>> inputs) {
            return newBuilderComplete()._withInputs(inputs);
        }

        public BuilderWithOutputs withOutputs(String... outputs) {
            return this._withOutputs(outputs);
        }

        public BuilderWithOutputs withOutputs(List<String> outputs) {
            return this._withOutputs(outputs);
        }

        public BuilderWithOutputs withOutputs(Feature<?>... outputs) {
            return this._withOutputs(outputs);
        }

        public BuilderWithOutputs withOutputs(FeaturesBase... outputs) {
            return this._withOutputs(outputs);
        }
    }

    @NoArgsConstructor
    public static class BuilderSeed extends Builder<BuilderSeed> {
        public BuilderSeed(
                Map<String, List<?>> inputs,
                List<String> outputs,
                Map<String, Duration> staleness,
                Map<String, String> meta,
                List<String> tags,
                boolean includeMeta,
                boolean storePlanStages,
                boolean explain,
                String environmentId,
                String previewDeploymentId,
                String queryName,
                String queryNameVersion,
                String correlationId,
                String branch,
                List<ZonedDateTime> now,
                List<String> requiredResolverTags,
                Map<String, Object> plannerOptions,
                Duration timeout
        ) {
            super(
                inputs,
                outputs,
                staleness,
                meta,
                tags,
                includeMeta,
                storePlanStages,
                explain,
                environmentId,
                previewDeploymentId,
                queryName,
                queryNameVersion,
                correlationId,
                branch,
                now,
                requiredResolverTags,
                plannerOptions,
                timeout
            );
        }

        public BuilderWithInputs newBuilderWithInputs() {
            return new BuilderWithInputs(
                    inputs,
                    outputs,
                    staleness,
                    meta,
                    tags,
                    includeMeta,
                    storePlanStages,
                    explain,
                    environmentId,
                    previewDeploymentId,
                    queryName,
                    queryNameVersion,
                    correlationId,
                    branch,
                    now,
                    requiredResolverTags,
                    plannerOptions,
                    timeout
                );
        }

        public BuilderWithOutputs newBuilderWithOutputs() {
            return new BuilderWithOutputs(
                inputs,
                outputs,
                staleness,
                meta,
                tags,
                includeMeta,
                storePlanStages,
                explain,
                environmentId,
                previewDeploymentId,
                queryName,
                queryNameVersion,
                correlationId,
                branch,
                now,
                requiredResolverTags,
                plannerOptions,
                timeout
         );
        }

        public BuilderWithInputs withInput(String fqn, List<?> values) {
            return newBuilderWithInputs().withInput(fqn, values);
        }

        public BuilderWithInputs withInputs(Map<String, List<?>> inputs) {
            return newBuilderWithInputs().withInputs(inputs);
        }

        @SafeVarargs
        public final <T> BuilderWithInputs withInput(Feature<T> feature, T... value) {
            return newBuilderWithInputs().withInput(feature, value);
        }

        public final <T> BuilderWithInputs withInput(Feature<T> feature, List<T> value) {
            return newBuilderWithInputs().withInput(feature, value);
        }

        // withOutputs takes either one output or a list of outputs and adds them to the outputs list
        public BuilderWithOutputs withOutputs(String... outputs) {
            return newBuilderWithOutputs().withOutputs(outputs);
        }

        public BuilderWithOutputs withOutputs(List<String> outputs) {
            return newBuilderWithOutputs().withOutputs(outputs);
        }

        public BuilderWithOutputs withOutputs(Feature<?>... outputs) {
            return newBuilderWithOutputs().withOutputs(outputs);
        }

        public BuilderWithOutputs withOutputs(WindowedFeaturesClass... outputs) {
            return newBuilderWithOutputs().withOutputs(outputs);
        }

        public BuilderWithOutputs withOutputs(StructFeaturesClass... outputs) {
            return newBuilderWithOutputs().withOutputs(outputs);
        }
    }

    public static BuilderSeed builder() {
        return new BuilderSeed();
    }
}

