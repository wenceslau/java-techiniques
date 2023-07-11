package br.com.ada.datetime.operations;

import java.time.Year;

public class LeapYearChecker {

    public boolean isLeapJavaTime(int year){
        return Year.isLeap(year);
    }

    public boolean isLeapJavaUtil(int year){

        if (year % 4 != 0) {
            return false;
        }

        if (year % 100 != 0 || year % 400 == 0){
            return true;
        }

        return false;
    }
}
