import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class convert_string_upper_lambda {
	public static void main(String[] args) {

		List<String> list=Arrays.asList("red", "green", "orange", "blue");
		list.replaceAll(s->s.toUpperCase());
		
		list.forEach(s->System.out.print(s+" "));
		
		list.replaceAll(s->s.toLowerCase());
		
		list.forEach(s->System.out.print(s+" "));
	}
}