public class CapitalizedCase {
    public static String toCapitalizedCase(String str) {
        String[] words = str.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                result.append(Character.toUpperCase(word.charAt(0)))
                      .append(word.substring(1).toLowerCase())
                      .append(" ");
            }
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        String input = "hello world! this is java.";
        System.out.println(toCapitalizedCase(input)); // Output: "Hello World! This Is Java."
    }
}
