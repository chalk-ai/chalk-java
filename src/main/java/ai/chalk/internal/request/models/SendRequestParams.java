package ai.chalk.internal.request.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SendRequestParams<T> {
    private Object body;
    private String method;
    private String URL;
    private Class<T> response;
    private boolean dontRefresh;
    private String environmentOverride;
    private String previewDeploymentId;
    private String branch;


    public SendRequestParams(Object body, String method, String URL, Class<T> response) {
        this.body = body;
        this.method = method;
        this.URL = URL;
        this.response = response;
        this.dontRefresh = true;
    }
}


