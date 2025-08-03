import java.util.ArrayList;
import java.util.List;

class arraylist_printing_using_lambda {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        // Using lambda expression to print each element
        list.forEach( data -> System.out.println(data));
    }
}