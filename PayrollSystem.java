// Employee.java (Base Class)
class Employee {
    protected String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        System.out.println("Calculating base salary for " + name);
        return baseSalary;
    }
}

// Manager.java (Derived Class)
class Manager extends Employee {
    private double bonusPercentage;

    public Manager(String name, double baseSalary, double bonusPercentage) {
        super(name, baseSalary);
        this.bonusPercentage = bonusPercentage;
    }

    @Override
    public double calculateSalary() {
        System.out.println("Calculating manager salary with bonus for " + name);
        double managerSalary = super.calculateSalary(); // Get base salary from Employee
        double bonus = managerSalary * (bonusPercentage / 100);
        return managerSalary + bonus;
    }
}

// PayrollSystem.java (Main Class)
public class PayrollSystem {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 50000);
        Manager mgr = new Manager("Bob", 70000, 10); // 10% bonus

        System.out.println("Employee Salary: $" + emp.calculateSalary());
        System.out.println("Manager Salary: $" + mgr.calculateSalary());

        // Demonstrating polymorphism with overriding
        Employee polyEmp = new Manager("Charlie", 60000, 15);
        System.out.println("Polymorphic Manager Salary: $" + polyEmp.calculateSalary());
    }
}