class Vehicle{
    void run(){
        System.out.println("Vehicle is running smoothly");
    }
}

class Bike extends Vehicle{
    void run(){
        System.out.println("Bike is running smoothly");
    }
}

class Car extends Vehicle{
    void run(){
        System.out.println("Car is running smoothly");
    }
}

public class Automobile{
    public static void main(String[] args) {
        Bike bike_obj = new Bike();
        Car car_obj = new Car();

        bike_obj.run();
        car_obj.run();


    }
}