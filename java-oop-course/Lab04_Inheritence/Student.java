package Lab04_Inheritence;


    public class Student extends Person { // Inherits from Person
    private String course;

    // Constructor calls the parent constructor using super()
    public Student(String name, int age, String course) {
        super(name, age); // Passes name and age up to the Person constructor
        this.course = course;
    }

    // Overriding the display method to include the specific course detail
    @Override
    public void display() {
        super.display(); // Runs the parent's print statement first
        System.out.println("Course: " + course);
    }
}


