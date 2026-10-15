package Lab04_Inheritence;

public class Person {
    
    protected String name;
    protected int age;

    // Constructor for the parent class
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display basic details shared by all people
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}


