package ai.chalk.internal.arrow;

import ai.chalk.exceptions.ClientException;
import ai.chalk.features.*;
import ai.chalk.internal.Constants;
import ai.chalk.internal.FieldMeta;
import ai.chalk.internal.NamespaceMemoItem;
import ai.chalk.internal.Utils;
import ai.chalk.internal.codegen.FieldSetter;
import ai.chalk.internal.codegen.Initializer;
import ai.chalk.models.OnlineQueryResult;
import org.apache.arrow.vector.*;
import org.apache.arrow.vector.complex.LargeListVector;
import org.apache.arrow.vector.complex.ListVector;
import org.apache.arrow.vector.complex.StructVector;
import org.apache.arrow.vector.table.Table;
import org.apache.arrow.vector.types.DateUnit;
import org.apache.arrow.vector.types.FloatingPointPrecision;
import org.apache.arrow.vector.types.pojo.ArrowType;

import java.lang.reflect.Field;
import java.time.*;
import java.util.*;

import static ai.chalk.internal.Utils.*;

public class Unmarshaller {
    public static List<String> fqnsToSkip = List.of(Constants.tsFeatureFqn, Constants.indexFqn);
    public static List<String> prefixToSkip = List.of(Constants.chalkDunderPrefix);

    public static <T extends FeaturesClass> T[] unmarshalOnlineQueryResult(OnlineQueryResult result, Class<T> target) throws ClientException {
        try {
            var rootFeatureClasses = unmarshalTable(result.getScalarsTable(), target);
            // This only unmarshals if has-many features gets returned in `result.groupsTables`
            // When using gRPC, has-many results get returned directly as lists of structs in
            // `result.scalarsTable`.
            unmarshalHasMany(result.getGroupsTables(), rootFeatureClasses);
            return rootFeatureClasses;
        } catch (Exception e) {
            throw new ClientException("Failed to unmarshal online query result into Java classes", e);
        }
    }

    public static void unmarshalHasMany(Map<String, Table> tables, FeaturesClass[] targets) throws Exception {
        if (targets.length == 0) {
            return;
        }
        Class<?> localClass = targets[0].getClass();
        Map<Class<?>, NamespaceMemoItem> memo = new HashMap<>();
        Initializer.buildNamespaceMemo(localClass, memo, new HashSet<>());
        for (var entry : tables.entrySet()) {
            String fqn = entry.getKey();
            Table table = entry.getValue();
            Field hasManyField = getFieldFromFqn(targets[0].getClass(), fqn);
            Class<?> hasManyClass = getInnerTypeFromListField(hasManyField);
            if (!hasManyField.isAnnotationPresent(HasMany.class)) {
                throw new Exception("Field " + fqn + " is not annotated as a has-many field");
            }
            HasMany hm = hasManyField.getAnnotation(HasMany.class);
            String localFqn = Utils.chalkpySnakeCase(localClass.getSimpleName()) + "." + hm.localKey();
            String foreignFqn = Utils.chalkpySnakeCase(hasManyClass.getSimpleName()) + "." + hm.foreignKey();

            FeaturesClass[] objects = unmarshalTable(table, hasManyClass.asSubclass(FeaturesClass.class));
            Map<String, List<FeaturesClass>> grouped = new HashMap<>();
            for (FeaturesClass obj : objects) {
                Field foreignField = getFieldFromFqn(hasManyClass, foreignFqn);
                Feature<?> foreignKeyFeature = (Feature<?>) foreignField.get(obj);
                if (foreignKeyFeature == null) {
                    throw new Exception("Error while grouping has-many result: foreign join key is null");
                }
                String v = foreignKeyFeature.getValue().toString();
                if (!grouped.containsKey(v)) {
                    grouped.put(v, new ArrayList<>());
                }
                grouped.get(v).add(obj);
            }

            List<String> fqnParts = Arrays.asList(fqn.split("\\."));
            for (FeaturesClass target : targets) {
                Field localField = getFieldFromFqn(localClass, localFqn);
                Feature<?> localKeyFeature = (Feature<?>) localField.get(target);
                if (localKeyFeature == null) {
                    throw new Exception("Error while grouping has-many result: local join key is null");
                }

                List<FieldSetter> setters = Initializer.initScoped(target, fqnParts, memo);
                for (FieldSetter s : setters) {
                    if (s.fieldMetas().size() != 1) {
                        throw new Exception("Expected exactly one field for has-many field: " + fqn);
                    }
                    FieldMeta meta = s.fieldMetas().get(0);
                    Feature<?> hmFeature = new Feature<>();
                    meta.field().set(target, hmFeature);
                    String joinKey = localKeyFeature.getValue().toString();
                    if (grouped.containsKey(joinKey)) {
                        hmFeature.setValue(grouped.get(joinKey));
                    } else {
                        hmFeature.setValue(new ArrayList<>());
                    }
                }
            }
        }
    }

    private static boolean shouldSkipField(String fqn) {
        if (fqnsToSkip.contains(fqn)) {
            return true;
        }
        for (String prefix : prefixToSkip) {
            if (fqn.startsWith(prefix)) {
                return true;
            }
        }
        return false;
    }

    public static <T extends FeaturesClass> T[] unmarshalTable(Table table, Class<T> target) throws Exception {
        List<T> result = new ArrayList<>();
        Map<Class<?>, NamespaceMemoItem> memo = new HashMap<>();
        Initializer.buildNamespaceMemo(target, memo, new HashSet<>());
        Initializer.alterMemoForUnmarshaller(memo);
        var constructor = target.getDeclaredConstructor();

        // Cache repeated work
        List<List<String>> fqnPartsList = new ArrayList<>();
        for (int j = 0; j < table.getSchema().getFields().size(); j++) {
            var arrowField = table.getSchema().getFields().get(j);
            String fqn = arrowField.getName();
            fqnPartsList.add(Arrays.asList(fqn.split("\\.")));
        }
        List<Boolean> shouldSkip = new ArrayList<>();
        for (int j = 0; j < table.getSchema().getFields().size(); j++) {
            var arrowField = table.getSchema().getFields().get(j);
            shouldSkip.add(shouldSkipField(arrowField.getName()));
        }

        try (var root = table.toVectorSchemaRoot()) {
            for (var row = 0; row < root.getRowCount(); row++) {
                T obj = constructor.newInstance();
                result.add(obj);
                for (var col = 0; col < root.getSchema().getFields().size(); col++) {
                    if (shouldSkip.get(col)) {
                        continue;
                    }
                    Object value = getValueFromFieldVector(root.getVector(col), row);
                    var fieldSetters = Initializer.initScoped(obj, fqnPartsList.get(col), memo);
                    for (var setter : fieldSetters) {
                        for (var fieldMeta : setter.fieldMetas()) {
                            var richVal = primitiveToRich(value, fieldMeta, memo);
                            fieldMeta.field().set(setter.parent(), richVal);
                        }
                    }
                }
            }
        }

        return listToArray(result, target);
    }

    public static List<Object> getInnerList(FieldVector vector, int startIdx, int endIdx) throws Exception {
        List<Object> result = new ArrayList<>();
        for (int i = startIdx; i < endIdx; i++) {
            result.add(getValueFromFieldVector(vector, i));
        }
        return result;
    }


    public static Object getValueFromFieldVector(FieldVector vector, int idx) throws Exception {
        ArrowType arrowType = vector.getField().getType();
        switch (arrowType.getTypeID()) {
            case Int -> {
                var intType = (ArrowType.Int) arrowType;
                var bitWidth = intType.getBitWidth();
                if (bitWidth == 8) {
                    TinyIntVector tinyIntVector = (TinyIntVector) vector;
                    if (tinyIntVector.isNull(idx)) {
                        return null;
                    }
                    return tinyIntVector.getObject(idx);
                } else if (bitWidth == 16) {
                    SmallIntVector smallIntVector = (SmallIntVector) vector;
                    if (smallIntVector.isNull(idx)) {
                        return null;
                    }
                    return smallIntVector.getObject(idx);
                } else if (bitWidth == 32) {
                    IntVector intVector = (IntVector) vector;
                    if (intVector.isNull(idx)) {
                        return null;
                    }
                    return intVector.getObject(idx);
                } else if (bitWidth == 64) {
                    BigIntVector bigIntVector = (BigIntVector) vector;
                    if (bigIntVector.isNull(idx)) {
                        return null;
                    }
                    return bigIntVector.getObject(idx);
                } else {
                    throw new Exception("Unsupported bitwidth found while converting from Arrow to Java: " + bitWidth);
                }
            }
            case FloatingPoint -> {
                var floatingPointType = (ArrowType.FloatingPoint) arrowType;
                var precision = floatingPointType.getPrecision();
                if (precision == FloatingPointPrecision.SINGLE) {
                    Float4Vector float4Vector = (Float4Vector) vector;
                    if (float4Vector.isNull(idx)) {
                        return null;
                    }
                    return float4Vector.getObject(idx);
                } else if (precision == FloatingPointPrecision.DOUBLE) {
                    Float8Vector float8Vector = (Float8Vector) vector;
                    if (float8Vector.isNull(idx)) {
                        return null;
                    }
                    return float8Vector.getObject(idx);
                } else {
                    throw new Exception("Unsupported precision found while converting from Arrow to Java: " + precision);
                }
            }
            case Bool -> {
                BitVector bitVector = (BitVector) vector;
                return bitVector.getObject(idx);
            }
            case Utf8 -> {
                VarCharVector varCharVector = (VarCharVector) vector;
                if (varCharVector.isNull(idx)) {
                    return null;
                }
                return new String(varCharVector.get(idx));
            }
            case LargeUtf8 -> {
                LargeVarCharVector largeVarCharVector = (LargeVarCharVector) vector;
                if (largeVarCharVector.isNull(idx)) {
                    return null;
                }
                return new String(largeVarCharVector.get(idx));
            }
            case Date -> {
                var dateType = (ArrowType.Date) arrowType;
                if (dateType.getUnit() == DateUnit.DAY) {
                    DateDayVector dateDayVector = (DateDayVector) vector;
                    if (dateDayVector.isNull(idx)) {
                        return null;
                    }
                    return LocalDate.ofEpochDay(dateDayVector.getObject(idx));
                } else if (dateType.getUnit() == DateUnit.MILLISECOND) {
                    DateMilliVector dateMilliVector = (DateMilliVector) vector;
                    if (dateMilliVector.isNull(idx)) {
                        return null;
                    }
                    return dateMilliVector.getObject(idx).toLocalDate();
                } else {
                    throw new Exception("Unsupported date unit found while converting from Arrow to Java: " + dateType.getUnit());
                }
            }
            case Timestamp -> {
                var timestampType = (ArrowType.Timestamp) arrowType;
                var timezone = timestampType.getTimezone();
                ZoneId zoneId = null;
                if (timezone != null) {
                    zoneId = ZoneId.of(timezone);
                }
                boolean hasTimezone = zoneId != null;
                switch (timestampType.getUnit()) {
                    case SECOND -> {
                        if (hasTimezone) {
                            TimeStampSecTZVector timeStampSecTZVector = (TimeStampSecTZVector) vector;
                            if (timeStampSecTZVector.isNull(idx)) {
                                return null;
                            }
                            return Instant.ofEpochSecond(timeStampSecTZVector.get(idx)).atZone(zoneId);
                        } else {
                            TimeStampSecVector timeStampSecVector = (TimeStampSecVector) vector;
                            if (timeStampSecVector.isNull(idx)) {
                                return null;
                            }
                            return Instant.ofEpochSecond(timeStampSecVector.get(idx)).atZone(ZoneOffset.UTC).toLocalDateTime();
                        }
                    }
                    case MILLISECOND -> {
                        if (hasTimezone) {
                            TimeStampMilliTZVector timeStampMilliTZVector = (TimeStampMilliTZVector) vector;
                            if (timeStampMilliTZVector.isNull(idx)) {
                                return null;
                            }
                            return Instant.ofEpochMilli(timeStampMilliTZVector.getObject(idx)).atZone(zoneId);
                        } else {
                            TimeStampMilliVector timeStampMilliVector = (TimeStampMilliVector) vector;
                            return timeStampMilliVector.getObject(idx);
                        }
                    }
                    case MICROSECOND -> {
                        if (hasTimezone) {
                            TimeStampMicroTZVector timeStampMicroTZVector = (TimeStampMicroTZVector) vector;
                            if (timeStampMicroTZVector.isNull(idx)) {
                                return null;
                            }
                            long epochSecondsTruncated = timeStampMicroTZVector.getObject(idx) / 1_000_000;
                            long epochNanoRemainder = (timeStampMicroTZVector.getObject(idx) % 1_000_000) * 1_000;
                            return Instant.ofEpochSecond(epochSecondsTruncated, epochNanoRemainder).atZone(zoneId);
                        } else {
                            TimeStampMicroVector timeStampMicroVector = (TimeStampMicroVector) vector;
                            return timeStampMicroVector.getObject(idx);
                        }
                    }
                    case NANOSECOND -> {
                        if (hasTimezone) {
                            TimeStampNanoTZVector timeStampNanoTZVector = (TimeStampNanoTZVector) vector;
                            if (timeStampNanoTZVector.isNull(idx)) {
                                return null;
                            }
                            long epochSecondsTruncated = timeStampNanoTZVector.getObject(idx) / 1_000_000_000;
                            long epochNanoRemainder = timeStampNanoTZVector.getObject(idx) % 1_000_000_000;
                            return Instant.ofEpochSecond(epochSecondsTruncated, epochNanoRemainder).atZone(zoneId);
                        } else {
                            TimeStampNanoVector timeStampNanoVector = (TimeStampNanoVector) vector;
                            return timeStampNanoVector.getObject(idx);
                        }
                    }
                    default -> {
                        throw new Exception("Unsupported type found while unmarshalling Arrow Table: " + arrowType);
                    }
                }
            }
            case List -> {
                ListVector listVector = (ListVector) vector;
                if (listVector.isNull(idx)) {
                    return null;
                }
                int offsetSize = 4;  // 4 bytes
                int startIdx = listVector.getOffsetBuffer().getInt((long) idx * offsetSize);
                int endIdx = listVector.getOffsetBuffer().getInt((long) (idx + 1) * offsetSize);
                return getInnerList(
                    listVector.getDataVector(),
                    startIdx,
                    endIdx
                );
            }
            case LargeList -> {
                LargeListVector largeListVector = (LargeListVector) vector;
                if (largeListVector.isNull(idx)) {
                    return null;
                }
                int offsetSize = 8;  // 8 bytes
                long startIdx = largeListVector.getOffsetBuffer().getLong((long) idx * offsetSize);
                long endIdx = largeListVector.getOffsetBuffer().getLong((long) (idx + 1) * offsetSize);
                return getInnerList(
                    largeListVector.getDataVector(),
                    Math.toIntExact(startIdx),
                    Math.toIntExact(endIdx)
                );
            }
            case Duration -> {
                DurationVector durationVector = (DurationVector) vector;
                if (durationVector.isNull(idx)) {
                    return null;
                }
                return Duration.ofSeconds(durationVector.getObject(idx).getSeconds(), durationVector.getObject(idx).getNano());
            }
            case Time -> {
                var timeType = (ArrowType.Time) arrowType;
                switch (timeType.getUnit()) {
                    case SECOND -> {
                        TimeSecVector timeSecVector = (TimeSecVector) vector;
                        if (timeSecVector.isNull(idx)) {
                            return null;
                        }
                        return LocalTime.ofSecondOfDay(timeSecVector.getObject(idx));
                    }
                    case MILLISECOND -> {
                        TimeMilliVector timeMilliVector = (TimeMilliVector) vector;
                        if (timeMilliVector.isNull(idx)) {
                            return null;
                        }
                        return timeMilliVector.getObject(idx).toLocalTime();
                    }
                    case MICROSECOND -> {
                        TimeMicroVector timeMicroVector = (TimeMicroVector) vector;
                        if (timeMicroVector.isNull(idx)) {
                            return null;
                        }
                        return LocalTime.ofNanoOfDay(timeMicroVector.getObject(idx) * 1_000L);
                    }
                    case NANOSECOND -> {
                        TimeNanoVector timeNanoVector = (TimeNanoVector) vector;
                        if (timeNanoVector.isNull(idx)) {
                            return null;
                        }
                        return LocalTime.ofNanoOfDay(timeNanoVector.getObject(idx));
                    }
                    default -> {
                        throw new Exception("Unsupported time unit found while converting from Arrow to Java: " + timeType.getUnit());
                    }
                }
            }
            case Struct -> {
                Map<String, Object> result = new HashMap<>();
                StructVector structVector = (StructVector) vector;
                var childFields = structVector.getChildrenFromFields();
                for (var childField : childFields) {
                    result.put(
                        childField.getName(),
                        getValueFromFieldVector(
                            structVector.getChild(childField.getName()),
                            idx
                        )
                    );
                }
                return result;
            }
            default -> {
                throw new Exception("Unsupported type found while unmarshalling Arrow Table: " + arrowType.getTypeID());
            }
        }
    }

    /**
     * Recursively converts hash maps to codegen'd classes, and scalar features to `Feature` objects.
     *  i.e.
     *    {
     *      "feature1": 1,
     *      "feature2": 2,
     *    }
     *      to
     *    MyFeaturesClass(feature1=Feature(null, 1), feature2=Feature(null, 2))
     *
     */
    private static Object primitiveToRich(
        Object primitiveVal,
        FieldMeta meta,
        Map<Class<?>, NamespaceMemoItem> allMemo
    ) throws Exception {
        if (meta.isList()) {
            List<?> list = (List<?>) primitiveVal;
            NamespaceMemoItem currMemo = allMemo.get(meta.listUnderlyingClass());
            Feature<?> newFeature = new Feature<>();

            if (currMemo == null) {
                // Not a struct or features class, since it's not in the memo
                newFeature.setValue(list);
                return newFeature;
            }

            List<Object> result = new ArrayList<>();
            for (Object item : list) {
                @SuppressWarnings("unchecked")
                var cls = (Class<? extends FeaturesBase>) meta.listUnderlyingClass();
                @SuppressWarnings("unchecked")
                var map = (Map<String, Object>) item;
                result.add(convertMapToFeaturesClass(map, cls, currMemo, allMemo));
            }
            newFeature.setValue(result);
            return newFeature;
        } else if (meta.isFeature()) {
            Feature<?> feature = new Feature<>();
            feature.setValue(primitiveVal);
            return feature;
        } else if (meta.isStruct() || meta.isFeaturesClass()) {
            NamespaceMemoItem currMemo = allMemo.get(meta.featuresBase());
            if (currMemo == null) {
                throw new Exception(
                        String.format(
                                "Memo not found for class '%s', found: %s",
                                meta.featuresBase().getSimpleName(),
                                allMemo.keySet()
                        )
                );
            }
            @SuppressWarnings("unchecked")
            var map = (Map<String, Object>) primitiveVal;
            return convertMapToFeaturesClass(map, meta.featuresBase(), currMemo, allMemo);
        } else {
            throw new Exception("Unsupported type found while converting from primitive to rich: " + meta);
        }
    }

    private static <T extends FeaturesBase> T convertMapToFeaturesClass(
        Map<String, Object> map,
        Class<? extends FeaturesBase> target,
        NamespaceMemoItem currMemo,
        Map<Class<?>, NamespaceMemoItem> allMemo
    ) throws Exception {
        @SuppressWarnings("unchecked")
        T result = (T) target.getDeclaredConstructor().newInstance();
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            List<FieldMeta> fieldMetas = currMemo.resolvedNameToFieldMetas.get(key);
            if (fieldMetas == null) {
                throw new Exception(String.format(
                    "Field '%s' not found in memo for class '%s', found keys: %s",
                    key,
                    target.getSimpleName(),
                    currMemo.resolvedNameToFieldMetas.keySet()
                ));
            }
            for (FieldMeta meta : fieldMetas) {
                meta.field().set(result, primitiveToRich(entry.getValue(), meta, allMemo));
            }
        }
        return result;

    }

    private static void unmarshalNested(Map<String, Object> struct, Map<String, List<Feature<?>>> featureMap, String fqn) {
        for (Map.Entry<String, Object> entry : struct.entrySet()) {
            var childFqn = fqn + "." + entry.getKey();
            var value = entry.getValue();
            if (value instanceof Map) {
                unmarshalNested((Map<String, Object>) value, featureMap, childFqn);
            } else {
                var childFeatures = featureMap.get(childFqn);
                for (Feature<?> childFeature : childFeatures) {
                    childFeature.setValue(value);
                }
            }
        }
    }
}
