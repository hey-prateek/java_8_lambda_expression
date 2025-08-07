import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.OptionalInt;
import java.util.function.Function;

public class code25_convertIntToBinaryRep {
    
    public static void main(String[] args) {
        int n=12;
        Function<Integer, String> f = s -> Integer.toBinaryString(s);
        System.out.print( f.apply(n) );
    }
}