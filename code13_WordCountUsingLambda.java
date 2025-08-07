/**
 * Functional interface to count words in a string.
 */
interface WordCounter {
    /**
     * Counts the number of words in the given string.
     * @param str the input string to count words from
     * @return the total number of words
     */
    int count_string_words(String str);
}

/**
 * Main class to demonstrate word counting using a functional interface.
 */
public class code13_WordCountUsingLambda {
    public static void main(String[] args) {
        String str = "hey yo prateek wsup"; // Input string to count words
        
        // Lambda expression to split string by whitespace and return word count
        WordCounter counter = s -> s.split("\\s+").length;

        // Print the word count
        System.out.print(counter.count_string_words(str));
    }
}