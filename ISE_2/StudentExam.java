/*
 7. Inner Class – Student Exam
Create a class Student with an inner class Exam that stores subject and marks.
Display marksheet using inner class object.

 */
// Outer class
class Student {
    String name;
    int id;

    // Constructor
    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Inner class
    class Exam {
        String subject;
        int marks;

        // Constructor
        Exam(String subject, int marks) {
            this.subject = subject;
            this.marks = marks;
        }

        // Method to display marks
        void displayExamDetails() {
            System.out.println("Subject: " + subject + ", Marks: " + marks);
        }
    }

    // Method to display student info
    void displayStudentInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
    }
}

// Main class
public class StudentExam {
    public static void main(String[] args) {
        // Create Student object
        Student s1 = new Student("Alice", 101);

        // Display student info
        s1.displayStudentInfo();

        System.out.println("\n--- Marksheet ---");

        // Create inner class objects
        Student.Exam e1 = s1.new Exam("Math", 85);
        Student.Exam e2 = s1.new Exam("Science", 90);
        Student.Exam e3 = s1.new Exam("English", 78);

        // Display marks
        e1.displayExamDetails();
        e2.displayExamDetails();
        e3.displayExamDetails();
    }
}
/*Output:-

Student Name: Alice
Student ID: 101

--- Marksheet ---
Subject: Math, Marks: 85
Subject: Science, Marks: 90
Subject: English, Marks: 78

 */