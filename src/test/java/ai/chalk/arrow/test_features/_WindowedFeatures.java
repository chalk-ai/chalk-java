package ai.chalk.arrow.test_features;


import ai.chalk.features.Feature;
import ai.chalk.features.Name;
import ai.chalk.features.WindowedFeaturesClass;

public class _WindowedFeatures extends WindowedFeaturesClass {
    @Name("bucket_1d")
    public Feature<Double> bucket1d;
    @Name("bucket_601s")
    public Feature<Double> bucket601s;
}
