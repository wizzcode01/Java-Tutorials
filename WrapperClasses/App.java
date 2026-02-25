package WrapperClasses;

public class App {
    public static void main(String[] args) {
        // Wrapper classes = Allow primitive values like int, char, double, boolean
        // to be used as objects. "wrap them in an object"
        // Generally, don't wrap primitives unless you need an object.
        // Allow use of collections framework and static utility methods.

        // technique called autoboxing
        // Integer a = 123; // primitive wrapped in an object.
        // Double b = 3.14;
        // Character c = '$';
        // Boolean d = true;
        // String e = "Pizza";

        // Unboxing
        // int x = a;

        // Utility classes
        // convert primitive datatype to string
        // String a = Integer.toString(123);
        // String b = Double.toString(3.14);
        // String c = Character.toString('@');
        // String d = Boolean.toString(false);

        // String x = a + b + c + d;
        // System.out.println(x);

        // convert a string to a primitive datatype
        // int a = Integer.parseInt("123");
        // double b = Double.parseDouble("3.14");
        // char c = "Pizza".charAt(0);
        // boolean d = Boolean.parseBoolean("true");

        // int x = a;

        // System.out.println(x);

        char letter = 'b';

        System.out.println(Character.isLetter(letter));
        System.out.println(Character.isUpperCase(letter));

    }
}
