import java.util.Arrays;
import java.util.List;

public class sum_and_product_using_lambda {
    public static void main(String[] args) {

        // Initialize a list of integers
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);

        // Calculate the product of all elements using reduce
        // Identity = 1 (neutral element for multiplication)
        int product = list.stream()
                          .reduce(1, (a, b) -> a * b);
        System.out.println(product); // Output: 120

        // Calculate the sum of all elements using reduce
        // Identity = 0 (neutral element for addition)
        int sum = list.stream()
                      .reduce(0, (a, b) -> a + b);
        System.out.println(sum); // Output: 15
    }
}
