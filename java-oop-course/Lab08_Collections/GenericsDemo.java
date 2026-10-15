package Lab08_Collections;


import java.util.List;

// 1. Generic Class: T is a type placeholder chosen by the caller
class Box<T> {
    private T content;

    public Box(T content) {
        this.content = content;
    }

    public T get() {
        return content;
    }

    public void set(T content) {
        this.content = content;
    }
}

public class GenericsDemo {

    // 2. Generic Method: <E> before the return type declares the type parameter
    public static <E> void printList(List<E> items) {
        for (E item : items) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    // 3. Bounded Generic Method: T must implement Comparable so we can use compareTo
    public static <T extends Comparable<T>> T findMax(List<T> items) {
        if (items == null || items.isEmpty()) return null;
        
        T max = items.get(0);
        for (T item : items) {
            if (item.compareTo(max) > 0) {
                max = item; // New maximum found
            }
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.println("--- Lab 8 Basic: Generics ---");

        // Using the generic Box container for different reference types
        Box<String> stringBox = new Box<>("Hello Java Generics");
        Box<Integer> integerBox = new Box<>(42); // Autoboxing: primitive int to Integer wrapper

        System.out.println("String Box Content: " + stringBox.get());
        System.out.println("Integer Box Content: " + integerBox.get());

        System.out.println("\n--- Testing Generic Print Method ---");
        List<String> cities = List.of("Harare", "Bulawayo", "Mutare");
        List<Integer> scores = List.of(85, 92, 78);
        
        printList(cities);
        printList(scores);

        System.out.println("\n--- Testing Bounded Max Finder Method ---");
        System.out.println("Max Score: " + findMax(scores));
        System.out.println("Max City (Alphabetical): " + findMax(cities));
    }
}


