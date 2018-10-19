package com.company.Kalkulator;

public class KalkulatorArabski implements Kalkulator {


    @Override
    public void dodaj(String a, String b) {
        int pierwszaLiczba = 0;
        int drugaLiczba = 0;
        switch (a) {
            case "0":
                pierwszaLiczba =0;
                break;
            case "1":
                pierwszaLiczba =1;
                break;

            case "2":
                pierwszaLiczba =2;
                break;

            case "3":
                pierwszaLiczba =3;
                break;

            case "4":
                pierwszaLiczba =4;
                break;

            case "5":
                pierwszaLiczba =5;
                break;

            case "6":
                pierwszaLiczba =6;
                break;

            case "7":
                pierwszaLiczba =7;
                break;

            case "8":
                pierwszaLiczba =8;
                break;

            case "9":
                pierwszaLiczba =9;
                break;
        }

        switch (b) {
            case "0":
                drugaLiczba = 0;
                break;
            case "1":
                drugaLiczba = 1;
                break;

            case "2":
                drugaLiczba = 2;
                break;

            case "3":
                drugaLiczba = 3;
                break;

            case "4":
                drugaLiczba = 4;
                break;

            case "5":
                drugaLiczba = 5;
                break;

            case "6":
                drugaLiczba = 6;
                break;

            case "7":
                drugaLiczba = 7;
                break;

            case "8":
                drugaLiczba = 8;
                break;

            case "9":
                drugaLiczba = 9;
                break;
        }

        System.out.println(pierwszaLiczba+drugaLiczba);

    }




    @Override
    public void odejmij(String a, String b) {

        int pierwszaLiczba = 0;
        int drugaLiczba = 0;
        switch (a) {
            case "0":
                pierwszaLiczba =0;
                break;
            case "1":
                pierwszaLiczba =1;
                break;

            case "2":
                pierwszaLiczba =2;
                break;

            case "3":
                pierwszaLiczba =3;
                break;

            case "4":
                pierwszaLiczba =4;
                break;

            case "5":
                pierwszaLiczba =5;
                break;

            case "6":
                pierwszaLiczba =6;
                break;

            case "7":
                pierwszaLiczba =7;
                break;

            case "8":
                pierwszaLiczba =8;
                break;

            case "9":
                pierwszaLiczba =9;
                break;
        }

        switch (b) {
            case "0":
                drugaLiczba = 0;
                break;
            case "1":
                drugaLiczba = 1;
                break;

            case "2":
                drugaLiczba = 2;
                break;

            case "3":
                drugaLiczba = 3;
                break;

            case "4":
                drugaLiczba = 4;
                break;

            case "5":
                drugaLiczba = 5;
                break;

            case "6":
                drugaLiczba = 6;
                break;

            case "7":
                drugaLiczba = 7;
                break;

            case "8":
                drugaLiczba = 8;
                break;

            case "9":
                drugaLiczba = 9;
                break;
        }

        System.out.println(pierwszaLiczba-drugaLiczba);


    }


}


