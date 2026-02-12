package OOP;

public class App {
    public static void main(String[] args) {
        // object = attribute and methods

        // Scanner scanner = new Scanner(System.in);
        // Random random = new Random();

        // car car1 = new car();
        // car car2 = new car();

        // car.isRunning = false;

        // System.out.println(car.make);
        // System.out.println(car.model);
        // System.out.println(car.year);
        // System.out.println(car.price);
        // System.out.println(car.isRunning);
        // car.start();
        // System.out.println(car.isRunning);
        // car.drive();
        // car.stop();
        // System.out.println(car.isRunning);
        // car.drive();
        // car.brake();

        // System.out.println(car1.make + " " + car1.model);
        // System.out.println(car2.make + " " + car2.model);

        Students student1 = new Students("Wisdom", 30, 4.8);
        Students student2 = new Students("Dominion", 26, 4.8);
        Students student3 = new Students("sandy", 24, 4.5);

        student1.study();
        student2.study();
        student3.study();
    }

}
