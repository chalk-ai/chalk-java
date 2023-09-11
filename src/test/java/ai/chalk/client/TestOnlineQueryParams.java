package ai.chalk.client;

import ai.chalk.internal.bytes.BytesProducer;
import ai.chalk.internal.feather.FeatherProcessor;
import ai.chalk.models.OnlineQueryParams;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class TestOnlineQueryParams {
    @Test
    public void test() throws Exception {
        OnlineQueryParams params = OnlineQueryParams.builder().withInput("user.id", new int[]{1, 2, 3}).withOutputs("user.today", "user.socure_score").build();
        assert params.getInputs().get("user.id").getClass().isArray();
        assert params.getOutputs().get(0).equals("user.today");
        assert params.getOutputs().get(1).equals("user.socure_score");

        Map<String, Object> inputs = params.getInputs();
        byte[] rootBytes = FeatherProcessor.inputsToArrowBytes(inputs);
        byte[] requestBodyBytes = BytesProducer.convertOnlineQueryParamsToBytes(params);
    }
}
