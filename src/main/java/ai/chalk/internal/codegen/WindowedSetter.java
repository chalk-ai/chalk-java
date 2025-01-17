package ai.chalk.internal.codegen;

import ai.chalk.features.WindowedFeaturesClass;

public class WindowedSetter implements Setter {
    private final WindowedFeaturesClass windowedFeature;

    public WindowedSetter(WindowedFeaturesClass windowedFeature) {
        this.windowedFeature = windowedFeature;
    }

    public void set(Object value) throws Exception {
        // TODO
    }
}
