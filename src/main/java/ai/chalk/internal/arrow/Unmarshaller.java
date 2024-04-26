package ai.chalk.internal.arrow;

import ai.chalk.models.OnlineQueryResult;
import ai.chalk.exceptions.ClientException;
import ai.chalk.features.Feature;
import ai.chalk.features.FeaturesClass;
import ai.chalk.features.HasMany;
import ai.chalk.features.StructFeaturesClass;
import ai.chalk.internal.Constants;
import ai.chalk.internal.Utils;
import ai.chalk.internal.codegen.Initializer;
import org.apache.arrow.vector.complex.LargeListVector;
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
        for (var entry: tables.entrySet()) {
            Class<?> localClass = targets[0].getClass();
            String fqn = entry.getKey();
            Table table = entry.getValue();
            Field hasManyField = getFieldFromFqn(targets[0].getClass(), fqn);
            Class<?> hasManyClass = getListFeatureInnerType(hasManyField);
            if (!hasManyField.isAnnotationPresent(HasMany.class)) {
                throw new Exception("Field " + fqn + " is not annotated as a has-many field");
            }
            HasMany hm = hasManyField.getAnnotation(HasMany.class);
            String localFqn = Utils.toSnakeCase(localClass.getSimpleName()) + "." + hm.localKey();
            String foreignFqn = Utils.toSnakeCase(hasManyClass.getSimpleName()) + "." + hm.foreignKey();

            FeaturesClass[] objects = unmarshalTable(table, hasManyClass.asSubclass(FeaturesClass.class));
            Map<String, List<FeaturesClass>> grouped = new HashMap<>();
            for (FeaturesClass obj: objects) {
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

            for (FeaturesClass target: targets) {
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
        for (Row row: table) {
            T obj = target.getDeclaredConstructor().newInstance();
            Map<String, Feature<?>> featureMap;
            try {
                featureMap = Initializer.initResult(obj);
            } catch (Exception e) {
                throw new Exception("Failed to initialize result object", e);
            }
            result.add(obj);

            for (var arrowField: table.getSchema().getFields()) {
                String fqn = arrowField.getName();
                String[] fqnsToSkip = new String[] {
                    Constants.tsFeatureFqn,
                };
                if (Arrays.asList(fqnsToSkip).contains(fqn)) {
                    continue;
                }

                var feature = featureMap.get(fqn);
                if (feature == null) {
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
                } else {
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
                                var largeListVector = (LargeListVector) table.getVectorCopy(fqn);
                                originalList = largeListVector.getObject(row.getRowNumber());
                            } else {
                                originalList = row.getList(fqn);
                            }
                            if (originalList == null) {
                                break;
                            }
                            var resultList = new ArrayList();
                            for (Object rawObj: originalList) {
                                if (rawObj instanceof Text) {
                                    // Converting from arrow `Text` to Java `String`
                                    resultList.add(rawObj.toString());
                                } else if (rawObj instanceof Map) {
                                    // Converting from arrow `Map` to Java `Map`
                                    Class<?> dataclass;
                                    try {
                                        Field field = Utils.getFieldFromFqn(target, fqn);
                                        dataclass = Utils.getListFeatureInnerType(field);
                                    } catch (Exception e) {
                                        throw new Exception("Could not get the inner type of list feature: " + fqn, e);
                                    }

                                    var dataclassInstance = (StructFeaturesClass) dataclass.getDeclaredConstructor().newInstance();
                                    var dataclassFeatureMap = Initializer.initResult(dataclassInstance);

                                    for (Map.Entry<String, Object> entry : ((Map<String, Object>) rawObj).entrySet()) {
                                        var dataclassRootFqn = Utils.toSnakeCase(dataclass.getSimpleName());
                                        var childFqn = dataclassRootFqn + "." + entry.getKey();
                                        var value = entry.getValue();
                                        if (value instanceof Map) {
                                            unmarshalNested((Map<String, Object>) value, dataclassFeatureMap, childFqn);
                                        } else {
                                            var childFeature = dataclassFeatureMap.get(childFqn);
                                            childFeature.setValue(value);
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
                            switch(cast.getUnit()) {
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
        return listToArray(result, target);
    }

    private static void unmarshalNested(Map<String, Object> struct, Map<String, Feature<?>> featureMap, String fqn) {
        for (Map.Entry<String, Object> entry : struct.entrySet()) {
            var childFqn = fqn + "." + entry.getKey();
            var value = entry.getValue();
            if (value instanceof Map) {
                unmarshalNested((Map<String, Object>) value, featureMap, childFqn);
            } else {
                var childFeature = featureMap.get(childFqn);
                childFeature.setValue(value);
            }
        }
    }
}
