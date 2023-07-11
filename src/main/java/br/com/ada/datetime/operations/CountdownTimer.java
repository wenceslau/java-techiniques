package br.com.ada.datetime.operations;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class CountdownTimer {

    public long calculateDaysRemainingJavaTime(LocalDate futureDate) {
        LocalDate today = LocalDate.now();
        long daysRemaining = ChronoUnit.DAYS.between(today, futureDate);
        return daysRemaining;
    }

    public long calculateDaysRemainingJavaUtil(Date futureDate) {
        Calendar today = Calendar.getInstance();
        Calendar future = Calendar.getInstance();
        future.setTime(futureDate);

        long diffInMillis = future.getTimeInMillis() - today.getTimeInMillis();
        return TimeUnit.DAYS.convert(diffInMillis, TimeUnit.MILLISECONDS);
    }

}
