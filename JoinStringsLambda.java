import java.util.function.BiFunction;

public class JoinStringsLambda {
    public static void main(String[] args) {

        // Define two input strings
        String s1 = "hey ";
        String s2 = "prateek";

        // BiFunction takes two strings and returns their concatenation
        BiFunction<String, String, String> f = (str1, str2) -> str1 + str2;

        // Apply the lambda to join s1 and s2
        System.out.print(f.apply(s1, s2)); // Output: hey prateek
    }
}
