import java.util.Scanner;

public class PrintNOddNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for N
        System.out.print("Enter the number of odd numbers to print: ");
        int n = scanner.nextInt();

        // Print the first N odd numbers
        int count = 0;
        int number = 1;

        while (count < n) {
            System.out.println(number);
            number += 2; // Next odd number
            count++;
        }

        scanner.close();
    }
}
