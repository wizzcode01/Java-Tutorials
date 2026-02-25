package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // ArrayList<Integer> list = new ArrayList<>();

        // list.add(3);
        // list.add(2);
        // list.add(1);

        // list.remove(0);
        // list.set(1, 7);

        // add is a built in method to add for arraylists
        // remove is the built in method to remove arraylist
        // set
        // get

        // System.out.println(list.size());

        // Collections.sort(list);

        // System.out.println(list);

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> foods = new ArrayList<>();
        System.out.print("Enter num to food you would like: ");
        int numOfFood = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= numOfFood; i++) {
            System.out.print("Enter food number " + i + ": ");
            String food = scanner.nextLine();
            foods.add(food);
        }

        System.out.println(foods);

        scanner.close();

    }
}
