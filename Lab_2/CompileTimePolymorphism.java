/* Assignment 2.4: Method Overloading
Objective: Demonstrate compile-time polymorphism
Task:
Create a class Calculator with overloaded methods add() to handle:
Two integers
Two doubles
Three integers
*/
class Calculator {
    Calculator() {
    }

    int add(int var1, int var2) {
        return var1 + var2;
    }

    double add(double var1, double var3) {
        return var1 + var3;
    }

    int add(int var1, int var2, int var3) {
        return var1 + var2 + var3;
    }
}

// Main class
public class CompileTimePolymorphism {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Addition of 2 integers: " + calc.add(2, 3));
        System.out.println("Addition of 2 doubles: " + calc.add(3.5, 4.3));
        System.out.println("Addition of 3 integers: " + calc.add(4, 5, 3));
    }
}

/*Output:-
Addition of 2 integers: 5
Addition of 2 doubles: 7.8
Addition of 3 integers: 12
 */