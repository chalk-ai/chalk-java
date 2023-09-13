package chalk.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.time.Duration;
import java.util.Map;


/**
 * OnlineQueryParams holds the parameters for an online query.
 * It is the starting point for constructing an instance of
 * OnlineQueryParamsComplete. Both `withInputs` and `withOutputs`
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
 *         result = client.onlineQuery(params);
 *         }
 *     </pre>
 * </p>
 */
@Getter @AllArgsConstructor
public class OnlineQueryParams {
    // The features for which there are known values, mapped
    // to those values. Set by `OnlineQueryParams.builder().withInputs`.

    /**
     * The features for which there are known values, mapped
     * to those values. Set by
     * `OnlineQueryParams.builder().withInputs`.
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

        // withInputs take alternating key, value pairs and adds them to the inputs map
        public Builder withInputs(Object... inputs) {
            if (this.inputs == null) {
                this.inputs = new HashMap<>();
            }
            if (inputs.length % 2 != 0) {
                throw new IllegalArgumentException("inputs must be an even number of alternating keys and values");
            }
            for (int i = 0; i < inputs.length; i += 2) {
                if (!(inputs[i] instanceof String)) {
                    throw new IllegalArgumentException("inputs must be an even number of alternating keys and values");
                }
                this.inputs.put((String) inputs[i], inputs[i + 1]);
            }
            return this;
        }

        // withOutputs takes either multiple arguments or a single list of outputs and adds them to the outputs list
        public Builder withOutputs(Object... outputs) {
            if (this.outputs == null) {
                this.outputs = new ArrayList<>();
            }
            if (outputs.length == 1 && outputs[0] instanceof List) {
                this.outputs.addAll((List<String>) outputs[0]);
            } else {
                for (Object output : outputs) {
                    this.outputs.add((String) output);
                }
            }
            return this;
        }


        // withOutput adds a single output to the outputs list
        public Builder withOutput(String output) {
            return this.withOutputs(output);
        }

        // withStaleness takes alternating key, value pairs and adds them to the staleness map
        public Builder withStaleness(Object... staleness) {
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
            return this;
        }

        // withMeta adds a single key, value pair to the meta map
        public Builder withMeta(String key, String value) {
            if (this.meta == null) {
                this.meta = new HashMap<>();
            }
            this.meta.put(key, value);
            return this;
        }

        // withTags takes either multiple arguments or a single list of tags and adds them to the tags list
        public Builder withTags(Object... tags) {
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
            return this;
        }

        // withTag adds a single tag to the tags list
        public Builder withTag(String tag) {
            return this.withTags(tag);
        }

        // withIncludeMeta sets the includeMeta flag
        public Builder withIncludeMeta(boolean includeMeta) {
            this.includeMeta = includeMeta;
            return this;
        }

        // withIncludeMetrics sets the includeMetrics flag
        public Builder withIncludeMetrics(boolean includeMetrics) {
            this.includeMetrics = includeMetrics;
            return this;
        }

        // withEnvironmentId sets the environmentId
        public Builder withEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }

        // withPreviewDeploymentId sets the previewDeploymentId
        public Builder withPreviewDeploymentId(String previewDeploymentId) {
            this.previewDeploymentId = previewDeploymentId;
            return this;
        }

        // withQueryName sets the queryName
        public Builder withQueryName(String queryName) {
            this.queryName = queryName;
            return this;
        }

        // withCorrelationId sets the correlationId
        public Builder withCorrelationId(String correlationId) {
            this.correlationId = correlationId;
            return this;
        }

        // withBranch sets the branch
        public Builder withBranch(String branch) {
            this.branch = branch;
            return this;
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

        public BuilderComplete withOutputs(Object... outputs) {
            BuilderComplete builder = new BuilderComplete(inputs, this.outputs, staleness, meta, tags, includeMeta, includeMetrics, environmentId, previewDeploymentId, queryName, correlationId, branch);
            builder.withOutputs(outputs);
            return builder;
        }

        public BuilderComplete withOutput(String output) {
            return this.withOutputs(output);
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

        public BuilderComplete withInputs(Object... inputs) {
            BuilderComplete builder = new BuilderComplete(this.inputs, outputs, staleness, meta, tags, includeMeta, includeMetrics, environmentId, previewDeploymentId, queryName, correlationId, branch);
            builder.withInputs(inputs);
            return builder;
        }

        public BuilderComplete withInput(String key, Object value) {
            return this.withInputs(key, value);
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

        // withInput adds a single key, value pair to the inputs map
        public BuilderWithInputs withInput(String key, Object value) {
            return this.withInputs(key, value);
        }

        public BuilderWithInputs withInputs(Object... inputs) {
            BuilderWithInputs builder = new BuilderWithInputs(this.inputs, outputs, staleness, meta, tags, includeMeta, includeMetrics, environmentId, previewDeploymentId, queryName, correlationId, branch);
            builder.withInputs(inputs);
            return builder;
        }

        // withOutput adds a single output to the outputs list
        public BuilderWithOutputs withOutput(String output) {
            return this.withOutputs(output);
        }

        // withOutputs takes either multiple arguments or a single list of outputs and adds them to the outputs list
        public BuilderWithOutputs withOutputs(Object... outputs) {
            BuilderWithOutputs builder = new BuilderWithOutputs(inputs, this.outputs, staleness, meta, tags, includeMeta, includeMetrics, environmentId, previewDeploymentId, queryName, correlationId, branch);
            builder.withOutputs(outputs);
            return builder;
        }
    }

    public static BuilderSeed builder() {
        return new BuilderSeed();
    }
}
