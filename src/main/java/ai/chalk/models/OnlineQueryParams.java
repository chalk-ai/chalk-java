package ai.chalk.models;

import ai.chalk.features.Feature;
import ai.chalk.features.StructFeaturesClass;
import ai.chalk.features.WindowedFeaturesClass;
import ai.chalk.internal.Utils;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

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
    // The features for which there are known values, mapped
    // to those values. Set by `OnlineQueryParams.builder().withInput`.

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

    // tags is a list of tags to apply to the query.

    private List<String> tags;
    private boolean includeMeta;
    private boolean includeMetrics;
    private String environmentId;
    private String previewDeploymentId;
    private String queryName;
    private String correlationId;
    private String branch;


    @AllArgsConstructor
    @NoArgsConstructor
    public static class Builder<T extends Builder<T>> {
        protected Map<String, List<?>> inputs;
        protected List<String> outputs;
        protected Map<String, Duration> staleness;
        protected Map<String, String> meta;
        protected List<String> tags;
        protected boolean includeMeta;
        protected boolean includeMetrics;
        protected String environmentId;
        protected String previewDeploymentId;
        protected String queryName;
        protected String correlationId;
        protected String branch;

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
            return (T) this._withOutputs(outputFqns);
        }

        public T _withOutputs(WindowedFeaturesClass... outputs) {
            var outputFqns = new String[outputs.length];
            for (int i = 0; i < outputs.length; i++) {
                outputFqns[i] = outputs[i].getFqn();
            }
            return this._withOutputs(outputFqns);
        }

        public T _withOutputs(StructFeaturesClass... outputs) {
            var outputFqns = new String[outputs.length];
            for (int i = 0; i < outputs.length; i++) {
                outputFqns[i] = outputs[i].getFqn();
            }
            return (T) this._withOutputs(outputFqns);
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

        // withIncludeMeta sets the includeMeta flag
        public T withIncludeMeta(boolean includeMeta) {
            this.includeMeta = includeMeta;
            return (T) this;
        }

        // withIncludeMetrics sets the includeMetrics flag
        public T withIncludeMetrics(boolean includeMetrics) {
            this.includeMetrics = includeMetrics;
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
            return new OnlineQueryParams(inputs, outputs, staleness, meta, tags, includeMeta, includeMetrics, environmentId, previewDeploymentId, queryName, correlationId, branch);
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
            boolean includeMetrics,
            String environmentId,
            String previewDeploymentId,
            String queryName,
            String correlationId,
            String branch
        ) {
            super(inputs, outputs, staleness, meta, tags, includeMeta, includeMetrics, environmentId, previewDeploymentId, queryName, correlationId, branch);
        }

        public BuilderComplete withInput(String fqn, List<?> values) {
            return this._withInput(fqn, values);
        }

        public BuilderComplete withInputs(Map<String, List<?>> inputs) {
            return this._withInputs(inputs);
        }

        @SafeVarargs
        public final <T> BuilderComplete withInput(Feature<T> feature, T... values) {
            return this._withInput(feature.getFqn(), Arrays.asList(values));
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

        public BuilderComplete withOutputs(WindowedFeaturesClass... outputs) {
            return this._withOutputs(outputs);
        }

        public BuilderComplete withOutputs(StructFeaturesClass... outputs) {
            return this._withOutputs(outputs);
        }

        public OnlineQueryParamsComplete build() {
            return new OnlineQueryParamsComplete(inputs, outputs, staleness, meta, tags, includeMeta, includeMetrics, environmentId, previewDeploymentId, queryName, correlationId, branch);
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
            boolean includeMetrics,
            String environmentId,
            String previewDeploymentId,
            String queryName,
            String correlationId,
            String branch
        ) {
            super(inputs, outputs, staleness, meta, tags, includeMeta, includeMetrics, environmentId, previewDeploymentId, queryName, correlationId, branch);
        }

        private BuilderComplete newBuilderComplete() {
            return new BuilderComplete(inputs, outputs, staleness, meta, tags, includeMeta, includeMetrics, environmentId, previewDeploymentId, queryName, correlationId, branch);
        }

        public BuilderWithInputs withInput(String fqn, List<?> values) {
            return this._withInput(fqn, values);
        }

        public BuilderWithInputs withInputs(Map<String, List<?>> inputs) {
            return this._withInputs(inputs);
        }

        @SafeVarargs
        public final <T> BuilderWithInputs withInput(Feature<T> feature, T... values) {
            return this._withInput(feature.getFqn(), Arrays.asList(values));
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

        public BuilderComplete withOutputs(WindowedFeaturesClass... outputs) {
            return this.newBuilderComplete()._withOutputs(outputs);
        }

        public BuilderComplete withOutputs(StructFeaturesClass... outputs) {
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
                boolean includeMetrics,
                String environmentId,
                String previewDeploymentId,
                String queryName,
                String correlationId,
                String branch
        ) {
            super(inputs, outputs, staleness, meta, tags, includeMeta, includeMetrics, environmentId, previewDeploymentId, queryName, correlationId, branch);
        }

        public BuilderComplete newBuilderComplete() {
            return new BuilderComplete(inputs, outputs, staleness, meta, tags, includeMeta, includeMetrics, environmentId, previewDeploymentId, queryName, correlationId, branch);
        }

        public BuilderComplete withInput(String fqn, List<?> values) {
            return newBuilderComplete()._withInput(fqn, values);
        }

        @SafeVarargs
        public final <T> BuilderComplete withInput(Feature<T> feature, T... values) {
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

        public BuilderWithOutputs withOutputs(WindowedFeaturesClass... outputs) {
            return this._withOutputs(outputs);
        }

        public BuilderWithOutputs withOutputs(StructFeaturesClass... outputs) {
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
                boolean includeMetrics,
                String environmentId,
                String previewDeploymentId,
                String queryName,
                String correlationId,
                String branch
        ) {
            super(inputs, outputs, staleness, meta, tags, includeMeta, includeMetrics, environmentId, previewDeploymentId, queryName, correlationId, branch);
        }

        public BuilderWithInputs newBuilderWithInputs() {
            return new BuilderWithInputs(inputs, outputs, staleness, meta, tags, includeMeta, includeMetrics, environmentId, previewDeploymentId, queryName, correlationId, branch);
        }

        public BuilderWithOutputs newBuilderWithOutputs() {
            return new BuilderWithOutputs(inputs, outputs, staleness, meta, tags, includeMeta, includeMetrics, environmentId, previewDeploymentId, queryName, correlationId, branch);
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

