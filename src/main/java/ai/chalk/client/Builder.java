package ai.chalk.client;

import ai.chalk.exceptions.ChalkException;

import java.net.http.HttpClient;

public interface Builder {
    public Builder setClientId(String clientId);
    public Builder setClientSecret(String clientSecret);
    public Builder setApiServer(String apiServer);
    public Builder setEnvironmentId(String environmentId);
    public Builder setBranch(String branch);
    public Builder setHttpClient(HttpClient httpClient);

    public String getClientId();
    public String getClientSecret();
    public String getApiServer();
    public String getEnvironmentId();
    public String getBranch();
    public HttpClient getHttpClient();

    ChalkClient build() throws ChalkException;
}
