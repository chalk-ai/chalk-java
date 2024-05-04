package ai.chalk.arrow.test_features;

import ai.chalk.features.Feature;
import ai.chalk.features.FeaturesClass;
import ai.chalk.features.Versioned;

public class VersionedFeaturesClass extends FeaturesClass {
    @Versioned(defaultVersion = 2)
    public Feature<String> grade;
    @Versioned
    public Feature<String> grade_v1;
    @Versioned
    public Feature<String> grade_v2;
}
