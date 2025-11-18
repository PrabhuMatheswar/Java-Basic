interface Vehicle {
    void start();
    default void stop() {
        System.out.println("Vehicle is stopping");
    }
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car is starting");
    }
}

public class InterfaceExample  {
    public static void main(String[] args) {
        Car car = new Car();
        car.start();
        car.stop();
    }
}