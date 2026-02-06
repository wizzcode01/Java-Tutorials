package CalculatorProgram;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double number;
        char operand;
        // Boolean option;
        double result = 0;

        System.out.println("-----WISDOM CALCULATOR PROGRAM USING JAVA-----");

        System.out.print("Enter number to calculate: ");
        result = scanner.nextDouble();

        String choice = "yes";

        while (choice.equalsIgnoreCase("yes")) {
            System.out.print("Choose any operand to perform calculation: (+, -, /, *, %, ^): ");
            operand = scanner.next().charAt(0);

            System.out.print("Enter next number: ");
            number = scanner.nextDouble();

            switch (operand) {
                case '+':
                    result += number;
                    break;
                case '-':
                    result -= number;
                    break;
                case '*':
                    result *= number;
                    break;
                case '%':
                    result %= number;
                    break;
                case '^':
                    result = Math.pow(result, number);
                    break;
                case '/':
                    if (number == 0) {
                        System.out.println("Cannot divide by zero");
                    }
                    result /= number;
                    break;

                default:
                    System.out.println("Invalid operator");

            }
            System.out.println("Do you want to calculate or continue adding numbers (yes/no)");
            choice = scanner.next();

        }

        System.out.println("Your answer is: " + result);

        scanner.close();

    }

}
