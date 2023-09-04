package ai.chalk.internal.request;

import ai.chalk.ai.chalk.exceptions.ChalkException;
import ai.chalk.ai.chalk.exceptions.ClientException;
import ai.chalk.internal.config.models.JWT;
import ai.chalk.internal.config.models.SourcedConfig;
import ai.chalk.internal.request.models.SendRequestParams;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class RequestHandler {
    private JWT jwt;
    private final HttpClient httpClient;
    private final SourcedConfig apiServer;
    private final SourcedConfig environmentId;
    private final SourcedConfig clientId;
    private final String branch;

    public RequestHandler(HttpClient httpClient, SourcedConfig apiServer, SourcedConfig environmentId, SourcedConfig clientId, String branch) {
        if (httpClient == null) {
            this.httpClient = HttpClient.newHttpClient();
        } else {
            this.httpClient = httpClient;
        }

        this.apiServer = apiServer;
        this.environmentId = environmentId;
        this.clientId = clientId;
        this.branch = branch;
    }

    private Map<String, String> getHeaders(String environmentOverride, String previewDeploymentId, String branchOverride) {
        Map<String, String> headers = new HashMap<>();

        headers.put("Accept", "application/json");
        headers.put("Content-Type", "application/json");
        headers.put("User-Agent", "chalk-go-0.0");
        headers.put("X-Chalk-Client-Id", this.clientId.getValue());

        if (!branchOverride.isEmpty()) {
            headers.put("X-Chalk-Branch-Id", branchOverride);
        } else if (!this.branch.isEmpty()) {
            headers.put("X-Chalk-Branch-Id", this.branch);
        }

        if (environmentOverride.isEmpty()) {
            headers.put("X-Chalk-Env-Id", this.environmentId.getValue());
        } else {
            headers.put("X-Chalk-Env-Id", environmentOverride);
        }

        if (!previewDeploymentId.isEmpty()) {
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
            bodyBytes = objectMapper.writeValueAsBytes(body);
        }

        return bodyBytes;
    }

    public void sendRequest(SendRequestParams args) throws ChalkException {
        byte[] bodyBytes;
        try {
            bodyBytes = this.getBodyBytes(args.getBody());
        } catch (Exception e) {
            throw new ClientException("Error marshalling request body: ", e);
        }

        URI uri;
        try {
            uri = new URI(args.getUrl());
        } catch (Exception e) {
            throw new ClientException("Error parsing request URL: ", e);
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
                refreshJwt();
            } catch (ChalkException e) {
                throw new ClientException("Error refreshing access token: ", e);
            }
        }

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

        try {
            HttpResponse<String> response = this.httpClient.send(requestBuilder.uri(url).build(), HttpResponse.BodyHandlers.ofString());
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
            ClientError clientError = getHttpError(c.getLogger(), response, requestBuilder.build());
            throw clientError;
        }

        String responseBody = response.body();
        Object castResponse = args.getResponse();
        if (castResponse instanceof OnlineQueryBulkResponse) {
            castResponse = ((OnlineQueryBulkResponse) castResponse).unmarshal(responseBody);
        } else {
            castResponse = new Gson().fromJson(responseBody, args.getResponse().getClass());
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


    private void refreshJwt() throws ChalkException {

    }

    private JWT getJwt() throws ChalkException {
        GetTokenRequest body = new GetTokenRequest(c.getClientId().getValue(), c.getClientSecret().getValue(), "client_credentials");
        GetTokenResponse response = new GetTokenResponse();
        try {
            SendRequestParams params = new SendRequestParams("POST", "v1/oauth/token", body, response, true);
            c.sendRequest(params);
        } catch (Exception e) {
            throw new ChalkException(String.format(
                    "Error obtaining access token: %s.\n" +
                            "  Auth config:\n" +
                            "    api_server=%s (source: %s),\n" +
                            "    client_id=%s (source: %s),\n" +
                            "    client_secret=*** (source: %s),\n" +
                            "    environment_id=%s (source: %s)\n",
                    e.getMessage(),
                    c.getApiServer().getValue(),
                    c.getApiServer().getSource(),
                    c.getClientId().getValue(),
                    c.getClientId().getSource(),
                    c.getClientSecret().getSource(),
                    c.getEnvironmentId().getValue(),
                    c.getEnvironmentId().getSource()
            ));
        }

        if (c.getInitialEnvironment().getValue().isEmpty()) {
            c.setEnvironmentId(new SourcedConfig(response.getPrimaryEnvironment(), "Primary Environment from credentials exchange response"));
        } else {
            c.setEnvironmentId(c.getInitialEnvironment());
        }

        LocalDateTime expiry = LocalDateTime.now(ZoneOffset.UTC).plusSeconds(response.getExpiresIn());
        JWT jwt = new JWT(response.getAccessToken(), expiry);
        return jwt;
    }

    public static HTTPError getHttpException(LeveledLogger logger, HttpResponse<String> res, HttpRequest req) HttpException {
        ChalkHttpException errorResponse;

        String responseBody = res.body();
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            errorResponse = objectMapper.readValue(responseBody, ChalkHttpException.class);
            logger.error("API error response", errorResponse, responseBody);
        } catch (IOException e) {
            logger.error("Error while unmarshalling the response", e);
            errorResponse = new ChalkHttpException();
        }

        HTTPError clientError = new HTTPError(
                "Unknown Chalk Server Error",
                req.uri().toString(),
                res.statusCode(),
                responseBody.length(),
                errorResponse.getTrace()
        );

        if (errorResponse.getDetail() != null) {
            clientError.setMessage(errorResponse.getDetail());
        }

        return clientError;
    }

}
