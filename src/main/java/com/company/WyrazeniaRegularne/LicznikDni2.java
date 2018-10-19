package com.company.WyrazeniaRegularne;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LicznikDni2 {
    public static void main(String[] args) {

        LocalDate startDate = LocalDate.parse("2018-12-17");
        LocalDate endtDate = LocalDate.now();

        Long range = ChronoUnit.DAYS.between(startDate, endtDate);
        Long range2 = ChronoUnit.MONTHS.between(startDate, endtDate);
        Long range3 = ChronoUnit.YEARS.between(startDate, endtDate);
        System.out.println("od wpisanej daty mineło Dni " + range + " Miesięcy " + range2 + " Lat " + range3);
    }
}
