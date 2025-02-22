import java.util.Scanner;

public class PrintNNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for N
        System.out.print("Enter the value of N: ");
        int n = scanner.nextInt();

        // Print numbers from 1 to N
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }

        scanner.close();
    }
}
