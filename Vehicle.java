//4. Design a class hierarchy for different types of vehicles. Create a base class 'Vehicle' with methods 'startEngine()' and 'stopEngine()'. Derive two classes 'Car' and 'Motorcycle' from 'Vehicle'. Add methods 'drive()' in 'Car' and 'ride()' in 'Motorcycle'. Write a Java program to demonstrate hierarchical inheritance and invoke the relevant methods for a car and a motorcycle object.
class Vehicle {
    void startEngine() {
        System.out.println("Engine started.");
    }

    void stopEngine() {
        System.out.println("Engine stopped.");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car is driving.");
    }
}

class Motorcycle extends Vehicle {
    void ride() {
        System.out.println("Motorcycle is riding.");
    }
}
class TestVehicle {
    public static void main(String[] args) {
        Car car = new Car();
        car.startEngine();
        car.drive();
        car.stopEngine();

        System.out.println();

        Motorcycle bike = new Motorcycle();
        bike.startEngine();
        bike.ride();
        bike.stopEngine();
    }
}


