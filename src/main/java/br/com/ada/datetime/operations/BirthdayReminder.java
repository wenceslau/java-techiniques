package br.com.ada.datetime.operations;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class BirthdayReminder {


    public List<String> listNextBirthdayJavaTime(Map<String, LocalDate> birthdays) throws ParseException {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Data de hoje
        LocalDate today = LocalDate.now();

        // Check for upcoming birthdays
        List<String> upcomingBirthdays = new ArrayList<>();

        //Percorre a lista de aniversarios pela chave do mapa
        for (String nome : birthdays.keySet()) {
            //Recupera a data de aniversario
            LocalDate birthday = birthdays.get(nome);
            //Retorna uma copia do ano de nascimento com o ano corrente
            birthday = birthday.withYear(today.getYear());
            //Verifica se a data é igual ou depois de hoje
            if (birthday.isAfter(today) || birthday.isEqual(today)) {
                upcomingBirthdays.add(nome);
            }
        }

        return upcomingBirthdays;
    }

    public List<String> listNextBirthdayJavaUtil(Map<String, Date> birthdays) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        // Get today's date
        Calendar today = Calendar.getInstance();
        today.set(Calendar.HOUR_OF_DAY, 0);
        today.set(Calendar.MINUTE, 0);
        today.set(Calendar.SECOND, 0);

        List<String> upcomingBirthdays = new ArrayList<>();

        //Percorre a lista de aniversarios pela chave do mapa
        for (String nome : birthdays.keySet()) {
            //Cria uma data corrente
            Calendar birthday = Calendar.getInstance();
            //Altera a data corrente para a data de aniversario
            birthday.setTime(birthdays.get(nome));
            //Altera do ano de nascimento para o ano corrente
            birthday.set(Calendar.YEAR, today.get(Calendar.YEAR));

            //Verifica se a data é igual ou depois de hoje
            if (birthday.compareTo(today) >= 0) {
                upcomingBirthdays.add(nome);
            }
        }

        return upcomingBirthdays;
    }
}
