public class StringUtils {
    public StringUtils() {
    }

    public static boolean IsNullOrBlank(String s) {
        return s == null || s.isBlank();
    }

    public static boolean IsLatinLetters(String s) {
        final String VALID_CHAR = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
        for (int i = 0; i < s.length(); i++) {
            if (!VALID_CHAR.contains(String.valueOf(s.charAt(i)))) {
                return false;
            }
        }
        return true;
    }

}