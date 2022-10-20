package transport;

public class ValidationUtils {

    public static String validOrDefault(String value, String defaultValue) {
        if (value != null && !value.isEmpty() && !value.isBlank()) {
            return value;
        } else {
            return defaultValue;
        }

    }
}
