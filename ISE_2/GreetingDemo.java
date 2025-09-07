/*
8. Anonymous Class – Greeting
Create an interface Greeting with method sayHello(). Implement it using an
anonymous class inside main() to print “Hello Students”.
 */
// Interface
interface Greeting {
    void sayHello();
}

// Main class
public class GreetingDemo {
    public static void main(String[] args) {
        // Anonymous class implementing Greeting
        Greeting g = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("Hello Students");
            }
        };

        // Call the method
        g.sayHello();
    }
}
/*Output:-
 Hello Students
 */
