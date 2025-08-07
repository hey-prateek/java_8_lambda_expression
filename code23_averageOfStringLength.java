import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;

public class code23_averageOfStringLength {

    public static void main(String[] args) {
        ArrayList<String> slist = new ArrayList<>(Arrays.asList("HEY", "prateek", "Tiwari", "SUPERMAN"));

        double res = slist.stream()
                          .mapToInt(s -> s.length())
                          .average()
                          .orElse(0);

        System.out.print(res);
    }
}
