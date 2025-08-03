@FunctionalInterface
interface finterface
{
    //single abstract method
    String reverse_string(String str);
}

//main class
public class lambda_expresion_with_arguments {
    public static void main(String[] args) {
        
        //lambda expression to implement single abstract method (reverse a string) 
        //with a given string argument and string return type
        finterface f= (String str)->
        {
            String temp="";
            for(int i=str.length()-1; i>=0; i--)
            {
                temp+=str.charAt(i);
            }
            return temp;
        };
        
        //printing using object.method call
        System.out.print(f.reverse_string("prateek"));
        
    }
}
