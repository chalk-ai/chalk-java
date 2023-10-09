package chalk.internal;

import org.junit.jupiter.api.Test;

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
    public void testNormalizeWindowedFeatureFqn() throws Exception {
        assert Utils.normalizeIfWindowedFeatureFqn("simple.feature.__600s__").equals("simple.feature.__10m__");
        assert Utils.normalizeIfWindowedFeatureFqn("simple.has_one.feature.__600s__").equals("simple.has_one.feature.__10m__");
        assert Utils.normalizeIfWindowedFeatureFqn("simple.feature.__601s__").equals("simple.feature.__601s__");
        assert Utils.normalizeIfWindowedFeatureFqn("malformed.feature.__601s").equals("malformed.feature.__601s");
    }
}
