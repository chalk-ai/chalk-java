package ai.chalk.client;

import ai.chalk.client.e2e.FraudTemplateFeatures;
import ai.chalk.client.e2e.Series;
import ai.chalk.client.e2e.User;
import ai.chalk.models.ErrorCode;
import ai.chalk.models.ErrorCodeCategory;
import ai.chalk.models.OnlineQueryParams;
import ai.chalk.models.OnlineQueryResult;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;

public class TestGrpcClient {
        private static ChalkClient client;

        @BeforeAll
        public static void setUpClass() throws Exception {
            if (FraudTemplateFeatures.getInitException() != null) {
                throw FraudTemplateFeatures.getInitException();
            }
            client = ChalkClient.createGrpc();
        }

        @Test
        public void testOnlineQueryScalars() throws Exception {
            var userIds = List.of("1", "2", "3");
            var params = OnlineQueryParams.builder()
                    .withInput(FraudTemplateFeatures.user.id, userIds)
                    .withOutputs(FraudTemplateFeatures.user.socure_score)
                    .build();

            try (OnlineQueryResult result = client.onlineQuery(params)) {
                assert result.getErrors().length == 0;
                var users = result.unmarshal(User.class);
                assert users.length == userIds.size();
                assert users[0].socure_score.getValue().equals(123.0);
            } catch (Exception e) {
                throw e;
            }
        }

        @Disabled("Has-many not yet supported on GRPC query")
        public void testOnlineQueryHasMany() throws Exception {
            var seedIds = List.of("seed", "A");
            var params = OnlineQueryParams.builder()
                    .withInput(FraudTemplateFeatures.series.id, seedIds)
                    .withOutputs(FraudTemplateFeatures.series.investors)
                    .build();

            try (OnlineQueryResult result = client.onlineQuery(params)) {
                assert result.getErrors().length == 0;
                var serieses = result.unmarshal(Series.class);
                assert serieses.length == seedIds.size();
                assert serieses[0].investors.getValue().size() > 0;
                assert serieses[0].investors.getValue().get(0).seriesId.getValue().equals("seed");
            }
        }

        @Test
        public void testOnlineQueryErrors() throws Exception {
            var userIds = List.of("1", "2", "3");
            var params = OnlineQueryParams.builder()
                    .withInput(FraudTemplateFeatures.user.id, userIds)
                    .withOutputs(FraudTemplateFeatures.user.socure_score, FraudTemplateFeatures.user.crashingFeature)
                    .build();

            try (OnlineQueryResult result = client.onlineQuery(params)) {
                var errors = result.getErrors();
                assert errors.length == 3;
                assert errors[0].getCode().equals(ErrorCode.RESOLVER_FAILED);
                assert errors[1].getCategory().equals(ErrorCodeCategory.FIELD);
                assert errors[2].getMessage().equals("Exception: oh no!");
                assert errors[0].getResolver().equals("neobank.resolvers.get_crashing_resolver");
                var users = result.unmarshal(User.class);
                assert users.length == userIds.size();
                assert users[0].socure_score.getValue().equals(123.0);
            } catch (Exception e) {
                throw e;
            }
        }

    @Test
    public void testOnlineQueryMeta() throws Exception {
        var userIds = List.of("1");
        var params = OnlineQueryParams.builder()
                .withInput(FraudTemplateFeatures.user.id, userIds)
                .withOutputs(FraudTemplateFeatures.user.socure_score)
                .build();

        try (OnlineQueryResult result = client.onlineQuery(params)) {
            var errors = result.getErrors();
            assert errors.length == 0;
            var meta = result.getMeta();
            assert meta.getQueryId().length() > 0;
            assert meta.getExecutionDurationS() > 0;
            // Significant oddity that this is coming back
            // empty. The python GRPC client has this populated.
            // assert meta.getEnvironmentId().length() > 0;
            assert meta.getQueryTimestamp() != null;
        } catch (Exception e) {
            throw e;
        }
    }


    @Test
    public void testOnlineQueryOptionalParamsSanity() throws Exception {
        // These tests simply tests that specifying these params don't crash,
        // instead of testing actual functionality.
        var userIds = List.of("1", "2", "3");
        var now = ZonedDateTime.now().minusMonths(1);
        var params = OnlineQueryParams.builder()
                .withInput(FraudTemplateFeatures.user.id, userIds)
                .withOutputs(FraudTemplateFeatures.user.socure_score)
                .withIncludeMeta(true)
                .withExplain(true)
                .withQueryName("chalk-java::testOnlineQueryOptionalParamsSanity")
                .withQueryNameVersion("1.0.0")
                .withStorePlanStages(true)
                .withStaleness(Map.of(FraudTemplateFeatures.user.socure_score.getFqn(), Duration.ofDays(1)))
                .withNow(List.of(now, now, now))
                .build();

        try (OnlineQueryResult result = client.onlineQuery(params)) {
            assert result.getErrors().length == 0;
            var users = result.unmarshal(User.class);
            assert users.length == userIds.size();
            assert users[0].socure_score.getValue().equals(123.0);
        } catch (Exception e) {
            throw e;
        }
    }
}
