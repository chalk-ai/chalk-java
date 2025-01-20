package ai.chalk.internal.test_features;

import ai.chalk.features.Feature;
import ai.chalk.features.FeaturesClass;
import ai.chalk.features.Versioned;

public class Transaction extends FeaturesClass {
    public Feature<String> id;
    public Feature<Double> amount;
    public _WindowedFeatures_1d_30d avgAmount;
    @Versioned( defaultVersion = 2 )
    public Feature<String> name;
    @Versioned
    public Feature<String> nameV2;
    @Versioned
    public Feature<String> nameV3;
}
