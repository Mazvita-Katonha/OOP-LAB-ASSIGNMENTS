package Lab04_Inheritence;

public class InheritanceExercise {
    
    public static void main(String[] args) {
        System.out.println("--- Lab 4 Basic Inheritance Assignment ---");
        
        // Creating a generic Person object
        Person individual = new Person("Ruvimbo", 45);
        
        // Creating a Student object
        Student learner = new Student("Tinashe", 21, "Computer Science");

        // Displaying details using the polymorphic logic
        System.out.println("[Displaying Person Class Data]");
        individual.display();
        System.out.println();

        System.out.println("[Displaying Student Subclass Data]");
        learner.display();
    }
}


