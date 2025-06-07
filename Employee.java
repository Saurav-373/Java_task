//2. Write a Java program to create a class called Employee with methods called work() and getSalary(). Create a subclass called HRManager that overrides the work() method.
class Employee {
    void work() {
        System.out.println("Employee is working.");
    }

    double getSalary() {
        return 50000.0;
    }
}

class HRManager extends Employee {
    void work() {
        System.out.println("HR Manager is managing employee relations.");
    }

    public static void main(String[] args) {
        HRManager hr = new HRManager();
        hr.work();
        System.out.println("Salary: " + hr.getSalary());
    }
}

