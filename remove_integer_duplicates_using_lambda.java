import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class remove_integer_duplicates_using_lambda {
	public static void main(String[] args) {

		List<Integer> lst=Arrays.asList(1,1,2,2,3,3,4,4,5,5,6,7);
		
		List<Integer> res=lst.stream().distinct().collect(Collectors.toList());
		
		res.forEach(s->System.out.print(s+" "));
	}
}