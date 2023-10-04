package chalk.client.features;

import chalk.features.Feature;
import chalk.features.FeaturesClass;
import org.apache.arrow.vector.table.Table;

public class User extends FeaturesClass {
    public Feature<String> id;
    public BurrysMembership burrysMembership;
    public Feature<Table> injuries;
    public Feature<Double> socureScore;
}
