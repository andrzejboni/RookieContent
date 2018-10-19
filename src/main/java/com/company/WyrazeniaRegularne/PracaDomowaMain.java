package com.company.WyrazeniaRegularne;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class PracaDomowaMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Daj date w forimie yyyy-MM-dd : ");
        String tekst = sc.nextLine();

        //Formatowanie tekstu na datę

        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate data = LocalDate.parse(tekst, f);
        //Formatowanie daty na tekst
        DateTimeFormatter f2 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        String dataSformatowana = data.format(f2);

        System.out.println("Data Wpisana : " + dataSformatowana);



    }
}

