import java.util.Scanner;

public class PrimeOrComposite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Check if number is prime or composite
        if (number <= 1) {
            System.out.println(number + " is neither prime nor composite.");
        } else if (isPrime(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is a composite number.");
        }
        
        scanner.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Number is divisible by another number
            }
        }
        return true; // Number is prime
    }
}
