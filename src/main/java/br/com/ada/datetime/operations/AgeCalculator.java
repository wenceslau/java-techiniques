package br.com.ada.datetime.operations;

import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;

public class AgeCalculator {

    public int calculateAgeJavaTime(LocalDate dateOfBirth) {
        LocalDate today = LocalDate.now();
        Period age = Period.between(dateOfBirth, today);
        return age.getYears();
    }

    public int calculateAgeJavaUtil(Date dateOfBirth) {
        Calendar dob = Calendar.getInstance();
        dob.setTime(dateOfBirth);

        Calendar today = Calendar.getInstance();

        int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);

        if (today.get(Calendar.MONTH) < dob.get(Calendar.MONTH) ||
                (today.get(Calendar.MONTH) == dob.get(Calendar.MONTH)
                        && today.get(Calendar.DAY_OF_MONTH) < dob.get(Calendar.DAY_OF_MONTH))) {
            age--;
        }

        return age;
    }

}
