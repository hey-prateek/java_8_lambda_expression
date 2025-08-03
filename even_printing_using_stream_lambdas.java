import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class even_printing_using_stream_lambdas {
	public static void main(String[] args) {

		List<Integer> alist=Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		
		List<Integer> res=alist.
		                  stream().
		                  filter(s->s%2==0).
		                  collect(Collectors.toList());
		
		res.forEach(s->System.out.print(s+" "));
	}
}