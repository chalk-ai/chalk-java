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

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class RequestHandler {
    private final Logger logger = LogManager.getLogManager().getLogger(RequestHandler.class.getName());

    private JWT jwt;
    private final HttpClient httpClient;
    private final URI apiServer;
    private SourcedConfig environmentId;
    private ConcurrentHashMap<String, URI> engines;
    private final SourcedConfig initialEnvironment;
    private final SourcedConfig clientId;
    private final SourcedConfig clientSecret;
    private final String branch;
    private final String deploymentTag;

    private final ObjectMapper objectMapper;

    public RequestHandler(
            HttpClient httpClient,
            SourcedConfig apiServer,
            SourcedConfig initialEnvironment,
            SourcedConfig environmentId,
            SourcedConfig clientId,
            SourcedConfig clientSecret,
            String branch,
            String deploymentTag
    ) {
        if (httpClient == null) {
            System.setProperty("jdk.httpclient.keepalive.timeout", "300");
            this.httpClient = HttpClient.newHttpClient();
        } else {
            this.httpClient = httpClient;
        }

        this.apiServer = URI.create(apiServer.value());
        this.environmentId = environmentId;
        this.initialEnvironment = initialEnvironment;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
        this.branch = branch;
        this.deploymentTag = deploymentTag;
        engines = new ConcurrentHashMap<>();

        objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.setPropertyNamingStrategy(PropertyNamingStrategies.SNAKE_CASE);
    }

    private String getResolvedEnvironment(String environmentOverride) {
        if (environmentOverride != null && !environmentOverride.isEmpty()) {
            return environmentOverride;
        }
        return environmentId.value();
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
        headers.put("X-Chalk-Client-Id", clientId.value());

        String branchResolved = null;
        if (branchOverride != null && !branchOverride.isEmpty()) {
            branchResolved = branchOverride;
        } else if (branch != null && !branch.isEmpty()) {
            branchResolved = branch;
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
            headers.put("X-Chalk-Env-Id", environmentId.value());
        }

        if (previewDeploymentId != null && !previewDeploymentId.isEmpty()) {
            headers.put("X-Chalk-Preview-Deployment", previewDeploymentId);
        }
        if (deploymentTag != null) {
            headers.put("X-Chalk-Deployment-Tag", deploymentTag);
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
            bodyBytes = objectMapper.writeValueAsBytes(body);
        }

        return bodyBytes;
    }

    public HttpResponse<byte[]> sendRequest(SendRequestParams args) throws ChalkException {
        byte[] bodyBytes;
        try {
            bodyBytes = getBodyBytes(args.getBody());
        } catch (Exception e) {
            throw new ClientException("error marshalling request body", e);
        }

        Map<String, String> headers = getHeaders(
                args.getEnvironmentOverride(),
                args.getPreviewDeploymentId(),
                args.getBranch(),
                args.getQueryName()
        );

        HttpRequest.Builder requestBuilder = HttpRequest.newBuilder()
                .method(args.getMethod(), HttpRequest.BodyPublishers.ofByteArray(bodyBytes))
                .uri(getUri(args))
                .version(HttpClient.Version.HTTP_1_1)
                .headers(headers.entrySet().stream()
                        .flatMap(e -> Stream.of(e.getKey(), e.getValue()))
                        .toArray(String[]::new));

        if (!args.isDontRefresh()) {
            try {
                refreshJwt(false);
            } catch (ChalkException e) {
                throw new ClientException("error refreshing access token", e);
            }
        }

        maybeSetJWTHeader(requestBuilder);

        var request = requestBuilder.build();
        HttpResponse<byte[]> response = null;

        var retries = 1;
        while (response == null && retries >= 0) {
            try {
                response = httpClient.send(request, HttpResponse.BodyHandlers.ofByteArray());
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
                retryResponse = retryRequest(request, args.getBody(), response);
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

    private <T> T deserializeResponseBody(byte[] body, Class<T> responseClass) throws ChalkException {
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
            String resolved = getResolvedEnvironment(args.getEnvironmentOverride());
            if (resolved != null &&
                    !resolved.isEmpty() &&
                    engines.containsKey(resolved)
            ) {
                return engines.get(resolved).resolve(args.getPath());
            }
        }

        return apiServer.resolve(args.getPath());
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

        maybeSetJWTHeader(requestBuilder);

        var newRequest = requestBuilder.build();
        return this.httpClient.send(newRequest, HttpResponse.BodyHandlers.ofByteArray());
    }

    private boolean maybeSetJWTHeader(HttpRequest.Builder reqBuilder) {
        if (jwt != null && jwt.getValue() != null && !jwt.getValue().isEmpty()) {
            reqBuilder.header("Authorization", "Bearer " + jwt.getValue());
            return true;
        }
        return false;
    }

    private JWT getJwt() throws ChalkException {
        SendRequestParams params = new SendRequestParams(
                new GetTokenRequest(
                        clientId.value(),
                        clientSecret.value(),
                        "client_credentials"
                ),
                "POST",
                "/v1/oauth/token",
                true,
                null,
                null,
                null,
                null,
                false
        );
        GetTokenResponse response;
        try {
            HttpResponse<byte[]> responseRaw = sendRequest(params);
            response = deserializeResponseBody(responseRaw.body(), GetTokenResponse.class);
        } catch (Exception e) {
            throw new ClientException("Error getting access token", e);
        }

        if (initialEnvironment.value().isEmpty()) {
            environmentId = new SourcedConfig(
                    response.getPrimaryEnvironment(),
                    "Primary environment from credentials exchange response"
            );
        } else {
            environmentId = initialEnvironment;
        }
        engines = new ConcurrentHashMap<>();
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

    private ChalkException getHttpException(HttpResponse<byte[]> res, String URL) {
        ChalkHttpException chalkException;

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
