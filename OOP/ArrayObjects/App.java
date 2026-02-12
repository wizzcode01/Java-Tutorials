package OOP.ArrayObjects;

public class App {
    public static void main(String[] args) {
        Car car1 = new Car("Prado", "Black");
        Car car2 = new Car("Benz", "Red");
        Car car3 = new Car("Ford", "Black");

        Car[] cars = { car1, car2, car3 };

        for (int i = 0; i < cars.length; i++) {
            cars[i].drive();
        }
    }
}
