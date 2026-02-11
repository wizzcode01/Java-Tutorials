package JavaSlots;

import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // A game you have balance, and you play with that balance any time you play,
        // the balance is reduced , if you win more money if you loose you go.

        double balance = 100;
        String playAgain;
        int bet;
        String row[];
        int payout;

        System.out.println("************************");
        System.out.println("Welcome to Java slots");
        System.out.println("Symbols: * & % $ # ");
        System.out.println("************************");
        while (balance > 0) {
            System.out.println("Current balance is: " + balance);
            System.out.print("Place a bet to play: ");
            bet = scanner.nextInt();
            scanner.nextLine();
            if (bet > balance || bet < 0) {
                System.out.println("INSUFFFICIENT BALANCE");
            } else {
                balance -= bet;
            }

            System.out.println("Spinning...");
            row = spinRow();
            printRow(row);
            payout = displayResult(row, bet);
            if (payout > 0) {
                System.out.println("You won $" + payout);
                balance = balance + payout;
            } else {
                System.out.println("Sorry you lost this round");
            }

            System.out.print("Do you want to play again? (Y/N): ");
            playAgain = scanner.nextLine().toUpperCase();

            if (!playAgain.equals("Y")) {
                break;
            }
        }
        System.out.println("GAME OVER! YOUR FINAL BALANCE IS $" + balance);

        scanner.close();
    }

    static String[] spinRow() {
        String[] symbols = { "*", "&", "%", "$", "#" };
        String[] row = new String[3];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            row[i] = symbols[random.nextInt(symbols.length)];
        }

        System.out.println(row[0] + row[1] + row[2]);

        return row;

    }

    static void printRow(String[] row) {
        System.out.println("****************");
        System.out.println(" " + String.join(" | ", row));
        System.out.println("****************");
    }

    static int displayResult(String[] row, int bet) {
        // String[] symbols = { "*", "&", "%", "$", "#" };
        if (row[0].equals(row[1]) && row[1].equals(row[2])) {
            return switch (row[0]) {
                case "*" -> bet * 3;
                case "&" -> bet * 4;
                case "%" -> bet * 5;
                case "$" -> bet * 10;
                case "#" -> bet * 20;
                default -> 0;
            };
        } else if (row[0].equals(row[1])) {
            return switch (row[0]) {
                case "*" -> bet * 2;
                case "&" -> bet * 3;
                case "%" -> bet * 4;
                case "$" -> bet * 5;
                case "#" -> bet * 10;
                default -> 0;
            };
        } else if (row[1].equals(row[2])) {
            return switch (row[1]) {
                case "*" -> bet * 2;
                case "&" -> bet * 3;
                case "%" -> bet * 4;
                case "$" -> bet * 5;
                case "#" -> bet * 10;
                default -> 0;
            };
        }
        return 0;
    }
}
