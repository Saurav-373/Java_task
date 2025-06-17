// Vehicle.java (Abstract Base Class)
abstract class Vehicle {
    protected String make;
    protected String model;
    protected int dailyRate;

    public Vehicle(String make, String model, int dailyRate) {
        this.make = make;
        this.model = model;
        this.dailyRate = dailyRate;
    }

    public abstract double calculateRentalCost(int days);
}

// Car.java
class Car extends Vehicle {
    private boolean hasAC;

    public Car(String make, String model, int dailyRate, boolean hasAC) {
        super(make, model, dailyRate);
        this.hasAC = hasAC;
    }

    @Override
    public double calculateRentalCost(int days) {
        double cost = dailyRate * days;
        if (hasAC) {
            cost += days * 10; // Additional cost for AC
        }
        return cost;
    }
}

// Motorcycle.java
class Motorcycle extends Vehicle {
    private boolean hasHelmet;

    public Motorcycle(String make, String model, int dailyRate, boolean hasHelmet) {
        super(make, model, dailyRate);
        this.hasHelmet = hasHelmet;
    }

    @Override
    public double calculateRentalCost(int days) {
        double cost = dailyRate * days;
        if (hasHelmet) {
            cost += days * 5; // Additional cost for helmet
        }
        return cost;
    }
}

// Bicycle.java
class Bicycle extends Vehicle {
    int gears;

    public Bicycle(String make, String model, int dailyRate, int gears) {
        super(make, model, dailyRate);
        this.gears = gears;
    }

    @Override
    public double calculateRentalCost(int days) {
        // Bicycles might have a simpler rental rule
        return dailyRate * days;
    }
}

// CarRentalSystem.java (Main Class)
public class task3 {
    public static void main(String[] args) {
        Vehicle car = new Car("Toyota", "Camry", 50, true);
        Vehicle motorcycle = new Motorcycle("Honda", "CBR500R", 30, true);
        Vehicle bicycle = new Bicycle("Trek", "FX 2", 10, 21);

        int rentalDays = 5;

        System.out.println("Rental Cost for " + car.make + " " + car.model + " for " + rentalDays + " days: $" + car.calculateRentalCost(rentalDays));
        System.out.println("Rental Cost for " + motorcycle.make + " " + motorcycle.model + " for " + rentalDays + " days: $" + motorcycle.calculateRentalCost(rentalDays));
        System.out.println("Rental Cost for " + bicycle.make + " " + bicycle.model + " for " + rentalDays + " days: $" + bicycle.calculateRentalCost(rentalDays));
    }
}