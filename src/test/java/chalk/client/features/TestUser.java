package chalk.client.features;

import chalk.features.Feature;
import chalk.features.FeaturesClass;

import java.util.List;

public class TestUser extends FeaturesClass {
    public Feature<String> id;
    public BurrysMembership burrysMembership;
    public Feature<List<BurrysInjury>> injuries;
    public Feature<Double> socureScore;
    public _WindowedFeatures meanAttendanceCount;
}
