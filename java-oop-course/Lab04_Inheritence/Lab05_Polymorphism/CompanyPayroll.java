package Lab04_Inheritence.Lab05_Polymorphism;

import Lab04_Inheritence.Employee;
import Lab04_Inheritence.Manager;

public class CompanyPayroll {
    class Employee {
    private final String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculatePay() {
        return baseSalary;
    }

    public String getName() { 
        return name; 
    }
}

// Manager subclass from Lab 4
class Manager extends Employee {
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    @Override
    public double calculatePay() {
        return super.calculatePay() + bonus;
    }
}

// NEW Intern subclass for Lab 5
class Intern extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public Intern(String name, int hoursWorked, double hourlyRate) {
        super(name, 0); // Interns don't use a fixed monthly base salary
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculatePay() {
        return hoursWorked * hourlyRate; // Calculated dynamically
    }
}


    public static void main(String[] args) {
        System.out.println("--- Lab 5 Intermediate Payroll ---");

        // Storing different types of employees together in an Employee array
        Employee[] staff = {
            new Employee("Kudzai", 2000.00),
            new Manager("Nyasha", 3500.00, 800.00),
            new Intern("Chipo", 80, 15.50)
        };

        double totalPayroll = 0;

        // The structure of this loop NEVER changes, even if you add more subclasses later
        for (Employee emp : staff) {
            double pay = emp.calculatePay(); // Polymorphic method call
            System.out.printf("%s earned: $%.2f%n", emp.getName(), pay);
            totalPayroll += pay;
        }

        System.out.printf("Total company payroll budget: $%.2f%n", totalPayroll);
    
    }