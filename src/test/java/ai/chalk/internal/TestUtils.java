package ai.chalk.internal;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUtils {
    @Test
    public void testFormatBucketDuration() throws Exception {
        assert Utils.formatBucketDuration(601).equals("601s");
        assert Utils.formatBucketDuration(600).equals("10m");
        assert Utils.formatBucketDuration(3600).equals("1h");
        assert Utils.formatBucketDuration(5400).equals("90m");
        assert Utils.formatBucketDuration(7200).equals("2h");
        assert Utils.formatBucketDuration(86400).equals("1d");
        assert Utils.formatBucketDuration(1).equals("1s");
        assert Utils.formatBucketDuration(86400 * 14).equals("2w");
    }


    @Test
    public void testOnlySeconds() {
        Duration duration = Duration.ofSeconds(30);
        assertEquals("30s", Utils.toChalkDuration(duration));
    }

    @Test
    public void testCombination() {
        Duration duration = Duration.ofDays(1).plusHours(2).plusMinutes(3).plusSeconds(4);
        assertEquals("1d 2h 3m 4s", Utils.toChalkDuration(duration));
    }

    @Test
    public void testSubMilliseconds() {
        Duration duration = Duration.ofMillis(1001).plusNanos(2000);
        assertEquals("1s 1ms 2us", Utils.toChalkDuration(duration));
    }

    @Test
    public void testZeroDuration() {
        Duration duration = Duration.ZERO;
        assertEquals("0s", Utils.toChalkDuration(duration));
    }

    @Test
    public void testMaxDuration() {
        Duration duration = Duration.ofSeconds(Long.MAX_VALUE, 999999999);
        assertEquals("all", Utils.toChalkDuration(duration));
    }

    @Test
    public void testForeverDuration() {
        Duration duration = ChronoUnit.FOREVER.getDuration();
        assertEquals("all", Utils.toChalkDuration(duration));
    }

    @Test
    public void testToSnakeCase() {
        assertEquals("segment_id_hash", Utils.chalkpySnakeCase("SEGMENT_ID_HASH"));
        assertEquals("account_id", Utils.chalkpySnakeCase("accountId"));
        assertEquals("account_id", Utils.chalkpySnakeCase("account_id"));
        assertEquals("foo", Utils.chalkpySnakeCase("foo"));
        assertEquals("foo", Utils.chalkpySnakeCase("FOO"));
        assertEquals("foo_bar", Utils.chalkpySnakeCase("FooBar"));
        assertEquals("abc7d7_efg", Utils.chalkpySnakeCase("abc7d7Efg"));
        assertEquals("be_really__careful", Utils.chalkpySnakeCase("be__REALLY__careful"));
    }

}
