package br.com.ada.datetime.zone;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;


public class TimeZone {


    public static void main(String[] args) {

        printTimeZone();
        convertTimeZone();

    }

    public static void printTimeZone(){
        // Creating a LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();

        // Applying a time zone to LocalDateTime
        ZoneId zoneId = ZoneId.of("America/New_York");
        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime, zoneId);

        System.out.println("LocalDateTime: " + localDateTime);
        System.out.println("ZonedDateTime: " + zonedDateTime);

    }

    public static void convertTimeZone(){
        // Creating a LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();

        // Converting to a different time zone
        ZoneId sourceZoneId = ZoneId.of("America/New_York");
        ZoneId targetZoneId = ZoneId.of("Asia/Tokyo");

        // Create a zone origin and zone target
        ZonedDateTime sourceZonedDateTime = ZonedDateTime.of(localDateTime, sourceZoneId);
        ZonedDateTime targetZonedDateTime = sourceZonedDateTime.withZoneSameInstant(targetZoneId);

        //Convert the zone to localdatetime
        LocalDateTime convertedDateTime = targetZonedDateTime.toLocalDateTime();

        System.out.println("Source LocalDateTime: " + localDateTime);
        System.out.println("Converted LocalDateTime: " + convertedDateTime);
    }

}
