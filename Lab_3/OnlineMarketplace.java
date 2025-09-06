/*Assignment 3: Online Marketplace Interface Design
Simulate an online marketplace:
Create an interface Sellable with:
displayItemDetails()
getPrice()
Create an abstract class Product with:
Fields: name, category
Abstract method: calculateDiscount()
Create classes ElectronicItem, ClothingItem that extend Product and implement Sellable
Demonstrate real-world logic of displaying items and calculating price after discount
 */
// Interface for sellable items
interface Sellable {
    void displayItemDetails();

    double getPrice();
}

// Abstract class Product
abstract class Product implements Sellable {
    String name;
    String category;

    Product(String name, String category) {
        this.name = name;
        this.category = category;
    }

    // Abstract method
    abstract double calculateDiscount();
}

// ElectronicItem class
class ElectronicItem extends Product {
    double price;
    int warrantyYears;

    ElectronicItem(String name, String category, double price, int warrantyYears) {
        super(name, category);
        this.price = price;
        this.warrantyYears = warrantyYears;
    }

    @Override
    public void displayItemDetails() {
        System.out.println("Electronic Item: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: $" + price);
        System.out.println("Warranty: " + warrantyYears + " years");
        System.out.println("Final Price after Discount: $" + getPrice());
    }

    @Override
    public double getPrice() {
        return price - calculateDiscount();
    }

    @Override
    double calculateDiscount() {
        // Example: 10% discount on electronics if price > 500
        if (price > 500) {
            return price * 0.10;
        } else {
            return price * 0.05;
        }

    }
}

// ClothingItem class
class ClothingItem extends Product {
    double price;
    String size;

    ClothingItem(String name, String category, double price, String size) {
        super(name, category);
        this.price = price;
        this.size = size;
    }

    @Override
    public void displayItemDetails() {
        System.out.println("Clothing Item: " + name);
        System.out.println("Category: " + category);
        System.out.println("Price: $" + price);
        System.out.println("Size: " + size);
        System.out.println("Final Price after Discount: $" + getPrice());
    }

    @Override
    public double getPrice() {
        return price - calculateDiscount();
    }

    @Override
    double calculateDiscount() {
        // Example: Flat 20% discount on clothes
        if (price > 500) {
            return price * 0.20;
        } else {
            return price * 0.05;
        }
    }
}

// Main class
public class OnlineMarketplace {
    public static void main(String[] args) {
        Sellable laptop = new ElectronicItem("Dell XPS 15", "Laptop", 112000, 2);
        Sellable tshirt = new ClothingItem("Nike T-Shirt", "Sportswear", 500, "M");

        System.out.println("=== Marketplace Items ===\n");

        laptop.displayItemDetails();
        System.out.println();

        tshirt.displayItemDetails();
    }
}
/*
Output 
=== Marketplace Items ===

Electronic Item: Dell XPS 15
Category: Laptop
Price: $112000.0
Warranty: 2 years
Final Price after Discount: $100800.0

Clothing Item: Nike T-Shirt
Category: Sportswear
Price: $500.0
Size: M
Final Price after Discount: $475.0
 */