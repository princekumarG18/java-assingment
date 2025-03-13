import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input: Number of even numbers to print
        System.out.print("Enter the number of even numbers to print: ");
        int n = scanner.nextInt();
        
        System.out.println("First " + n + " even numbers:");
        for (int i = 1; i <= n; i++) {
            System.out.println(2 * i);
        }
        
        scanner.close();
    }
}
