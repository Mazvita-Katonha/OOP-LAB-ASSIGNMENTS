package Lab04_Inheritence.Lab05_Polymorphism.Lab06_Abstraction;

public class InterfaceDemo {
    
// The interface acts as a contract of capabilities
interface Flyable {
    // Methods in an interface are implicitly public and abstract
    void fly(); 
}

// Concrete Class 1: Living organism
class Bird implements Flyable {
    private String species;

    public Bird(String species) {
        this.species = species;
    }

    @Override
    public void fly() {
        System.out.println("The " + species + " flaps its wings and soars through the sky.");
    }
}

// Concrete Class 2: Mechanical vehicle
class Aeroplane implements Flyable {
    private String model;

    public Aeroplane(String model) {
        this.model = model;
    }

    @Override
    public void fly() {
        System.out.println("The " + model + " ignites its jet engines and takes off from the runway.");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        System.out.println("--- Lab 6 Basic: Interfaces ---");

        // Programming to the interface: holding unrelated objects in a Flyable array
        Flyable[] flyingObjects = {
            new Bird("Eagle"),
            new Aeroplane("Boeing 737")
        };

        // Calling the shared capability polymorphically
        for (Flyable f : flyingObjects) {
            f.fly();
        }
    }
}

}
