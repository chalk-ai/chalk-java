package ai.chalk.client;

import ai.chalk.client.e2e.FraudTemplateFeatures;
import ai.chalk.client.e2e.User;
import ai.chalk.exceptions.ChalkException;
import ai.chalk.models.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.Map;


class TestBothClients {
    private static ChalkClient httpClient;
    private static ChalkClient grpcClient;

    @BeforeAll
    static void setUp() throws ChalkException {
        grpcClient = ChalkClient.createGrpc();
        httpClient = ChalkClient.create();
    }

    @ParameterizedTest
    @ValueSource(strings = {"grpc", "http"})
    public void testUploadFeatures(String clientVersion) throws Exception {
        ChalkClient c = clientVersion.equals("grpc") ? grpcClient : httpClient;
        var userIds = Arrays.asList("777", "888", "999");
        var scoreList = Arrays.asList(Math.random(), Math.random(), Math.random());

        UploadFeaturesParams uploadParams = UploadFeaturesParams.builder()
                .withInputs(Map.of("user.id", userIds,"user.socure_score", scoreList))
                .build();
        UploadFeaturesResult res = c.uploadFeatures(uploadParams);
        assert res.getErrors().size() == 0;
        assert !res.getOperationId().equals("");

        OnlineQueryParamsComplete params = OnlineQueryParams.builder()
                .withInput(FraudTemplateFeatures.user.id, Arrays.asList("777", "888", "999"))
                .withOutputs(FraudTemplateFeatures.user.socure_score)
                .build();

        try (OnlineQueryResult queryRes = c.onlineQuery(params)) {
            assert queryRes.getErrors().length == 0;
            User[] users = queryRes.unmarshal(User.class);
            assert users.length == 3;
            assert users[0].socure_score.getValue().equals(scoreList.get(0));
            assert users[1].socure_score.getValue().equals(scoreList.get(1));
            assert users[2].socure_score.getValue().equals(scoreList.get(2));
        };
    }
}