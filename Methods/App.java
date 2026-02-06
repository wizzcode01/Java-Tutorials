package Methods;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;

        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        if (ageCheck(age)) {
            System.out.println("You may sign up");
        } else {
            System.out.println("You must be 18+ to sign up");
        }

        scanner.close();
    }

    // method to verify users age..
    static boolean ageCheck(int age) {

        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

}
