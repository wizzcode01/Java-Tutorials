package Composition;

public class App {
    public static void main(String[] args) {
        // Composition it represent a part of relationship between objects. e.g an
        // engine is part of a car
        Car car = new Car("Prado", 2025, "v8");

        System.out.println(car.model);
        System.out.println(car.year);
        System.out.println(car.engine.type);

        car.start();
    }

}
