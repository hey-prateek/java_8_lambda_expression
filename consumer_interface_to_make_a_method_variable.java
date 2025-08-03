// this code demonstrates the use of the Consumer interface to create a method variable

import java.util.ArrayList;
import java.util.function.Consumer;

public class consumer_interface_to_make_a_method_variable {
    public static void main(String[] args) {

        // Create an ArrayList to store strings
        ArrayList<String> list = new ArrayList<>();
        list.add("cat");
        list.add("dog");
        list.add("monkey");

        // Define a Consumer that prints each string followed by a space
        Consumer<String> method = s -> System.out.print(s + " ");

        // Use forEach to apply the Consumer to each element in the list
        list.forEach(method);  // Output: cat dog monkey 
    }
}