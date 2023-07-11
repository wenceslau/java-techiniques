package br.com.ada.datetime.operations;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;

public class Friday13thChecker {


    public boolean isFriday13JavaTime(int ano, int mes){
        if (mes < 1 || mes > 12 || ano < 0){
            return false;
        }

        LocalDate date = LocalDate.of(ano, mes, 13);
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        return dayOfWeek == DayOfWeek.FRIDAY;
    }

    public boolean isFriday13JavaUtil(int ano, int mes){

        if (mes < 1 || mes > 12 || ano < 0){
            return false;
        }

        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.MONTH, mes -1);
        calendar.set(Calendar.YEAR, ano);
        calendar.set(Calendar.DAY_OF_MONTH, 13);

        return calendar.get(Calendar.DAY_OF_WEEK) == Calendar.FRIDAY;

    }


}
