/*3.Interface – Vehicle
Create an interface Vehicle with methods start(), stop(). Implement it in
Car and Bike classes. Demonstrate polymorphism using interface reference. */
 interface Vehicle {
    void start();
    void stop();
}
class car implements Vehicle
 {
    @Override
    public void start()
    {
        System.out.println("Car is starting ");
    }
    @Override
    public void stop()
    {
        System.out.println("Car is stopping ");
    }
 } 
 class Bike implements Vehicle
 {
    @Override
    public void start()
    {
        System.out.println("Bike is starting ");
    }
    @Override
    public void stop()
    {
        System.out.println("Bike is stopping ");
    }
 } 
public class demoVehicle {
    public static void main(String[] args)
    {
        
        Vehicle v1= new car();
        v1.start();
        v1.stop();

        Vehicle v2= new Bike();
        v2.start();
        v2.stop();
    }
    
}
