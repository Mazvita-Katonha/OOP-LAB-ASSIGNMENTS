package Lab02_Constructors;

public class Circle {
    
    // static field -> ONE copy shared by ALL instances to count circles
    private static int circleCount = 0;
    
    // instance field -> each individual circle has its own radius
    private double radius;

    // Constructor 1: Takes a specified radius
    public Circle(double radius) {
        this.radius = radius;
        circleCount++; // Increment the global counter whenever a new circle is born
    }

    // Constructor 2: No-argument constructor defaulting the radius to 1.0
    public Circle() {
        this(1.0); // Constructor chaining: calls Constructor 1
    }

    // static getter method to retrieve the count without needing a circle object
    public static int getCircleCount() {
        return circleCount;
    }

    // Method to calculate area
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to display circle details
    public void display() {
        System.out.printf("Circle [Radius: %.2f, Area: %.2f]%n", radius, calculateArea());
    }

    public static void main(String[] args) {
        System.out.println("--- Lab 2 Circle Assignment ---");
        System.out.println("Initial circle count: " + Circle.getCircleCount());
        System.out.println();

        // Creating circles using different constructors
        Circle c1 = new Circle(5.5);
        Circle c2 = new Circle(); // Uses the default 1.0 radius
        Circle c3 = new Circle(3.0);

        // Displaying details
        c1.display();
        c2.display();
        c3.display();
        
        System.out.println();
        System.out.println("Total circles created: " + Circle.getCircleCount());
    }
}


