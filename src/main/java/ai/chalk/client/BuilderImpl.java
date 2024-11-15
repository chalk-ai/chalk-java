package ai.chalk.client;

import ai.chalk.exceptions.ChalkException;
import ai.chalk.exceptions.ClientException;
import lombok.Getter;
import org.checkerframework.checker.nullness.qual.Nullable;

import java.net.http.HttpClient;
import java.nio.file.Path;

@Getter
public class BuilderImpl implements ChalkClient.Builder {
    @Nullable
    private String clientId;
    @Nullable
    private String clientSecret;
    @Nullable
    private String apiServer;
    @Nullable
    private String queryServerOverride;
    @Nullable
    private String environmentId;
    @Nullable
    private String branch;
    @Nullable
    private HttpClient httpClient;
    private boolean useGrpc;
    @Nullable
    private String deploymentTag;
    @Nullable
    private Path rootCa;

    public BuilderImpl() {
        this.clientId = null;
        this.clientSecret = null;
        this.apiServer = null;
        this.queryServerOverride = null;
        this.environmentId = null;
        this.branch = null;
        this.deploymentTag = null;
        this.httpClient = null;
        this.rootCa = null;
    }

    @Override
    public BuilderImpl withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    @Override
    public BuilderImpl withClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
        return this;
    }

    @Override
    public BuilderImpl withApiServer(String apiServer) {
        this.apiServer = apiServer;
        return this;
    }

    @Override
    public BuilderImpl withQueryServer(String queryServer) {
        this.queryServerOverride = queryServer;
        return this;
    }

    @Override
    public BuilderImpl withEnvironmentId(String environmentId) {
        this.environmentId = environmentId;
        return this;
    }

    @Override
    public BuilderImpl withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    @Override
    public BuilderImpl withDeploymentTag(String deploymentTag) {
        this.deploymentTag = deploymentTag;
        return this;
    }

    @Override
    public BuilderImpl withHttpClient(HttpClient httpClient) {
        this.httpClient = httpClient;
        return this;
    }

    @Override
    public BuilderImpl withGrpc() {
        this.useGrpc = true;
        return this;
    }

    @Override
    public ChalkClient.Builder withRootCa(Path rootCa) {
        var rootCaFile = rootCa.toFile();
        if (!(rootCaFile.exists() && rootCaFile.isFile())) {
            throw new IllegalArgumentException("Root CA file not found, %s".formatted(rootCa.toAbsolutePath()));
        }
        this.rootCa = rootCa;
        return this;
    }

    @Override
    public ChalkClient build() throws ChalkException {
        if (useGrpc) {
            return new GRPCClient(this);
        }
        return new ChalkClientImpl(this);
    }
}
