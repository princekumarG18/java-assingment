public class AlternatingCase {
    public static String toAlternatingCase(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (i % 2 == 0) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(Character.toLowerCase(c));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "hello world";
        System.out.println(toAlternatingCase(input)); // Output: "HeLlO WoRlD"
    }
}
