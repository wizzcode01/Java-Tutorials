package TimerTask;

import java.util.Timer;
import java.util.TimerTask;

public class App {
    public static void main(String[] args) {
        // Timer = is a class that schedule tasks at specific times or periodically
        // it is useful for sending notification, scheduled updates, repetitive events
        // TimerTask = is the task that will execute when our timer says so

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {

            int count = 3;

            @Override
            public void run() {
                System.out.println("Hello!");
                count--;
                if (count < 0) {
                    System.out.println("TASK COMPLETE!");
                    timer.cancel();
                }
            }
        };

        timer.schedule(task, 0, 1000);
    }
}
