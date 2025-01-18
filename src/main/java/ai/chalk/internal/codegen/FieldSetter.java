package ai.chalk.internal.codegen;

import ai.chalk.internal.FieldMeta;

import java.util.List;

public record FieldSetter(Object parent, List<FieldMeta> fieldMetas) {}
