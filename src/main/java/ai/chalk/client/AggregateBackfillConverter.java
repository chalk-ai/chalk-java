package ai.chalk.client;

import ai.chalk.models.AggregateBackfillCostEstimate;
import ai.chalk.models.AggregateBackfillJob;
import ai.chalk.models.AggregateBackfillPlan;
import ai.chalk.models.AggregateBackfillResponse;
import ai.chalk.models.AggregateBackfillStatus;
import ai.chalk.protos.chalk.aggregate.v1.AggregateBackfill;
import ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillWithCostEstimate;
import ai.chalk.protos.chalk.aggregate.v1.AggregateTimeSeries;
import ai.chalk.protos.chalk.aggregate.v1.AggregateTimeSeriesRule;
import ai.chalk.protos.chalk.aggregate.v1.CreateAggregateBackfillV2Response;
import com.google.protobuf.Timestamp;

import javax.annotation.Nullable;
import java.time.Duration;
import java.time.Instant;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/**
 * Decodes aggregate backfill protos into the public models, so callers never handle
 * a protobuf message. Mirrors {@code AggregateBackfillConverter} in the Python client.
 */
final class AggregateBackfillConverter {
    private AggregateBackfillConverter() {}

    static AggregateBackfillResponse responseDecode(CreateAggregateBackfillV2Response proto) {
        return new AggregateBackfillResponse(
                // An unset `job` means the request was a plan-only dry run, which creates nothing.
                proto.hasJob() ? jobDecode(proto.getJob()) : null,
                plansDecode(proto.getSubBackfillsList())
        );
    }

    static List<AggregateBackfillPlan> plansDecode(List<AggregateBackfillWithCostEstimate> protos) {
        List<AggregateBackfillPlan> plans = new ArrayList<>();
        for (AggregateBackfillWithCostEstimate proto : protos) {
            plans.add(planDecode(proto));
        }
        return plans;
    }

    static AggregateBackfillPlan planDecode(AggregateBackfillWithCostEstimate proto) {
        AggregateBackfill backfill = proto.getBackfill();
        var estimate = proto.getEstimate();
        return new AggregateBackfillPlan(
                // Flattened from series[].rules[].dependent_features so callers do not have to walk
                // four levels of nesting to answer "which features does this sub-backfill cover?".
                dependentFeatures(backfill),
                new AggregateBackfillCostEstimate(
                        estimate.getMaxBuckets(),
                        estimate.getExpectedBuckets(),
                        estimate.getExpectedBytes(),
                        estimate.getExpectedStorageCost(),
                        estimate.hasExpectedRuntime() ? durationDecode(estimate.getExpectedRuntime()) : null
                ),
                emptyToNull(backfill.getResolver()),
                emptyToNull(backfill.getDatetimeFeature()),
                backfill.hasLowerBound() ? timestampDecode(backfill.getLowerBound()) : null,
                backfill.hasUpperBound() ? timestampDecode(backfill.getUpperBound()) : null,
                backfill.hasBucketDuration() ? durationDecode(backfill.getBucketDuration()) : null,
                backfill.hasMaxRetention() ? durationDecode(backfill.getMaxRetention()) : null,
                new ArrayList<>(backfill.getGroupByList()),
                emptyToNull(backfill.getFiltersDescription()),
                backfill.hasInputSql() ? backfill.getInputSql() : null
        );
    }

    static AggregateBackfillJob jobDecode(ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillJob proto) {
        return new AggregateBackfillJob(
                proto.getId(),
                statusDecode(proto.getStatus()),
                // Deduplicated so every server path agrees. CreateAggregateBackfillV2 writes a
                // deduplicated set, but a V1 server builds this row from one insert per sub-backfill,
                // repeating anything two sub-backfills share, and the server can also append
                // resolvers while hydrating the row without deduplicating.
                dedupe(proto.getFeaturesList()),
                dedupe(proto.getResolversList()),
                new ArrayList<>(proto.getQueryTagsList()),
                emptyToNull(proto.getEnvironmentId()),
                proto.hasResolver() ? proto.getResolver() : null,
                proto.hasAgentId() ? proto.getAgentId() : null,
                proto.hasDeploymentId() ? proto.getDeploymentId() : null,
                proto.hasPlanHash() ? proto.getPlanHash() : null,
                proto.hasCronAggregateBackfillId() ? proto.getCronAggregateBackfillId() : null,
                proto.hasCronAggregateBackfillName() ? proto.getCronAggregateBackfillName() : null,
                proto.hasCreatedAt() ? timestampDecode(proto.getCreatedAt()) : null,
                proto.hasUpdatedAt() ? timestampDecode(proto.getUpdatedAt()) : null
        );
    }

    /*
     * Unlike ErrorCode, this is a lifecycle enum a newer server can extend. Reporting an
     * unrecognized value as UNKNOWN keeps the rest of the backfill readable, where throwing
     * would fail the whole response over one status we happen not to know yet.
     */
    static AggregateBackfillStatus statusDecode(ai.chalk.protos.chalk.aggregate.v1.AggregateBackfillStatus status) {
        return switch (status) {
            case AGGREGATE_BACKFILL_STATUS_INITIALIZING -> AggregateBackfillStatus.INITIALIZING;
            case AGGREGATE_BACKFILL_STATUS_INIT_FAILED -> AggregateBackfillStatus.INIT_FAILED;
            case AGGREGATE_BACKFILL_STATUS_SKIPPED -> AggregateBackfillStatus.SKIPPED;
            case AGGREGATE_BACKFILL_STATUS_QUEUED -> AggregateBackfillStatus.QUEUED;
            case AGGREGATE_BACKFILL_STATUS_WORKING -> AggregateBackfillStatus.WORKING;
            case AGGREGATE_BACKFILL_STATUS_COMPLETED -> AggregateBackfillStatus.COMPLETED;
            case AGGREGATE_BACKFILL_STATUS_FAILED -> AggregateBackfillStatus.FAILED;
            case AGGREGATE_BACKFILL_STATUS_CANCELED -> AggregateBackfillStatus.CANCELED;
            case AGGREGATE_BACKFILL_STATUS_UNSPECIFIED, UNRECOGNIZED -> AggregateBackfillStatus.UNKNOWN;
        };
    }

    static List<String> dependentFeatures(AggregateBackfill backfill) {
        LinkedHashSet<String> features = new LinkedHashSet<>();
        for (AggregateTimeSeries series : backfill.getSeriesList()) {
            for (AggregateTimeSeriesRule rule : series.getRulesList()) {
                features.addAll(rule.getDependentFeaturesList());
            }
        }
        return new ArrayList<>(features);
    }

    static Timestamp timestampEncode(ZonedDateTime value) {
        return Timestamp.newBuilder()
                .setSeconds(value.toEpochSecond())
                .setNanos(value.getNano())
                .build();
    }

    private static ZonedDateTime timestampDecode(Timestamp ts) {
        return ZonedDateTime.ofInstant(Instant.ofEpochSecond(ts.getSeconds(), ts.getNanos()), ZoneOffset.UTC);
    }

    private static Duration durationDecode(com.google.protobuf.Duration d) {
        return Duration.ofSeconds(d.getSeconds(), d.getNanos());
    }

    private static List<String> dedupe(List<String> values) {
        return new ArrayList<>(new LinkedHashSet<>(values));
    }

    private static @Nullable String emptyToNull(String value) {
        return value.isEmpty() ? null : value;
    }
}
