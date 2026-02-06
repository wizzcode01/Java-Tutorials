package MyToDoApp;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("-----WELCOME TO WISDOM TIME SECHUDLE PROGRAM-----");

        String[] tasks = null;
        int[] time;
        int size;

        System.out.print("How many schedule do you have to do: ");
        size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.print("What task do you have today: ");
            tasks[i] = scanner.nextLine();
            scanner.nextLine();
            System.out.print("Allocate time for it: ");
            time[i] = scanner.nextInt();
        }

        System.out.println("\nYou have " + tasks);
        System.out.printf("Total time to accomplish your schedule is: " + time + "hours");

        scanner.close();
    }

}
