import java.util.Arrays;
import java.util.Collections;

public class ArraySorting  {
    public static void main(String[] args) {
        // Integer Array
        int[] numbers = {50, 20, 40, 10, 30};

        // Sort in Ascending Order
        Arrays.sort(numbers);
        System.out.println("Ascending Order: " + Arrays.toString(numbers));

        // Sort in Descending Order (using Integer array)
        Integer[] numbersDesc = {50, 20, 40, 10, 30};
        Arrays.sort(numbersDesc, Collections.reverseOrder());
        System.out.println("Descending Order: " + Arrays.toString(numbersDesc));
    }
}
