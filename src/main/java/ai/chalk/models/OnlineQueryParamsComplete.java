package ai.chalk.models;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class OnlineQueryParamsComplete extends OnlineQueryParams {
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
