/*
 5. Polymorphism – Method Overriding
Create a class Account with method calculateInterest(). Subclasses
SavingAccount and CurrentAccount override the method. Write a program to
calculate interest for both using runtime polymorphism.

 */
 // Parent class
class Account {
    double balance;

    Account(double balance) {
        this.balance = balance;
    }

    // Method to be overridden
    double calculateInterest() {
        return 0; // Default (no interest)
    }
}

// Subclass 1: SavingAccount
class SavingAccount extends Account {
    SavingAccount(double balance) {
        super(balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.04; // 4% interest
    }
}

// Subclass 2: CurrentAccount
class CurrentAccount extends Account {
    CurrentAccount(double balance) {
        super(balance);
    }

    @Override
    double calculateInterest() {
        return balance * 0.02; // 2% interest
    }
}
public class DemoInterest {
    public static void main(String[] args) {
        // Polymorphism: Account reference
        Account acc1 = new SavingAccount(10000);
        Account acc2 = new CurrentAccount(10000);

        System.out.println("Saving Account Interest: " + acc1.calculateInterest());
        System.out.println("Current Account Interest: " + acc2.calculateInterest());
    }
}

/*
Output:-
Saving Account Interest: 400.0
Current Account Interest: 200.0 
 */
