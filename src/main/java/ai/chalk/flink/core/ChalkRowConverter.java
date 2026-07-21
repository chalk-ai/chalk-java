package ai.chalk.flink.core;

import java.io.Serializable;
import java.util.Map;

/**
 * Maps a single stream element of type {@code IN} to a Chalk feature row: a map from
 * fully-qualified feature name (e.g. {@code "user.id"}, {@code "user.score"}) to its value for
 * this record. The map MUST include the resolver's primary-key feature (e.g. {@code "user.id"}).
 *
 * <p>Values should have a consistent runtime type per feature across the stream — Chalk validates
 * types on ingest. Supported value types mirror the Chalk Java client's Arrow encoding: {@code Long},
 * {@code Integer}, {@code Double}, {@code Float}, {@code Boolean}, {@code String}, {@code byte[]},
 * {@code java.time.Instant}, and lists/maps thereof. A {@code null} value is uploaded as a null cell.
 *
 * <p>Return {@code null} from {@link #toRow} to drop an element (it will not be uploaded).
 *
 * <p>Must be {@link Serializable} because Flink ships it to the TaskManagers.
 */
@FunctionalInterface
public interface ChalkRowConverter<IN> extends Serializable {

    Map<String, Object> toRow(IN element);

    /** Identity converter for streams that already carry {@code Map<String, Object>} rows. */
    @SuppressWarnings("unchecked")
    static ChalkRowConverter<Map<String, Object>> identity() {
        return element -> (Map<String, Object>) element;
    }
}
