package ai.chalk.client;

import ai.chalk.exceptions.ChalkException;
import lombok.Getter;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.net.http.HttpClient;

@Getter
public class BuilderImpl implements ChalkClient.Builder {
    @Nullable
    private String clientId;
    @Nullable
    private String clientSecret;
    @Nullable
    private String apiServer;
    @Nullable
    private String environmentId;
    @Nullable
    private String branch;
    @Nullable
    private HttpClient httpClient;

    public BuilderImpl() {
        this.clientId = null;
        this.clientSecret = null;
        this.apiServer = null;
        this.environmentId = null;
        this.branch = null;
        this.httpClient = null;
    }

    public BuilderImpl withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    public BuilderImpl withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    public BuilderImpl withApiServer(String apiServer) {
        this.apiServer = apiServer;
        return this;
    }

    public BuilderImpl withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    public BuilderImpl withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    public BuilderImpl withHttpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }

    public ChalkClient build() throws ChalkException {
        return new ChalkClientImpl(this);
    }
}
