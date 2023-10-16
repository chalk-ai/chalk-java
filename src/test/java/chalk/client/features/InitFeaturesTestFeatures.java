package chalk.client.features;


// `InitFeaturesTestFeatures` helps us test `initFeatures`.
public class InitFeaturesTestFeatures {
    public static BurrysInstructor burrys_instructor;
    public static BurrysMembership burrys_membership;
    public static BurrysInjury burrys_injury;

    public static TestUser user;

    public static Exception initException = chalk.internal.codegen.Initializer.initFeatures(InitFeaturesTestFeatures.class);

    public static Exception getInitException() {
        return InitFeaturesTestFeatures.initException;
    }
}
