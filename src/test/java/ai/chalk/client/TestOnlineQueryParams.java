package ai.chalk.client;

import ai.chalk.internal.bytes.BytesProducer;
import ai.chalk.internal.arrow.FeatherProcessor;
import ai.chalk.models.OnlineQueryParams;
import ai.chalk.client.features.InitFeaturesTestFeatures;
import ai.chalk.models.OnlineQueryParamsComplete;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Map;

public class TestOnlineQueryParams {
    @Test
    public void test() throws Exception {
        OnlineQueryParamsComplete params = OnlineQueryParams.builder().withInput("user.id", new int[]{1, 2, 3}).withOutputs("user.today", "user.socure_score").build();
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
                .withInput(InitFeaturesTestFeatures.user.id, expectedInputs)
                .withOutputs("user.today", "user.socure_score")
                .build();
        var p2 = OnlineQueryParams
                .builder()
                .withInput(InitFeaturesTestFeatures.user.burrys_membership.membership_id, "abc", "def")
                .withInput(InitFeaturesTestFeatures.user.id, "1", "2", "3")
                .withOutputs("user.today", "user.socure_score")
                .build();
        var p3 = OnlineQueryParams
                .builder()
                .withOutputs("user.today", "user.socure_score")
                .withInput(InitFeaturesTestFeatures.user.id, expectedInputs)
                .build();
        var p4 = OnlineQueryParams
                .builder()
                .withOutputs("user.today")
                .withInput(InitFeaturesTestFeatures.user.id, expectedInputs)
                .build();


        var allParams = new OnlineQueryParamsComplete[]{p1, p2, p3, p4};
        for (OnlineQueryParamsComplete p : allParams) {
            assert Arrays.equals((String[]) p.getInputs().get("test_user.id"), expectedInputs);
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
                .withInput(InitFeaturesTestFeatures.user.id, "1", "2", "3")
                .withOutputs(InitFeaturesTestFeatures.user.id, InitFeaturesTestFeatures.user.burrys_membership.membership_id)
                .build();
        var p2 = OnlineQueryParams
                .builder()
                .withOutputs(InitFeaturesTestFeatures.user.id, InitFeaturesTestFeatures.user.burrys_membership.membership_id)
                .withInput(InitFeaturesTestFeatures.user.id, "1", "2", "3")
                .build();
        var p3 = OnlineQueryParams
                .builder()
                .withInput(InitFeaturesTestFeatures.user.id, "1", "2", "3")
                .withOutputs(InitFeaturesTestFeatures.user.id)
                .withOutputs(InitFeaturesTestFeatures.user.burrys_membership.membership_id)
                .build();
        var p4 = OnlineQueryParams
                .builder()
                .withOutputs(InitFeaturesTestFeatures.user.id)
                .withOutputs(InitFeaturesTestFeatures.user.burrys_membership.membership_id)
                .withInput(InitFeaturesTestFeatures.user.id, "1", "2", "3")
                .build();
        var p5 = OnlineQueryParams
                .builder()
                .withOutputs(InitFeaturesTestFeatures.user.id)
                .withInput(InitFeaturesTestFeatures.user.id, "1", "2", "3")
                .withOutputs(InitFeaturesTestFeatures.user.burrys_membership.membership_id)
                .build();

        var allParams = new OnlineQueryParamsComplete[]{p1, p2, p3, p4, p5};
        for (OnlineQueryParamsComplete p : allParams) {
            assert Arrays.equals(p.getOutputs().toArray(), new String[]{"test_user.id", "test_user.burrys_membership.membership_id"});
            // Test serialization is OK.
            BytesProducer.convertOnlineQueryParamsToBytes(p);
        }
    }

    /**
     * Test special output objects like `WindowedFeaturesClass` and `StructFeaturesClass`
     */
    @Test
    public void testSpecialOutputFeatures() throws Exception {
        var p = OnlineQueryParams
                .builder()
                .withInput(InitFeaturesTestFeatures.user.id, "1", "2", "3")
                .withOutputs(InitFeaturesTestFeatures.user.mean_attendance_count)        // WindowedFeaturesClass
                .withOutputs(InitFeaturesTestFeatures.user.burrys_membership.branch)    // StructFeaturesClass
                .build();
        assert Arrays.equals(p.getOutputs().toArray(), new String[]{"test_user.mean_attendance_count", "test_user.burrys_membership.branch"});
        // Test serialization is OK.
        BytesProducer.convertOnlineQueryParamsToBytes(p);
    }


    /**
     * Tests that `initFeatures` correctly initialized FQNs for all features
     * under the `Features` class.
     */
    @Test
    public void testInitFeaturesFqn() throws Exception {
        assert InitFeaturesTestFeatures.user.id.getFqn().equals("test_user.id");
        assert InitFeaturesTestFeatures.user.injuries.getFqn().equals("test_user.injuries");
        assert InitFeaturesTestFeatures.user.burrys_membership.getFqn().equals("test_user.burrys_membership");
        assert InitFeaturesTestFeatures.user.burrys_membership.is_free_monthly_burryto_claimed.getFqn().equals("test_user.burrys_membership.is_free_monthly_burryto_claimed");

        // Test has ones
        assert InitFeaturesTestFeatures.user.burrys_membership.instructor.id.getFqn().equals("test_user.burrys_membership.instructor.id");
        assert InitFeaturesTestFeatures.user.burrys_membership.instructor.rating.getFqn().equals("test_user.burrys_membership.instructor.rating");

        // Test has many
        assert InitFeaturesTestFeatures.user.burrys_membership.injuries.getFqn().equals("test_user.burrys_membership.injuries");

        // Test dataclasses and nested dataclasses. They should have
        // their FQN truncated until the first feature is reached.
        assert InitFeaturesTestFeatures.user.burrys_membership.branch.averageInjuriesPerMonth.getFqn().equals("test_user.burrys_membership.branch");
        assert InitFeaturesTestFeatures.user.burrys_membership.branch.city.isItSanFrancisco.getFqn().equals("test_user.burrys_membership.branch");
        assert InitFeaturesTestFeatures.user.burrys_membership.branch.getFqn().equals("test_user.burrys_membership.branch");

        // Windowed feature classes
        assert InitFeaturesTestFeatures.user.mean_attendance_count.getFqn().equals("test_user.mean_attendance_count");
        assert InitFeaturesTestFeatures.user.mean_attendance_count.bucket_all.getFqn().equals("test_user.mean_attendance_count__all__");
        assert InitFeaturesTestFeatures.user.mean_attendance_count.bucket_1w.getFqn().equals("test_user.mean_attendance_count__604800__");
    }
}