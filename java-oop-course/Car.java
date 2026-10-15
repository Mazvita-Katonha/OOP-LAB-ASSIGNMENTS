public class Car {

    // Fields (State)
    String brand;
    int year;
    double mileage;

    // Method to display car details
    void display() {
        System.out.println("Brand: " + brand + ", Year: " + year + ", Mileage: " + mileage + " km");
    }

    // Method to check if the car is older than 25 years (Lab 1 Basic Exercise 2)
    boolean isAntique() {
        int currentYear = 2026; 
        return (currentYear - year) > 25;
    }

    public static void main(String[] args) {
        // Creating 3 distinct car objects
        Car car1 = new Car();
        car1.brand = "Toyota";
        car1.year = 1998;
        car1.mileage = 250000;

        Car car2 = new Car();
        car2.brand = "Mazda";
        car2.year = 2015;
        car2.mileage = 85000;

        Car car3 = new Car();
        car3.brand = "Mercedes-Benz";
        car3.year = 1985;
        car3.mileage = 310000;

        // Displaying outputs and checking antique status
        System.out.println("--- Lab 1 Car Assignment ---");
        car1.display();
        System.out.println("Is antique? " + car1.isAntique());
        System.out.println();

        car2.display();
        System.out.println("Is antique? " + car2.isAntique());
        System.out.println();

        car3.display();
        System.out.println("Is antique? " + car3.isAntique());
    }
}


