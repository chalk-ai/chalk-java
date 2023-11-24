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
 *         .withInput("user.id", new int[] {1, 2, 3})
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
    private Map<String, Object> inputs;

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
    public static class Builder {
        protected Map<String, Object> inputs;
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

        protected <T extends Builder> T _withInput(String fqn, Object... values) {
            if (this.inputs == null) {
                this.inputs = new HashMap<>();
            }
            if (values.length == 1 && values[0].getClass().isArray()) {
                // Cast and use the inner array as the actual argument
                values = Utils.convertToArrayOfObjects(values[0]);
            }
            this.inputs.put(fqn, values);
            return (T) this;
        }

        public <T extends Builder, K> T _withInput(Feature<K> feature, K... value) {
            return this._withInput(feature.getFqn(), value);
        }

        protected <T extends Builder> T _withInputs(Map<String, Object> inputs) {
            if (this.inputs == null) {
                this.inputs = new HashMap<>();
            }
            this.inputs.putAll(inputs);
            return (T) this;
        }

        protected <T extends Builder> T _withOutputs(String... outputs) {
            if (this.outputs == null) {
                this.outputs = new ArrayList<>();
            }
            this.outputs.addAll(Arrays.asList(outputs));
            return (T) this;
        }

        public <T extends Builder> T _withOutputs(Feature<?>... outputs) {
            var outputFqns = new String[outputs.length];
            for (int i = 0; i < outputs.length; i++) {
                outputFqns[i] = outputs[i].getFqn();
            }
            return (T) this._withOutputs(outputFqns);
        }

        public <T extends Builder> T _withOutputs(WindowedFeaturesClass... outputs) {
            var outputFqns = new String[outputs.length];
            for (int i = 0; i < outputs.length; i++) {
                outputFqns[i] = outputs[i].getFqn();
            }
            return (T) this._withOutputs(outputFqns);
        }

        public <T extends Builder> T _withOutputs(StructFeaturesClass... outputs) {
            var outputFqns = new String[outputs.length];
            for (int i = 0; i < outputs.length; i++) {
                outputFqns[i] = outputs[i].getFqn();
            }
            return (T) this._withOutputs(outputFqns);
        }

        // withStaleness takes alternating key, value pairs and adds them to the staleness map
        public <T extends Builder> T _withStaleness(Object... staleness) {
            if (this.staleness == null) {
                this.staleness = new HashMap<>();
            }
            if (staleness.length % 2 != 0) {
                throw new IllegalArgumentException("staleness must be an even number of alternating keys and values");
            }
            for (int i = 0; i < staleness.length; i += 2) {
                if (!(staleness[i] instanceof String)) {
                    throw new IllegalArgumentException("staleness must be an even number of alternating keys and values");
                }
                this.staleness.put((String) staleness[i], (Duration) staleness[i + 1]);
            }
            return (T) this;
        }

        // withMeta adds a single key, value pair to the meta map
        public <T extends Builder> T _withMeta(String key, String value) {
            if (this.meta == null) {
                this.meta = new HashMap<>();
            }
            this.meta.put(key, value);
            return (T) this;
        }

        // withTags takes either multiple arguments or a single list of tags and adds them to the tags list
        public <T extends Builder> T _withTags(Object... tags) {
            if (this.tags == null) {
                this.tags = new ArrayList<>();
            }
            if (tags.length == 1 && tags[0] instanceof List) {
                this.tags.addAll((List<String>) tags[0]);
            } else {
                for (Object tag : tags) {
                    this.tags.add((String) tag);
                }
            }
            return (T) this;
        }

        // withTag adds a single tag to the tags list
        public <T extends Builder> T _withTag(String tag) {
            return this._withTags(tag);
        }

        // withIncludeMeta sets the includeMeta flag
        public <T extends Builder> T _withIncludeMeta(boolean includeMeta) {
            this.includeMeta = includeMeta;
            return (T) this;
        }

        // withIncludeMetrics sets the includeMetrics flag
        public <T extends Builder> T _withIncludeMetrics(boolean includeMetrics) {
            this.includeMetrics = includeMetrics;
            return (T) this;
        }

        // withEnvironmentId sets the environmentId
        public <T extends Builder> T _withEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return (T) this;
        }

        // withPreviewDeploymentId sets the previewDeploymentId
        public <T extends Builder> T _withPreviewDeploymentId(String previewDeploymentId) {
            this.previewDeploymentId = previewDeploymentId;
            return (T) this;
        }

        // withQueryName sets the queryName
        public <T extends Builder> T _withQueryName(String queryName) {
            this.queryName = queryName;
            return (T) this;
        }

        // withCorrelationId sets the correlationId
        public <T extends Builder> T _withCorrelationId(String correlationId) {
            this.correlationId = correlationId;
            return (T) this;
        }

        // withBranch sets the branch
        public <T extends Builder> T _withBranch(String branch) {
            this.branch = branch;
            return (T) this;
        }

        public OnlineQueryParams build() {
            return new OnlineQueryParams(inputs, outputs, staleness, meta, tags, includeMeta, includeMetrics, environmentId, previewDeploymentId, queryName, correlationId, branch);
        }

    }

    public static class BuilderComplete extends Builder {
        public BuilderComplete(
            Map<String, Object> inputs,
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

        public BuilderComplete withInput(String fqn, Object... values) {
            return this._withInput(fqn, values);
        }

        public BuilderComplete withInputs(Map<String, Object> inputs) {
            return this._withInputs(inputs);
        }

        @SafeVarargs
        public final <T> BuilderComplete withInput(Feature<T> feature, T... values) {
            return this._withInput(feature.getFqn(), values);
        }

        public BuilderComplete withOutputs(String... outputs) {
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

        public BuilderComplete withStaleness(Object... staleness) {
            return this._withStaleness(staleness);
        }

        public BuilderComplete withMeta(String key, String value) {
            return this._withMeta(key, value);
        }

        public BuilderComplete withTags(Object... tags) {
            return this._withTags(tags);
        }

        public BuilderComplete withTag(String tag) {
            return this._withTag(tag);
        }

        public BuilderComplete withIncludeMeta(boolean includeMeta) {
            return this._withIncludeMeta(includeMeta);
        }

        public BuilderComplete withIncludeMetrics(boolean includeMetrics) {
            return this._withIncludeMetrics(includeMetrics);
        }

        public BuilderComplete withEnvironmentId(String environmentId) {
            return this._withEnvironmentId(environmentId);
        }

        public BuilderComplete withPreviewDeploymentId(String previewDeploymentId) {
            return this._withPreviewDeploymentId(previewDeploymentId);
        }

        public BuilderComplete withQueryName(String queryName) {
            return this._withQueryName(queryName);
        }

        public BuilderComplete withCorrelationId(String correlationId) {
            return this._withCorrelationId(correlationId);
        }

        public BuilderComplete withBranch(String branch) {
            return this._withBranch(branch);
        }

        public OnlineQueryParamsComplete build() {
            return new OnlineQueryParamsComplete(inputs, outputs, staleness, meta, tags, includeMeta, includeMetrics, environmentId, previewDeploymentId, queryName, correlationId, branch);
        }
    }

    public static class BuilderWithInputs extends Builder {
        public BuilderWithInputs(
            Map<String, Object> inputs,
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

        public BuilderWithInputs withInput(String fqn, Object... values) {
            return this._withInput(fqn, values);
        }

        public BuilderWithInputs withInputs(Map<String, Object> inputs) {
            return this._withInputs(inputs);
        }

        @SafeVarargs
        public final <T> BuilderWithInputs withInput(Feature<T> feature, T... values) {
            return this._withInput(feature.getFqn(), values);
        }

        public BuilderComplete withOutputs(String... outputs) {
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

        public BuilderWithInputs withStaleness(Object... staleness) {
            return this._withStaleness(staleness);
        }

        public BuilderWithInputs withMeta(String key, String value) {
            return this._withMeta(key, value);
        }

        public BuilderWithInputs withTags(Object... tags) {
            return this._withTags(tags);
        }

        public BuilderWithInputs withTag(String tag) {
            return this._withTag(tag);
        }

        public BuilderWithInputs withIncludeMeta(boolean includeMeta) {
            return this._withIncludeMeta(includeMeta);
        }

        public BuilderWithInputs withIncludeMetrics(boolean includeMetrics) {
            return this._withIncludeMetrics(includeMetrics);
        }

        public BuilderWithInputs withEnvironmentId(String environmentId) {
            return this._withEnvironmentId(environmentId);
        }

        public BuilderWithInputs withPreviewDeploymentId(String previewDeploymentId) {
            return this._withPreviewDeploymentId(previewDeploymentId);
        }

        public BuilderWithInputs withQueryName(String queryName) {
            return this._withQueryName(queryName);
        }

        public BuilderWithInputs withCorrelationId(String correlationId) {
            return this._withCorrelationId(correlationId);
        }

        public BuilderWithInputs withBranch(String branch) {
            return this._withBranch(branch);
        }
    }

    public static class BuilderWithOutputs extends Builder {
        public BuilderWithOutputs(
                Map<String, Object> inputs,
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

        public BuilderComplete withInput(String fqn, Object... values) {
            return newBuilderComplete()._withInput(fqn, values);
        }

        @SafeVarargs
        public final <T> BuilderComplete withInput(Feature<T> feature, T... values) {
            return newBuilderComplete()._withInput(feature.getFqn(), values);
        }


        public final <T> BuilderComplete withInputs(Map<String, Object> inputs) {
            return newBuilderComplete()._withInputs(inputs);
        }

        public BuilderWithOutputs withOutputs(String... outputs) {
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

        public BuilderWithOutputs withStaleness(Object... staleness) {
            return this._withStaleness(staleness);
        }

        public BuilderWithOutputs withMeta(String key, String value) {
            return this._withMeta(key, value);
        }

        public BuilderWithOutputs withTags(Object... tags) {
            return this._withTags(tags);
        }

        public BuilderWithOutputs withTag(String tag) {
            return this._withTag(tag);
        }

        public BuilderWithOutputs withIncludeMeta(boolean includeMeta) {
            return this._withIncludeMeta(includeMeta);
        }

        public BuilderWithOutputs withIncludeMetrics(boolean includeMetrics) {
            return this._withIncludeMetrics(includeMetrics);
        }

        public BuilderWithOutputs withEnvironmentId(String environmentId) {
            return this._withEnvironmentId(environmentId);
        }

        public BuilderWithOutputs withPreviewDeploymentId(String previewDeploymentId) {
            return this._withPreviewDeploymentId(previewDeploymentId);
        }

        public BuilderWithOutputs withQueryName(String queryName) {
            return this._withQueryName(queryName);
        }

        public BuilderWithOutputs withCorrelationId(String correlationId) {
            return this._withCorrelationId(correlationId);
        }

        public BuilderWithOutputs withBranch(String branch) {
            return this._withBranch(branch);
        }
    }

    @NoArgsConstructor
    public static class BuilderSeed extends Builder {
        public BuilderSeed(
                Map<String, Object> inputs,
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

        // withInput adds a single feature FQN, value pair to the inputs map
        public BuilderWithInputs withInput(String fqn, Object... values) {
            return newBuilderWithInputs().withInput(fqn, values);
        }

        public BuilderWithInputs withInputs(Map<String, Object> inputs) {
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

