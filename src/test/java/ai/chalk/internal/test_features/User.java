package ai.chalk.internal.test_features;

import ai.chalk.features.Feature;
import ai.chalk.features.FeaturesClass;
import ai.chalk.features.HasMany;

import java.util.List;

public class User extends FeaturesClass {
    public Feature<String> id;
    public Feature<String> name;
    @HasMany(localKey = "id", foreignKey = "user_id")
    public Feature<List<Transaction>> transactions;
    public Account account;
    public Address address;
}
