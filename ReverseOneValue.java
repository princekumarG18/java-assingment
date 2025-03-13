public class ReverseOneValue {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int index = 2; // Index of value to reverse (e.g., reverse numbers[2] which is 30)

        // Convert the value at the specified index to its reverse form (e.g., 30 -> 03 or 3)
        numbers[index] = reverseNumber(numbers[index]);

        // Print the updated array
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }

    // Method to reverse the digits of a number
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
}

