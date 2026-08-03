package ai.chalk.flink.core;

import ai.chalk.client.ChalkClient;
import ai.chalk.exceptions.ChalkException;
import ai.chalk.exceptions.ServerError;
import ai.chalk.models.UploadFeaturesParams;
import ai.chalk.models.UploadFeaturesResult;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Default {@link ChalkUploadClient}, backed by the maintained {@code ai.chalk.client.ChalkClient}
 * over its gRPC transport. The Chalk client owns credential/token exchange, engine routing, auth
 * headers, and Arrow-Feather encoding of the columnar inputs — this class just adapts types.
 *
 * <p>Built once per parallel sink subtask (in the Flink operator's {@code open()}), not serialized.
 *
 * <p>Limitation: the public {@link UploadFeaturesParams} exposes only inputs/env/timeout, so uploads
 * target the <b>online store</b> (the engine default). Writing to the offline store or updating
 * materialized aggregations requires {@code write_offline}/{@code update_mataggs} options, which the
 * chalk-java high-level API does not yet surface. See README "Write targets".
 */
final class ChalkClientUploadClient implements ChalkUploadClient {

    private final ChalkClient client;
    private final java.time.Duration uploadTimeout;
    private final boolean writeOnline;
    private final boolean writeOffline;
    private final boolean updateMataggs;
    private final String resourceGroup;

    ChalkClientUploadClient(ChalkSinkConfig config) {
        this.uploadTimeout = config.uploadTimeout();
        this.resourceGroup = config.resourceGroup();
        // Captured for the future upgrade path (see the commented withWrite* lines in upload()).
        // Non-default values are already rejected up front in ChalkSinkConfig.build(), so here they
        // are always the online-only defaults until the dependency exposes UploadFeaturesOptions.
        this.writeOnline = config.writeOnline();
        this.writeOffline = config.writeOffline();
        this.updateMataggs = config.updateMataggs();
        try {
            ChalkClient.Builder builder = ChalkClient.builder()
                    .withClientId(config.clientId())
                    .withClientSecret(config.clientSecret())
                    .withGrpc();
            if (config.apiServer() != null) {
                builder.withApiServer(config.apiServer());
            }
            if (config.environmentId() != null) {
                builder.withEnvironmentId(config.environmentId());
            }
            if (config.queryServer() != null) {
                builder.withQueryServer(config.queryServer());
            }
            if (config.branch() != null) {
                builder.withBranch(config.branch());
            }
            builder.withTimeout(uploadTimeout);
            this.client = builder.build();
        } catch (ChalkException e) {
            throw new ChalkUploadException("failed to construct Chalk gRPC client", e);
        }
    }

    @Override
    public UploadOutcome upload(Map<String, List<?>> columnarInputs) throws ChalkException {
        UploadFeaturesParams params = UploadFeaturesParams.builder()
                .withInputs(columnarInputs)
                .withTimeout(uploadTimeout)
                // Null/empty leaves the header unset, i.e. the environment's default engines.
                .withResourceGroup(resourceGroup)
                // Write targets. Uncomment once the dependency is bumped to a chalk-java release that
                // exposes these on UploadFeaturesParams (see chalk-java-pr/ and README "Write targets").
                // Until then, uploads target the online store (the engine default).
                // .withWriteOnline(writeOnline)
                // .withWriteOffline(writeOffline)
                // .withUpdateMataggs(updateMataggs)
                .build();
        UploadFeaturesResult result = client.uploadFeatures(params);
        List<String> errors = result.getErrors() == null
                ? List.of()
                : result.getErrors().stream()
                        .map(ChalkClientUploadClient::describe)
                        .collect(Collectors.toList());
        return new UploadOutcome(result.getOperationId(), errors);
    }

    private static String describe(ServerError e) {
        return e == null ? "unknown error" : e.toString();
    }

    @Override
    public void close() {
        try {
            client.close(); // AutoCloseable.close() declares a checked Exception
        } catch (Exception e) {
            throw new ChalkUploadException("error closing Chalk client", e);
        }
    }
}
