package ai.chalk.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public class Utils {
    public static String toSnakeCase(String s) {
        return s.replaceAll("([a-z])([A-Z])", "$1_$2").toLowerCase();
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

    public static String firstLetterToLower(String s) {
        if (s == null || s.isEmpty()) {
            return s; // return the input string if it's null or empty
        }
        return Character.toLowerCase(s.charAt(0)) + s.substring(1);
    }

    public static String fqnCamelCase(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '_' && i + 1 < s.length()) {
                // Skip over '_' in "_{{lowercase}}".
                continue;
            } else if (isASCIIDigit(c) || c == '.') {
                result.append(c);
            } else {
                // Assume we have a letter now - if not, it's a bogus identifier.
                // The next word is a sequence of characters that must start upper case.
                if (isASCIILower(c)) {
                    c = Character.toUpperCase(c);
                }
                result.append(c);

                // Accept lower case sequence that follows.
                while (i + 1 < s.length() && isASCIILower(s.charAt(i + 1))) {
                    result.append(s.charAt(i + 1));
                    i++;
                }
            }
        }
        return result.toString();
    }

    private static boolean isASCIIDigit(char c) {
        return c >= '0' && c <= '9';
    }

    private static boolean isASCIILower(char c) {
        return c >= 'a' && c <= 'z';
    }


    public static Field getFieldFromFqn(Class<?> clazz, String fqn) throws Exception {
        String featureName = Utils.getDotDelimitedLastSection(fqn);
        String fieldName = Utils.firstLetterToLower(Utils.fqnCamelCase(featureName));
        for (Field field : clazz.getDeclaredFields()) {
            if (field.getName().equals(fieldName)) {
                return field;
            }
        }
        throw new IllegalArgumentException("Field " + fieldName + " does not exist in class " + clazz.getName());
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
}
