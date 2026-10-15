package Lab04_Inheritence.Lab05_Polymorphism.Lab06_Abstraction;



// Abstract base class managing shared state and contracts
abstract class Account {
    private final String accountNumber;
    protected double balance;

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // Concrete method: shared functionality across all accounts
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.printf("Deposited $%.2f into %s. New balance: $%.2f%n", amount, accountNumber, balance);
        }
    }

    // Abstract method: each specific account type must calculate its own fee structural rules
    public abstract double monthlyFee();

    public String getAccountNumber() { return accountNumber; }
    public double getBalance() { return balance; }
}

// Subclass 1: Savings Account
class SavingsAccount extends Account {
    public SavingsAccount(String accountNumber, double initialBalance) {
        super(accountNumber, initialBalance);
    }

    @Override
    public double monthlyFee() {
        // Savings accounts have zero or very low fees to encourage savings
        return 0.00; 
    }
}

// Subclass 2: Current Account
class CurrentAccount extends Account {
    private final double flatServiceFee;

    public CurrentAccount(String accountNumber, double initialBalance, double flatServiceFee) {
        super(accountNumber, initialBalance);
        this.flatServiceFee = flatServiceFee;
    }

    @Override
    public double monthlyFee() {
        // Current accounts incur standard maintenance service fees
        return flatServiceFee; 
    }
}

public class AccountDemo {
    public static void main(String[] args) {
        System.out.println("--- Lab 6 Intermediate: Account Hierarchy ---");

        // Storing different account objects together using the abstract parent reference type
        Account[] accounts = {
            new SavingsAccount("SAV-9001", 1500.00),
            new CurrentAccount("CUR-4002", 500.00, 12.50)
        };

        // Simulating month-end fee processing
        for (Account acc : accounts) {
            acc.deposit(200.00); // Standard shared action
            double fee = acc.monthlyFee(); // Polymorphic validation check
            System.out.printf("Account %s incurs a Monthly Fee of: $%.2f%n", acc.getAccountNumber(), fee);
            System.out.println("-------------------------------------------");
        }
    }
}

