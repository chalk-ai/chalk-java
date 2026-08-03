package ai.chalk.models;

import ai.chalk.features.Feature;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.annotation.Nullable;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


@AllArgsConstructor @Getter
public class UploadFeaturesParams {
    private final Map<String, List<?>> inputs;
    @Nullable
    private final String environmentId;
    @Nullable
    private final Duration timeout;
    // Write targets (mirror chalk.common.v1.UploadFeaturesOptions). Defaults preserve prior
    // behavior: online store only.
    private final boolean writeOnline;
    private final boolean writeOffline;
    private final boolean updateMataggs;
    // Routes the upload to the engines of a named resource group, via the
    // `x-chalk-resource-group` header. Null/empty means the environment's default engines.
    @Nullable
    private final String resourceGroup;

    @AllArgsConstructor
    @NoArgsConstructor
    public static class Builder {
        protected Map<String, List<?>> inputs;
        protected String environmentId;
        protected Duration timeout;
        protected boolean writeOnline = true;
        protected boolean writeOffline = false;
        protected boolean updateMataggs = false;
        protected String resourceGroup;

        public UploadFeaturesParams build() {
            return new UploadFeaturesParams(
                this.inputs,
                this.environmentId,
                this.timeout,
                this.writeOnline,
                this.writeOffline,
                this.updateMataggs,
                this.resourceGroup);
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

        public Builder withTimeout(Duration timeout) {
            this.timeout = timeout;
            return this;
        }

        /** Write uploaded values to the online store. Defaults to {@code true}. */
        public Builder withWriteOnline(boolean writeOnline) {
            this.writeOnline = writeOnline;
            return this;
        }

        /** Also write uploaded values to the offline store. Defaults to {@code false}. */
        public Builder withWriteOffline(boolean writeOffline) {
            this.writeOffline = writeOffline;
            return this;
        }

        /** Update materialized (streaming) aggregations on upload. Defaults to {@code false}. */
        public Builder withUpdateMataggs(boolean updateMataggs) {
            this.updateMataggs = updateMataggs;
            return this;
        }

        /**
         * Route this upload to the engines of a named resource group instead of the environment's
         * default engines. Sent as the {@code x-chalk-resource-group} header, which the ingress
         * routes on. Defaults to unset (the default engines).
         */
        public Builder withResourceGroup(String resourceGroup) {
            this.resourceGroup = resourceGroup;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }
}


