package DateTime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) {
        // LocalDate date = LocalDate.now();
        // LocalTime time = LocalTime.now();
        // LocalDateTime dateTime = LocalDateTime.now();

        // System.out.println(dateTime);

        // Instant instant = Instant.now();
        // System.out.println(instant);

        // Custom format
        // LocalDateTime dateTime = LocalDateTime.now();
        // DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy
        // HH:mm:ss");
        // String newDateTime = dateTime.format(formatter);

        // System.out.println(newDateTime);

        LocalDate date1 = LocalDate.of(2026, 2, 25);
        LocalDate date2 = LocalDate.of(2026, 3, 2);

        if (date1.isBefore(date2)) {
            System.out.println(date1 + " is earlier than " + date2);
        } else if (date1.isAfter(date2)) {
            System.out.println(date1 + " is later than " + date2);
        }
    }
}
