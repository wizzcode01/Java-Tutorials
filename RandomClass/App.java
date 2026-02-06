package RandomClass;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random random = new Random();

        // int number;
        // int number2;
        // int number3;

        // number = random.nextInt(1, 6);
        // number2 = random.nextInt(1, 6);
        // number3 = random.nextInt(1, 6);

        // System.out.println(number);
        // System.out.println(number2);
        // System.out.println(number3);

        boolean isHeads;

        isHeads = random.nextBoolean();

        if (isHeads) {
            System.out.println("HEADS");
        } else {
            System.out.println("TAILS");
        }

        // you can also generate random doubles and boolean
    }
}
