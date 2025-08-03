//create a function interface
@FunctionalInterface
interface finterface
{
    // the single abstract method
    String display(String s);
}

public class method_taking_lambda_exp_as_parameter {
    public static void main(String[] args) {

        //creating objects of the functional interface using lambda expressions
        finterface f1= s-> "hello" + s;
        finterface f2 = s -> "goodbye " + s;

        //passing the lambda expressions as parameters to the method
        method(f1, " world");
        method(f2, "prateek");
    }

    // method that takes a functional interface object as a parameter
    static void method(finterface f, String s)
    {
        String str=f.display(s);
        System.out.println(str);
    }
}
