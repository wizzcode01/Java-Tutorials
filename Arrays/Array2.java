package Arrays;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8 };
        String[] fruits = { "apple", "orange", "banana" };
        String target;
        boolean isFound = false;

        System.out.print("Enter a fruit to search for: ");
        target = scanner.nextLine().toLowerCase();

        for (int i = 0; i < fruits.length; i++) {
            if (target.equals(fruits[i])) {
                System.out.println("Element found at index: " + i);
                isFound = true;
                break;
            }
        }

        if (!isFound) {
            System.out.println("Element not found in the array");
        }

        scanner.close();
    }
}
