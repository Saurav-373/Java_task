// MenuItem.java (Abstract Base Class)
abstract class MenuItem {
    protected String name;
    protected double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public abstract void prepare();
    public abstract void serve();
}

// Appetizer.java
class Appetizer extends MenuItem {
    public Appetizer(String name, double price) {
        super(name, price);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing appetizer: " + name + " (Light and quick)");
    }

    @Override
    public void serve() {
        System.out.println("Serving appetizer: " + name + " with a small garnish.");
    }
}

// MainCourse.java
class MainCourse extends MenuItem {
    public MainCourse(String name, double price) {
        super(name, price);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing main course: " + name + " (Requires more cooking time)");
    }

    @Override
    public void serve() {
        System.out.println("Serving main course: " + name + " as the centerpiece.");
    }
}

// Beverage.java
class Beverage extends MenuItem {
    public Beverage(String name, double price) {
        super(name, price);
    }

    @Override
    public void prepare() {
        System.out.println("Preparing beverage: " + name + " (Just pour and chill)");
    }

    @Override
    public void serve() {
        System.out.println("Serving beverage: " + name + " with ice.");
    }
}

// RestaurantOrderingSystem.java (Main Class)
public class task4 {
    public static void main(String[] args) {
        MenuItem springRolls = new Appetizer("Spring Rolls", 8.99);
        MenuItem chickenCurry = new MainCourse("Chicken Curry", 15.50);
        MenuItem cocaCola = new Beverage("Coca-Cola", 2.00);

        System.out.println("--- Order 1 ---");
        springRolls.prepare();
        springRolls.serve();

        System.out.println("\n--- Order 2 ---");
        chickenCurry.prepare();
        chickenCurry.serve();

        System.out.println("\n--- Order 3 ---");
        cocaCola.prepare();
        cocaCola.serve();
    }
}