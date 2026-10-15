package Lab07_Exceptions;



// Extending Exception makes this a CHECKED exception
public class InsufficientFundsException extends Exception {
    private final double shortfall;

    // Constructor to pass a meaningful error message down to the parent class
    public InsufficientFundsException(String message, double shortfall) {
        super(message);
        this.shortfall = shortfall;
    }

    public double getShortfall() {
        return shortfall;
    }
}
 

