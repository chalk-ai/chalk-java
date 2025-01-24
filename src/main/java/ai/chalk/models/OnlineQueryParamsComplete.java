package ai.chalk.models;

import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.Map;

public class OnlineQueryParamsComplete extends OnlineQueryParams {

    /**
     * Thin subclass of OnlineQueryParams. Used to statically
     * indicate that all required online query params have been
     * provided.
     *
     * <p> Constructed by calling `withInput` and `withOutput`
     * at least once in {@link OnlineQueryParams.Builder}.
     *
     * <p>
     *     Example usage:
     *     <pre>
     *         {@code
     *         OnlineQueryParamsComplete params = OnlineQueryParams.builder()
     *         .withInput("user.id", Arrays.asList(1, 2, 3))
     *         .withOutputs("user.email", "user.transactions")
     *         .build();
     *
     *         try (OnlineQueryResult result = client.onlineQuery(params)) {
     *               // do something with the result
     *         }
     *         }
     *     </pre>
     * </p>
     */
    public OnlineQueryParamsComplete(
            Map<String, List<?>> inputs,
            List<String> outputs,
            Map<String, Duration> staleness,
            Map<String, String> meta,
            List<String> tags,
            boolean includeMeta,
            boolean storePlanStages,
            boolean explain,
            String environmentId,
            String previewDeploymentId,
            String queryName,
            String queryNameVersion,
            String correlationId,
            String branch,
            List<ZonedDateTime> now,
            List<String> requiredResolverTags,
            Map<String, Object> plannerOptions
    ) {
        super(
            inputs,
            outputs,
            staleness,
            meta,
            tags,
            includeMeta,
            storePlanStages,
            explain,
            environmentId,
            previewDeploymentId,
            queryName,
            queryNameVersion,
            correlationId,
            branch,
            now,
            requiredResolverTags,
            plannerOptions
        );
    }
}
