package chalk.client;

import chalk.internal.bytes.BytesProducer;
import chalk.internal.feather.FeatherProcessor;
import chalk.models.OnlineQueryParams;
import chalk.client.features.Features;
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
        FeatherProcessor.inputsToArrowBytes(inputs);
        BytesProducer.convertOnlineQueryParamsToBytes(params);
    }

    @Test
    public void testParamsWithCodegen() throws Exception {
        OnlineQueryParams params = OnlineQueryParams.builder().withInput(Features.user.id, "1", "2", "3").withOutputs("user.today", "user.socure_score").build();
        assert params.getInputs().get("user.id").getClass().isArray();
        assert params.getOutputs().get(0).equals("user.today");
        assert params.getOutputs().get(1).equals("user.socure_score");

        Map<String, Object> inputs = params.getInputs();
        FeatherProcessor.inputsToArrowBytes(inputs);
        BytesProducer.convertOnlineQueryParamsToBytes(params);
    }


    /**
     * Tests that `initFeatures` correctly initialized FQNs for all features
     * under the `Features` class.
     */
    @Test
    public void testInitFeaturesFqn() throws Exception {
        assert Features.user.id.getFqn().equals("user.id");
        assert Features.user.injuries.getFqn().equals("user.injuries");
        assert Features.user.burrysMembership.getFqn().equals("user.burrys_membership");
        assert Features.user.burrysMembership.isFreeMonthlyBurrytoClaimed.getFqn().equals("user.burrys_membership.is_free_monthly_burryto_claimed");
        assert Features.user.burrysMembership.instructor.id.getFqn().equals("user.burrys_membership.instructor.id");
        assert Features.user.burrysMembership.instructor.rating.getFqn().equals("user.burrys_membership.instructor.rating");

        // Test dataclasses and nested dataclasses. They should have
        // their FQN truncated until the first feature is reached.
        assert Features.user.burrysMembership.branch.averageInjuriesPerMonth.getFqn().equals("user.burrys_membership.branch");
        assert Features.user.burrysMembership.branch.city.name.getFqn().equals("user.burrys_membership.branch");
    }
}
