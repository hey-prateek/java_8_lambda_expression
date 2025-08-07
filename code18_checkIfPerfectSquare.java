import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class code18_checkIfPerfectSquare {
    
    public static void main(String[] args) {
     
    
    Predicate<Integer> pred= s -> Math.sqrt(s) - (int)(Math.sqrt(s)) == 0.0;
    System.out.print(pred.test(36));
     
    }
}