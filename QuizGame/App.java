package QuizGame;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Quiz game using java

        // Algorithm
        // 1. initialize variables
        // 2. declare scanner
        // 3. store answers and question in array
        // 4. use loop to loop through array of questions
        // 5. array for questions and 2d array for answers
        Scanner scanner = new Scanner(System.in);

        System.out.println("****************************");
        System.out.println("Welcome to the Java Quiz Game!");
        System.out.println("****************************");

        String[] Questions = { "What is the size of an int in Java?",
                "Which keyword is used to inherit a class in Java?",
                "What is the default value of an int array element in Java?",
                "Which collection does NOT allow duplicate elements?",
                "Which method is the entry point of a Java program?" };
        String[][] Options = { { "A. 2 bytes\n",
                "B. 4 bytes\n",
                "C. 8 bytes\n",
                "D. Depends on system" },
                {
                        "A. implement\n",
                        "B. inherit\n",
                        "C. extends\n",
                        "D. super" },
                { "A. null\n",
                        "B. 0\n",
                        "C. 1\n",
                        "D. undefined" },
                { "A. List\n",
                        "B. ArrayList\n",
                        "C. Set\n",
                        "D. Vector" },
                { "A. start()\n",
                        "B. run()\n",
                        "C. main()\n",
                        "D. init()" } };

        // String userAnswer;
        int[] answers = { 2, 3, 2, 3, 3 };
        int score = 0;
        int guess;

        for (int i = 0; i < Questions.length; i++) {
            System.out.println(Questions[i]);
            for (String option : Options[i]) {
                System.out.println(option);
            }

            System.out.print("Guess an answer: ");
            guess = scanner.nextInt();

            if (guess == answers[i]) {
                System.out.println("**********");
                System.out.println("YOU WIN!!!");
                System.out.println("**********");
                score++;
            } else {
                System.out.println("**********");
                System.out.println("YOU LOOSE!");
                System.out.println("**********");
            }

            System.out.println("Your score is: " + score + " out of " + Questions.length);
        }

        scanner.close();
    }

}
