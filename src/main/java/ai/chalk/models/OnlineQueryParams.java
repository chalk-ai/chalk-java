package ai.chalk.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Singular;

import java.util.List;
import java.time.Duration;
import java.util.Map;

@Getter @Builder @AllArgsConstructor
public class OnlineQueryParams {
    @Singular private Map<String, Object> inputs;
    @Singular private List<String> outputs;
    @Singular("staleness") private Map<String, Duration> staleness;
    @Singular("meta") private Map<String, String> meta;
    @Singular private List<String> tags;
    private boolean includeMeta;
    private boolean includeMetrics;
    private String environmentId;
    private String previewDeploymentId;
    private String queryName;
    private String correlationId;
}