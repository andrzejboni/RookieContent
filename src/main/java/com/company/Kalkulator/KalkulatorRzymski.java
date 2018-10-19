package com.company.Kalkulator;

public class KalkulatorRzymski implements Kalkulator {


    @Override
    public void dodaj(String a, String b) {
        int pierwszaLiczba = 0;
        int drugaLiczba = 0;
        switch (a) {
            case "I":
                pierwszaLiczba = 1;
                break;
            case "II":
                pierwszaLiczba = 2;
                break;

            case "III":
                pierwszaLiczba = 3;
                break;

            case "IV":
                pierwszaLiczba = 4;
                break;

            case "V":
                pierwszaLiczba = 5;
                break;

            case "VI":
                pierwszaLiczba = 6;
                break;

            case "VII":
                pierwszaLiczba = 7;
                break;

            case "VIII":
                pierwszaLiczba = 8;
                break;

            case "IX":
                pierwszaLiczba = 9;
                break;

            case "X":
                pierwszaLiczba = 10;
                break;
        }

        switch (b) {
            case "I":
                drugaLiczba = 1;
                break;

            case "II":
                drugaLiczba = 2;
                break;

            case "III":
                drugaLiczba = 3;
                break;

            case "IV":
                drugaLiczba = 4;
                break;

            case "V":
                drugaLiczba = 5;
                break;

            case "VI":
                drugaLiczba = 6;
                break;

            case "VII":
                drugaLiczba = 7;
                break;

            case "VIII":
                drugaLiczba = 8;
                break;

            case "IX":
                drugaLiczba = 9;
                break;

            case "X":
                drugaLiczba = 10;
                break;
        }

        System.out.println(pierwszaLiczba + drugaLiczba);

    }


    @Override
    public void odejmij(String a, String b) {

        int pierwszaLiczba = 0;
        int drugaLiczba = 0;
        switch (a) {
            case "I":
                pierwszaLiczba = 1;
                break;
            case "II":
                pierwszaLiczba = 2;
                break;

            case "III":
                pierwszaLiczba = 3;
                break;

            case "IV":
                pierwszaLiczba = 4;
                break;

            case "V":
                pierwszaLiczba = 5;
                break;

            case "VI":
                pierwszaLiczba = 6;
                break;

            case "VII":
                pierwszaLiczba = 7;
                break;

            case "VIII":
                pierwszaLiczba = 8;
                break;

            case "IX":
                pierwszaLiczba = 9;
                break;

            case "X":
                pierwszaLiczba = 10;
                break;
        }

        switch (b) {
            case "I":
                drugaLiczba = 1;
                break;

            case "II":
                drugaLiczba = 2;
                break;

            case "III":
                drugaLiczba = 3;
                break;

            case "IV":
                drugaLiczba = 4;
                break;

            case "V":
                drugaLiczba = 5;
                break;

            case "VI":
                drugaLiczba = 6;
                break;

            case "VII":
                drugaLiczba = 7;
                break;

            case "VIII":
                drugaLiczba = 8;
                break;

            case "IX":
                drugaLiczba = 9;
                break;

            case "X":
                drugaLiczba = 10;
                break;
        }

        System.out.println(pierwszaLiczba - drugaLiczba);

    }


}

