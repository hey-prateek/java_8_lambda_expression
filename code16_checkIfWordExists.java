import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Predicate;
public class code16_checkIfWordExists {
    
    public static void main(String[] args) {
     
     ArrayList<String> alist=new ArrayList<>(Arrays.asList("hey", "prateek", "nnrg", "accenture"));
     
     //using bi function 
     BiFunction<String, ArrayList<String>, Boolean> bf = (str, lst) -> lst.contains(str);
     System.out.println(bf.apply("prateek", alist));
     
     //using predicate and streams
     Predicate<String> containsword=s->s.equals("prateekk");
     boolean flag = alist.stream().anyMatch(containsword);
     System.out.print(flag);
     
    }
}