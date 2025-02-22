public class InverseCase {
    public static String toInverseCase(String str) {
        StringBuilder result = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c); // Keep non-alphabetic characters unchanged
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "Hello World!";
        System.out.println(toInverseCase(input)); // Output: "hELLO wORLD!"
    }
}
