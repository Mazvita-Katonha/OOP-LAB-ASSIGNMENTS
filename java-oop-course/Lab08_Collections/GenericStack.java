package Lab08_Collections;



import java.util.ArrayList;

// A custom Last-In-First-Out (LIFO) stack collection structure
public class GenericStack<T> {
    private final ArrayList<T> elements = new ArrayList<>();

    // Push an item onto the top of the stack
    public void push(T item) {
        elements.add(item);
    }

    // Remove and return the top item from the stack
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack Underflow: Cannot pop from an empty stack.");
        }
        return elements.remove(elements.size() - 1);
    }

    // Inspect the top item without removing it
    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty.");
        }
        return elements.get(elements.size() - 1);
    }

    public boolean isEmpty() {
        return elements.isEmpty();
    }

    public int size() {
        return elements.size();
    }

    @Override
    public String toString() {
        return elements.toString();
    }
}


