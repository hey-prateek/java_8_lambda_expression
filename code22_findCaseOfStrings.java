import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;

public class code22_findCaseOfStrings {
    
    public static void main(String[] args) {
        
    ArrayList<String> slist=new ArrayList<>(Arrays.asList("HEY", "prateek", "Tiwari", "SUPERMAN"));
    
    slist.stream().filter(s -> (s.toUpperCase()).equals(s)).forEach(s -> System.out.print(s+", "));
    
    slist.stream().filter(s -> (s.toLowerCase()).equals(s)).forEach(s -> System.out.print(s+", "));
    
    slist.stream().filter(s -> (!(s.toLowerCase()).equals(s) && !(s.toUpperCase()).equals(s))).forEach(s -> System.out.print(s+", "));
    
    }
}