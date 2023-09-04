package ai.chalk.internal.request.models;

import lombok.Data;

import java.net.http.HttpRequest;
import java.util.Map;

@Data
public class SendRequestParams {
    private HttpRequest request;
    private Object body;
    private String method;
    private String url;
    private Object response;
    private boolean dontRefresh;
    private String environmentOverride;
    private String previewDeploymentId;
    private String branch;
}
