class Vehicle {
    Vehicle(String type) {
        System.out.println("Vehicle type: " + type);
    }
}

class Car extends Vehicle {
    Car(String type) {
        super(type);  // Calls superclass constructor
        System.out.println("Car constructor called");
    }
}

public class TestSuper {
    public static void main(String[] args) {
        Car c = new Car("Sedan");
    }
}
