//5. Implement a class hierarchy for various shapes. Create a base class 'Shape' with a method 'calculateArea()'. Derive two classes 'Rectangle' and 'Circle' from 'Shape'. Add additional methods 'calculatePerimeter()' in 'Rectangle' and 'calculateCircumference()' in 'Circle'. Write a Java program to demonstrate hierarchical inheritance and compute the area and perimeter/circumference for a rectangle and a circle object.
class Shape {
    double calculateArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    double length = 10, width = 5;

    @Override
    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return 2 * (length + width);
    }
}

class Circle extends Shape {
    double radius = 7;

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        System.out.println("Rectangle Area: " + rect.calculateArea());
        System.out.println("Rectangle Perimeter: " + rect.calculatePerimeter());

        Circle circ = new Circle();
        System.out.println("Circle Area: " + circ.calculateArea());
        System.out.println("Circle Circumference: " + circ.calculateCircumference());
    }
}

