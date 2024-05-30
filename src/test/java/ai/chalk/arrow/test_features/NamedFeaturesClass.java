package ai.chalk.arrow.test_features;

import ai.chalk.features.Feature;
import ai.chalk.features.FeaturesClass;
import ai.chalk.features.Name;

public class NamedFeaturesClass extends FeaturesClass {
    @Name("abc_7d7_efg")
    public Feature<String> abc7d7Efg;

    // This tests back compat because we used to
    // generate features with snake case field names.
    public Feature<String> abc_7d7_efg;
}
