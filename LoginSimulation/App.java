package LoginSimulation;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String username = "wizzycode";
        String password = "wizzycode001";

        for (int attempts = 3; attempts > 0; attempts--) {

            System.out.print("Enter your username: ");
            String inputUsername = scanner.nextLine();

            System.out.print("Enter your password: ");
            String inputPassword = scanner.nextLine();

            if (inputUsername.equals(username) && inputPassword.equals(password)) {
                System.out.println("Login successfully");
                break;
            } else {
                // attempts--;
                System.out.println("Invalid credentials");
                System.out.println("Attempts left: " + (attempts - 1));
            }

            if (attempts == 0) {
                System.out.println("Account locaked come back in 3 hours.");
            }

        }

        scanner.close();

    }

}
