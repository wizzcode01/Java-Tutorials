package Arrays;

public class Array3 {
    public static void main(String[] args) {
        // 2D array = An array where each element is an array
        // useful for storing a matrix of data.
        // String[] fruits = { "apple", "orange", "banana" };
        // String[] vegetables = { "potato", "onion", "carrot" };
        // String[] meats = { "chicken", "pork", "beef", "fish" };

        // // 2 dimensional array of strings
        // String[][] groceries = { fruits, vegetables, meats };

        // groceries[2][1] = "celery";

        // for (String[] foods : groceries) {
        // for (String food : foods) {
        // System.out.print(food + " ");
        // }
        // System.out.println();
        // }

        // int[] number1 = {1, 2, 3}

        char[][] matrixNumber = { { '1', '2', '3' },
                { '4', '5', '6' },
                { '7', '8', '9' },
                { '*', '0', '#' } };

        for (char[] number : matrixNumber) {
            for (char each : number) {
                System.out.print(each + " ");
            }
            System.out.println();
        }
    }
}
