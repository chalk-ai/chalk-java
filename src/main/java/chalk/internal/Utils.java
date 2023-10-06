package chalk.internal;

import java.lang.reflect.Array;
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
}
