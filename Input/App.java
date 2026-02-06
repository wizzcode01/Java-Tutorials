package Input;

import java.util.Scanner;

// how to accept user data types in java
public class App {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter your name: ");
        // String name = scanner.nextLine();

        // System.out.print("Enter your age: ");
        // int age = scanner.nextInt();

        // System.out.print("Enter your gpa: ");
        // double gpa = scanner.nextDouble();

        // System.out.print("Are you a student? (true/false): ");
        // boolean isStudent = scanner.nextBoolean();

        // System.out.println("Hello " + name);
        // System.out.println("You are " + age + " years old");
        // System.out.println("You have a gpa of " + gpa);
        // // System.out.println("Student: " + isStudent);
        // if (isStudent) {
        // System.out.println("You are enrolled as a student");
        // } else {
        // System.out.println("You are not enrolled as a student");
        // }

        // scanner.close();

        // CALCULATE THE AREA OF A RECTANGLE

        // double width = 0;
        // double height = 0;
        // double area = 0;

        // Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter the width: ");
        // width = scanner.nextDouble();

        // System.out.print("Enter the height: ");
        // height = scanner.nextDouble();

        // area = width * height;

        // System.out.println("The area is: " + area + "cm");

        // scanner.close();

        // CALCULATE CIRCUMFERENCE OF A CIRCLE 2 * PIE * R

        double radius = 0;
        double pie = 22.7;
        double circumference = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter tha value of radius: ");
        radius = scanner.nextDouble();

        circumference = 2 * pie * radius;

        System.out.println("The circumference of a circle is: " + circumference);

        scanner.close();
    }
}
