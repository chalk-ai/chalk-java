package chalk.internal.arrow;

import chalk.exceptions.ClientException;
import chalk.features.Feature;
import chalk.features.FeaturesClass;
import chalk.features.HasMany;
import chalk.features.StructFeaturesClass;
import chalk.internal.Utils;
import chalk.internal.codegen.Initializer;
import chalk.models.OnlineQueryResult;
import org.apache.arrow.vector.table.Row;
import org.apache.arrow.vector.table.Table;
import org.apache.arrow.vector.types.DateUnit;
import org.apache.arrow.vector.types.FloatingPointPrecision;
import org.apache.arrow.vector.types.pojo.ArrowType;
import org.apache.arrow.vector.util.Text;

import java.lang.reflect.Field;
import java.time.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static chalk.internal.Utils.*;

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

            for (var arrowField: table.getSchema().getFields()) {
                String fqn = arrowField.getName();

                var feature = featureMap.get(fqn);

                if (feature == null) {
                    throw new Exception(String.format("Target field not found for unmarshalling feature with FQN: '%s'", fqn));
                }

                switch (arrowField.getType().getTypeID()) {
                    case Int -> {
                        var castInt = (ArrowType.Int) (arrowField.getFieldType().getType());
                        var bitWidth = castInt.getBitWidth();
                        if (bitWidth == 32) {
                            int val = row.getInt(fqn);
                            feature.setValue(val);
                        } else if (bitWidth == 64) {
                            long val = row.getBigInt(fqn);
                            feature.setValue(val);
                        } else if (bitWidth == 16) {
                            short val = row.getSmallInt(fqn);
                            feature.setValue(val);
                        } else if (bitWidth == 8) {
                            byte val = row.getTinyInt(fqn);
                            feature.setValue(val);
                        } else {
                            throw new Exception("Unsupported bitwidth found while converting from Arrow to Java: " + bitWidth);
                        }
                    }
                    case FloatingPoint -> {
                        var castFloatingPoint = (ArrowType.FloatingPoint) (arrowField.getFieldType().getType());
                        var precision = castFloatingPoint.getPrecision();
                        if (precision == FloatingPointPrecision.SINGLE) {
                            var val2 = row.getFloat4(fqn);
                            feature.setValue(val2);
                        } else if (precision == FloatingPointPrecision.DOUBLE) {
                            var val2 = row.getFloat8(fqn);
                            feature.setValue(val2);
                        } else {
                            throw new Exception("Unsupported precision found while converting from Arrow to Java: " + precision);
                        }
                    }
                    case Bool -> {
                        boolean boolVal = row.getBit(fqn) == 1;
                        feature.setValue(boolVal);
                    }
                    case Utf8 -> {
                        String strVal = row.getVarCharObj(fqn);
                        feature.setValue(strVal);
                    }
                    case LargeUtf8 -> {
                        String strVal = row.getLargeVarCharObj(fqn);
                        feature.setValue(strVal);
                    }
                    case Date -> {
                        var castDate = (ArrowType.Date) (arrowField.getFieldType().getType());
                        if (castDate.getUnit() == DateUnit.DAY) {
                            int epochDays = row.getDateDay(fqn);
                            feature.setValue(LocalDate.ofEpochDay(epochDays));
                        } else if (castDate.getUnit() == DateUnit.MILLISECOND) {
                            long epochSeconds = row.getDateMilli(fqn);
                            var dateMillisFeature = featureMap.get(fqn);
                            LocalDate localDate = Instant.ofEpochSecond(epochSeconds).atZone(ZoneOffset.UTC).toLocalDate();
                            dateMillisFeature.setValue(localDate);
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
                                    long epochSeconds = row.getTimeStampSecTZ(fqn);
                                    feature.setValue(Instant.ofEpochSecond(epochSeconds).atZone(zoneId));
                                } else {
                                    long epochSeconds = row.getTimeStampSec(fqn);
                                    feature.setValue(Instant.ofEpochSecond(epochSeconds).atZone(ZoneOffset.UTC).toLocalDateTime());
                                }
                            }
                            case MILLISECOND -> {
                                if (hasTimezone) {
                                    long epochMilli = row.getTimeStampMilliTZ(fqn);
                                    feature.setValue(Instant.ofEpochMilli(epochMilli).atZone(zoneId));
                                } else {
                                    long epochMilli = row.getTimeStampMilli(fqn);
                                    feature.setValue(Instant.ofEpochMilli(epochMilli).atZone(ZoneOffset.UTC).toLocalDateTime());
                                }
                            }
                            case MICROSECOND -> {
                                if (hasTimezone) {
                                    long epochMicro = row.getTimeStampMicroTZ(fqn);
                                    long epochSecondsTruncated = epochMicro / 1_000_000;
                                    long epochNanoRemainder = (epochMicro % 1_000_000) * 1_000;
                                    feature.setValue(Instant.ofEpochSecond(epochSecondsTruncated, epochNanoRemainder).atZone(zoneId));
                                } else {
                                    long epochMicro = row.getTimeStampMicro(fqn);
                                    long epochSecondsTruncated = epochMicro / 1_000_000;
                                    long epochNanoRemainder = (epochMicro % 1_000_000) * 1_000;
                                    var timestampFeature = featureMap.get(fqn);
                                    timestampFeature.setValue(Instant.ofEpochSecond(epochSecondsTruncated, epochNanoRemainder).atZone(ZoneOffset.UTC).toLocalDateTime());
                                }
                            }
                            case NANOSECOND -> {
                                if (hasTimezone) {
                                    long epochNano = row.getTimeStampNanoTZ(fqn);
                                    long epochSecondsTruncated = epochNano / 1_000_000_000;
                                    long epochNanoRemainder = epochNano % 1_000_000_000;
                                    feature.setValue(Instant.ofEpochSecond(epochSecondsTruncated, epochNanoRemainder).atZone(zoneId));
                                } else {
                                    long epochNano = row.getTimeStampNano(fqn);
                                    long epochSecondsTruncated = epochNano / 1_000_000_000;
                                    long epochNanoRemainder = epochNano % 1_000_000_000;
                                    feature.setValue(Instant.ofEpochSecond(epochSecondsTruncated, epochNanoRemainder).atZone(ZoneOffset.UTC).toLocalDateTime());
                                }
                            }
                            default ->
                                    throw new Exception("Unsupported timestamp unit found while converting from Arrow to Java: " + cast.getUnit());
                        }
                    }
                    case Struct -> {
                        var structObj = row.getStruct(fqn);
                        unmarshalNested((HashMap<String, Object>) structObj, featureMap, fqn);
                    }
                    case List -> {
                        feature = featureMap.get(fqn);
                        var originalList = row.getList(fqn);
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
                        feature.setValue(Duration.ofSeconds(duration.getSeconds(), duration.getNano()));
                    }
                    case Time -> {
                        var cast = (ArrowType.Time) (arrowField.getFieldType().getType());
                        switch(cast.getUnit()) {
                            case SECOND -> {
                                var time = row.getTimeSec(fqn);
                                feature.setValue(LocalTime.ofSecondOfDay(time));
                            }
                            case MILLISECOND -> {
                                var time = row.getTimeMilli(fqn);
                                feature.setValue(LocalTime.ofNanoOfDay(time * 1_000_000L));
                            }
                            case MICROSECOND -> {
                                var time = row.getTimeMicro(fqn);
                                feature.setValue(LocalTime.ofNanoOfDay(time * 1_000L));
                            }
                            case NANOSECOND -> {
                                var time = row.getTimeNano(fqn);
                                feature.setValue(LocalTime.ofNanoOfDay(time));
                            }
                            default ->
                                    throw new Exception("Unsupported time unit found while converting from Arrow to Java: " + cast.getUnit());
                        }
                    }
                    case LargeBinary, Binary, Decimal -> {
                        throw new Exception("Unsupported type found while unmarshalling Arrow Table: " + arrowField.getType().getTypeID());
                    }
                }
            }
            result.add(obj);
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
