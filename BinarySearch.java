 
public class BinarySearch {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;

        // Print original values
        System.out.println("Original values:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        // Swap variables
        int temp = a;
        a = b;
        b = c;
        c = d;
        d = temp;

        // Print swapped values
        System.out.println("Swapped values:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
