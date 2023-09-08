package ai.chalk.client;

import ai.chalk.models.OnlineQueryParams;
import org.junit.jupiter.api.Test;

public class TestOnlineQueryParams {

    @Test
    public void test() {
        OnlineQueryParams params = OnlineQueryParams.builder().input("user.id", 1).output("user.today").output("user.socure_score").build();
        assert params.getInputs().get("user.id").equals(1);
        assert params.getOutputs().get(0).equals("user.today");
        assert params.getOutputs().get(1).equals("user.socure_score");
    }
}
