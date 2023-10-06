package chalk.arrow.test_features;

import chalk.internal.codegen.Initializer;


public class ArrowFeatures {
    public static MyTail myTail;
    public static Transaction transactions;
    public static ArrowUser user;


    private static Exception initException = Initializer.initFeatures(ArrowFeatures.class);

    public static Exception getInitException() {
        return ArrowFeatures.initException;
    }
}
