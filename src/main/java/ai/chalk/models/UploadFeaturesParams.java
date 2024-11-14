package ai.chalk.models;

import ai.chalk.features.Feature;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.annotation.Nullable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@AllArgsConstructor @Getter
public class UploadFeaturesParams {
    private final Map<String, List<?>> inputs;
    @Nullable
    private final String environmentId;

    @AllArgsConstructor
    @NoArgsConstructor
    public static class Builder {
        protected Map<String, List<?>> inputs;
        protected String environmentId;

        public UploadFeaturesParams build() {
            return new UploadFeaturesParams(this.inputs, this.environmentId);
        }

        private void initInputs() {
            if (this.inputs == null) {
                this.inputs = new HashMap<>();
            }
        }

        private Builder _withInput(String fqn, List<?> value) {
            this.initInputs();
            this.inputs.put(fqn, value);
            return this;
        }

        public Builder withInputs(Map<String, List<?>> inputs) {
            this.initInputs();
            this.inputs.putAll(inputs);
            return this;
        }

        public <T> Builder withFeatureInputs(Map<Feature<T>, List<T>> inputs) {
            this.initInputs();
            inputs.forEach((feature, value) -> this.inputs.put(feature.getFqn(), value));
            return this;
        }

        public Builder withInput(Feature<?> feature, List<?> value) {
            return this._withInput(feature.getFqn(), value);
        }

        public Builder withInput(String feature, List<?> value) {
            return this._withInput(feature, value);
        }
    }

    public static Builder builder() {
        return new Builder();
    }
}


