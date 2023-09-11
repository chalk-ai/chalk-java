package ai.chalk.client;

import ai.chalk.exceptions.ChalkException;

import java.net.http.HttpClient;

public class BuilderImpl implements ChalkClient.Builder {
    private String clientId;
    private String clientSecret;
    private String apiServer;
    private String environmentId;
    private String branch;
    private HttpClient httpClient;

    public BuilderImpl() {
        this.clientId = null;
        this.clientSecret = null;
        this.apiServer = null;
        this.environmentId = null;
        this.branch = null;
        this.httpClient = null;
    }

    public BuilderImpl setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public BuilderImpl setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }
    public BuilderImpl setApiServer(String apiServer) {
        this.apiServer = apiServer;
        return this;
    }
    public BuilderImpl setEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }
    public BuilderImpl setBranch(String branch) {
        this.branch = branch;
        return this;
    }
    public BuilderImpl setHttpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }

    public String getClientId() { return clientId; }
    public String getClientSecret() { return clientSecret; }
    public String getApiServer() { return apiServer; }
    public String getEnvironmentId() { return environmentId; }
    public String getBranch() { return branch; }
    public HttpClient getHttpClient() { return httpClient; }

    public ChalkClient build() throws ChalkException {
        return new ChalkClientImpl(this);
    }
}
