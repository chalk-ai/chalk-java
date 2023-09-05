package ai.chalk.internal.request;

import ai.chalk.ai.chalk.exceptions.ChalkException;
import ai.chalk.ai.chalk.exceptions.ClientException;
import ai.chalk.ai.chalk.exceptions.HttpException;
import ai.chalk.internal.config.models.JWT;
import ai.chalk.internal.config.models.SourcedConfig;
import ai.chalk.internal.request.models.ChalkHttpException;
import ai.chalk.internal.request.models.GetTokenRequest;
import ai.chalk.internal.request.models.GetTokenResponse;
import ai.chalk.internal.request.models.SendRequestParams;
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
        headers.put("User-Agent", "chalk-go-0.0");
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


    public byte[] getBodyBytes(Object body) throws Exception {
        if (body == null) {
            return null;
        }

        byte[] bodyBytes;

        if (body instanceof byte[]) {
            bodyBytes = (byte[]) body;
        } else {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
            bodyBytes = objectMapper.writeValueAsBytes(body);
        }

        return bodyBytes;
    }

    public Object sendRequest(SendRequestParams<?> args) throws ChalkException {
        byte[] bodyBytes;
        try {
            bodyBytes = this.getBodyBytes(args.getBody());
        } catch (Exception e) {
            throw new ClientException("error marshalling request body", e);
        }

        URI uri;
        try {
            var base = new URI(this.apiServer.getValue());
            uri = base.resolve(args.getURL());
        } catch (Exception e) {
            throw new ClientException("error parsing request URL", e);
        }

        Map<String, String> headers = this.getHeaders(args.getEnvironmentOverride(), args.getPreviewDeploymentId(), args.getBranch());
        HttpRequest.Builder requestBuilder = HttpRequest.newBuilder()
                .method(args.getMethod(), HttpRequest.BodyPublishers.ofByteArray(bodyBytes))
                .uri(uri)
                .headers(headers.entrySet().stream()
                        .flatMap(e -> Stream.of(e.getKey(), e.getValue()))
                        .toArray(String[]::new));

//        if (!args.isDontRefresh()) {
//            try {
//                refreshJwt();
//            } catch (ChalkException e) {
//                throw new ClientException("Error refreshing access token: ", e);
//            }
//        }

        if (this.jwt != null && this.jwt.getValue() != null && !this.jwt.getValue().isEmpty()) {
            requestBuilder.header("Authorization", "Bearer " + this.jwt.getValue());
        }


        URI url = requestBuilder.build().uri();
        if (!url.toString().startsWith("http:") && !url.toString().startsWith("https:")) {
            try {
                url = new URI(this.apiServer + "/" + url.toString());
            } catch (Exception e) {
                throw new ClientException("Error constructing request URL: ", e);
            }
        }

        var request = requestBuilder.uri(url).build();
        HttpResponse<byte[]> response = null;
        try {
            response = this.httpClient.send(request, HttpResponse.BodyHandlers.ofByteArray());
        } catch (Exception e) {
            throw new ClientException("Error with sending of request", e);
        }
//
//        if (response.statusCode() == 401 && !args.isDontRefresh() && requestBuilder != null) {
//            HttpResponse<String> retryResponse = retryRequest(requestBuilder.build(), args.getBody(), response, null);
//            if (retryResponse != null) {
//                response = retryResponse;
//            }
//        }

        if (response.statusCode() != 200) {
            throw getHttpException(response, request.uri().toString());
        }

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(new JavaTimeModule());
        objectMapper.setPropertyNamingStrategy(PropertyNamingStrategy.SNAKE_CASE);
        try {
            return objectMapper.readValue(response.body(), args.getResponse());
        } catch (IOException e) {
            throw new ClientException(
                    "Exception occurred while unmarshalling response",
                    e
            );
        }
    }

//    public HttpResponse<String> retryRequest(
//            HttpRequest originalRequest, Object originalBody,
//            HttpResponse<String> originalResponse, Exception originalError
//    ) throws Exception {
//        Exception refreshJwtError = refreshJwt(true);
//        if (refreshJwtError != null) {
//            c.getLogger().debug("Error refreshing access token upon 401: ", refreshJwtError);
//            return originalResponse;
//        }
//
//        BodyBuffer originalBodyBuffer = getBodyBuffer(originalBody);
//        if (originalBodyBuffer.getError() != null) {
//            throw originalBodyBuffer.getError();
//        }
//
//        HttpRequest newRequest = HttpRequest.newBuilder(originalRequest.uri())
//                .method(originalRequest.method(), HttpRequest.BodyPublishers.ofByteArray(originalBodyBuffer.getBody()))
//                .headers(originalRequest.headers().map())
//                .build();
//
//        if (c.getJwt() != null && c.getJwt().getToken() != null && !c.getJwt().getToken().isEmpty()) {
//            newRequest.headers().map().put("Authorization", List.of("Bearer " + c.getJwt().getToken()));
//        }
//
//        HttpResponse<String> response = c.getHttpClient().send(newRequest, HttpResponse.BodyHandlers.ofString());
//        c.getLogger().debug("Response Status for retried request: " + response.statusCode());
//
//        return response;
//    }


//    private void refreshJwt() throws ChalkException {
//
//    }
//
    public JWT getJwt() throws ChalkException {
        GetTokenRequest body = new GetTokenRequest(this.clientId.getValue(), this.clientSecret.getValue(), "client_credentials");
        GetTokenResponse response = null;
        try {
            SendRequestParams<GetTokenResponse> params = new SendRequestParams<GetTokenResponse>(body, "POST", "v1/oauth/token", GetTokenResponse.class, true, null, null, null);
            response = (GetTokenResponse) this.sendRequest(params);
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

    public static ChalkException getHttpException(HttpResponse<byte[]> res, String URL) {
        ChalkHttpException chalkException;

        ObjectMapper objectMapper = new ObjectMapper();
        try {
            chalkException = objectMapper.readValue(res.body(), ChalkHttpException.class);
        } catch (IOException e) {
            return new ClientException(
                    "Exception occurred while parsing error response",
                    e
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
