package ai.chalk.internal.request;

import ai.chalk.exceptions.ChalkException;
import ai.chalk.exceptions.ClientException;
import ai.chalk.exceptions.ServerException;
import ai.chalk.internal.config.models.JWT;
import ai.chalk.internal.config.models.SourcedConfig;
import ai.chalk.internal.request.models.*;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import javax.annotation.Nullable;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class RequestHandler {
    private JWT jwt;
    private final HttpClient httpClient;
    private final URI apiServer;
    @Nullable
    private final URI queryServerOverride;
    private SourcedConfig environmentId;
    private Map<String, URI> engines;
    private final SourcedConfig initialEnvironment;
    private final SourcedConfig clientId;
    private final SourcedConfig clientSecret;
    private final String branch;
    private final String deploymentTag;
    private final Duration clientLevelTimeout;


    public RequestHandler(
            HttpClient httpClient,
            SourcedConfig apiServer,
            String queryServerOverride,
            SourcedConfig initialEnvironment,
            SourcedConfig environmentId,
            SourcedConfig clientId,
            SourcedConfig clientSecret,
            String branch,
            String deploymentTag,
            Duration clientLevelTimeout
    ) {
        if (httpClient == null) {
            System.setProperty("jdk.httpclient.keepalive.timeout", "300");
            this.httpClient = HttpClient.newHttpClient();
        } else {
            this.httpClient = httpClient;
        }

        this.apiServer = URI.create(apiServer.value());
        if (queryServerOverride == null || queryServerOverride.isEmpty()) {
            this.queryServerOverride = null;
        } else {
            this.queryServerOverride = URI.create(queryServerOverride);
        }
        this.environmentId = environmentId;
        this.initialEnvironment = initialEnvironment;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.branch = branch;
        this.deploymentTag = deploymentTag;
        this.engines = new HashMap<>();
        this.clientLevelTimeout = clientLevelTimeout;
    }

    private String getResolvedEnvironment(String environmentOverride) {
        if (environmentOverride != null && !environmentOverride.isEmpty()) {
            return environmentOverride;
        }
        return this.environmentId.value();
    }

    private Map<String, String> getHeaders(
            String environmentOverride,
            String previewDeploymentId,
            String branchOverride,
            String queryName
    ) {

        Map<String, String> headers = new HashMap<>();

        headers.put("Accept", "application/json");
        headers.put("Content-Type", "application/json");
        headers.put("User-Agent", "chalk-java");
        headers.put("X-Chalk-Client-Id", this.clientId.value());

        String branchResolved = null;
        if (branchOverride != null && !branchOverride.isEmpty()) {
            branchResolved = branchOverride;
        } else if (this.branch != null && !this.branch.isEmpty()) {
            branchResolved = this.branch;
        }
        if (branchResolved != null) {
            headers.put("X-Chalk-Branch-Id", branchResolved);
            headers.put("X-Chalk-Deployment-Type", "branch");
        } else {
            headers.put("X-Chalk-Deployment-Type", "engine");
        }

        if (environmentOverride != null && !environmentOverride.isEmpty()) {
            headers.put("X-Chalk-Env-Id", environmentOverride);
        } else {
            headers.put("X-Chalk-Env-Id", this.environmentId.value());
        }

        if (previewDeploymentId != null && !previewDeploymentId.isEmpty()) {
            headers.put("X-Chalk-Preview-Deployment", previewDeploymentId);
        }
        if (this.deploymentTag != null) {
            headers.put("X-Chalk-Deployment-Tag", this.deploymentTag);
        }

        if (queryName != null && !queryName.isEmpty()) {
            headers.put("X-Chalk-Query-Name", queryName);
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
            objectMapper.setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);
            bodyBytes = objectMapper.writeValueAsBytes(body);
        }

        return bodyBytes;
    }

    public HttpResponse<byte[]> sendRequest(SendRequestParams args) throws ChalkException {
        byte[] bodyBytes;
        try {
            bodyBytes = this.getBodyBytes(args.getBody());
        } catch (Exception e) {
            throw new ClientException("error marshalling request body", e);
        }

        Map<String, String> headers = this.getHeaders(
                args.getEnvironmentOverride(),
                args.getPreviewDeploymentId(),
                args.getBranch(),
                args.getQueryName()
        );

        var builder = HttpRequest.newBuilder();
        if (args.getRequestLevelTimeout() != null) {
            builder.timeout(args.getRequestLevelTimeout());
        } else if (this.clientLevelTimeout != null) {
            builder.timeout(this.clientLevelTimeout);
        }
        HttpRequest.Builder requestBuilder = builder
                .method(args.getMethod(), HttpRequest.BodyPublishers.ofByteArray(bodyBytes))
                .uri(getUri(args))
                .version(HttpClient.Version.HTTP_1_1)
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
        HttpResponse<byte[]> response;

        var retries = 1;
        while (true) {
            try {
                response = this.httpClient.send(request, HttpResponse.BodyHandlers.ofByteArray());
                break;
            } catch (IOException ioexception) {
                if (retries == 0) {
                    throw new ClientException("error with sending of request", ioexception);
                }
                retries--;
            } catch (Exception e) {
                throw new ClientException("error with sending of request", e);
            }
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

        return response;
    }

    public <T> T deserializeResponseBody(byte[] body, Class<T> responseClass) throws ChalkException {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);
        try {
            return objectMapper.readValue(body, responseClass);
        } catch (IOException e) {
            throw new ClientException(
                    "Exception occurred while unmarshalling response",
                    e
            );
        }
    }

    private URI getUri(SendRequestParams args) {
        if (args.getIsEngineRequest()) {
            if (this.queryServerOverride != null) {
                return this.queryServerOverride.resolve(args.getPath());
            }
            String resolved = this.getResolvedEnvironment(args.getEnvironmentOverride());
            if (resolved != null &&
                    !resolved.isEmpty() &&
                    this.engines.containsKey(resolved)
            ) {
                return this.engines.get(resolved).resolve(args.getPath());
            }
        }

        return this.apiServer.resolve(args.getPath());
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
                .version(HttpClient.Version.HTTP_1_1)
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
        SendRequestParams params = new SendRequestParams.Builder(null)
                .body(new GetTokenRequest(
                        this.clientId.value(),
                        this.clientSecret.value(),
                        "client_credentials"
                ))
                .method("POST")
                .path("/v1/oauth/token")
                .dontRefresh(true)
                .isEngineRequest(false)
                .build();
        GetTokenResponse response;
        try {
            HttpResponse<byte[]> responseRaw = this.sendRequest(params);
            response = this.deserializeResponseBody(responseRaw.body(), GetTokenResponse.class);
        } catch (Exception e) {
            throw new ClientException("Error getting access token", e);
        }

        if (this.initialEnvironment.value().isEmpty()) {
            this.environmentId = new SourcedConfig(
                    response.getPrimaryEnvironment(),
                    "Primary environment from credentials exchange response"
            );
        } else {
            this.environmentId = this.initialEnvironment;
        }
        this.engines = new HashMap<>();
        for (Map.Entry<String, String> entry : response.getEngines().entrySet()) {
            try {
                this.engines.put(entry.getKey(), URI.create(entry.getValue()));
            } catch (Exception ignored) {
            }
        }

        LocalDateTime expiry = LocalDateTime.now(ZoneOffset.UTC).plusSeconds(response.getExpiresIn());
        return new JWT(response.getAccessToken(), expiry);
    }

    private void refreshJwt(boolean forceRefresh) throws ChalkException {
        if (
                forceRefresh ||
                        jwt == null ||
                        jwt.getValidUntil() == null ||
                        LocalDateTime.now(ZoneOffset.UTC).plusSeconds(10).isAfter(jwt.getValidUntil())
        ) {
            this.jwt = getJwt();
        }
    }

    public static ChalkException getHttpException(HttpResponse<byte[]> res, String URL) {
        ChalkHttpException chalkException;

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);
        try {
            chalkException = objectMapper.readValue(res.body(), ChalkHttpException.class);
        } catch (IOException e) {
            // TODO: Log error here when we have logging
            return new ServerException(
                    res.statusCode(),
                    res.body().length,
                    URL
            );
        }

        return new ServerException(
                chalkException,
                res.statusCode(),
                res.body().length,
                URL
        );
    }

}
