package CompoundInterest;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // formular a = p[1 + r/n]^nt

        // Scanner scanner = new Scanner(System.in);
        Scanner scnr = new Scanner(System.in);

        int num1, num2, ans;

        System.out.println("Input a Number");
        num1 = scnr.nextInt();
        System.out.println("Input a second Number");
        num2 = scnr.nextInt();
        ans = num1 + num2;

        System.out.println(ans);
        scnr.close();

    }

}
