/*
 9. Abstract Class + Interface (Hybrid)
Create an abstract class Appliance with abstract method powerOn().
Create interface SmartDevice with method connectWifi().
Class SmartFan implements both. Demonstrate usage.

 */
// Abstract class
abstract class Appliance {
    abstract void powerOn();
}

// Interface
interface SmartDevice {
    void connectWifi();
}

// Class implementing both
class SmartFan extends Appliance implements SmartDevice {
    @Override
    void powerOn() {
        System.out.println("Smart Fan is powered on.");
    }

    @Override
    public void connectWifi() {
        System.out.println("Smart Fan connected to Wi-Fi.");
    }
}

// Main class
public class HybridDemo {
    public static void main(String[] args) {
        SmartFan fan = new SmartFan();

        fan.powerOn();       // From abstract class
        fan.connectWifi();   // From interface
    }
}
/*
Output:-
Smart Fan is powered on.
Smart Fan connected to Wi-Fi.
 */
