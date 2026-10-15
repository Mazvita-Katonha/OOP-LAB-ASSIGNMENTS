package Lab04_Inheritence.Lab05_Polymorphism;

public class HidingDemo {
    

class Parent {
    // Parent field
    String data = "Parent Field Data";
    
    // Parent method
    void show() {
        System.out.println("Executing: Parent Method");
    }
}

class Child extends Parent {
    // This HIDES the parent field instead of overriding it
    String data = "Child Field Data"; 
    
    // This OVERRIDES the parent method
    @Override
    void show() {
        System.out.println("Executing: Child Method"); 
    }
}

public class HidingDemo {
    public static void main(String[] args) {
        System.out.println("--- Lab 5 Field Hiding vs Method Overriding ---");

        // Upcasting: Parent reference pointing to a Child object
        Parent reference = new Child(); 
        
        // 1. Fields follow the DECLARED reference variable type (Parent)
        System.out.println("Accessed Field: " + reference.data); 
        
        // 2. Methods follow the ACTUAL runtime object type on the heap (Child)
        reference.show(); 
    }
}

}
