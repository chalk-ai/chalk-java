package ai.chalk.internal.request.models;

import lombok.Data;

import java.net.http.HttpRequest;

@Data
public class SendRequestParams<T> {
    private HttpRequest request;
    private Object body;
    private String method;
    private String URL;
    private Class<T> response;
    private boolean dontRefresh;
    private String environmentOverride;
    private String previewDeploymentId;
    private String branch;
}
