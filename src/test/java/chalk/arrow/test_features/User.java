package chalk.arrow.test_features;

import chalk.features.Feature;
import chalk.features.FeaturesClass;

import java.util.List;

public class User extends FeaturesClass {
    public Feature<String> id;
    public Feature<List<Long>> favoriteNumbers;
}
