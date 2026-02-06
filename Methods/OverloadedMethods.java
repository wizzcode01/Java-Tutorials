package Methods;

public class OverloadedMethods {
    public static void main(String[] args) {
        // overload methods = methods that share the same name, but different parameters
        // signature = name + parameters

        // System.out.println(add(10, 5, 3, 8));
        String soup = cookSoup("Waterleaf", "Goat meat", "Afang");

        System.out.println(soup);

    }

    // static double add(double a, double b) {
    // return a + b;
    // }

    // static double add(double a, double b, double c) {
    // return a + b + c;
    // }

    // static double add(double a, double b, double c, double d) {
    // return a + b + c + d;
    // }

    // BAKE AFANG SOUP PROGRAM

    static String cookSoup(String ingredients) {
        return ingredients + "soup";
    }

    static String cookSoup(String ingredients, String meat) {
        return ingredients + " " + meat + " soup";
    }

    static String cookSoup(String ingredients, String meat, String type) {
        return type + " " + ingredients + " " + meat + " soup";
    }

}
