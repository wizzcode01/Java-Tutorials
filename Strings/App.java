package Strings;

public class App {
    public static void main(String[] args) {

        String name = "Wisdom Dickson";

        // int length = name.length();
        // char letter = name.charAt(0);
        // int index = name.indexOf(" ");
        // int lastIndex = name.lastIndexOf("w");

        // name = name.toUpperCase();
        // name = name.toLowerCase();

        // name = name.trim();

        // name = name.replace("d", "4");

        // check if string is empty

        // System.out.println(name.isEmpty());

        // if (name.isEmpty()) {
        // System.out.println("Your name is empty");
        // } else {
        // System.out.println("Hello " + name);
        // }

        // if (name.contains(" ")) {
        // System.out.println("Your name contains a space");
        // } else {
        // System.out.println("Your name has no space");
        // }

        if (name.equalsIgnoreCase("password")) {
            System.out.println("Your name can't be password");
        } else {
            System.out.println("Hello " + name);
        }
    }

}
