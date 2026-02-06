package VariableArgs;

public class App {
    public static void main(String[] args) {
        // varargs = allow a method to accept a varying number of arguments
        // makes methods more flexible, no need for overloaded methods
        // java will pack the arguments into an array
        // ...(ellipsis)
        System.out.println(add());
    }

    // static int add(int... numbers) {
    // int sum = 0;

    // for (int number : numbers) {
    // sum += number;
    // }

    // // for (int i = 0; i < numbers.length; i++) {
    // // sum += numbers[i];
    // // }
    // return sum;
    // }
    static double add(double... numbers) {
        double sum = 0;

        if (numbers.length == 0) {
            return 0;
        }

        for (double number : numbers) {
            sum += number;
        }

        return sum / numbers.length;
    }
}
