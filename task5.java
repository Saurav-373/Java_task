// ManipulableShape.java (Interface)
interface ManipulableShape {
    void resize(double factor);
    void rotate(double angle);
    void display(); // Added for demonstration
}

// Circle.java
class Circle implements ManipulableShape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double factor) {
        this.radius *= factor;
        System.out.println("Circle resized. New radius: " + radius);
    }

    @Override
    public void rotate(double angle) {
        System.out.println("Circle rotated by " + angle + " degrees (Rotation doesn't visually change a circle).");
    }

    @Override
    public void display() {
        System.out.println("Circle with radius: " + radius);
    }
}

// Square.java
class Square implements ManipulableShape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void resize(double factor) {
        this.side *= factor;
        System.out.println("Square resized. New side length: " + side);
    }

    @Override
    public void rotate(double angle) {
        System.out.println("Square rotated by " + angle + " degrees.");
    }

    @Override
    public void display() {
        System.out.println("Square with side length: " + side);
    }
}

// Triangle.java
class Triangle implements ManipulableShape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void resize(double factor) {
        this.base *= factor;
        this.height *= factor;
        System.out.println("Triangle resized. New base: " + base + ", New height: " + height);
    }

    @Override
    public void rotate(double angle) {
        System.out.println("Triangle rotated by " + angle + " degrees.");
    }

    @Override
    public void display() {
        System.out.println("Triangle with base: " + base + ", height: " + height);
    }
}

// ShapeManipulationApp.java (Main Class)
public class task5 {
    public static void main(String[] args) {
        ManipulableShape circle = new Circle(10.0);
        ManipulableShape square = new Square(5.0);
        ManipulableShape triangle = new Triangle(8.0, 6.0);

        System.out.println("--- Original Shapes ---");
        circle.display();
        square.display();
        triangle.display();

        System.out.println("\n--- Resizing Shapes ---");
        circle.resize(1.5);
        square.resize(2.0);
        triangle.resize(0.5);

        System.out.println("\n--- Rotated Shapes ---");
        circle.rotate(45);
        square.rotate(90);
        triangle.rotate(30);

        System.out.println("\n--- After Manipulation ---");
        circle.display();
        square.display();
        triangle.display();
    }
}