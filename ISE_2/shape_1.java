/*1. Abstract Class – Shape
Create an abstract class Shape with method area().
Implement subclasses Circle and Rectangle. Write a program to calculate and
display area for both. */
import java.util.Scanner;

abstract  class shape 
{
    abstract void area();
    void display()
    {
        System.out.println("printing area of shape");
    }
}
class circle extends shape
{
    double radius;
    circle(double radius)
    {
        this.radius=radius;
    }
    @Override
    void area()
    {
        display();
        System.out.println("Area of circle is : "+3.14*radius*radius);
        
    }
}class rectangle extends shape
{
    double length,width;
    rectangle(double length,double width)
    {
        this.length=length;
        this.width=width;
    }
    @Override
    void area()
    {
        display();
        System.out.println("Area of rectangle is : "+length*width);
        
    }
}
public class shape_1 {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        // circle
        System.out.println("Enter radius of circle");
        double r= sc.nextDouble();
        shape c= new circle(r);
        c.area();
        //rectangle
        System.out.println("enter the length of rectangle");
        double l=sc.nextDouble();
        System.out.println("enter the width of rectangle");
        double w=sc.nextDouble();
        shape R=new rectangle(l, w);
        R.area();
        sc.close();
    }
    
}
/*
Enter radius of circle
2
printing area of shape
area of circle is : 12.56

enter the length of rectangle
10
enter the width of rectangle
10
printing area of shape
area of circle is : 100.0
 */