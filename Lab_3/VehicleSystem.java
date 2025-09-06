/*Assignment 1: Vehicle System using Abstract Class and Interface
Design a vehicle system where:
Create an abstract class Vehicle with:
Fields: brand, speed
Abstract method: start()
Concrete method: displayInfo()
Create an interface FuelEfficient with method calculateMileage()
Create two classes Car and Bike that inherit from Vehicle and implement FuelEfficient */

// Interface for fuel efficiency
interface FuelEfficient {
    double calculateMileage(); // abstract method (must be implemented by child classes)
}

// Abstract class Vehicle
abstract class Vehicle {
    String brand;
    int speed;

    // Constructor
    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }

    // Abstract method
    abstract void start();

    // Concrete method
    void displayInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed + " km/hr");
    }
}

// Car class
class Car extends Vehicle implements FuelEfficient {
    int fuelConsumption; // liters per 100 km

    Car(String brand, int speed, int fuelConsumption) {
        super(brand, speed);
        this.fuelConsumption = fuelConsumption;
    }

    // Implement abstract method
    @Override
    void start() {
        System.out.println(brand + " Car is starting ...");
    }

    // Implement interface method
    @Override
    public double calculateMileage() {
        // Assuming mileage = 100 / fuelConsumption
        return 100.0 / fuelConsumption;
    }
}

// Bike class
class Bike extends Vehicle implements FuelEfficient {
    int fuelConsumption; // liters per 100 km

    Bike(String brand, int speed, int fuelConsumption) {
        super(brand, speed);
        this.fuelConsumption = fuelConsumption;
    }

    // Implement abstract method
    @Override
    void start() {
        System.out.println(brand + " Bike is starting ....");
    }

    // Implement interface method
    @Override
    public double calculateMileage() {
        return 100.0 / fuelConsumption;
    }
}

// Main class
public class VehicleSystem {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 180, 8);
        Bike bike = new Bike("Honda", 120, 3);

        System.out.println("=== Car Details ===");
        car.displayInfo();
        car.start();
        System.out.println("Mileage: " + car.calculateMileage() + " km/hr");

        System.out.println("\n=== Bike Details ===");
        bike.displayInfo();
        bike.start();
        System.out.println("Mileage: " + bike.calculateMileage() + " km/hr");
    }
}
/*
 === Car Details ===
Brand: Toyota
Speed: 180 km/hr
Toyota Car is starting ...
Mileage: 12.5 km/hr

=== Bike Details ===
Brand: Honda
Speed: 120 km/hr
Honda Bike is starting ....
Mileage: 33.333333333333336 km/hr
 */
