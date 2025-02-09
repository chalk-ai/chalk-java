package ai.chalk.internal;

import ai.chalk.features.Name;
import ai.chalk.features.Versioned;
import ai.chalk.features.WindowedFeaturesClass;
import com.google.protobuf.ListValue;
import com.google.protobuf.NullValue;
import com.google.protobuf.Struct;
import com.google.protobuf.Value;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.regex.Pattern;

public class Utils {
    private static final Pattern snakeCase1 = Pattern.compile("(.)([A-Z][a-z]+)");
    private static final Pattern snakeCase2 = Pattern.compile("__([A-Z])");
    private static final Pattern snakeCase3 = Pattern.compile("([a-z0-9])([A-Z])");


    public static String getResolvedName(Field field) {
        String fieldName;

        // If has the Name annotation, use that as the name
        // Otherwise, use the field name snake cased
        if (field.isAnnotationPresent(Name.class)) {
            fieldName = field.getAnnotation(Name.class).value();
        } else {
            fieldName = chalkpySnakeCase(field.getName());
        }

        if (field.isAnnotationPresent(Versioned.class)) {
            Versioned versionInfo = field.getAnnotation(Versioned.class);
            if (versionInfo.defaultVersion() == 0) {
                // Is not base version feature, so we need to strip the `_vN` suffix by splitting on '_'
                String[] parts = fieldName.split("_");
                // Parse the digits from the last part of the FQN, which looks something like `v1`
                String versionStr = parts[parts.length - 1].substring(1);
                String base = String.join("_", Arrays.copyOf(parts, parts.length - 1));
                if (versionStr.equals("1")) {
                    // If the version is 1, we don't need to append it to the FQN
                    fieldName = base;
                } else {
                    fieldName = base + "@" + versionStr;
                }
            } else if (versionInfo.defaultVersion() > 1) {
                // Is base version feature, so we need to append the default version to the FQN
                fieldName += "@" + versionInfo.defaultVersion();
            }
            return fieldName;
        } else if (WindowedFeaturesClass.class.isAssignableFrom(field.getDeclaringClass())) {
            // Convert bucket_1h to __3600s__
            String durationWithUnitStr = fieldName.substring("bucket_".length());
            String convertedDurationStr = Utils.convertBucketDurationToSeconds(durationWithUnitStr);
            fieldName = String.format("__%s__", convertedDurationStr);
        }

        return fieldName;

    }
    public static String chalkpySnakeCase(String s) {
        // Aims to be in parity with chalkpy's impl
        s = snakeCase1.matcher(s).replaceAll("$1_$2");
        s = snakeCase2.matcher(s).replaceAll("_$1");
        s = snakeCase3.matcher(s).replaceAll("$1_$2");
        return s.toLowerCase();
    }

    public static <T> T[] listToArray(List<T> list, Class<T> clazz) {
        @SuppressWarnings("unchecked")
        T[] array = (T[]) Array.newInstance(clazz, list.size());
        return list.toArray(array);
    }

    public static String getDotDelimitedLastSection(String s) {
        var splitArr = s.split("\\.");
        return splitArr[splitArr.length - 1];
    }

    public static Field getFieldFromFqn(Class<?> clazz, String fqn) throws Exception {
        String featureName = Utils.getDotDelimitedLastSection(fqn);
        for (Field field : clazz.getDeclaredFields()) {
            if (Utils.getResolvedName(field).equals(featureName)) {
                return field;
            }
        }
        throw new IllegalArgumentException("Field that corresponds to the feature '" + featureName +
                "' does not exist in class " + clazz.getName());
    }

    public static Class<?> getInnerTypeFromListType(Type genericType) throws Exception {
        if (genericType instanceof ParameterizedType) {
            ParameterizedType paramType = (ParameterizedType) genericType;
            Type[] typeArgs = paramType.getActualTypeArguments();
            for (Type arg : typeArgs) {
                if (arg instanceof ParameterizedType) {
                    ParameterizedType innerParamType = (ParameterizedType) arg;
                    Type[] innerTypeArgs = innerParamType.getActualTypeArguments();
                    for (Type innerArg : innerTypeArgs) {
                        if (innerArg instanceof Class<?>) {
                            return (Class<?>) innerArg;
                        }
                    }
                }
            }
        }
        throw new Exception("not a parameterized type");
    }

    public static Class<?> getInnerTypeFromListField(Field field) throws Exception {
        Type genericType = field.getGenericType();
        try {
            return getInnerTypeFromListType(genericType);
        } catch (Exception e) {
            throw new Exception(
                "Could not get inner type of field " + field.getName() + " in class " + field.getDeclaringClass().getName(),
                e
            );
        }
    }

    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static String formatBucketDuration(int duration) {
        String[] units = {"s", "m", "h", "d", "w"};
        int[] divisors = {60, 60, 24, 7};

        for (int i = 0; i < divisors.length; i++) {
            if (duration % divisors[i] != 0) {
                return String.format("%d%s", duration, units[i]);
            }
            duration = duration / divisors[i];
        }

        return String.format("%d%s", duration, units[units.length - 1]);
    }

    public static String convertBucketDurationToSeconds(String duration) {
        if (duration.equals("all")) {
            return duration;
        }

        String[] units = {"s", "m", "h", "d", "w"};
        int[] multipliers = {1, 60, 3600, 86400, 604800};

        for (int i = 0; i < units.length; i++) {
            if (duration.endsWith(units[i])) {
                var secondsInt = Integer.parseInt(duration.substring(0, duration.length() - units[i].length())) * multipliers[i];
                return String.format("%d", secondsInt);
            }
        }

        throw new IllegalArgumentException("Invalid bucket duration: " + duration);
    }

    public static Object[] convertToArrayOfObjects(Object array) {
        if (!array.getClass().isArray()) {
            throw new IllegalArgumentException("Provided object is not an array");
        }

        int length = Array.getLength(array);
        Object[] outputArray = new Object[length];

        for (int i = 0; i < length; i++) {
            outputArray[i] = Array.get(array, i);
        }

        return outputArray;
    }

    public static String toChalkDuration(Duration duration) {
        if (ChronoUnit.FOREVER.getDuration().equals(duration)) {
            return "all";
        }

        long seconds = duration.getSeconds();
        long nanoseconds = duration.getNano();

        long weeks = seconds / (7 * 24 * 60 * 60);
        seconds %= (7 * 24 * 60 * 60);
        long days = seconds / (24 * 60 * 60);
        seconds %= (24 * 60 * 60);
        long hours = seconds / (60 * 60);
        seconds %= (60 * 60);
        long minutes = seconds / 60;
        seconds %= 60;
        long milliseconds = nanoseconds / 1_000_000;
        nanoseconds %= 1_000_000;
        long microseconds = nanoseconds / 1_000;
        nanoseconds %= 1_000;

        StringBuilder builder = new StringBuilder();
        if (weeks > 0) {
            builder.append(weeks).append("w ");
        }
        if (days > 0) {
            builder.append(days).append("d ");
        }
        if (hours > 0) {
            builder.append(hours).append("h ");
        }
        if (minutes > 0) {
            builder.append(minutes).append("m ");
        }
        if (seconds > 0) {
            builder.append(seconds).append("s ");
        }
        if (milliseconds > 0) {
            builder.append(milliseconds).append("ms ");
        }

        // Sub milliseconds not supported, but let's
        // have the server do the validation.
        if (microseconds > 0) {
            builder.append(microseconds).append("us ");
        }
        if (nanoseconds > 0) {
            builder.append(nanoseconds).append("ns ");
        }

        var res = builder.toString().trim();
        if (res.isEmpty()) {
            return "0s";
        }
        return res;
    }

    public static Value toProto(Object obj) {
        Value.Builder valueBuilder = Value.newBuilder();
        if (obj == null) {
            valueBuilder.setNullValue(NullValue.NULL_VALUE);
        } else if (obj instanceof String) {
            valueBuilder.setStringValue((String) obj);
        } else if (obj instanceof Number) {
            valueBuilder.setNumberValue(((Number) obj).doubleValue());
        } else if (obj instanceof Boolean) {
            valueBuilder.setBoolValue((Boolean) obj);
        } else if (obj instanceof Map) {
            Struct.Builder structBuilder = Struct.newBuilder();
            Map<?, ?> map = (Map<?, ?>) obj;
            for (Map.Entry<?, ?> entry : map.entrySet()) {
                String key = entry.getKey().toString();
                Value value = toProto(entry.getValue());
                structBuilder.putFields(key, value);
            }
            valueBuilder.setStructValue(structBuilder.build());
        } else if (obj instanceof List) {
            ListValue.Builder listBuilder = ListValue.newBuilder();
            List<?> list = (List<?>) obj;
            for (Object item : list) {
                listBuilder.addValues(toProto(item));
            }
            valueBuilder.setListValue(listBuilder.build());
        } else {
            throw new IllegalArgumentException("Unsupported object type: " + obj.getClass().getName());
        }
        return valueBuilder.build();
    }
}
