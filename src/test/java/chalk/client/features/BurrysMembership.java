package chalk.client.features;

import chalk.features.Feature;
import chalk.features.FeaturesClass;
import org.apache.arrow.vector.table.Table;

public class BurrysMembership extends FeaturesClass {
    public Feature<String> membershipId;
    public Feature<java.time.LocalDate> startDate;
    public Feature<Boolean> isFreeMonthlyBurrytoClaimed;
    public Feature<Table> injuries;

    public BurrysBranchDataclass branch;
    public BurrysInstructor instructor;
}
