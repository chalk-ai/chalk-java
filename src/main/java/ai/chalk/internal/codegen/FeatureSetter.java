package ai.chalk.internal.codegen;

import ai.chalk.features.Feature;


public class FeatureSetter implements Setter {
    private final Feature<?> feature;

    public FeatureSetter(Feature<?> feature) {
        this.feature = feature;
    }

    public void set(Object value) throws Exception {
        feature.setValue(value);
    }
}
