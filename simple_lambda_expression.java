@FunctionalInterface
interface finterface
{
    double getvalue();
}
public class simple_lambda_expression {
    public static void main(String[] args) {
        finterface f= () -> 3.145;
        System.out.print(f.getvalue());
        
        
        
    }
}
