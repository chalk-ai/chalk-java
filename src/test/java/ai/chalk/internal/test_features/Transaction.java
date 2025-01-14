package ai.chalk.internal.test_features;

import ai.chalk.features.FeaturesClass;
import ai.chalk.features.Versioned;

public class Transaction extends FeaturesClass {
    public String id;
    public double amount;
    public _WindowedFeatures_1d_30d avgAmount;
    @Versioned( defaultVersion = 2 )
    public String name;
    @Versioned
    public String nameV2;
    @Versioned
    public String nameV3;
}
