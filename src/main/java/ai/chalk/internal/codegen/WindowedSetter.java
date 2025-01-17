package ai.chalk.internal.codegen;

import ai.chalk.features.WindowedFeaturesClass;
import ai.chalk.internal.NamespaceMemoItem;

public class WindowedSetter implements Setter {
    private final WindowedFeaturesClass windowedFeature;
    private final NamespaceMemoItem memo;

    public WindowedSetter(WindowedFeaturesClass windowedFeature, NamespaceMemoItem memo) {
        this.windowedFeature = windowedFeature;
        this.memo = memo;
    }

    public void set(Object value) throws Exception {


    }
}
