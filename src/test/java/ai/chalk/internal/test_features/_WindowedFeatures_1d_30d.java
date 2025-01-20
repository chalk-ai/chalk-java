package ai.chalk.internal.test_features;

import ai.chalk.features.Feature;
import ai.chalk.features.Name;
import ai.chalk.features.WindowedFeaturesClass;

public class _WindowedFeatures_1d_30d extends WindowedFeaturesClass {
    @Name("bucket_1d")
    public Feature<Double> bucket1d;

    @Name("bucket_30d")
    public Feature<Double> bucket30d;
}
