package WeightConversionProgram;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("----WELCOME TO WEIGHT CONVERSION PROGRAM-----");

        System.out.println("1. Enter one to convert lbs to kgs: ");
        System.out.println("2. Enter two to convert kgs to lbs: ");

        System.out.print("Choose an option: ");
        choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter the weight in lbs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 0.453592;
            System.out.print("your weight in kgs is: " + newWeight);

        } else if (choice == 2) {
            System.out.println("Enter the weight in kgs: ");
            weight = scanner.nextDouble();
            newWeight = weight * 2.20462;
            System.out.println("your weight in lgs is: " + newWeight);

        }

        else {
            System.out.println("Invalid choice input.");
        }

        scanner.close();

    }

}
