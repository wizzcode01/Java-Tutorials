package Arrays;

import java.util.Scanner;
import java.util.Arrays;

public class Array {
    public static void main(String[] args) {

        // String[] fruits = { "apple", "orange", "banana", "coconut" };

        // int numOfFruits = fruits.length;
        // fruits[2] = "strawberry";
        // for (int i = 0; i < fruits.length; i++) {
        // System.out.println(fruits[i]);
        // }
        // Arrays.sort(fruits);
        // Arrays.fill(fruits, "pineple");

        // for (String fruit : fruits) {
        // System.out.println(fruit);
        // }
        Scanner scanner = new Scanner(System.in);

        int size;
        String[] foods;

        System.out.println("What number of food do you want?: ");
        size = scanner.nextInt();
        scanner.nextLine();

        foods = new String[size];
        for (int i = 0; i < foods.length; i++) {
            System.out.print("Enter a food: ");
            foods[i] = scanner.nextLine();
        }

        for (String food : foods) {
            System.out.println(food);
        }
        scanner.close();

    }
}
