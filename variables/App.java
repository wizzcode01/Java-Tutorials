package variables;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome Wisdom to your first java program!");

        // data types in java
        int age = 21;
        double gpa = 4.89;
        double temperature = 30.1;

        char grade = 'A';
        char currency = '$';
        char symbol = '@';

        boolean isStudent = true;
        boolean isOnline = true;
        boolean isExcellent = true;
        boolean forSale = false;

        String name = "Wisdom Dickson";
        String food = "Afang soup";
        String email = "dicksonwisdom005@gmail.com";
        String car = "Benz";
        String color = "Green";

        int year = 2025;
        double price = 2055.09;

        System.out.println("Hello " + name);
        System.out.println("You are " + age + "years old");
        System.out.println("Your gpa is " + gpa);
        System.out.println("Are you an excellent student?  " + isExcellent);

        System.out.println("Your car is a " + color + " " + year + " " + car);
        System.out.println("The price is: " + currency + price);

        if (forSale) {
            System.out.println("The " + car + " " + "is for sale.");
        } else {
            System.out.println("The " + car + " " + "is not for sale.");
        }
    }
}
