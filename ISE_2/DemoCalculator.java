/*
6. Polymorphism – Method Overloading
Write a class Calculator with overloaded methods add(int,int),
add(float,float), add(String,String). Demonstrate method
overloading.
 */
// Class with overloaded methods
class Calculator {
    // Add two integers
    int add(int a, int b) {
        return a + b;
    }

    // Add two floats
    float add(float a, float b) {
        return a + b;
    }

    // Concatenate two strings
    String add(String a, String b) {
        return a + b;
    }
}
public class DemoCalculator {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of integers: " + calc.add(10, 20));
        System.out.println("Sum of floats: " + calc.add(5.5f, 4.5f));
        System.out.println("Concatenation of strings: " + calc.add("Hello, ", "World!"));
    }
}
/* Output 
Sum of integers: 30
Sum of floats: 10.0
Concatenation of strings: Hello, World!
 */