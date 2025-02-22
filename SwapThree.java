public class SwapThree {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;

        System.out.println("Before swapping:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);

        // Swap without using a temporary variable
        a = a + b + c;
        b = a - (b + c); // (a + b + c) - (b + c) = a
        c = a - (b + c); // (a + b + c) - (a + c) = b
        a = a - (b + c); // (a + b + c) - (a + b) = c

        System.out.println("After swapping:");
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }
}
