package Lab04_Inheritence.Lab05_Polymorphism.Lab06_Abstraction;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Implementing Comparable defines the default, "natural" sorting behavior
class Student implements Comparable<Student> {
    private final String name;
    private final int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String getName() { return name; }
    public int getMarks() { return marks; }

    // Natural order: Sort alphabetically by name
    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return name + " (" + marks + " marks)";
    }
}

public class StudentSortingDemo {
    public static void main(String[] args) {
        System.out.println("--- Lab 6 Intermediate: Comparable & Comparator ---");

        List<Student> classroom = new ArrayList<>();
        classroom.add(new Student("Tinashe", 85));
        classroom.add(new Student("Anesu", 92));
        classroom.add(new Student("Farai", 78));
        classroom.add(new Student("Chipo", 95));

        System.out.println("Original List: " + classroom);

        // 1. Sorting using Comparable contract (Alphabetical by Name)
        Collections.sort(classroom);
        System.out.println("\nSorted Alphabetically (Comparable): " + classroom);

        // 2. Sorting using an external Comparator (Descending by Marks)
        // We use an anonymous class approach to implement the single method contract
        classroom.sort(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                // Highest marks first (descending order)
                return Integer.compare(s2.getMarks(), s1.getMarks());
            }
        });
        System.out.println("\nSorted by Marks Descending (Comparator): " + classroom);
    }
}


