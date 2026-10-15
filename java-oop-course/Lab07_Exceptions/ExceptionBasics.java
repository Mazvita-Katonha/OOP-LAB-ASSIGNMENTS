package Lab07_Exceptions;



import java.util.Scanner;

public class ExceptionBasics {

    // A simple method that will throw an ArithmeticException if b is zero
    public static int divide(int a, int b) {
        return a / b; 
    }

    public static void main(String[] args) {
        System.out.println("--- Lab 7 Basic: Try/Catch/Finally ---");
        Scanner scanner = new Scanner(System.in);

        // ---- PART 1: Handling Division by Zero & Non-Numeric Input ----
        try {
            System.out.print("Enter first integer (numerator): ");
            int num = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter second integer (denominator): ");
            int den = Integer.parseInt(scanner.nextLine());

            int result = divide(num, den);
            System.out.println("Result of division: " + result);

        } catch (NumberFormatException e) {
            System.out.println("Error: Please input valid numeric whole integers only!");
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide an integer by zero math bounds!");
        } finally {
            // The finally block is guaranteed to run no matter what happens inside try/catch
            System.out.println("Cleanup Action: Closing scanner resources.");
            scanner.close();
        }

        // ---- PART 2: Specific Array Index Bounds Handling ----
        System.out.println("\n--- Part 2: Array Safety Demo ---");
        int[] shortArray = {10, 20, 30};

        try {
            System.out.println("Accessing index 5: " + shortArray[5]); // Out of bounds!
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught Error: " + e.getMessage());
        }
    }
}


