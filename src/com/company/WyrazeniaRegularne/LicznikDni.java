package com.company.WyrazeniaRegularne;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class LicznikDni {

    public static void main(String[] args) throws ParseException {
        String date1 = "03-";
        String date2 = "2018 17 12";

        Calendar cal1 = new GregorianCalendar();
        Calendar cal2 = new GregorianCalendar();

        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");

        Date date = sdf.parse("09092018");
        cal1.setTime(date);
        date = sdf.parse("17122018");
        cal2.setTime(date);

        //cal1.set(2008, 8, 1);
        //cal2.set(2008, 9, 31);
        System.out.println("Days= "+daysBetween(cal1.getTime(),cal2.getTime()));
        System.out.println("Months= "+daysBetweenMonth(cal1.getTime(),cal2.getTime()));
        System.out.println("Years= "+daysBetweenYears(cal1.getTime(),cal2.getTime()));


    }

    public static int daysBetween(Date d1, Date d2){
        return (int)( (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
    }
    public static int daysBetweenMonth(Date d1, Date d2){
        return (int)( ((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24)/30));
    }

    public static int daysBetweenYears(Date d1, Date d2){
        return (int)( (((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24)))/365);
    }



}
