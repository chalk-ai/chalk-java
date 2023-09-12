package ai.chalk.internal.request;

import ai.chalk.exceptions.ChalkException;
import ai.chalk.exceptions.ClientException;
import ai.chalk.exceptions.HttpException;
import ai.chalk.internal.config.models.JWT;
import ai.chalk.internal.config.models.SourcedConfig;
import ai.chalk.internal.request.models.ChalkHttpException;
import ai.chalk.internal.request.models.GetTokenRequest;
import ai.chalk.internal.request.models.GetTokenResponse;
import ai.chalk.internal.request.models.SendRequestParams;
import ai.chalk.internal.request.models.OnlineQueryBulkResponse;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class RequestHandler {
    private JWT jwt;
    private final HttpClient httpClient;
    private final SourcedConfig apiServer;
    private SourcedConfig environmentId;
    private final SourcedConfig initialEnvironment;
    private final SourcedConfig clientId;
    private final SourcedConfig clientSecret;
    private final String branch;

    public RequestHandler(HttpClient httpClient, SourcedConfig apiServer, SourcedConfig initialEnvironment, SourcedConfig environmentId, SourcedConfig clientId, SourcedConfig clientSecret, String branch) {
        if (httpClient == null) {
            this.httpClient = HttpClient.newHttpClient();
        } else {
            this.httpClient = httpClient;
        }

        this.apiServer = apiServer;
        this.environmentId = environmentId;
        this.initialEnvironment = initialEnvironment;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.branch = branch;
    }

    private Map<String, String> getHeaders(String environmentOverride, String previewDeploymentId, String branchOverride) {
        Map<String, String> headers = new HashMap<>();

        headers.put("Accept", "application/json");
        headers.put("Content-Type", "application/json");
        headers.put("User-Agent", "chalk-java");
        headers.put("X-Chalk-Client-Id", this.clientId.getValue());

        if (branchOverride != null && !branchOverride.isEmpty()) {
            headers.put("X-Chalk-Branch-Id", branchOverride);
        } else if (this.branch != null && !this.branch.isEmpty()) {
            headers.put("X-Chalk-Branch-Id", this.branch);
        }

        if (environmentOverride != null && !environmentOverride.isEmpty()) {
            headers.put("X-Chalk-Env-Id", environmentOverride);
        } else {
            headers.put("X-Chalk-Env-Id", this.environmentId.getValue());
        }

        if (previewDeploymentId != null && !previewDeploymentId.isEmpty()) {
            headers.put("X-Chalk-Preview-Deployment", previewDeploymentId);
        }

        return headers;
    }


    private byte[] getBodyBytes(Object body) throws Exception {
        if (body == null) {
            return null;
        }

        byte[] bodyBytes;

        if (body instanceof byte[]) {
            bodyBytes = (byte[]) body;
        } else {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
            bodyBytes = objectMapper.writeValueAsBytes(body);
        }

        return bodyBytes;
    }

    public <T> T sendRequest(SendRequestParams<T> args) throws ChalkException {
        byte[] bodyBytes;
        try {
            bodyBytes = this.getBodyBytes(args.getBody());
        } catch (Exception e) {
            throw new ClientException("error marshalling request body", e);
        }

        URI uri;
        String urlArg = args.getURL();
        try {
            if (!urlArg.startsWith("http:") && !urlArg.startsWith("https:")) {
                var base = new URI(this.apiServer.getValue());
                uri = base.resolve(urlArg);
            } else {
                uri = new URI(urlArg);
            }
        } catch (Exception e) {
            throw new ClientException(String.format("error building request URL with base URL '%s' and relative URL '%s'", apiServer.getValue(), args.getURL()), e);
        }

        Map<String, String> headers = this.getHeaders(args.getEnvironmentOverride(), args.getPreviewDeploymentId(), args.getBranch());
        HttpRequest.Builder requestBuilder = HttpRequest.newBuilder()
                .method(args.getMethod(), HttpRequest.BodyPublishers.ofByteArray(bodyBytes))
                .uri(uri)
                .headers(headers.entrySet().stream()
                        .flatMap(e -> Stream.of(e.getKey(), e.getValue()))
                        .toArray(String[]::new));

        if (!args.isDontRefresh()) {
            try {
                this.refreshJwt(false);
            } catch (ChalkException e) {
                throw new ClientException("error refreshing access token", e);
            }
        }

        if (this.jwt != null && this.jwt.getValue() != null && !this.jwt.getValue().isEmpty()) {
            requestBuilder.header("Authorization", "Bearer " + this.jwt.getValue());
        }

        var request = requestBuilder.build();
        HttpResponse<byte[]> response = null;
        try {
            response = this.httpClient.send(request, HttpResponse.BodyHandlers.ofByteArray());
        } catch (Exception e) {
            throw new ClientException("error with sending of request", e);
        }

        if (response.statusCode() == 401 && !args.isDontRefresh()) {
            HttpResponse<byte[]> retryResponse;
            try {
                retryResponse = this.retryRequest(request, args.getBody(), response);
            } catch (Exception e) {
                throw new ClientException("error retrying request upon 401", e);
            }
            if (retryResponse != null) {
                response = retryResponse;
            }
        }

        if (response.statusCode() != 200) {
            throw getHttpException(response, request.uri().toString());
        }


        if (args.getResponseClass() == OnlineQueryBulkResponse.class) {
            // Custom Chalk byte-packing deserialization
            try {
                return (T) OnlineQueryBulkResponse.fromBytes(response.body());
            } catch (Exception e) {
                throw new ClientException(
                        "Exception occurred while unmarshalling response",
                        e
                );
            }
        } else {
            // JSON deserialization
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.registerModule(new JavaTimeModule());
            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
            objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
            try {
                return objectMapper.readValue(response.body(), args.getResponseClass());
            } catch (IOException e) {
                throw new ClientException(
                        "Exception occurred while unmarshalling response",
                        e
                );
            }
        }
    }

    private HttpResponse<byte[]> retryRequest(
        HttpRequest originalRequest,
        Object originalBody,
        HttpResponse<byte[]> originalResponse
    ) throws Exception {
        try {
            this.refreshJwt(true);
        } catch (ChalkException e) {
            // TODO: Log error here when we have logging
            System.err.println("error refreshing JWT upon 401");
            e.printStackTrace();
            return originalResponse;
        }

        byte[] originalBodyBytes = getBodyBytes(originalBody);

        HttpRequest.Builder requestBuilder = HttpRequest.newBuilder()
                .method(originalRequest.method(), HttpRequest.BodyPublishers.ofByteArray(originalBodyBytes))
                .uri(originalRequest.uri())
                .headers(originalRequest.headers().map().entrySet().stream()
                        .flatMap(e -> Stream.of(e.getKey(), e.getValue().get(0)))
                        .toArray(String[]::new));

        if (this.jwt != null && this.jwt.getValue() != null && !this.jwt.getValue().isEmpty()) {
            requestBuilder.header("Authorization", "Bearer " + this.jwt.getValue());
        }

        var newRequest = requestBuilder.build();
        return this.httpClient.send(newRequest, HttpResponse.BodyHandlers.ofByteArray());
    }


    private JWT getJwt() throws ChalkException {
        GetTokenRequest body = new GetTokenRequest(this.clientId.getValue(), this.clientSecret.getValue(), "client_credentials");
        GetTokenResponse response = null;
        try {
            SendRequestParams<GetTokenResponse> params = new SendRequestParams<GetTokenResponse>(body, "POST", "v1/oauth/token", GetTokenResponse.class, true, null, null, null);
            response = this.sendRequest(params);
        } catch (Exception e) {
            throw new ClientException("Error getting access token", e);
        }

        if (this.initialEnvironment.getValue().isEmpty()) {
            this.environmentId = new SourcedConfig(response.getPrimaryEnvironment(), "Primary Environment from credentials exchange response");
        } else {
            this.environmentId = this.initialEnvironment;
        }

        LocalDateTime expiry = LocalDateTime.now(ZoneOffset.UTC).plusSeconds(response.getExpiresIn());
        return new JWT(response.getAccessToken(), expiry);
    }

    private void refreshJwt(boolean forceRefresh) throws ChalkException {
        if (!forceRefresh && jwt != null && jwt.getValidUntil() != null
                && jwt.getValidUntil().isAfter(LocalDateTime.now(ZoneOffset.UTC).plusSeconds(10))) {
            return;
        }
        this.jwt = getJwt();
    }

    public static ChalkException getHttpException(HttpResponse<byte[]> res, String URL) {
        ChalkHttpException chalkException;

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        try {
            chalkException = objectMapper.readValue(res.body(), ChalkHttpException.class);
        } catch (IOException e) {
            // TODO: Log error here when we have logging
            return new HttpException(
                    res.statusCode(),
                    res.body().length,
                    URL
            );
        }

        return new HttpException(
                chalkException,
                res.statusCode(),
                res.body().length,
                URL
            );
    }

}
