//SAM -> simple abstract method
// This code demonstrates how to implement a single abstract method (SAM) interface using an anonymous inner

public class implementing_thread_using_anonymous_inner_class {
    public static void main(String[] args) {

        new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                System.out.print("hey wasuuppppp...");
            }
        }
        )
        .start();
    }
}
