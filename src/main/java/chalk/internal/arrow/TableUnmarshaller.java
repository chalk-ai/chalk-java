package chalk.internal.arrow;

import chalk.features.Feature;
import chalk.features.FeaturesClass;
import chalk.internal.codegen.Initializer;
import chalk.models.OnlineQueryResult;
import org.apache.arrow.vector.table.Row;
import org.apache.arrow.vector.table.Table;
import org.apache.arrow.vector.types.DateUnit;
import org.apache.arrow.vector.types.FloatingPointPrecision;
import org.apache.arrow.vector.types.pojo.ArrowType;

import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static chalk.internal.Utils.listToArray;

public class TableUnmarshaller {
    public static <T extends FeaturesClass> T[] unmarshalOnlineQueryResult(OnlineQueryResult result, Class<T> target) throws Exception {
        return unmarshal(result.getScalarsTable(), target);
    }

    public static <T extends FeaturesClass> T[] unmarshal(Table table, Class<T> target) throws Exception {
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
                    // TODO: Handle `namespace.__chalk_observed_at__` field.
                    continue;
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
                                    feature.setValue(Instant.ofEpochSecond(epochMicro).atZone(zoneId));
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
                    case List, Struct, LargeBinary, Binary, Time, Duration, Decimal -> {
                        continue;
//                        throw new Exception("Unsupported type found while unmarshalling Arrow Table: " + arrowField.getType().getTypeID());
                    }
                }
            }
            result.add(obj);
        }
        return listToArray(result, target);
    }
}
