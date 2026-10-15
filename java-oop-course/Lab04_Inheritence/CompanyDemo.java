package Lab04_Inheritence;

public class CompanyDemo {
    
    public static void main(String[] args) {
        Employee e = new Employee("Kudzai", 2000);
        System.out.println();
        
        Manager m = new Manager("Nyasha", 3500, 800);
        System.out.println("----");

        e.describe();
        m.describe(); // The describe() method is cleanly inherited by the manager!
    }
}


