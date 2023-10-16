package chalk.client.features;

import chalk.features.Feature;
import chalk.features.FeaturesClass;

import java.util.List;

public class TestUser extends FeaturesClass {
    public Feature<String> id;
    public BurrysMembership burrys_membership;
    public Feature<List<BurrysInjury>> injuries;
    public Feature<Double> socure_score;
    public _WindowedFeatures_1w_4w_all mean_attendance_count;
}
