package chalk.client.features;


// `InitFeaturesTestFeatures` helps us test `initFeatures`.
public class InitFeaturesTestFeatures {
    public static BurrysInstructor burrysInstructor;
    public static BurrysMembership burrysMembership;
    public static BurrysInjury burrysInjury;

    public static User user;

    public static Exception initException = chalk.internal.codegen.Initializer.initFeatures(InitFeaturesTestFeatures.class);

    public static Exception getInitException() {
        return InitFeaturesTestFeatures.initException;
    }
}
