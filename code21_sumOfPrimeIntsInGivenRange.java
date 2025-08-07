import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.IntStream;


public class code21_sumOfPrimeIntsInGivenRange {
    
    static boolean isPrime(int n)
    {
        if(n<=1)
        return false;
        else{
            for(int i=2;i<=Math.sqrt(n);i++)
            {
                if(n%i==0)
                return false;
            }
            return true;
        }
    }
    
    public static void main(String[] args) {
    int res=IntStream.rangeClosed(10, 100).filter(s -> isPrime(s)).sum();
    System.out.print(res);
    }
}