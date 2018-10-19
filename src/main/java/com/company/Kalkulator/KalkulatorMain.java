package com.company.Kalkulator;

public class KalkulatorMain {

    public static void main(String[] args) {
        KalkulatorRzymski kalkulatorRz = new KalkulatorRzymski();
        KalkulatorArabski kalkulatorA = new KalkulatorArabski();

        String pierwszaLiczba = "3";
        String drugaLicza = "3";
        String pierwszaLiczbaRz= "III";
        String drugaLiczbaRz ="III";

//
//        kalkulatorA.dodaj("3", "3");
//        kalkulatorA.odejmij("5", "2");
//
//        kalkulatorRz.dodaj("III", "VI");
//        kalkulatorRz.dodaj("II", "IX");


        demonstracja(kalkulatorA, pierwszaLiczba, drugaLicza);
        demonstracja(kalkulatorRz,pierwszaLiczbaRz,drugaLiczbaRz);

//        String pierwszaLiczba;
//        String drugaLiczba;

    }


    public static void demonstracja(Kalkulator kal, String pierwszaLiczba, String drugaLiczba) {
        kal.dodaj(pierwszaLiczba, drugaLiczba);
        kal.odejmij(pierwszaLiczba, drugaLiczba);
    }
}

