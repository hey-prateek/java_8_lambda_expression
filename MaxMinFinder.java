import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaxMinFinder {
    public static void main(String[] args) {

        // Initialize a list of integers
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 99);

        // Find the maximum value using a method reference
        Optional<Integer> max = list.stream().max(Integer::compareTo);

        // Find the minimum value using a method reference
        Optional<Integer> min = list.stream().min(Integer::compareTo);

        // Print the max and min values, or null if not found (e.g., empty list)
        System.out.print("Max: " + max.orElse(null) + " Min: " + min.orElse(null));
    }
}
