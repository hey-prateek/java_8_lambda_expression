
interface finterface {
    int add(int a, int b);
}

public class sum_of_2_integers_using_lambda {
    public static void main(String[] args) {

        finterface f = (int a, int b) -> a + b;

        System.out.print(f.add(10, 20));

    }
}