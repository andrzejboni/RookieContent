package com.company.java;

import java.util.Scanner;

public class MojaDataMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program moja data. Przyjmowany format to 1 10 2011");
        System.out.println("Podaj dzien: ");
        int  dzien = scanner.nextInt();
        System.out.println("Podaj miesiac: ");
        int  miesiac = scanner.nextInt();
        System.out.println("Podaj rok: ");
        int  rok = scanner.nextInt();

        MojaData m = new MojaData();
        MojaDataWydarzenie wydarzenie = new MojaDataWydarzenie();
        wydarzenie.ileZostaloLat();


        System.out.println("Oto twoja data w 3 róznych formatach.");
        m.wyswietlDate1(dzien,miesiac,rok);
        m.wyswietlDate2(dzien,miesiac,rok);
        m.wyswietlDate3(dzien,miesiac,rok);



    }
}
