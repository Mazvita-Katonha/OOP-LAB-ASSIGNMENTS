package Lab07_Exceptions;

public class BankExceptionDem {
   

class BankAccount {
    private final String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    // The 'throws' clause warns callers they must catch this exception
    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount > balance) {
            double shortfall = amount - balance;
            // The 'throw' keyword generates and kicks out the error object
            throw new InsufficientFundsException(
                "Transaction Denied: Insufficient funds in account " + accountNumber, 
                shortfall
            );
        }
        balance -= amount;
        System.out.printf("Successfully withdrew $%.2f. Remaining balance: $%.2f%n", amount, balance);
    }

    public double getBalance() {
        return balance;
    }
}

public class BankExceptionDemo {
    public static void main(String[] args) {
        System.out.println("--- Lab 7 Intermediate: Custom Exceptions ---");

        BankAccount account = new BankAccount("ZIM-7744", 250.00);

        // Attempt 1: Safe withdrawal within limits
        try {
            System.out.println("Attempting to withdraw $150.00...");
            account.withdraw(150.00);
            
            // Attempt 2: Overdraft trigger
            System.out.println("\nAttempting to withdraw $200.00...");
            account.withdraw(200.00); // This will fail!
            
        } catch (InsufficientFundsException e) {
            // Gracefully handling the problem instead of letting the app crash
            System.out.println("Alert: " + e.getMessage());
            System.out.printf("Reason: You are short by exactly $%.2f%n", e.getShortfall());
        }

        System.out.println("\nExecution continues smoothly after handling the error.");
    }
}

}
