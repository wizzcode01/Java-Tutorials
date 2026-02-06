package MyToDoApp;

import java.util.Scanner;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("-----WELCOME TO WISDOM TIME SECHUDLE PROGRAM-----");

        System.out.print("How many schedule do you have to do: ");
        int size = scanner.nextInt();

        String[] tasks = new String[size];
        int[] time = new int[size];
        int totalTime = 0;

        scanner.nextLine();

        for (int i = 0; i < size; i++) {
            System.out.print("What task do you have today: ");
            tasks[i] = scanner.nextLine();
            // scanner.nextLine();
            System.out.print("Allocate time for it: ");
            time[i] = scanner.nextInt();
            scanner.nextLine();
        }

        System.out.println("\n======== YOUR SCHEDULE ========");
        for (int i = 0; i < size; i++) {
            System.out.println((i + 1) + ". " + tasks[i] + " -> " + time[i] + "hours");
            totalTime += time[i];
        }

        // System.out.println("\nYou have " + tasks);
        System.out.printf("Total time to accomplish your schedule is: " + totalTime + " hours");

        scanner.close();
    }

}
