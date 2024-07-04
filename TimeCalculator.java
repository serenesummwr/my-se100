import java.util.Scanner;

public class TimeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of seconds: ");
        int totalSeconds = scanner.nextInt();

        final int SECONDS_IN_A_DAY = 86400;
        final int SECONDS_IN_AN_HOUR = 3600;
        final int SECONDS_IN_A_MINUTE = 60;

        int days = totalSeconds / SECONDS_IN_A_DAY;
        totalSeconds %= SECONDS_IN_A_DAY;

        int hours = totalSeconds / SECONDS_IN_AN_HOUR;
        totalSeconds %= SECONDS_IN_AN_HOUR;

        int minutes = totalSeconds / SECONDS_IN_A_MINUTE;
        int seconds = totalSeconds % SECONDS_IN_A_MINUTE;

        System.out.println("Time: " + days + " days " + hours + " hours " + minutes + " minutes " + seconds + " seconds");

        scanner.close();
    }
}