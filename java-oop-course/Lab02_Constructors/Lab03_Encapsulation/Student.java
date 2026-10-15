package Lab02_Constructors.Lab03_Encapsulation;

public class Student {
    
    // Private fields protecting the state of the object
    private String name;
    private int marks;

    // Constructor with built-in validation rules
    public Student(String name, int marks) {
        this.name = name;
        setMarks(marks); // Reuses the setter's validation rules
    }

    // Getter for Name
    public String getName() {
        return name;
    }

    // Setter for Name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for Marks
    public int getMarks() {
        return marks;
    }

    // Setter with validation: Rejects invalid marks (Lab 3 Basic Exercise 1)
    public void setMarks(int marks) {
        if (marks < 0 || marks > 100) {
            throw new IllegalArgumentException("Marks must be between 0 and 100.");
        }
        this.marks = marks;
    }

    // Dynamic grading logic without keeping an extra field (Lab 3 Basic Exercise 2)
    public char getGrade() {
        if (marks >= 75) {
            return 'A';
        } else if (marks >= 60) {
            return 'B';
        } else if (marks >= 50) {
            return 'C';
        } else {
            return 'F';
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Lab 3 Student Encapsulation Assignment ---");

        // Creating valid student profiles
        Student s1 = new Student("Chipo", 82);
        Student s2 = new Student("Farai", 55);

        System.out.println(s1.getName() + " Marks: " + s1.getMarks() + ", Grade: " + s1.getGrade());
        System.out.println(s2.getName() + " Marks: " + s2.getMarks() + ", Grade: " + s2.getGrade());
        System.out.println();

        // Testing the Encapsulation Validation Engine
        try {
            System.out.println("Attempting to assign invalid marks (-15)...");
            s2.setMarks(-15); // This should fail!
        } catch (IllegalArgumentException e) {
            System.out.println("Security Blocked: " + e.getMessage());
        }

        try {
            System.out.println("Attempting to create student with invalid marks (105)...");
            Student s3 = new Student("Invalid Student", 105); // This should fail!
        } catch (IllegalArgumentException e) {
            System.out.println("Security Blocked: " + e.getMessage());
        }
    }
}


