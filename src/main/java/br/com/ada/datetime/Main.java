package br.com.ada.datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

        Calendar cToday = Calendar.getInstance();
        System.out.println("Data: "+ cToday);

        Date dToday = new Date();
        System.out.println("Data: "+ dToday);

        LocalDate lToday = LocalDate.now();
        System.out.println("Data: "+lToday);

        LocalDateTime lNow = LocalDateTime.now();
        System.out.println("Data e Hora: "+ lNow);

        LocalTime time = LocalTime.now();
        System.out.println("Hora: "+ time);

        Period period = Period.between(LocalDate.now(), LocalDate.now());
        System.out.println("Periodo entre duas datas: " + period);

        DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
        System.out.println("Dia da Semana: " + dayOfWeek);

        Duration duration = Duration.between(LocalDateTime.now(), LocalDateTime.now());
        System.out.println("Duração entre duas datas: " + duration);

        String dateFormatted = LocalDateTime.now().format( DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        System.out.println("Data Hora Formatada: "+dateFormatted);

        LocalDateTime horaSaoPaulo = LocalDateTime.now(ZoneId.of("America/New_York"));
        System.out.println("Hora em Nova York: " + horaSaoPaulo);

        LocalDateTime horaTokio = LocalDateTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("Hora em Tokio: " + horaTokio);

    }

}
