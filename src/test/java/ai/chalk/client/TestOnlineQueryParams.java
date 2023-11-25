package ai.chalk.client;

import ai.chalk.internal.bytes.BytesProducer;
import ai.chalk.models.OnlineQueryParams;
import ai.chalk.client.features.InitFeaturesTestFeatures;
import ai.chalk.models.OnlineQueryParamsComplete;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestOnlineQueryParams {
    @Test
    public void testWithInputs() throws Exception {
        Map<String, List<?>> inputs = new HashMap<>();
        var userIds = Arrays.asList(1, 2, 3);
        var emails = Arrays.asList("a", "b", "c");
        var socureScores = Arrays.asList(1.0, 2.0, 3.0);
        inputs.put("user.id", userIds);
        inputs.put("user.email", emails);
        inputs.put("user.socure_score", socureScores);

        var outputs = new String[]{"user.today", "user.socure_score"};

        OnlineQueryParamsComplete params = OnlineQueryParams.builder().withInputs(inputs).withOutputs(outputs).build();
        assert params.getInputs().get("user.id").equals(userIds);
        assert params.getInputs().get("user.email").equals(emails);
        assert params.getInputs().get("user.socure_score").equals(socureScores);
        assert params.getOutputs().get(0).equals("user.today");
        assert params.getOutputs().get(1).equals("user.socure_score");

        var params2 = OnlineQueryParams.builder().withOutputs(outputs).withInputs(inputs).build();
        assert params2.getInputs().get("user.id").equals(userIds);
        assert params2.getInputs().get("user.email").equals(emails);
        assert params2.getInputs().get("user.socure_score").equals(socureScores);
        assert params2.getOutputs().get(0).equals("user.today");
        assert params2.getOutputs().get(1).equals("user.socure_score");

        var abcs = Arrays.asList("a", "b", "c");
        var cbd = Arrays.asList("c", "b", "d");
        var params3 = OnlineQueryParams.builder().withOutputs(outputs).withInput("user.abc", abcs).withInputs(inputs).withInput("user.cbd", cbd).build();
        assert params3.getInputs().get("user.id").equals(userIds);
        assert params3.getInputs().get("user.email").equals(emails);
        assert params3.getInputs().get("user.socure_score").equals(socureScores);
        assert params3.getInputs().get("user.abc").equals(abcs);
        assert params3.getInputs().get("user.cbd").equals(cbd);
        assert params3.getOutputs().get(0).equals("user.today");
        assert params3.getOutputs().get(1).equals("user.socure_score");
    }

    @Test
    public void testWithOptionalParams() throws Exception {
        Map<String, List<?>> inputs = new HashMap<>();
        var userIds = Arrays.asList(1, 2, 3);
        var emails = Arrays.asList("a", "b", "c");
        var socureScores = Arrays.asList(1.0, 2.0, 3.0);
        inputs.put("user.id", userIds);
        inputs.put("user.email", emails);
        inputs.put("user.socure_score", socureScores);

        var outputs = new String[]{"user.today", "user.socure_score"};

        // Test BuilderSeed with optional params
        OnlineQueryParams.BuilderSeed builderSeed = OnlineQueryParams.builder()
                .withStaleness("user.id", Duration.ofSeconds(1000))
                .withMeta("user.id", "abc")
                .withTags("user.id", "abc")
                .withIncludeMeta(true)
                .withIncludeMetrics(true)
                .withEnvironmentId("abc")
                .withPreviewDeploymentId("abc")
                .withQueryName("abc")
                .withCorrelationId("abc")
                .withBranch("abc");
        OnlineQueryParams paramsSeed = builderSeed.build();
        assert paramsSeed.getStaleness().get("user.id").equals(Duration.ofSeconds(1000));
        assert paramsSeed.getMeta().get("user.id").equals("abc");
        assert paramsSeed.getTags().get(0).equals("user.id");
        assert paramsSeed.getTags().get(1).equals("abc");
        assert paramsSeed.isIncludeMeta();
        assert paramsSeed.isIncludeMetrics();
        assert paramsSeed.getEnvironmentId().equals("abc");
        assert paramsSeed.getPreviewDeploymentId().equals("abc");
        assert paramsSeed.getQueryName().equals("abc");
        assert paramsSeed.getCorrelationId().equals("abc");
        assert paramsSeed.getBranch().equals("abc");

        // Test BuilderWithInputs with optional params
        OnlineQueryParams.BuilderWithInputs builderWithInputs = OnlineQueryParams.builder()
                .withInputs(inputs)
                .withStaleness("user.id", Duration.ofSeconds(1000))
                .withMeta("user.id", "abc")
                .withTags("user.id", "abc")
                .withIncludeMeta(true)
                .withIncludeMetrics(true)
                .withEnvironmentId("abc")
                .withPreviewDeploymentId("abc")
                .withQueryName("abc")
                .withCorrelationId("abc")
                .withBranch("abc");

        OnlineQueryParams paramsWithInputs = builderWithInputs.build();
        assert paramsWithInputs.getInputs().get("user.id").equals(userIds);
        assert paramsWithInputs.getInputs().get("user.email").equals(emails);
        assert paramsWithInputs.getInputs().get("user.socure_score").equals(socureScores);
        assert paramsWithInputs.getStaleness().get("user.id").equals(Duration.ofSeconds(1000));
        assert paramsWithInputs.getMeta().get("user.id").equals("abc");
        assert paramsWithInputs.getTags().get(0).equals("user.id");
        assert paramsWithInputs.getTags().get(1).equals("abc");
        assert paramsWithInputs.isIncludeMeta();
        assert paramsWithInputs.isIncludeMetrics();
        assert paramsWithInputs.getEnvironmentId().equals("abc");
        assert paramsWithInputs.getPreviewDeploymentId().equals("abc");
        assert paramsWithInputs.getQueryName().equals("abc");
        assert paramsWithInputs.getCorrelationId().equals("abc");

        // Test BuilderWithOutputs with optional params
        OnlineQueryParams.BuilderWithOutputs builderWithOutputs = OnlineQueryParams.builder()
                .withOutputs(outputs)
                .withStaleness("user.id", Duration.ofSeconds(1000))
                .withMeta("user.id", "abc")
                .withTags("user.id", "abc")
                .withIncludeMeta(true)
                .withIncludeMetrics(true)
                .withEnvironmentId("abc")
                .withPreviewDeploymentId("abc")
                .withQueryName("abc")
                .withCorrelationId("abc")
                .withBranch("abc");

        OnlineQueryParams paramsWithOutputs = builderWithOutputs.build();
        assert paramsWithOutputs.getOutputs().get(0).equals("user.today");
        assert paramsWithOutputs.getOutputs().get(1).equals("user.socure_score");
        assert paramsWithOutputs.getStaleness().get("user.id").equals(Duration.ofSeconds(1000));
        assert paramsWithOutputs.getMeta().get("user.id").equals("abc");
        assert paramsWithOutputs.getTags().get(0).equals("user.id");
        assert paramsWithOutputs.getTags().get(1).equals("abc");
        assert paramsWithOutputs.isIncludeMeta();
        assert paramsWithOutputs.isIncludeMetrics();
        assert paramsWithOutputs.getEnvironmentId().equals("abc");
        assert paramsWithOutputs.getPreviewDeploymentId().equals("abc");
        assert paramsWithOutputs.getQueryName().equals("abc");
        assert paramsWithOutputs.getCorrelationId().equals("abc");

        // Test BuilderComplete with optional params
        OnlineQueryParams.BuilderComplete builderComplete = OnlineQueryParams.builder()
                .withInputs(inputs)
                .withOutputs(outputs)
                .withStaleness("user.id", Duration.ofSeconds(1000))
                .withMeta("user.id", "abc")
                .withTags("user.id", "abc")
                .withIncludeMeta(true)
                .withIncludeMetrics(true)
                .withEnvironmentId("abc")
                .withPreviewDeploymentId("abc")
                .withQueryName("abc")
                .withCorrelationId("abc")
                .withBranch("abc");

        OnlineQueryParamsComplete paramsComplete = builderComplete.build();
        assert paramsComplete.getInputs().get("user.id").equals(userIds);
        assert paramsComplete.getInputs().get("user.email").equals(emails);
        assert paramsComplete.getInputs().get("user.socure_score").equals(socureScores);
        assert paramsComplete.getOutputs().get(0).equals("user.today");
        assert paramsComplete.getOutputs().get(1).equals("user.socure_score");
        assert paramsComplete.getStaleness().get("user.id").equals(Duration.ofSeconds(1000));
        assert paramsComplete.getMeta().get("user.id").equals("abc");
        assert paramsComplete.getTags().get(0).equals("user.id");
        assert paramsComplete.getTags().get(1).equals("abc");
        assert paramsComplete.isIncludeMeta();
        assert paramsComplete.isIncludeMetrics();
        assert paramsComplete.getEnvironmentId().equals("abc");
        assert paramsComplete.getPreviewDeploymentId().equals("abc");
        assert paramsComplete.getQueryName().equals("abc");
        assert paramsComplete.getCorrelationId().equals("abc");

        // Test serialization
        BytesProducer.convertOnlineQueryParamsToBytes(paramsComplete);
    }


    @Test
    public void testSerializationWithListAsInputValuesBatch() throws Exception {
        var inputs = new HashMap<String, List<?>>();
        var userIds = Arrays.asList("1", "2", "3");
        inputs.put("user.id", userIds);
        var outputs = new String[]{"user.today", "user.socure_score"};
        var params = OnlineQueryParams.builder().withInputs(inputs).withOutputs(outputs).build();
        BytesProducer.convertOnlineQueryParamsToBytes(params);
    }

    @Test
    public void testSerializationWithListAsInputValuesSingular() throws Exception {
        var userIds = Arrays.asList("1", "2", "3");
        var params = OnlineQueryParams.builder().withInput("user.id", userIds).withOutputs("user.today", "user.socure_score").build();
        assert params.getInputs().get("user.id").equals(userIds);
        BytesProducer.convertOnlineQueryParamsToBytes(params);
    }

    @Test
    public void testSerializationWithListAsOutputs() throws Exception {
        var outputs = Arrays.asList("user.today", "user.socure_score");
        var params = OnlineQueryParams.builder().withInput("user.id", Arrays.asList(1, 2, 3)).withOutputs(outputs).build();
        assert params.getOutputs().equals(outputs);
        BytesProducer.convertOnlineQueryParamsToBytes(params);
    }

    @Test
    public void testSerializationWithArrayAsOutputs() throws Exception {
        var outputs = new String[]{"user.today", "user.socure_score"};
        var params = OnlineQueryParams.builder().withInput("user.id", Arrays.asList(1, 2, 3)).withOutputs(outputs).build();
        assert Arrays.equals(params.getOutputs().toArray(), outputs);
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
            assert Arrays.equals(p.getInputs().get("test_user.id").toArray(), expectedInputs);
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
