package ai.chalk.flink.core;

import java.io.Serializable;

/**
 * Builds the {@link ChalkUploadClient} a sink subtask uses, given the job config. Serialized and
 * shipped to TaskManagers, then invoked once per subtask in the operator's {@code open()} /
 * {@code createWriter()}.
 *
 * <p>The default (a {@code null} factory on the adapters) uses the real {@code ChalkClient}-backed
 * client. Supply a custom factory to inject a fake for a Flink MiniCluster test, or an alternate
 * transport. Implementations must be {@link Serializable}.
 */
@FunctionalInterface
public interface ChalkUploadClientFactory extends Serializable {
    ChalkUploadClient create(ChalkSinkConfig config);
}
