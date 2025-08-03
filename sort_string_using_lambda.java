import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class sort_string_using_lambda {
	public static void main(String[] args) {

		List<String> list=Arrays.asList("red", "green", "orange", "blue");
		
		list.sort((s1, s2)-> s1.compareToIgnoreCase(s2));
		
		list.forEach(s->System.out.print(s+" "));
	}
}