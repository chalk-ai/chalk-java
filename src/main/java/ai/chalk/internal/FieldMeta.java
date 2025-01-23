package ai.chalk.internal;


import ai.chalk.features.FeaturesBase;
import ai.chalk.features.FeaturesClass;
import ai.chalk.features.StructFeaturesClass;
import ai.chalk.features.WindowedFeaturesClass;

import java.lang.reflect.Field;

public record FieldMeta(Field field, Class<?> listUnderlyingClass, String resolvedName) {
    public boolean isList() {
        return listUnderlyingClass != null;
    }
}
