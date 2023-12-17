package ai.chalk.internal.request.models;

import lombok.AllArgsConstructor;
import lombok.Data;


// Not using Lombok's @Builder annotation because the generated
// `responseClass` method takes in `Class<Object>` instead of `Class<T>`
@Data
@AllArgsConstructor
public class SendRequestParams<T> {
    private Object body;
    private String method;
    private String path;
    private Class<T> responseClass;
    private boolean dontRefresh;
    private String environmentOverride;
    private String previewDeploymentId;
    private String branch;
    private String queryName;
    private Boolean useDirectEngine;

    public static class Builder<T> {
        private Object body;
        private String method;
        private String URL;
        private Class<T> responseClass;
        private boolean dontRefresh;
        private String environmentOverride;
        private String previewDeploymentId;
        private String branch;
        private String queryName;
        private Boolean useDirectEngine;

        public Builder<T> body(Object body) {
            this.body = body;
            return this;
        }

        public Builder<T> method(String method) {
            this.method = method;
            return this;
        }

        public Builder<T> URL(String URL) {
            this.URL = URL;
            return this;
        }

        public Builder<T> responseClass(Class<T> responseClass) {
            this.responseClass = responseClass;
            return this;
        }

        public Builder<T> dontRefresh(boolean dontRefresh) {
            this.dontRefresh = dontRefresh;
            return this;
        }

        public Builder<T> environmentOverride(String environmentOverride) {
            this.environmentOverride = environmentOverride;
            return this;
        }

        public Builder<T> previewDeploymentId(String previewDeploymentId) {
            this.previewDeploymentId = previewDeploymentId;
            return this;
        }

        public Builder<T> queryName(String queryName) {
            this.queryName = queryName;
            return this;
        }

        public Builder<T> branch(String branch) {
            this.branch = branch;
            return this;
        }

        public Builder<T> useDirectEngine(Boolean useDirectEngine) {
            this.useDirectEngine = useDirectEngine;
            return this;
        }

        public SendRequestParams<T> build() {
            return new SendRequestParams<>(
                    body, method, URL, responseClass, dontRefresh,
                    environmentOverride, previewDeploymentId, branch, queryName, useDirectEngine
            );
        }
    }
}
