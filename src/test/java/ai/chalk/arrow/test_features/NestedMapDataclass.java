package ai.chalk.arrow.test_features;

import ai.chalk.features.Feature;
import ai.chalk.features.StructFeaturesClass;

import java.util.Map;


public class NestedMapDataclass extends StructFeaturesClass {
    public Feature<Map<String, Map<String, Integer>>> nestedMap;
}
