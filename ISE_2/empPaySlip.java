/*2.Abstract Class – Employee Pay Slip
Create an abstract class Employee with fields name, id, and abstract method
calculateSalary().
Subclasses: FullTimeEmployee and PartTimeEmployee. Demonstrate
polymorphism. */
abstract class Employee{
    String name;
    String id;
    Employee(String name, String id)
    {
        this.id=id;
        this.name=name;
    }
    void display()
    {
        System.out.println("Employee name: "+name);
        System.out.println("Employee id: "+id);
        System.out.println("salary: "+calculateSalary());
    }
    abstract double calculateSalary(); 
}
class FullTimeEmployee extends Employee
{
    double fixedSalary;
    FullTimeEmployee(String name, String id,double fixedSalary)
    {
        super(name, id);
        this.fixedSalary=fixedSalary;
    }
    @Override
    double calculateSalary() {
        return fixedSalary;
    }
}
class PartTimeEmployee extends Employee
{
    double hoursWorked;
    int ratePerHour;
    PartTimeEmployee(String name, String id,double hoursWorked,int ratePerHour)
    {
        super(name, id);
        this.hoursWorked=hoursWorked;
        this.ratePerHour=ratePerHour;
    }
    @Override
    double calculateSalary() {
        return hoursWorked*ratePerHour;
    }
}
public class empPaySlip {
    public static void main(String[] args)
    {
        Employee emp1=new FullTimeEmployee("Mayuri", "e15", 100000.0);
        emp1.display();

        Employee emp2=new PartTimeEmployee("Soham", "b10", 7, 1000);
        emp2.display();
    }
}
