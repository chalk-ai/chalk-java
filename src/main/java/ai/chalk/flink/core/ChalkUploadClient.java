package ai.chalk.flink.core;

import java.util.List;
import java.util.Map;

/**
 * Narrow seam over the Chalk upload transport. The default implementation
 * ({@link ChalkClientUploadClient}) delegates to {@code ai.chalk.client.ChalkClient}, which owns
 * token exchange, gRPC channel/routing, auth headers, and Arrow encoding. Tests substitute a fake.
 *
 * <p>Inputs are columnar: feature FQN to the list of values for the batch. Every column in a single
 * call must have the same length (Chalk expects a rectangular table); {@link ChalkFeatureUploader}
 * guarantees this by null-padding absent cells.
 */
public interface ChalkUploadClient extends AutoCloseable {

    UploadOutcome upload(Map<String, List<?>> columnarInputs) throws Exception;

    @Override
    void close();
}
