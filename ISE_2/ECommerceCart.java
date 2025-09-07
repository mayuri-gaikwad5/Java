/*10. Real World Integration – E-Commerce Cart
Create interface Sellable with methods getPrice(), getDetails().
Create abstract class Product with name, category.
Subclasses: ElectronicItem, ClothingItem.
Implement Sellable and calculate final bill of cart.
*/


import java.util.*;
// Interface
interface Sellable {
    double getPrice();
    String getDetails();
}

// Abstract class
abstract class Product implements Sellable {
    String name;
    String category;

    Product(String name, String category) {
        this.name = name;
        this.category = category;
    }

    // Abstract method for discount logic
    abstract double calculateDiscount(double price);
}

// Electronic Item subclass
class ElectronicItem extends Product {
    double basePrice;

    ElectronicItem(String name, double basePrice) {
        super(name, "Electronics");
        this.basePrice = basePrice;
    }

    @Override
    public double getPrice() {
        return basePrice - calculateDiscount(basePrice);
    }

    @Override
    public String getDetails() {
        return category + ": " + name + " | Price after discount: " + getPrice();
    }

    @Override
    double calculateDiscount(double price) {
        // 10% discount if price > 500
        return (price > 500) ? price * 0.10 : price * 0.05;
    }
}

// Clothing Item subclass
class ClothingItem extends Product {
    double basePrice;

    ClothingItem(String name, double basePrice) {
        super(name, "Clothing");
        this.basePrice = basePrice;
    }

    @Override
    public double getPrice() {
        return basePrice - calculateDiscount(basePrice);
    }

    @Override
    public String getDetails() {
        return category + ": " + name + " | Price after discount: " + getPrice();
    }

    @Override
    double calculateDiscount(double price) {
        // Flat 20% discount
        return price * 0.20;
    }
}

// Main class
public class ECommerceCart {
    public static void main(String[] args) {
        List<Sellable> cart = new ArrayList<>();

        // Add items
        cart.add(new ElectronicItem("Laptop", 60000));
        cart.add(new ElectronicItem("Headphones", 1500));
        cart.add(new ClothingItem("T-Shirt", 800));
        cart.add(new ClothingItem("Jeans", 2000));

        double totalBill = 0;

        System.out.println("=== Cart Details ===");
        for (Sellable item : cart) {
            System.out.println(item.getDetails());
            totalBill += item.getPrice();
        }

        System.out.println("\nFinal Bill Amount: " + totalBill);
    }
}
/*
Output:-
=== Cart Details ===
Electronics: Laptop | Price after discount: 54000.0
Electronics: Headphones | Price after discount: 1350.0
Clothing: T-Shirt | Price after discount: 640.0
Clothing: Jeans | Price after discount: 1600.0

Final Bill Amount: 57590.0
 */
