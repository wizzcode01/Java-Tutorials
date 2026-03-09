package Multithreading;

public class App {
    public static void main(String[] args) {
        // MyRunnable myRunning = new MyRunnable();
        Thread thread1 = new Thread(new MyRunnable());
        Thread thread2 = new Thread(new MyRunnable());
        thread1.start();
        thread2.start();

    }
}
