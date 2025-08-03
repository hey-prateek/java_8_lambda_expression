import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.function.Predicate;

public class prime_using_lambda {
	public static void main(String[] args) {

		
		Predicate<Integer> p=s->
		{
		    if(s<2)
		    return false;
		    else
		    {
		        for(int i=2;i<=Math.sqrt(s);i++)
		        {
		            if(s%i==0)
		            return false;
		        }
		    }
		    return true;
		};
		System.out.print(p.test(16));
		

	}
}