import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class Reminder {
    public static void main(String[] args) {
        // Use try-with-resources to ensure the Scanner is closed automatically
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the topic of the reminder: ");
            String topic = scanner.nextLine();

            System.out.print("Enter the number of hours: ");
            int hours = scanner.nextInt();

            System.out.print("Enter the number of minutes: ");
            int minutes = scanner.nextInt();

            System.out.print("Enter the number of seconds: ");
            int seconds = scanner.nextInt();

            // Calculate the delay in milliseconds using TimeUnit for readability
            long delay = TimeUnit.HOURS.toMillis(hours) 
                       + TimeUnit.MINUTES.toMillis(minutes) 
                       + TimeUnit.SECONDS.toMillis(seconds);

            Timer timer = new Timer();
            timer.schedule(new TimerTask() {
                @Override
                public void run() {
                    System.out.println("Reminder: " + topic);
                    System.out.println("Time's up!");
                    timer.cancel(); // Stop the timer
                }
            }, delay);
        } catch (Exception e) {
            System.err.println("Error occurred: " + e.getMessage());
        }
    }
}