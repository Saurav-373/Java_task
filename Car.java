// 1.Write a Java program to create a class called Vehicle with a method called drive(). Create a subclass called Car with method display() method to print details of the Car.
class Vehicle {
    void drive() {
        System.out.println("Vehicle is being driven.");
    }
}

class Car extends Vehicle {
    void display() {
        System.out.println("This is a Car. Model: Toyota, Year: 2023");
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.drive();
        car.display();
    }
}
