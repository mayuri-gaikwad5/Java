/*Assignment 2.2: Interface and Multiple Inheritance
Objective: Apply interfaces and demonstrate multiple inheritance
Task:
Create interfaces Printable and Showable. Implement both in a class Student.
Demonstrate method implementation from both interfaces.
*/
interface Printable {
    void print();
}

// Interface 2
interface Showable {
    void show();
}

// Class implementing both interfaces
class Student implements Printable, Showable {
    String name;
    int roll;
    double marks;

    Student(String name, int roll, double marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    // Implementation of Printable
    public void print() {
        System.out.println("Printing Student Details…");
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + roll);
        System.out.println("Marks: " + marks);
    }

    // Implementation of Showable
    public void show() {
        System.out.println("Showing Student Information...");
    }
}

// Main class
public class InterfaceDemo {
    public static void main(String[] args) {
        Student s1 = new Student("Mayuri", 101, 88.5);

        s1.print(); // from Printable
        s1.show();  // from Showable
    }
}
/*Otput:-
Printing Student Details?
Name: Mayuri
Roll No: 101
Marks: 88.5
Showing Student Information...
 */