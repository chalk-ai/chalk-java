package ai.chalk.internal;


import java.lang.reflect.Field;

public record FieldMeta(Field field, boolean isFeaturesBase, boolean isStruct, boolean isWindowed) {
}
