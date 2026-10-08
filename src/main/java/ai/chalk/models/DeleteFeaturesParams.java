package ai.chalk.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.annotation.Nullable;
import java.util.List;


/**
 * Targets feature observation values for deletion. Mirrors the parameters of
 * {@code ChalkClient.delete_features} in the Python client.
 */
@AllArgsConstructor @Getter
public class DeleteFeaturesParams {
    /**
     * The namespace in which the target features reside.
     */
    private final String namespace;
    /**
     * An optional list of the feature names of the features that should be deleted
     * for the targeted primary keys. Not specifying this and not specifying {@code tags}
     * will result in all features being targeted for deletion for the specified primary keys.
     * Note that this parameter and {@code tags} are mutually exclusive.
     */
    @Nullable
    private final List<String> features;
    /**
     * An optional list of tags that specify features that should be targeted for deletion.
     * If a feature has a tag in this list, its observations for the primary keys you listed
     * will be targeted for deletion. Not specifying this and not specifying {@code features}
     * will result in all features being targeted for deletion for the specified primary keys.
     * Note that this parameter and {@code features} are mutually exclusive.
     */
    @Nullable
    private final List<String> tags;
    /**
     * The primary keys of the observations that should be targeted for deletion.
     */
    private final List<String> primaryKeys;
    @Nullable
    private final String environmentId;
    /**
     * Feature deletion is not currently supported for branch deployments.
     */
    @Nullable
    private final String branch;
    /**
     * If true, the given observations will not be dropped from the offline store.
     */
    private final boolean retainOffline;
    /**
     * If true, the given observations will not be dropped from the online store.
     */
    private final boolean retainOnline;

    @AllArgsConstructor
    @NoArgsConstructor
    public static class Builder {
        protected String namespace;
        protected List<String> features;
        protected List<String> tags;
        protected List<String> primaryKeys;
        protected String environmentId;
        protected String branch;
        protected boolean retainOffline = false;
        protected boolean retainOnline = false;

        public DeleteFeaturesParams build() {
            return new DeleteFeaturesParams(
                this.namespace,
                this.features,
                this.tags,
                this.primaryKeys,
                this.environmentId,
                this.branch,
                this.retainOffline,
                this.retainOnline);
        }

        public Builder withNamespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        public Builder withFeatures(List<String> features) {
            this.features = features;
            return this;
        }

        public Builder withTags(List<String> tags) {
            this.tags = tags;
            return this;
        }

        public Builder withPrimaryKeys(List<String> primaryKeys) {
            this.primaryKeys = primaryKeys;
            return this;
        }

        public Builder withEnvironmentId(String environmentId) {
            this.environmentId = environmentId;
            return this;
        }

        public Builder withBranch(String branch) {
            this.branch = branch;
            return this;
        }

        /** Do not drop the given observations from the offline store. Defaults to {@code false}. */
        public Builder withRetainOffline(boolean retainOffline) {
            this.retainOffline = retainOffline;
            return this;
        }

        /** Do not drop the given observations from the online store. Defaults to {@code false}. */
        public Builder withRetainOnline(boolean retainOnline) {
            this.retainOnline = retainOnline;
            return this;
        }
    }

    public static Builder builder() {
        return new Builder();
    }
}
