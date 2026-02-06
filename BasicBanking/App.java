package BasicBanking;

import java.util.Scanner;

public class App {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        double balance = 0;
        double Deposit;
        double Withdraw;
        boolean isRunning = true;

        while (isRunning) {
            System.out.println("****************");
            System.out.println("WISDOM BANKING PROGRAM");
            System.out.println("*****************");

            System.out.println("1. Show Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.println("\n*****************");

            System.out.print("Enter your choice (1-4): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showBalance(balance);
                case 2 -> balance += Deposit();
                case 3 -> balance -= Withdraw(balance);
                case 4 -> isRunning = false;
                default ->
                    System.out.println("Invalid choice input");

            }

        }

        scanner.close();

    }

    static void showBalance(double balance) {
        System.out.printf("$%.2f\nTotal Balance: ", balance);
        // return balance;
    }

    static double Deposit() {

        double amount;

        System.out.print("Enter amount to deposit: ");
        amount = scanner.nextDouble();

        if (amount < 0) {
            System.out.println("You can't enter an amount less than zero");
            return 0;
        } else {
            System.out.println("You have deposited: " + amount);
            return amount;
        }

    }

    static double Withdraw(double balance) {

        double amount;
        System.out.print("Enter amount to withdraw: ");
        amount = scanner.nextDouble();

        if (amount > balance) {
            System.out.println("Insufficent balance");
            return 0;
        } else if (amount < 0) {
            System.out.println("You can't enter an amount less than zero");
            return 0;
        } else {
            System.out.println("You have successfully withdraw: " + amount);
            return amount;
        }

    }

    static void Exit(boolean balance) {

    }
}
