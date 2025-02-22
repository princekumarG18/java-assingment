public class IncrementArray {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        // Increment each element
        for (int i = 0; i < numbers.length; i++) {
            numbers[i]++;
        }

        // Print the updated array
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
