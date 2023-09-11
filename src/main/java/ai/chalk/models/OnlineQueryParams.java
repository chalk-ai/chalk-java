package ai.chalk.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.time.Duration;
import java.util.Map;

@Getter @AllArgsConstructor
public class OnlineQueryParams {
    private Map<String, Object> inputs;
    private List<String> outputs;
    private Map<String, Duration> staleness;
    private Map<String, String> meta;
    private List<String> tags;
    private boolean includeMeta;
    private boolean includeMetrics;
    private String environmentId;
    private String previewDeploymentId;
    private String queryName;
    private String correlationId;
    private String branch;

    public static class Builder {
        private Map<String, Object> inputs;
        private List<String> outputs;
        private Map<String, Duration> staleness;
        private Map<String, String> meta;
        private List<String> tags;
        private boolean includeMeta;
        private boolean includeMetrics;
        private String environmentId;
        private String previewDeploymentId;
        private String queryName;
        private String correlationId;
        private String branch;

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

        // withInput adds a single key, value pair to the inputs map
        public Builder withInput(String key, Object value) {
            return this.withInputs(key, value);
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

    public static Builder builder() {
        return new Builder();
    }


}