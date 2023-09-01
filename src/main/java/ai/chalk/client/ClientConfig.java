package ai.chalk.client;
import java.net.http.HttpClient;

public class ClientConfig {
    private final String clientId;
    private final String clientSecret;
    private final String apiServer;
    private final String environmentId;
    private final String branch;
    private final HttpClient httpClient;

    public ClientConfig() {
        this(null, null, null, null, null, null);
    }

    public ClientConfig(String clientId, String clientSecret, String apiServer, String environmentId, String branch, HttpClient httpClient) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.apiServer = apiServer;
        this.environmentId = environmentId;
        this.branch = branch;

        if (httpClient == null) {
            this.httpClient = HttpClient.newHttpClient();
        } else {
            this.httpClient = httpClient;
        }
    }


}
