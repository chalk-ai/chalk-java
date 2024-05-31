package ai.chalk.internal;

import ai.chalk.features.Name;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.time.Duration;
import java.util.List;
import java.time.temporal.ChronoUnit;

public class Utils {
    public static String getResolvedName(Field field) {
        // If has the Name annotation, use that as the name
        // Otherwise, use the field name snake cased
        if (field.isAnnotationPresent(Name.class)) {
            return field.getAnnotation(Name.class).value();
        }
        return chalkpySnakeCase(field.getName());

    }
    public static String chalkpySnakeCase(String s) {
        // Aims to be in parity with chalkpy's impl
        s = s.replaceAll("(.)([A-Z][a-z]+)", "$1_$2");
        s = s.replaceAll("__([A-Z])", "_$1");
        s = s.replaceAll("([a-z0-9])([A-Z])", "$1_$2");
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

    public static Class<?> getListFeatureInnerType(Field field) throws Exception {
        Type genericType = field.getGenericType();
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
        throw new Exception("Could not get inner type of field " + field.getName() + " in class " + field.getDeclaringClass().getName());
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
}
