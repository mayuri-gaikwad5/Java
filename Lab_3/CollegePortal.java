/*Assignment 2: College Portal Simulation
Create a student management simulation:
Create an abstract class Person with:
Fields: name, id
Abstract method: getRole()
Create an interface Login with:
Method: login(String username, String password)
Create classes Student, Faculty that extend Person and implement Login
Demonstrate polymorphic behavior and implement sample login logic
 */

// Interface for login functionality
interface Login {
    boolean login(String username, String password);
}

// Abstract class Person
abstract class Person {
    String name;
    String id;

    Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Abstract method
    abstract String getRole();

    // Concrete method
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Role: " + getRole());
    }
}

// Student class
class Student extends Person implements Login {
    private String username;
    private String password;

    Student(String name, String id, String username, String password) {
        super(name, id);
        this.username = username;
        this.password = password;
    }

    @Override
    String getRole() {
        return "Student";
    }

    @Override
    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}

// Faculty class
class Faculty extends Person implements Login {
    private String username; 
    private String password;

    Faculty(String name, String id, String username, String password) {
        super(name, id);
        this.username = username;
        this.password = password;
    }

    @Override
    String getRole() {
        return "Faculty";
    }

    @Override
    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}

// Main class
public class CollegePortal {
    public static void main(String[] args) {
        // Polymorphism: Person reference for Student & Faculty
        Person student = new Student("Alice", "S101", "alice123", "pass123");
        Person faculty = new Faculty("Dr. Smith", "F202", "smith", "faculty@2025");

        System.out.println("=== Student Info ===");
        student.displayInfo();
        // Login check
        if (((Login) student).login("alice123", "pass123")) {
            System.out.println("Login successful for Student!");
        } else {
            System.out.println("Login failed for Student!");
        }

        System.out.println("\n=== Faculty Info ===");
        faculty.displayInfo();
        if (((Login) faculty).login("smith", "faculty@2025")) {
            System.out.println("Login successful for Faculty!");
        } else {
            System.out.println("Login failed for Faculty!");
        }
    }
}
 
/*Output
=== Student Info ===
Name: Alice
ID: S101
Role: Student
Login successful for Student!

=== Faculty Info ===
Name: Dr. Smith
ID: F202
Role: Faculty
Login successful for Faculty!
 */
