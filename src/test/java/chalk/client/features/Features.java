package chalk.client.features;


// `Features` helps us test `initFeatures`.
public class Features {
    public static BurrysInstructor burrysInstructor;
    public static BurrysMembership burrysMembership;
    public static BurrysInjury burrysInjury;

    public static User user;

    public static Exception initException = chalk.internal.codegen.Initializer.initFeatures(Features.class);

    public static Exception getInitException() {
        return Features.initException;
    }
}
