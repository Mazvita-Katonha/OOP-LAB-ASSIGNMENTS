package Lab04_Inheritence;


    public class Manager extends Employee { // Inherits from Employee
    private double bonus;

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary); // Calls the parent Employee constructor first!
        this.bonus = bonus;
        System.out.println("Manager constructor: " + name);
    }

    @Override // Tells the compiler we are replacing the parent calculation method
    public double calculatePay() {
        return super.calculatePay() + bonus; // Reuses parent logic and adds the bonus
    }
}


