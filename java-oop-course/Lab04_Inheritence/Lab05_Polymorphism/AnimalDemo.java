package Lab04_Inheritence.Lab05_Polymorphism;

public class AnimalDemo {
    

// 1. Parent class defining the generic behavior
class Animal {
    void sound() {
        System.out.println("Some generic animal sound...");
    }
}

// 2. Subclasses overriding the parent method
class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

class Cow extends Animal {
    @Override
    void sound() {
        System.out.println("Moo");
    }
}

class Duck extends Animal {
    @Override
    void sound() {
        System.out.println("Quack");
    }
}

// 3. The ONLY public class in this file, enclosing the main method
public class AnimalDemo {
    public static void main(String[] args) {
        System.out.println("--- Lab 5: Run-Time Polymorphism ---");

        // Upcasting: Storing different subclass objects inside a superclass array
        Animal[] farm = { new Cat(), new Cow(), new Duck(), new Animal() };

        // Dynamic Method Dispatch: The JVM decides which sound() to call at runtime
        for (Animal a : farm) {
            a.sound(); 
        }
    }
}

}