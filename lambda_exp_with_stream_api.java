import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class lambda_exp_with_stream_api {
    public static void main(String[] args) {

        // Initialize a list of country and city strings
        List<String> list = new ArrayList<>(Arrays.asList(
            "nepal, kathmandu", 
            "USA, texas", 
            "India, delhi", 
            "china, shanghai", 
            "nepal, mt.everest"
        ));

        // Process the list using Stream API:
        list.stream()
            // Filter elements that start with "nepal"
            .filter(s -> s.startsWith("nepal"))
            // Convert the matching elements to uppercase
            .map(s -> s.toUpperCase())
            // Sort the results alphabetically
            .sorted()
            // Print each result followed by "_____"
            .forEach(s -> System.out.print(s + "_____"));
    }
}
// The output will be the filtered, transformed, and sorted list of strings.
// Output: NEPAL, KATHMANDU_____NEPAL, MT.EVEREST