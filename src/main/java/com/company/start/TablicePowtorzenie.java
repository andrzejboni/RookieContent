package com.company.start;

import java.util.Random;

public class TablicePowtorzenie {

    public static void main(String[] args) {

        Random rand = new Random();


        int[] tablica = new int[100];

        for (int i = 0; i < 100; i++) {

            int n = rand.nextInt(100) + 1;
            tablica[i] = n;

//
//            if (i % 2 == 0){ // a  // Wypełnianie tablicy 100 elementowej
//                System.out.println(i+ ". " + tablica[i]);
//
//            }

//
//            if (tablica[i] % 2 == 0){ //b  // czy liczba jest podzielna przez 2
//                System.out.println(i+ ". " + tablica[i]);
//
//            }
//
//            if (tablica[i] % 2 == 0) { // Sprawdzanie czy liczba jest podzielana przez 2 i przez 3 jednoczasnie
//
//                if (tablica[i] % 3 == 0) {
//                    System.out.println(tablica[i]);
//                }
//
//            }


            // Suma liczb nieparzystych
        }
            int pomocnicza = 0;

            for (int i = 0; i < 100; i++) {

            if (tablica[i] % 2 == 1) { // Sprawdzanie czy liczba jest podzielana przez 2 i przez 3 jednoczasnie
                    pomocnicza = pomocnicza + tablica[i];

            }


        }
            System.out.println(pomocnicza);

        for (int i = 0; i < 100; i++) { // Iloczyn wszystkich liczb apodzielnych przez 5  Nie sprawdzone czy działa.

            if (tablica[i] % 5 == 1) {
                pomocnicza = pomocnicza + tablica[i];

            }


        }
        System.out.println(pomocnicza);


//        for (int j = 0; j < tablica.length; j++) { // Suma liczba nieparzystych
//
//
//            if (czyJestLiczbaPierwsza(tablica[j])) {
//                System.out.println(tablica[j]);
//            }
//
//
//        }








    }

    private static boolean czyJestLiczbaPierwsza(int x) {
    int licznik =0;
    if (x<2){return false;}

    for (int i=1; i <= x; i++) {
        if (x % i == 0) {

            licznik++;
        }
    }

        if (licznik== 2){

            return true;
        }

        if (licznik > 2){
            return false;}

  return false;
    }




}
