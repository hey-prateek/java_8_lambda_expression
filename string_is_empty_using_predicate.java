import java.util.function.Predicate;

public class string_is_empty_using_predicate {
	public static void main(String[] args) {

		Predicate pd=s->s.equals("");
		System.out.println(pd.test("prateek"));
		System.out.println(pd.test(""));
	}
}