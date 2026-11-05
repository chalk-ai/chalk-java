package ai.chalk.internal.request.models;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.annotation.Nullable;
import java.time.Duration;
import java.util.Map;
import java.util.Optional;


// Not using Lombok's @Builder annotation because the generated
// `responseClass` method takes in `Class<Object>` instead of `Class<T>`
@Data
@AllArgsConstructor
public class SendRequestParams {
    private Object body;
    private String method;
    private String path;
    private boolean dontRefresh;
    private String environmentOverride;
    private String previewDeploymentId;
    private String branch;
    private String queryName;
    private Boolean isEngineRequest;
    private Duration requestLevelTimeout;
    /** Overrides the default headers. A null value removes that header. */
    private Map<String, String> headers;
    /** If true, non-200 responses are returned rather than thrown. */
    private boolean returnErrorResponses;

    public static class Builder {
        private Object body;
        private String method;
        private String path;
        private boolean dontRefresh;
        private String environmentOverride;
        private String previewDeploymentId;
        private String branch;
        private String queryName;
        private Boolean isEngineRequest;
        private @Nullable Duration requestLevelTimeout;
        private @Nullable Map<String, String> headers;
        private boolean returnErrorResponses;

        public Builder(Duration requestLevelTimeout) {
            this.requestLevelTimeout = requestLevelTimeout;
        }

        public Builder body(Object body) {
            this.body = body;
            return this;
        }

        public Builder method(String method) {
            this.method = method;
            return this;
        }

        public Builder path(String path) {
            this.path = path;
            return this;
        }


        public Builder dontRefresh(boolean dontRefresh) {
            this.dontRefresh = dontRefresh;
            return this;
        }

        public Builder environmentOverride(String environmentOverride) {
            this.environmentOverride = environmentOverride;
            return this;
        }

        public Builder previewDeploymentId(String previewDeploymentId) {
            this.previewDeploymentId = previewDeploymentId;
            return this;
        }

        public Builder queryName(String queryName) {
            this.queryName = queryName;
            return this;
        }

        public Builder branch(String branch) {
            this.branch = branch;
            return this;
        }

        public Builder isEngineRequest(Boolean isEngineRequest) {
            this.isEngineRequest = isEngineRequest;
            return this;
        }

        public Builder headers(Map<String, String> headers) {
            this.headers = headers;
            return this;
        }

        public Builder returnErrorResponses(boolean returnErrorResponses) {
            this.returnErrorResponses = returnErrorResponses;
            return this;
        }

        public SendRequestParams build() {
            return new SendRequestParams(
                    body, method, path, dontRefresh,
                    environmentOverride, previewDeploymentId, branch, queryName,
                    isEngineRequest, requestLevelTimeout, headers, returnErrorResponses
            );
        }
    }
}
