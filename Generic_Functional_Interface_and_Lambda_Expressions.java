// Functional interface using generics to operate on any type T
@FunctionalInterface
interface finterface<T> {
    T getvalue(T t);  // Abstract method to be implemented using lambda
}

public class Generic_Functional_Interface_and_Lambda_Expressions {
    public static void main(String[] args) {

        // Lambda expression that takes a String and returns a greeting
        finterface<String> f1 = s -> {
            String str = "hello " + s;
            return str;
        };

        // Lambda expression that adds 10 to an Integer input
        finterface<Integer> f2 = i -> {
            int num = i + 10;
            return num;
        };

        // Execute the lambdas and print the results
        System.out.println(f1.getvalue("prateek"));  // Output: hello prateek
        System.out.print(f2.getvalue(20));           // Output: 30
    }
}
