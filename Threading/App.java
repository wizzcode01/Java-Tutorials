package Threading;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Threading = Allows a program to run multiple tasks simultaneously
        // helps improve performance with time-consuming operations
        // (file I/O, network communication, or any background tasks)

        // steps to create a tread
        // 1. Extend the thread class (simpler)
        // 2. implement the runnable interface (better)

        Scanner scanner = new Scanner(System.in);

        MyRunnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable);
        thread.start();

        System.out.println("You have 5 seconds to enter your name");

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello " + name);

        scanner.close();
    }
}
