public class Geometry {
    // a) double calculateArea(double radius) - Area of a circle
    public double calculateArea(double radius) {
        System.out.println("Calculating area of a circle with radius: " + radius);
        return Math.PI * radius * radius;
    }

    // b) double calculateArea(double length, double width) - Area of a rectangle
    public double calculateArea(double length, double width) {
        System.out.println("Calculating area of a rectangle with length: " + length + " and width: " + width);
        return length * width;
    }

    // c) double calculateArea(double base, double height, boolean type) - Area of a triangle
    // The 'type' parameter is just to differentiate the method signature from a rectangle,
    // though in a real-world scenario, you might have separate classes for shapes.
    public double calculateArea(double base, double height, boolean type) {
        System.out.println("Calculating area of a triangle with base: " + base + " and height: " + height);
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Geometry geo = new Geometry();

        // Calculate area of a circle
        System.out.println("Area of Circle (radius 7.0): " + geo.calculateArea(7.0));

        // Calculate area of a rectangle
        System.out.println("Area of Rectangle (length 5.0, width 8.0): " + geo.calculateArea(5.0, 8.0));

        // Calculate area of a triangle (the 'true' boolean is just for signature differentiation)
        System.out.println("Area of Triangle (base 10.0, height 4.0): " + geo.calculateArea(10.0, 4.0, true));
    }
}