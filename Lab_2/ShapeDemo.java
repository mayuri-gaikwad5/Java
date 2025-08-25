
/*Assignment 2.1: Implementing Abstract Class
Objective: Understand abstraction and code reuse
Task:
Create an abstract class Shape with methods calculateArea() and display(). 
Derive Circle and Rectangle classes from it and override the methods.

 */
import java.util.Scanner;

// Abstract class
abstract class Shape {
    abstract void calculateArea();

    void display() {
        System.out.println("Displaying shape area...");
    }
}

// Circle class
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void calculateArea() {
        double area = Math.PI * radius * radius;
        display();
        System.out.println("Circle area: " + area);
    }
}

// Rectangle class
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    void calculateArea() {
        double area = length * width;
        display();
        System.out.println("Rectangle area: " + area);
    }
}

// Main class
public class ShapeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Circle
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        Shape circle = new Circle(r);
        circle.calculateArea();

        // Rectangle
        System.out.print("\nEnter length of rectangle: ");
        double l = sc.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double w = sc.nextDouble();
        Shape rectangle = new Rectangle(l, w);
        rectangle.calculateArea();

        sc.close();
    }
}
/*
 * Output
 * Enter radius of circle: 2
 * Displaying shape area...
 * Circle area: 12.566370614359172
 * 
 * Enter length of rectangle: 10
 * Enter width of rectangle: 20
 * Displaying shape area...
 * Rectangle area: 200.0
 */