package ai.chalk.client.e2e;

import ai.chalk.features.Feature;
import ai.chalk.features.FeaturesClass;
import ai.chalk.features.HasMany;

import java.util.List;


public class Series extends FeaturesClass {
    public Feature<String> id;
    public Feature<String> name;
    @HasMany(localKey = "id", foreignKey = "series_id")
    public Feature<List<Investor>> investors;
}
