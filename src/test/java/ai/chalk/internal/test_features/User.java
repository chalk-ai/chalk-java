package ai.chalk.internal.test_features;

import ai.chalk.features.Feature;
import ai.chalk.features.FeaturesClass;

import java.util.List;

public class User extends FeaturesClass {
    public Feature<String> id;
    public Feature<String> name;
    public Feature<List<Transaction>> transactions;
}
