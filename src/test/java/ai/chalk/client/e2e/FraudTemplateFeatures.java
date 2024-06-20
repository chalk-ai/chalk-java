package ai.chalk.client.e2e;

import ai.chalk.internal.codegen.Initializer;

public class FraudTemplateFeatures {
    public static User user;

    public static Series series;

    public static Exception initException = Initializer.initFeatures(FraudTemplateFeatures.class);

    public static Exception getInitException() {
        return FraudTemplateFeatures.initException;
    }
}