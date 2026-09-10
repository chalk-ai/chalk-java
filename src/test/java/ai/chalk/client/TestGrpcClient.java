package ai.chalk.client;

import ai.chalk.client.e2e.FraudTemplateFeatures;
import ai.chalk.client.e2e.Series;
import ai.chalk.client.e2e.User;
import ai.chalk.models.ErrorCode;
import ai.chalk.models.ErrorCodeCategory;
import ai.chalk.exceptions.ClientException;
import ai.chalk.models.OnlineQueryMultiResult;
import ai.chalk.models.OnlineQueryParams;
import ai.chalk.models.OnlineQueryParamsComplete;
import ai.chalk.models.OnlineQueryResult;
import org.junit.jupiter.api.AfterAll;
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

        @AfterAll
        public static void tearDown() throws Exception {
            client.close();
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
        @Test
        public void testOnlineQueryTraceId() throws Exception {
            var userIds = List.of("5524");
            var params = OnlineQueryParams.builder()
                    .withInput(FraudTemplateFeatures.user.id, userIds)
                    .withOutputs(FraudTemplateFeatures.user.socure_score)
                    .build();

            try (OnlineQueryResult result = client.onlineQuery(params)) {
                assert result.getErrors().length == 0;
                assert result.getMeta().getTraceId() != null;
                assert result.getMeta().getTraceId().length() > 0;
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
                var series = result.unmarshal(Series.class);
                assert series.length == seedIds.size();
                assert series[0].investors.getValue().size() > 0;
                assert series[0].investors.getValue().get(0).seriesId.getValue().equals("seed");
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
                .withQueryName("chalk-java::testOnlineQueryOptionalParamsSanity")
                .withQueryNameVersion("1.0.0")
                .withOutputs(FraudTemplateFeatures.user.socure_score)
                // TODO: CHA-4791
                // .withIncludeMeta(true)
                // .withExplain(true)
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

    @Test
    public void testOnlineQueryMultiScalars() throws Exception {
        var firstIds = List.of("1", "2", "3");
        var secondIds = List.of("4", "5");
        var first = OnlineQueryParams.builder()
                .withInput(FraudTemplateFeatures.user.id, firstIds)
                .withOutputs(FraudTemplateFeatures.user.socure_score)
                .build();
        var second = OnlineQueryParams.builder()
                .withInput(FraudTemplateFeatures.user.id, secondIds)
                .withOutputs(FraudTemplateFeatures.user.socure_score)
                .build();

        try (OnlineQueryMultiResult multi = client.onlineQueryMulti(List.of(first, second))) {
            assert multi.getGlobalErrors().length == 0;
            assert multi.getResults().size() == 2;

            var firstUsers = multi.getResults().get(0).unmarshal(User.class);
            assert firstUsers.length == firstIds.size();
            assert firstUsers[0].socure_score.getValue().equals(123.0);

            var secondUsers = multi.getResults().get(1).unmarshal(User.class);
            assert secondUsers.length == secondIds.size();
        }
    }

    /**
     * The engine executes the sub-queries independently, so one failing query must
     * leave the others' results intact and must not produce a global error.
     */
    @Test
    public void testOnlineQueryMultiPartialFailure() throws Exception {
        var userIds = List.of("1", "2", "3");
        var healthy = OnlineQueryParams.builder()
                .withInput(FraudTemplateFeatures.user.id, userIds)
                .withOutputs(FraudTemplateFeatures.user.socure_score)
                .build();
        var crashing = OnlineQueryParams.builder()
                .withInput(FraudTemplateFeatures.user.id, userIds)
                .withOutputs(FraudTemplateFeatures.user.socure_score, FraudTemplateFeatures.user.crashingFeature)
                .build();

        try (OnlineQueryMultiResult multi = client.onlineQueryMulti(List.of(healthy, crashing))) {
            // the batch itself succeeded; the failure belongs to one sub-query
            assert multi.getGlobalErrors().length == 0;
            assert multi.getResults().size() == 2;

            var healthyResult = multi.getResults().get(0);
            assert healthyResult.getErrors().length == 0;
            var users = healthyResult.unmarshal(User.class);
            assert users.length == userIds.size();
            assert users[0].socure_score.getValue().equals(123.0);

            var crashingResult = multi.getResults().get(1);
            assert crashingResult.getErrors().length > 0;
            assert crashingResult.getErrors()[0].getCode().equals(ErrorCode.RESOLVER_FAILED);
        }
    }

    @Test
    public void testOnlineQueryMultiTraceId() throws Exception {
        var params = OnlineQueryParams.builder()
                .withInput(FraudTemplateFeatures.user.id, List.of("1"))
                .withOutputs(FraudTemplateFeatures.user.socure_score)
                .build();

        try (OnlineQueryMultiResult multi = client.onlineQueryMulti(List.of(params, params))) {
            assert multi.getTraceId() != null && !multi.getTraceId().isEmpty();
            // one request means one trace id, shared by every sub-query
            for (var result : multi.getResults()) {
                assert multi.getTraceId().equals(result.getMeta().getTraceId());
            }
        }
    }

    /**
     * A one-element batch must agree with the equivalent single query, which
     * cross-checks the request builders and response decoders the two paths share.
     */
    @Test
    public void testOnlineQueryMultiMatchesSingleQuery() throws Exception {
        var userIds = List.of("1", "2", "3");
        var params = OnlineQueryParams.builder()
                .withInput(FraudTemplateFeatures.user.id, userIds)
                .withOutputs(FraudTemplateFeatures.user.socure_score)
                .build();

        try (
                OnlineQueryResult single = client.onlineQuery(params);
                OnlineQueryMultiResult multi = client.onlineQueryMulti(List.of(params))
        ) {
            assert multi.getResults().size() == 1;
            var singleUsers = single.unmarshal(User.class);
            var multiUsers = multi.getResults().get(0).unmarshal(User.class);
            assert singleUsers.length == multiUsers.length;
            for (int i = 0; i < singleUsers.length; i++) {
                assert singleUsers[i].socure_score.getValue()
                        .equals(multiUsers[i].socure_score.getValue());
            }
        }
    }

    @Test
    public void testOnlineQueryMultiRejectsConflictingQueryName() throws Exception {
        var named = OnlineQueryParams.builder()
                .withInput(FraudTemplateFeatures.user.id, List.of("1"))
                .withOutputs(FraudTemplateFeatures.user.socure_score)
                .withQueryName("chalk-java::multiA")
                .build();
        var otherName = OnlineQueryParams.builder()
                .withInput(FraudTemplateFeatures.user.id, List.of("1"))
                .withOutputs(FraudTemplateFeatures.user.socure_score)
                .withQueryName("chalk-java::multiB")
                .build();

        // Query name is routed on per request, so a batch cannot mix names.
        org.junit.jupiter.api.Assertions.assertThrows(
                ClientException.class, () -> client.onlineQueryMulti(List.of(named, otherName)));
    }

    @Test
    public void testOnlineQueryMultiEmptyList() throws Exception {
        try (OnlineQueryMultiResult multi = client.onlineQueryMulti(List.<OnlineQueryParamsComplete>of())) {
            assert multi.getResults().isEmpty();
            assert multi.getGlobalErrors().length == 0;
        }
    }
}
