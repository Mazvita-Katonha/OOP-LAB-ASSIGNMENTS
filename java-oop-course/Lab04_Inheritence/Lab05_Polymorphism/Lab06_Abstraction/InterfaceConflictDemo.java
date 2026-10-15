package Lab04_Inheritence.Lab05_Polymorphism.Lab06_Abstraction;



// Interface 1 with a default method body
interface InterfaceA {
    default void hello() {
        System.out.println("Hello from Interface A!");
    }
}

// Interface 2 with the exact same signature
interface InterfaceB {
    default void hello() {
        System.out.println("Hello from Interface B!");
    }
}

// This class implements both interfaces, creating an inheritance conflict
class GreetingResolver implements InterfaceA, InterfaceB {

    // If you don't override this method, the compiler throws an error!
    @Override
    public void hello() {
        // Explicitly choosing to run Interface A's version
        InterfaceA.super.hello();
        
        // You could also add custom logic or run Interface B's version:
        // InterfaceB.super.hello();
        System.out.println("Conflict resolved successfully inside the implementing class.");
    }
}

public class InterfaceConflictDemo {
    public static void main(String[] args) {
        System.out.println("--- Lab 6 Challenge: Multiple Interface Conflict ---");

        GreetingResolver resolver = new GreetingResolver();
        resolver.hello();
    }
}


