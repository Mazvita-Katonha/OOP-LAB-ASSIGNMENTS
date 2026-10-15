package Lab04_Inheritence.Lab05_Polymorphism;


    

import java.util.Arrays;

public class Printer {

    // Overload 1: Handles integers
    public void print(int value) {
        System.out.println("Printing int: " + value);
    }

    // Overload 2: Handles doubles
    public void print(double value) {
        System.out.println("Printing double: " + value);
    }

    // Overload 3: Handles text strings
    public void print(String value) {
        System.out.println("Printing String: " + value);
    }

    // Overload 4: Handles integer arrays
    public void print(int[] array) {
        System.out.println("Printing int array: " + Arrays.toString(array));
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        
        System.out.println("--- Lab 5: Compile-Time Polymorphism ---");
        
        // The compiler determines which method matches based on your inputs
        printer.print(42);
        printer.print(19.99);
        printer.print("Polymorphism Lab");
        printer.print(new int[]{10, 20, 30});
    }
}


