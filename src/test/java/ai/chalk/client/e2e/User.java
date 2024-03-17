package ai.chalk.client.e2e;

import ai.chalk.features.Feature;
import ai.chalk.features.FeaturesClass;

import java.util.Optional;

public class User extends FeaturesClass {
    public Feature<String> id;
    public Feature<Double> socure_score;
    public Feature<byte[]> binary_data;
    public Feature<Optional<String>> full_name_optional;
}
