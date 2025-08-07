import java.util.function.Predicate;

/**
 * Class to demonstrate the use of Predicate with String palindrome checking.
 */
public class code14_PalindromePredicateDemo {
    /**
     * Main method to execute the palindrome test using Predicate.
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Predicate to check if a string is a palindrome by reversing it
        Predicate<String> isPalindrome = s -> s.equals(new StringBuilder(s).reverse().toString());

        // Test cases: prints true for "parap" (palindrome), false for "RajivTalwar"
        System.out.println(isPalindrome.test("parap"));      // Output: true
        System.out.println(isPalindrome.test("RajivTalwar")); // Output: false
    }
}