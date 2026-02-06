package RockGame;

import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // ROCK, PAPER, SCISSORS
        // GET CHOICE FROM THE USER
        // GET RANDOM CHOICE FOR THE COMPUTER
        // CHECK WIN CONDITIONS
        // ASK TO PLAY AGAIN?
        // GOODBYE MESSAGE

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String computerChoice;
        String playerChoice;
        String playAgain = "yes";
        // = new String[];
        String[] choice = { "rock", "paper", "scissors" };
        do {
            System.out.print("Enter your move(rock, paper, scissors): ");
            playerChoice = scanner.nextLine().toLowerCase();

            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("Invalid player choice input");
                continue;
            }

            computerChoice = choice[random.nextInt(3)];

            System.out.println("Computer choice: " + computerChoice);

            // check for win answer
            if (playerChoice.equals(computerChoice)) {
                System.out.println("It's a tie!");
            } else if (playerChoice.equals("rock") && computerChoice.equals("scissors")) {
                System.out.println("You Win!");
            } else if (playerChoice.equals("paper") && computerChoice.equals("rock")) {
                System.out.println("You Win!");
            } else if (playerChoice.equals("scissors") && computerChoice.equals("paper")) {
                System.out.println("You Win!");
            } else {
                System.out.println("You Loose!, Computer Wins!");
            }

            System.out.println("continue playing?(yes/no): ");
            playAgain = scanner.nextLine().toLowerCase();

        } while (playAgain.equals("yes"));

        System.out.println("Thanks for playing");

        scanner.close();
    }
}
