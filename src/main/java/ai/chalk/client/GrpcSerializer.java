package ai.chalk.client;

import ai.chalk.models.ResolverException;
import ai.chalk.protos.chalk.common.v1.ErrorCode;
import ai.chalk.protos.chalk.common.v1.ErrorCodeCategory;

import java.time.Instant;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Map;

public class GrpcSerializer {
    private static final Map<ErrorCode, ai.chalk.models.ErrorCode> errorCodeMap = Map.ofEntries(
            Map.entry(ErrorCode.ERROR_CODE_INTERNAL_SERVER_ERROR_UNSPECIFIED, ai.chalk.models.ErrorCode.INTERNAL_SERVER_ERROR),
            Map.entry(ErrorCode.ERROR_CODE_PARSE_FAILED, ai.chalk.models.ErrorCode.PARSE_FAILED),
            Map.entry(ErrorCode.ERROR_CODE_RESOLVER_NOT_FOUND, ai.chalk.models.ErrorCode.RESOLVER_NOT_FOUND),
            Map.entry(ErrorCode.ERROR_CODE_INVALID_QUERY, ai.chalk.models.ErrorCode.INVALID_QUERY),
            Map.entry(ErrorCode.ERROR_CODE_VALIDATION_FAILED, ai.chalk.models.ErrorCode.VALIDATION_FAILED),
            Map.entry(ErrorCode.ERROR_CODE_RESOLVER_FAILED, ai.chalk.models.ErrorCode.RESOLVER_FAILED),
            Map.entry(ErrorCode.ERROR_CODE_RESOLVER_TIMED_OUT, ai.chalk.models.ErrorCode.RESOLVER_TIMED_OUT),
            Map.entry(ErrorCode.ERROR_CODE_UPSTREAM_FAILED, ai.chalk.models.ErrorCode.UPSTREAM_FAILED),
            Map.entry(ErrorCode.ERROR_CODE_UNAUTHENTICATED, ai.chalk.models.ErrorCode.UNAUTHENTICATED),
            Map.entry(ErrorCode.ERROR_CODE_UNAUTHORIZED, ai.chalk.models.ErrorCode.UNAUTHORIZED),
            Map.entry(ErrorCode.ERROR_CODE_CANCELLED, ai.chalk.models.ErrorCode.CANCELLED),
            Map.entry(ErrorCode.ERROR_CODE_DEADLINE_EXCEEDED, ai.chalk.models.ErrorCode.DEADLINE_EXCEEDED)
    );

    private static final Map<ErrorCodeCategory, ai.chalk.models.ErrorCodeCategory> errorCategoryMap = Map.ofEntries(
            Map.entry(ErrorCodeCategory.ERROR_CODE_CATEGORY_NETWORK_UNSPECIFIED, ai.chalk.models.ErrorCodeCategory.NETWORK),
            Map.entry(ErrorCodeCategory.ERROR_CODE_CATEGORY_REQUEST, ai.chalk.models.ErrorCodeCategory.REQUEST),
            Map.entry(ErrorCodeCategory.ERROR_CODE_CATEGORY_FIELD, ai.chalk.models.ErrorCodeCategory.FIELD)
    );

    public static ai.chalk.models.ResolverException toException(ai.chalk.protos.chalk.common.v1.ChalkException e) {
        return new ai.chalk.models.ResolverException(
                e.getKind(),
                e.getMessage(),
                e.getStacktrace(),
                e.getInternalStacktrace()
        );
    }

    public static ai.chalk.exceptions.ServerError toServerError(ai.chalk.protos.chalk.common.v1.ChalkError e) {
        ResolverException exception = null;
        if (e.hasException()) {
            exception = toException(e.getException());
        }

        return new ai.chalk.exceptions.ServerError(
                errorCodeMap.get(e.getCode()),
                errorCategoryMap.get(e.getCategory()),
                e.getMessage(),
                exception,
                e.getFeature(),
                e.getResolver()
        );
    }

    public static ai.chalk.models.QueryMeta toQueryMeta(ai.chalk.protos.chalk.common.v1.OnlineQueryMetadata meta) {
        ZonedDateTime queryTimestamp = null;
        if (meta.hasQueryTimestamp()) {
            var ts = meta.getQueryTimestamp();
            queryTimestamp = ZonedDateTime.ofInstant(
                Instant.ofEpochSecond(ts.getSeconds(), ts.getNanos()),
                ZoneOffset.UTC
            );
        }
        return new ai.chalk.models.QueryMeta(
            meta.getExecutionDuration().getSeconds() + (meta.getExecutionDuration().getNanos() / 1e9),
            meta.getDeploymentId(),
            meta.getEnvironmentId(),
            meta.getEnvironmentName(),
            meta.getQueryId(),
            queryTimestamp,
            meta.getQueryHash()
        );
    }
}
