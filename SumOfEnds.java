public class SumOfEnds {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        
        if (numbers.length >= 2) {
            int sum = numbers[0] + numbers[numbers.length - 1];
            System.out.println("Sum of first and last elements: " + sum);
        } else {
            System.out.println("Array should have at least two elements.");
        }
    }
}
// compare this snippet from sumofends.java;
