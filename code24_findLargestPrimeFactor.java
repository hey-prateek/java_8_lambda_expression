import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.OptionalInt;

public class code24_findLargestPrimeFactor {

    static boolean isPrime(int n) {
        if(n <= 1)
            return false;
        else {
            for(int i = 2; i <= Math.sqrt(n); i++) {
                if(n % i == 0)
                    return false;
            }
            return true;
        }
    }

    public static void main(String[] args) {
        int n = 961;
        int res = IntStream.rangeClosed(1, (int)(n / 2))
                           .filter(s -> (n % s == 0) && (isPrime(s)))
                           .boxed()
                           .sorted(Collections.reverseOrder())
                           .findFirst()
                           .orElse(0);
        System.out.print(res);
    }
}
