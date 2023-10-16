package chalk.client.features;

import chalk.features.Feature;
import chalk.features.FeaturesClass;
import org.apache.arrow.vector.table.Table;

public class BurrysMembership extends FeaturesClass {
    public Feature<String> membership_id;
    public Feature<java.time.LocalDate> start_date;
    public Feature<Boolean> is_free_monthly_burryto_claimed;
    public Feature<Table> injuries;

    public BurrysBranchDataclass branch;
    public BurrysInstructor instructor;

    // Test we avoid infinite looping when there are
    // two-way has-one relationships
    public TestUser user;
}
