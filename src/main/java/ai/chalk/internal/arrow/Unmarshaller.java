package ai.chalk.internal.arrow;

import ai.chalk.exceptions.ClientException;
import ai.chalk.features.Feature;
import ai.chalk.features.FeaturesClass;
import ai.chalk.features.HasMany;
import ai.chalk.features.StructFeaturesClass;
import ai.chalk.internal.Constants;
import ai.chalk.internal.NamespaceMemoItem;
import ai.chalk.internal.Utils;
import ai.chalk.internal.codegen.Initializer;
import ai.chalk.models.OnlineQueryResult;
import org.apache.arrow.vector.*;
import org.apache.arrow.vector.complex.LargeListVector;
import org.apache.arrow.vector.complex.ListVector;
import org.apache.arrow.vector.complex.StructVector;
import org.apache.arrow.vector.holders.*;
import org.apache.arrow.vector.table.Row;
import org.apache.arrow.vector.table.Table;
import org.apache.arrow.vector.types.DateUnit;
import org.apache.arrow.vector.types.FloatingPointPrecision;
import org.apache.arrow.vector.types.pojo.ArrowType;
import org.apache.arrow.vector.util.Text;

import java.lang.reflect.Field;
import java.time.*;
import java.util.*;

import static ai.chalk.internal.Utils.*;
import static org.apache.arrow.vector.types.pojo.ArrowType.ArrowTypeID.LargeList;

public class Unmarshaller {
    public static List<String> fqnsToSkip = List.of(Constants.tsFeatureFqn, Constants.indexFqn);
    public static List<String> prefixToSkip = List.of(Constants.chalkDunderPrefix);

    public static <T extends FeaturesClass> T[] unmarshalOnlineQueryResult(OnlineQueryResult result, Class<T> target) throws ClientException {
        try {
            var rootFeatureClasses = unmarshalTable(result.getScalarsTable(), target);
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
        for (var entry : tables.entrySet()) {
            Class<?> localClass = targets[0].getClass();
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

            for (FeaturesClass target : targets) {
                Field localField = getFieldFromFqn(localClass, localFqn);
                Feature<?> localKeyFeature = (Feature<?>) localField.get(target);
                if (localKeyFeature == null) {
                    throw new Exception("Error while grouping has-many result: local join key is null");
                }
                Field hmField = getFieldFromFqn(target.getClass(), fqn);
                Feature<?> hmFieldFeature = (Feature<?>) hmField.get(target);
                String v = localKeyFeature.getValue().toString();
                if (grouped.containsKey(v)) {
                    List<FeaturesClass> group = grouped.get(v);
                    hmFieldFeature.setValue(group);
                } else {
                    hmFieldFeature.setValue(new ArrayList<>());
                }
            }
        }
    }


    public static <T extends FeaturesClass> T[] unmarshalTable(Table table, Class<T> target) throws Exception {
        List<T> result = new ArrayList<T>();

        // Exists to work around `row.getLargeList` not being available.
        var fqnToLargeListColumnCopy = new HashMap<String, LargeListVector>();

        String namespace = Utils.chalkpySnakeCase(target.getSimpleName());
        Map<Class<?>, NamespaceMemoItem> memo = new HashMap<>();
        Initializer.buildNamespaceMemo(target, memo, new HashSet<>());

        for (Row row : table) {
            T obj = target.getDeclaredConstructor().newInstance();
            Map<String, List<Feature<?>>> featureMap;
            try {
                featureMap = Initializer.initResult(obj, memo, namespace);
            } catch (Exception e) {
                throw new Exception("Failed to initialize result object", e);
            }
            result.add(obj);

            outerLoop:
            for (var arrowField : table.getSchema().getFields()) {
                String fqn = arrowField.getName();
                if (fqnsToSkip.contains(fqn)) {
                    continue;
                }
                for (String prefix : prefixToSkip) {
                    if (fqn.startsWith(prefix)) {
                        continue outerLoop;
                    }
                }

                var featureList = featureMap.get(fqn);
                if (featureList == null) {
                    // We are faking the attributes of a struct as features,
                    // instead of having the struct itself be a feature.
                    if (arrowField.getType().getTypeID() == ArrowType.ArrowTypeID.Struct) {
                        var structObj = row.getStruct(fqn);
                        if (structObj == null) {
                            if (!arrowField.isNullable()) {
                                throw new Exception(String.format("Non-nullable field '%s' is null", fqn));
                            }
                            continue;
                        }
                        unmarshalNested((HashMap<String, Object>) structObj, featureMap, fqn);
                    } else {
                        throw new Exception(String.format("Target field not found for unmarshalling feature with FQN: '%s'", fqn));
                    }
                    continue;
                }

                for (Feature<?> feature : featureList) {
                    switch (arrowField.getType().getTypeID()) {
                        case Int -> {
                            var castInt = (ArrowType.Int) (arrowField.getFieldType().getType());
                            var bitWidth = castInt.getBitWidth();
                            if (bitWidth == 32) {
                                var holder = new NullableIntHolder();
                                row.getInt(fqn, holder);
                                if (holder.isSet == 1) {
                                    feature.setValue(holder.value);
                                }
                            } else if (bitWidth == 64) {
                                var nullableBigIntHolder = new NullableBigIntHolder();
                                row.getBigInt(fqn, nullableBigIntHolder);
                                if (nullableBigIntHolder.isSet == 1) {
                                    feature.setValue(nullableBigIntHolder.value);
                                }
                            } else if (bitWidth == 16) {
                                var holder = new NullableSmallIntHolder();
                                row.getSmallInt(fqn, holder);
                                if (holder.isSet == 1) {
                                    feature.setValue(holder.value);
                                }
                            } else if (bitWidth == 8) {
                                var holder = new NullableTinyIntHolder();
                                row.getTinyInt(fqn, holder);
                                if (holder.isSet == 1) {
                                    feature.setValue(holder.value);
                                }
                            } else {
                                throw new Exception("Unsupported bitwidth found while converting from Arrow to Java: " + bitWidth);
                            }
                        }
                        case FloatingPoint -> {
                            var castFloatingPoint = (ArrowType.FloatingPoint) (arrowField.getFieldType().getType());
                            var precision = castFloatingPoint.getPrecision();
                            if (precision == FloatingPointPrecision.SINGLE) {
                                var holder = new NullableFloat4Holder();
                                row.getFloat4(fqn, holder);
                                if (holder.isSet == 1) {
                                    feature.setValue(holder.value);
                                }
                            } else if (precision == FloatingPointPrecision.DOUBLE) {
                                var holder = new NullableFloat8Holder();
                                row.getFloat8(fqn, holder);
                                if (holder.isSet == 1) {
                                    feature.setValue(holder.value);
                                }
                            } else {
                                throw new Exception("Unsupported precision found while converting from Arrow to Java: " + precision);
                            }
                        }
                        case Bool -> {
                            var holder = new NullableBitHolder();
                            row.getBit(fqn, holder);
                            if (holder.isSet == 1) {
                                feature.setValue(holder.value == 1);
                            }
                        }
                        case Utf8 -> {
                            byte[] bytes = row.getVarChar(fqn);
                            if (bytes != null) {
                                var strVal = new String(bytes);
                                feature.setValue(strVal);
                            }
                        }
                        case LargeUtf8 -> {
                            byte[] bytes = row.getLargeVarChar(fqn);
                            if (bytes != null) {
                                var strVal = new String(bytes);
                                feature.setValue(strVal);
                            }
                        }
                        case Date -> {
                            var castDate = (ArrowType.Date) (arrowField.getFieldType().getType());
                            if (castDate.getUnit() == DateUnit.DAY) {
                                var holder = new NullableDateDayHolder();
                                row.getDateDay(fqn, holder);
                                if (holder.isSet == 1) {
                                    feature.setValue(LocalDate.ofEpochDay(holder.value));
                                }
                            } else if (castDate.getUnit() == DateUnit.MILLISECOND) {
                                var holder = new NullableDateMilliHolder();
                                row.getDateMilli(fqn, holder);
                                if (holder.isSet == 1) {
                                    LocalDate localDate = Instant.ofEpochSecond(holder.value).atZone(ZoneOffset.UTC).toLocalDate();
                                    feature.setValue(localDate);
                                }
                            } else {
                                throw new Exception("Unsupported date unit found while converting from Arrow to Java: " + castDate.getUnit());
                            }
                        }
                        case Timestamp -> {
                            var cast = (ArrowType.Timestamp) (arrowField.getFieldType().getType());
                            var timezone = cast.getTimezone();
                            ZoneId zoneId = null;
                            if (timezone != null) {
                                zoneId = ZoneId.of(timezone);
                            }
                            boolean hasTimezone = zoneId != null;
                            switch (cast.getUnit()) {
                                case SECOND -> {
                                    if (hasTimezone) {
                                        var holder = new NullableTimeStampSecTZHolder();
                                        row.getTimeStampSecTZ(fqn, holder);
                                        if (holder.isSet == 1) {
                                            feature.setValue(Instant.ofEpochSecond(holder.value).atZone(zoneId));
                                        }
                                    } else {
                                        var holder = new NullableTimeStampSecHolder();
                                        row.getTimeStampSec(fqn, holder);
                                        if (holder.isSet == 1) {
                                            feature.setValue(Instant.ofEpochSecond(holder.value).atZone(ZoneOffset.UTC).toLocalDateTime());
                                        }
                                    }
                                }
                                case MILLISECOND -> {
                                    if (hasTimezone) {
                                        var holder = new NullableTimeStampMilliTZHolder();
                                        row.getTimeStampMilliTZ(fqn, holder);
                                        if (holder.isSet == 1) {
                                            feature.setValue(Instant.ofEpochMilli(holder.value).atZone(zoneId));
                                        }
                                    } else {
                                        var holder = new NullableTimeStampMilliHolder();
                                        row.getTimeStampMilli(fqn, holder);
                                        if (holder.isSet == 1) {
                                            feature.setValue(Instant.ofEpochMilli(holder.value).atZone(ZoneOffset.UTC).toLocalDateTime());
                                        }
                                    }
                                }
                                case MICROSECOND -> {
                                    if (hasTimezone) {
                                        var holder = new NullableTimeStampMicroTZHolder();
                                        row.getTimeStampMicroTZ(fqn, holder);
                                        if (holder.isSet == 1) {
                                            long epochSecondsTruncated = holder.value / 1_000_000;
                                            long epochNanoRemainder = (holder.value % 1_000_000) * 1_000;
                                            feature.setValue(Instant.ofEpochSecond(epochSecondsTruncated, epochNanoRemainder).atZone(zoneId));
                                        }
                                    } else {
                                        var holder = new NullableTimeStampMicroHolder();
                                        row.getTimeStampMicro(fqn, holder);
                                        if (holder.isSet == 1) {
                                            long epochSecondsTruncated = holder.value / 1_000_000;
                                            long epochNanoRemainder = (holder.value % 1_000_000) * 1_000;
                                            feature.setValue(Instant.ofEpochSecond(epochSecondsTruncated, epochNanoRemainder).atZone(ZoneOffset.UTC).toLocalDateTime());
                                        }
                                    }
                                }
                                case NANOSECOND -> {
                                    if (hasTimezone) {
                                        var holder = new NullableTimeStampNanoTZHolder();
                                        row.getTimeStampNanoTZ(fqn, holder);
                                        if (holder.isSet == 1) {
                                            long epochSecondsTruncated = holder.value / 1_000_000_000;
                                            long epochNanoRemainder = holder.value % 1_000_000_000;
                                            feature.setValue(Instant.ofEpochSecond(epochSecondsTruncated, epochNanoRemainder).atZone(zoneId));
                                        }
                                    } else {
                                        var holder = new NullableTimeStampNanoHolder();
                                        row.getTimeStampNano(fqn, holder);
                                        if (holder.isSet == 1) {
                                            long epochSecondsTruncated = holder.value / 1_000_000_000;
                                            long epochNanoRemainder = holder.value % 1_000_000_000;
                                            feature.setValue(Instant.ofEpochSecond(epochSecondsTruncated, epochNanoRemainder).atZone(ZoneOffset.UTC).toLocalDateTime());
                                        }
                                    }
                                }
                                default ->
                                        throw new Exception("Unsupported timestamp unit found while converting from Arrow to Java: " + cast.getUnit());
                            }
                        }
                        case List, LargeList -> {
                            List<?> originalList;
                            if (arrowField.getType().getTypeID() == LargeList) {
                                LargeListVector largeListVector;
                                if (fqnToLargeListColumnCopy.containsKey(fqn)) {
                                    largeListVector = fqnToLargeListColumnCopy.get(fqn);
                                } else {
                                    // TODO: Get large list without copying. The obvious `row.getLargeList` does not exist.
                                    largeListVector = (LargeListVector) table.getVectorCopy(fqn);
                                    fqnToLargeListColumnCopy.put(fqn, largeListVector);
                                }
                                originalList = largeListVector.getObject(row.getRowNumber());
                            } else {
                                originalList = row.getList(fqn);
                            }
                            if (originalList == null) {
                                break;
                            }
                            var resultList = new ArrayList();
                            for (Object rawObj : originalList) {
                                if (rawObj instanceof Text) {
                                    // Converting from arrow `Text` to Java `String`
                                    resultList.add(rawObj.toString());
                                } else if (rawObj instanceof Map) {
                                    // Converting from arrow `Map` to Java `Map`
                                    Class<?> dataclass;
                                    try {
                                        Field field = Utils.getFieldFromFqn(target, fqn);
                                        dataclass = Utils.getInnerTypeFromListField(field);
                                    } catch (Exception e) {
                                        throw new Exception("Could not get the inner type of list feature: " + fqn, e);
                                    }

                                    var dataclassInstance = (StructFeaturesClass) dataclass.getDeclaredConstructor().newInstance();
                                    var dataclassNamespace = Utils.chalkpySnakeCase(dataclass.getSimpleName());
                                    var dataclassFeatureMap = Initializer.initResult(dataclassInstance, memo, dataclassNamespace);

                                    for (Map.Entry<String, Object> entry : ((Map<String, Object>) rawObj).entrySet()) {
                                        var dataclassRootFqn = Utils.chalkpySnakeCase(dataclass.getSimpleName());
                                        var childFqn = dataclassRootFqn + "." + entry.getKey();
                                        var value = entry.getValue();
                                        if (value instanceof Map) {
                                            unmarshalNested((Map<String, Object>) value, dataclassFeatureMap, childFqn);
                                        } else {
                                            var childFeatures = dataclassFeatureMap.get(childFqn);
                                            if (childFeatures.size() > 1) {
                                                throw new Exception(String.format("Dataclass child feature '%s' should have FQNs that map to only 1 feature", childFqn));
                                            }
                                            childFeatures.get(0).setValue(value);
                                        }
                                    }
                                    resultList.add(dataclassInstance);
                                } else {
                                    resultList.add(rawObj);
                                }

                            }
                            feature.setValue(resultList);
                        }
                        case Duration -> {
                            var duration = row.getDurationObj(fqn);
                            if (duration != null) {
                                feature.setValue(Duration.ofSeconds(duration.getSeconds(), duration.getNano()));
                            }
                        }
                        case Time -> {
                            var cast = (ArrowType.Time) (arrowField.getFieldType().getType());
                            switch (cast.getUnit()) {
                                case SECOND -> {
                                    var holder = new NullableTimeSecHolder();
                                    row.getTimeSec(fqn, holder);
                                    if (holder.isSet == 1) {
                                        feature.setValue(LocalTime.ofSecondOfDay(holder.value));
                                    }
                                }
                                case MILLISECOND -> {
                                    var holder = new NullableTimeMilliHolder();
                                    row.getTimeMilli(fqn, holder);
                                    if (holder.isSet == 1) {
                                        feature.setValue(LocalTime.ofNanoOfDay(holder.value * 1_000_000L));
                                    }
                                }
                                case MICROSECOND -> {
                                    var holder = new NullableTimeMicroHolder();
                                    row.getTimeMicro(fqn, holder);
                                    if (holder.isSet == 1) {
                                        feature.setValue(LocalTime.ofNanoOfDay(holder.value * 1_000L));
                                    }
                                }
                                case NANOSECOND -> {
                                    var holder = new NullableTimeNanoHolder();
                                    row.getTimeNano(fqn, holder);
                                    if (holder.isSet == 1) {
                                        feature.setValue(LocalTime.ofNanoOfDay(holder.value));
                                    }
                                }
                                default ->
                                        throw new Exception("Unsupported time unit found while converting from Arrow to Java: " + cast.getUnit());
                            }
                        }
                        default -> {
                            throw new Exception("Unsupported type found while unmarshalling Arrow Table: " + arrowField.getType().getTypeID());
                        }
                    }
                    if (feature.getValue() == null && !arrowField.isNullable()) {
                        throw new Exception(String.format("Non-nullable field '%s' is null", fqn));
                    }
                }
            }
        }
        for (var entry : fqnToLargeListColumnCopy.entrySet()) {
            entry.getValue().close();
        }
        return listToArray(result, target);
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


    public static <T extends FeaturesClass> T[] unmarshalTableNewNew(Table table, Class<T> target) throws Exception {
        List<T> result = new ArrayList<>();
        Map<Class<?>, NamespaceMemoItem> memo = new HashMap<>();
        Initializer.buildNamespaceMemo(target, memo, new HashSet<>());
        var constructor = target.getDeclaredConstructor();

        // Cache repeated work
        List<List<String>> fieldIdxToFqnParts = new ArrayList<>();
        for (int j = 0; j < table.getSchema().getFields().size(); j++) {
            var arrowField = table.getSchema().getFields().get(j);
            String fqn = arrowField.getName();
            fieldIdxToFqnParts.add(Arrays.asList(fqn.split("\\.")));
        }
        List<Boolean> fieldIdxToSkip = new ArrayList<>();
        for (int j = 0; j < table.getSchema().getFields().size(); j++) {
            var arrowField = table.getSchema().getFields().get(j);
            fieldIdxToSkip.add(shouldSkipField(arrowField.getName()));
        }

        try (var root = table.toVectorSchemaRoot()) {
            for (var row = 0; row < root.getRowCount(); row++) {
                T obj = constructor.newInstance();
                result.add(obj);
                for (var col = 0; col < root.getSchema().getFields().size(); col++) {
                    if (fieldIdxToSkip.get(col)) {
                        continue;
                    }
                    var setters = Initializer.initScoped(obj, fieldIdxToFqnParts.get(col), memo);
                    for (var s : setters) {
                        Object value = getValueFromFieldVector(root.getVector(col), row);
                        s.set(value);
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
                var dataVector = listVector.getDataVector();
                return getInnerList(
                    dataVector,
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
                    var childVector = structVector.getChild(childField.getName());
                    result.put(
                        childField.getName(),
                        getValueFromFieldVector(childVector, idx)
                    );
                }
                return result;
            }
            default -> {
                throw new Exception("Unsupported type found while unmarshalling Arrow Table: " + arrowType.getTypeID());
            }
        }
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
