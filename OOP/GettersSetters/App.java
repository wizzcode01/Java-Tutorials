package OOP.GettersSetters;

import java.util.Scanner;;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Car car = new Car("Charger", "White", 10000);

        // car.model = "Corvette";
        System.out.print("Enter the new price: ");
        int price = scanner.nextInt();

        car.setColor("Yellow");
        car.setPrice(price);

        System.out.println(car.getColor() + " " + car.getModel() + " " + car.getPrice());

        scanner.close();
    }
}
