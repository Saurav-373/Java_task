public class task6 {
    // a) int add(int a, int b)
    public int add(int a, int b) {
        System.out.println("Calling int add(int, int)");
        return a + b;
    }

    // b) double add(double a, double b)
    public double add(double a, double b) {
        System.out.println("Calling double add(double, double)");
        return a + b;
    }

    // c) int add(int a, int b, int c)
    public int add(int a, int b, int c) {
        System.out.println("Calling int add(int, int, int)");
        return a + b + c;
    }

    public static void main(String[] args) {
        task6 calc = new task6();

        // Calling different overloaded methods
        System.out.println("Result of 5 + 3: " + calc.add(5, 3));
        System.out.println("Result of 10.5 + 2.3: " + calc.add(10.5, 2.3));
        System.out.println("Result of 1 + 2 + 3: " + calc.add(1, 2, 3));
    }
}