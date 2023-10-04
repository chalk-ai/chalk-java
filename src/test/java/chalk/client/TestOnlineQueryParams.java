package chalk.client;

import chalk.internal.bytes.BytesProducer;
import chalk.internal.arrow.FeatherProcessor;
import chalk.models.OnlineQueryParams;
import chalk.client.features.Features;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
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


    /**
     * Aims to test all methods that take `Feature` as keys to the inputs map.
     */
    @Test
    public void testInputsWithCodegenClass() throws Exception {
        String[] expectedInputs = new String[]{"1", "2", "3"};
        var p1 = OnlineQueryParams
                .builder()
                .withInput(Features.user.id, expectedInputs)
                .withOutputs("user.today", "user.socure_score")
                .build();
        var p2 = OnlineQueryParams
                .builder()
                .withInput(Features.user.burrysMembership.membershipId, "abc", "def")
                .withInput(Features.user.id, "1", "2", "3")
                .withOutputs("user.today", "user.socure_score")
                .build();
        var p3 = OnlineQueryParams
                .builder()
                .withOutputs("user.today", "user.socure_score")
                .withInput(Features.user.id, expectedInputs)
                .build();
        var p4 = OnlineQueryParams
                .builder()
                .withOutput("user.today")
                .withInput(Features.user.id, expectedInputs)
                .build();


        var allParams = new OnlineQueryParams[]{p1, p2, p3, p4};
        for (OnlineQueryParams p : allParams) {
            assert Arrays.equals((String[]) p.getInputs().get("user.id"), expectedInputs);
            // Test serialization is OK.
            BytesProducer.convertOnlineQueryParamsToBytes(p);
        }
    }

    /**
     * Aims to test all methods that take `Feature` as outputs.
     */
    @Test
    public void testOutputsWithCodegenClass() throws Exception {
        var p1 = OnlineQueryParams
                .builder()
                .withInput(Features.user.id, "1", "2", "3")
                .withOutputs(Features.user.id, Features.user.burrysMembership.membershipId)
                .build();
        var p2 = OnlineQueryParams
                .builder()
                .withOutputs(Features.user.id, Features.user.burrysMembership.membershipId)
                .withInput(Features.user.id, "1", "2", "3")
                .build();
        var p3 = OnlineQueryParams
                .builder()
                .withInput(Features.user.id, "1", "2", "3")
                .withOutput(Features.user.id)
                .withOutput(Features.user.burrysMembership.membershipId)
                .build();
        var p4 = OnlineQueryParams
                .builder()
                .withOutput(Features.user.id)
                .withOutput(Features.user.burrysMembership.membershipId)
                .withInput(Features.user.id, "1", "2", "3")
                .build();
        var p5 = OnlineQueryParams
                .builder()
                .withOutput(Features.user.id)
                .withInput(Features.user.id, "1", "2", "3")
                .withOutput(Features.user.burrysMembership.membershipId)
                .build();

        var allParams = new OnlineQueryParams[]{p1, p2, p3, p4, p5};
        for (OnlineQueryParams p : allParams) {
            assert Arrays.equals(p.getOutputs().toArray(), new String[]{"user.id", "user.burrys_membership.membership_id"});
            // Test serialization is OK.
            BytesProducer.convertOnlineQueryParamsToBytes(p);
        }
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

        // Test has ones
        assert Features.user.burrysMembership.instructor.id.getFqn().equals("user.burrys_membership.instructor.id");
        assert Features.user.burrysMembership.instructor.rating.getFqn().equals("user.burrys_membership.instructor.rating");

        // Test has many
        assert Features.user.burrysMembership.injuries.getFqn().equals("user.burrys_membership.injuries");

        // Test dataclasses and nested dataclasses. They should have
        // their FQN truncated until the first feature is reached.
        assert Features.user.burrysMembership.branch.averageInjuriesPerMonth.getFqn().equals("user.burrys_membership.branch");
        assert Features.user.burrysMembership.branch.city.isItSanFrancisco.getFqn().equals("user.burrys_membership.branch");
    }
}
