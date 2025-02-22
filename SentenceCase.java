public class SentenceCase {
    public static String toSentenceCase(String str) {
        str = str.trim();
        if (str.isEmpty()) {
            return str;
        }

        return Character.toUpperCase(str.charAt(0)) + str.substring(1).toLowerCase();
    }

    public static void main(String[] args) {
        String input = "hELLO wORLD! tHIS is JAVA.";
        System.out.println(toSentenceCase(input)); // Output: "Hello world! this is java."
    }
}
