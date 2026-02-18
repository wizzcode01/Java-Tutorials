package OOP.ArrayObjects;

public class App {
    public static void main(String[] args) {
        Car[] cars = { new Car("Prado", "Black"),
                new Car("Benz", "Red"),
                new Car("Ford", "Black") };

        // for (int i = 0; i < cars.length; i++) {
        // cars[i].drive();
        // }

        // anomynous object

        for (Car car : cars) {
            car.drive();
        }
    }
}
