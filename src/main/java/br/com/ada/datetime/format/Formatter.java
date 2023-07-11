package br.com.ada.datetime.format;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Formatter {

    public static void main(String[] args) {
        formatterLocalDateTime();
        formatterLocalDate();
        formatterLocalTime();
    }
    public static void formatterLocalDateTime(){
        LocalDateTime dateTime = LocalDateTime.now();

        // Example 1: dd/MM/yyyy HH:mm:ss
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formattedDateTime1 = dateTime.format(formatter1);
        System.out.println(formattedDateTime1);

        // Example 2: yyyy-MM-dd'T'HH:mm:ss.SSS
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS");
        String formattedDateTime2 = dateTime.format(formatter2);
        System.out.println(formattedDateTime2);

    }
    public static void formatterLocalDate(){
        LocalDate date = LocalDate.now();

        // Example 1: yyyy/MM/dd
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        String formattedDate1 = date.format(formatter1);
        System.out.println(formattedDate1);

        // Example 2: EEE, MMM d, yyyy
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("EEE, MMM d, yyyy");
        String formattedDate2 = date.format(formatter2);
        System.out.println(formattedDate2);

    }
    public static void formatterLocalTime(){

        LocalTime time = LocalTime.now();

        // Example 1: HH:mm:ss
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime1 = time.format(formatter1);
        System.out.println(formattedTime1);

        // Example 2: h:mm a
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("h:mm a");
        String formattedTime2 = time.format(formatter2);
        System.out.println(formattedTime2);

    }

}
