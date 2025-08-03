import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class factorial_using_lambda {
	public static void main(String[] args) {


		int n=3;
		int res=IntStream.
		        rangeClosed(1,n).   //This creates a stream of integers from 1 to n (inclusive), Example: if n = 5, it produces the stream: 1, 2, 3, 4, 5.
		        reduce(1,(a,b)->a*b);   //This is a reduction operation that multiplies all elements together.
//1 is the identity value (the starting value).
//(a, b) -> a * b is a lambda expression that takes two numbers and returns their product.
//It works like:
//(((1 * 1) * 2) * 3) * 4 * 5 = 120
		System.out.print(res);

	}
}