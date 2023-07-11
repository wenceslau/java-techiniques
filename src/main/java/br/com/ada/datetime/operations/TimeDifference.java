package br.com.ada.datetime.operations;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class TimeDifference {

    public String calculateTimeDifferenceJavaTime(LocalDateTime dateTime1, LocalDateTime dateTime2) {
        Duration duration = Duration.between(dateTime1, dateTime2);
        long hours = duration.toHours();
        long minutes = duration.toMinutesPart();
        long seconds = duration.toSecondsPart();

        return String.format("Time Difference: %d hours, %d minutes, %d seconds", hours, minutes, seconds);
    }

    public String calculateTimeDifferenceJavaUtil(Date date1, Date date2) {
        long diffInMillis = Math.abs(date2.getTime() - date1.getTime());

        long hours = diffInMillis / (60 * 60 * 1000);
        long minutes = (diffInMillis % (60 * 60 * 1000)) / (60 * 1000);
        long seconds = (diffInMillis % (60 * 1000)) / 1000;

        return String.format("Time Difference: %d hours, %d minutes, %d seconds", hours, minutes, seconds);
    }
}
