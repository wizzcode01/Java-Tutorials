package EnhanceSwitch;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String day;

        System.out.print("Enter day of the week: ");
        day = scanner.nextLine().toLowerCase();

        switch (day) {
            case "monday", "tuesday", "wednesday", "thursday", "friday" -> System.out.println("It is a weekday");

            case "saturday", "sunday" -> System.out.println("It is a weekend");

            default -> System.out.println(day + " is not a day");
        }

        scanner.close();

    }

}
