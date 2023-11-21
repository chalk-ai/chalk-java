package ai.chalk.arrow.test_features;

import ai.chalk.internal.codegen.Initializer;


public class ArrowFeatures {
    public static MyTail myTail;
    public static Transaction transaction;
    public static ArrowUser user;


    private static Exception initException = Initializer.initFeatures(ArrowFeatures.class);

    public static Exception getInitException() {
        return ArrowFeatures.initException;
    }
}
