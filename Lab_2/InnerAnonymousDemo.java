/*Assignment 2.5: Use of Inner Class

Objective: Understand inner and anonymous classes
Task:
Create a class Outer with an inner class Inner.
Show how to access inner class members from the outer class.
Also demonstrate an anonymous inner class implementing an interface.

*/
interface MyInterface {
    void show();
}

// Outer class
class Outer {

    // Inner class
    class Inner {
        void display() {
            System.out.println("This is inner class.");
        }
    }

    // Method in Outer to access Inner class members
    void accessInner() {
        Inner innerObj = new Inner(); // create object of Inner
        innerObj.display(); // call Inner class method
    }
}

// Main class
public class InnerAnonymousDemo {
    public static void main(String[] args) {
        // Access inner class from outer class
        Outer outerObj = new Outer();
        outerObj.accessInner();

        // Anonymous inner class implementing an interface
        MyInterface obj = new MyInterface() {
            @Override
            public void show() {
                System.out.println("This is anonymous class.");
            }
        };

        obj.show(); // call method
    }
}
/*
 This is inner class.
 This is anonymous class.
 */
