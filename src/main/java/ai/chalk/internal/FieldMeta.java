package ai.chalk.internal;


import ai.chalk.features.FeaturesBase;
import ai.chalk.features.FeaturesClass;
import ai.chalk.features.StructFeaturesClass;
import ai.chalk.features.WindowedFeaturesClass;

import java.lang.reflect.Field;

public record FieldMeta(
        Field field,
        Class<? extends FeaturesBase> featuresBase,
        Class<? extends FeaturesClass> featuresClass,
        Class<? extends StructFeaturesClass> structClass,
        Class<? extends WindowedFeaturesClass> windowedClass,
        Class<?> listUnderlyingClass,
        boolean isFeature
) {
    public boolean isFeaturesBase() {
        return featuresBase != null;
    }

    public boolean isFeaturesClass() {
        return featuresClass != null;
    }

    public boolean isStruct() {
        return structClass != null;
    }

    public boolean isWindowed() {
        return windowedClass != null;
    }

    public boolean isList() {
        return listUnderlyingClass != null;
    }
}
