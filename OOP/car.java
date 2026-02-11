package OOP;

public class car {
    String make = "Ford";
    String model = "Mustang";
    int year = 2025;
    double price = 58000.99;
    boolean isRunning = true;

    void start() {
        isRunning = true;
        System.out.println("You start the engine");
    }

    void drive() {
        System.out.println("You are driving the " + model);
    }

    void brake() {
        System.out.println("You brake the " + model);
    }

    void stop() {
        isRunning = false;
        System.out.println("You stop the engine");
    }
}
