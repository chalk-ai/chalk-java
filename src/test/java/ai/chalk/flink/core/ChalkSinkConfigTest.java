package ai.chalk.flink.core;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ChalkSinkConfigTest {

    private static ChalkSinkConfig.Builder base() {
        return ChalkSinkConfig.builder().clientId("cid").clientSecret("secret");
    }

    @Test
    void defaultsBuild() {
        assertDoesNotThrow(() -> base().build()); // writeOnline=true, others false
    }

    @Test
    void rejectsUnsupportedWriteTargetsAtConstruction() {
        assertThrows(IllegalArgumentException.class, () -> base().writeOffline(true).build());
        assertThrows(IllegalArgumentException.class, () -> base().updateMataggs(true).build());
        assertThrows(IllegalArgumentException.class, () -> base().writeOnline(false).build());
    }

    @Test
    void rejectsInvalidDurationsAndCounts() {
        assertThrows(IllegalArgumentException.class, () -> base().retryBackoff(Duration.ofMillis(-1)).build());
        assertThrows(IllegalArgumentException.class, () -> base().flushInterval(Duration.ofMillis(-1)).build());
        assertThrows(IllegalArgumentException.class, () -> base().uploadTimeout(Duration.ZERO).build());
        assertThrows(IllegalArgumentException.class, () -> base().batchSize(0).build());
    }

    @Test
    void rejectsMissingCredentials() {
        assertThrows(IllegalArgumentException.class,
                () -> ChalkSinkConfig.builder().clientSecret("s").build());
        assertThrows(IllegalArgumentException.class,
                () -> ChalkSinkConfig.builder().clientId("c").build());
    }
}
