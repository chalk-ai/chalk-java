package ai.chalk.client;

import ai.chalk.features.Feature;
import ai.chalk.features.FeaturesClass;

/** Minimal feature class used only to exercise the unmarshal guard. */
public class TestGrpcMultiQueryUser extends FeaturesClass {
    public Feature<String> id;
    public Feature<Double> socure_score;
}
