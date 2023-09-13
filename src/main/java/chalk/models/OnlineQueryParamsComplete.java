package chalk.models;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class OnlineQueryParamsComplete extends OnlineQueryParams {

    /**
     * Thin subclass of OnlineQueryParams. Used to statically
     * indicate that all required online query params have been
     * provided.
     *
     * <p> Constructed by calling `withInputs` and `withOutputs`
     * at least once in {@link OnlineQueryParams.Builder}.
     *
     * <p>
     *     Example usage:
     *     <pre>
     *         {@code
     *         OnlineQueryParamsComplete params = OnlineQueryParams.builder()
     *         .withInput("user.id", new int[] {1, 2, 3})
     *         .withOutputs("user.email", "user.transactions")
     *         .build();
     *
     *         result = client.onlineQuery(params);
     *         }
     *     </pre>
     * </p>
     */
    public OnlineQueryParamsComplete(
            Map<String, Object> inputs,
            List<String> outputs,
            Map<String, Duration> staleness,
            Map<String, String> meta,
            List<String> tags,
            boolean includeMeta,
            boolean includeMetrics,
            String environmentId,
            String previewDeploymentId,
            String queryName,
            String correlationId,
            String branch
    ) {
        super(inputs, outputs, staleness, meta, tags, includeMeta, includeMetrics, environmentId, previewDeploymentId, queryName, correlationId, branch);
    }
}
