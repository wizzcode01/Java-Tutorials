package AnonymousClass;

public class App {
    public static void main(String[] args) {
        // ANONYMOUS CLASS = a class that doesn't have a name, cannot be reused.
        // it is often used for one time uses (TimerTask, Runnable, callbacks)

        Dog dog = new Dog();
        Dog dog2 = new Dog() {
            @Override
            void speak() {
                System.out.println("Scooby doo says ruh roh");
            }
        };

        dog.speak();
        dog2.speak();
    }
}
