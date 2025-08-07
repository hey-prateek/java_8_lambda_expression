import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
public class code15_OddEvenSum {
    
    public static void main(String[] args) {
     
     List<Integer> alist=new ArrayList<>(Arrays.asList(1,2,3,4,5,6));
     
     int evenSumResult=alist.stream().filter(s->s%2==0).map(s->s*s).reduce(0,(a,b)->a+b);
     
     int oddSumResult=alist.stream().filter(s->s%2!=0).mapToInt(s ->s*s).sum();
     
     System.out.print(evenSumResult+" "+ oddSumResult);
    }
}