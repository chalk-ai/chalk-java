package ai.chalk.client;

import java.net.http.HttpClient;

public interface Builder {
    ChalkClient build();
    public Builder setClientId(String clientId);
    public Builder setClientSecret(String clientSecret);
    public Builder setApiServer(String apiServer);
    public Builder setEnvironmentId(String environmentId);
    public Builder setBranch(String branch);
    public Builder setHttpClient(HttpClient httpClient);
}
