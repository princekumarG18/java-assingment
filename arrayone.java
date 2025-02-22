package arrayone;

public class SumOfEnds {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50}; // Example array
        
        // Calculate the sum of the first and last elements
        int sum = numbers[0] + numbers[numbers.length - 1];
        
        // Print the result
        System.out.println("Sum of first and last elements: " + sum);
    }
}
