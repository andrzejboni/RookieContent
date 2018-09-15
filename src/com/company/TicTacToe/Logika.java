package com.company.TicTacToe;

import java.util.Scanner;

public class Logika {

    public static boolean czyMoznaPostawicZnak(int i, int j) {

        if (Plansza.plansza[i][j] == ' ') {

            return true;
        } else {
            return false;
        }
    }

    public static boolean czyKRZYZYKWygral() {
        // Jest 3 + 3 + 2 czyli razem 8 mozliwosci wygranai w kolko i krzyżor trzeba wszystkie razy tutaj zaimplementowac


        for (int i = 0; i < Plansza.plansza.length; i++) { // Sprwadzenie po kolumnach

            int licznik = 0;
            for (int j = 0; j < Plansza.plansza.length; j++) {

                if (Plansza.plansza[i][j] == 'X') {
                    licznik++;
                }

                if (licznik == 3) {
                    return true;
                }
            }
        }

        for (int i = 0; i < Plansza.plansza.length; i++) { // Sprwadzenie po wierszach

            int licznik = 0;
            for (int j = 0; j < Plansza.plansza.length; j++) {

                if (Plansza.plansza[j][i] == 'X') {
                    licznik++;
                }

                if (licznik == 3) {
                    return true;
                }
            }
        }

        // Sprwadzenie po przekatnych od lewego gornego rogu
        if (true) {
            int licznik = 0;

            if (Plansza.plansza[0][0] == 'X') {
                licznik++;
            }

            if (Plansza.plansza[1][1] == 'X') {
                licznik++;
            }

            if (Plansza.plansza[2][2] == 'X') {
                licznik++;
            }

            if (licznik == 3) {
                return true;
            }
        }

        // Sprwadzenie po przekatnych od prawego gornego rogu // i wiersz , j kolumna
        if (true) {
            int licznik = 0;

            if (Plansza.plansza[0][2] == 'X') {
                licznik++;
            }

            if (Plansza.plansza[1][1] == 'X') {
                licznik++;
            }

            if (Plansza.plansza[2][0] == 'X') {
                licznik++;
            }

            if (licznik == 3) {
                return true;
            }
        }

        return false;
    }

    public static boolean czyKOLKOWygral() {
        // Jest 3 + 3 + 2 czyli razem 8 mozliwosci wygranai w kolko i krzyżor trzeba wszystkie razy tutaj zaimplementowac

        for (int i = 0; i < Plansza.plansza.length; i++) { // Sprwadzenie po kolumnach

            int licznik = 0;
            for (int j = 0; j < Plansza.plansza.length; j++) {

                if (Plansza.plansza[i][j] == 'O') {
                    licznik++;
                }

                if (licznik == 3) {
                    return true;
                }
            }
        }

        for (int i = 0; i < Plansza.plansza.length; i++) { // Sprwadzenie po wierszach

            int licznik = 0;
            for (int j = 0; j < Plansza.plansza.length; j++) {

                if (Plansza.plansza[j][i] == 'O') {
                    licznik++;
                }

                if (licznik == 3) {
                    return true;
                }
            }
        }

        // Sprwadzenie po przekatnych od lewego gornego rogu
        if (true) {
            int licznik = 0;

            if (Plansza.plansza[0][0] == 'O') {
                licznik++;
            }

            if (Plansza.plansza[1][1] == 'O') {
                licznik++;
            }

            if (Plansza.plansza[2][2] == 'O') {
                licznik++;
            }

            if (licznik == 3) {
                return true;
            }
        }

        // Sprwadzenie po przekatnych od prawego gornego rogu // i wiersz , j kolumna
        if (true) {
            int licznik = 0;

            if (Plansza.plansza[0][2] == 'O') {
                licznik++;
            }

            if (Plansza.plansza[1][1] == 'O') {
                licznik++;
            }

            if (Plansza.plansza[2][0] == 'O') {
                licznik++;
            }

            if (licznik == 3) {
                return true;
            }
        }

        return false;
    }

    public static void rozgrywka() {
        boolean krzyz = true; // ZMIENNE DO ZMIANY KOLEJKI
        boolean kolo = false;



        for (int w = 0; w <= 9; w++) { /// Ustawione na 9 z powodu 9 miejsc w planszy! Gra zawsze skończy się a) albo po wygraniu czimś, albo po zapełnieniu całej planszy! Easy.
            Logika.ilePolObok_SI();


            if (w == 9) {
                System.out.println("Remis!");
                break;
            }

            Scanner scanner = new Scanner(System.in);

            Plansza.wypisz();
            if (Logika.czyKRZYZYKWygral()) {
                System.out.println("Krzyzyk wygrał!");
                break;
            }
            if (Logika.czyKOLKOWygral()) {
                System.out.println("Kółko wygrało!");
                break;
            }

            Wypisywanie.granie();
            int i = scanner.nextInt();
            int j = scanner.nextInt();

            if (kolo == true) {
                if (Logika.czyMoznaPostawicZnak(i, j) == true) {
                    Kolko.postawZnak(i, j);
                } else {
                    System.out.println("Nie można postawić tutaj znaku!");
                }

            }

            if (krzyz == true) {
                if (Logika.czyMoznaPostawicZnak(i, j) == true) {
                    Krzyzyk.postawZnak(i, j);
                } else {
                    System.out.println("Nie można postawić tutaj znaku!");
                }

            }

            if (krzyz == true) {
                krzyz = false;
                kolo = true;
            } else {
                krzyz = true;
                kolo = false;
            }

        }

    }

    public static int ocena[][] = new int[3][3];
    public static int skladowaOceny[][] = new int[3][3];


    public static void ilePolObok_SI() {
        /*  Na czym opierać ma się sztuczna inteligencja w grze kółko i krzyżyk.
            Otóż jak mi się wydaje, powinna ona liczyć pola jakie dostępne są obok - im więcej możliwości
            Rozróżniamy:
            - ilość dostępnych pól obok (im więcej tym lepiej)  -> inicjatywa nad iloscia rzedow
            - ilość ruchów do ułożenia 3 kolejnych znaków (im mniej tym lepiej)
            - zmniejszenie ułożeń przecinikia (im mniej tym lepiej)
        */
        // implementuję pierwszą rzecz, to jest ile jest dostępnych ruchów obok ma każde pole na planszy
        // Należy przejść przez każd pole w każdej komórce i sprawdzić czy w danej komórce jest możliwy ruch.
//
//        for (int i = 0; i < Plansza.plansza.length; i++) {
//
//            for (int j = 0; j < Plansza.plansza.length; j++) {// Dwie powyzsze petle informuja które pole oceniam // i wiersz, j kolumna
//
//                for (int o = 0; o < Plansza.plansza.length; o++) {
//
//                    for (int p = 0; p < Plansza.plansza.length; p++) {// j  kolumna, i wiersz
//
//
//                        if (i != o && j != p) {  //  sprawdza czy nie oceniam własnego pola
//
//                            if (Plansza.plansza[o][p] == ' ') {
//
//                                skladowaOceny[o][p] = 1;
//
//                            }
//                        }
//
//                    }
//
////                    if (i == 0 & j == 0) {
////                    ocena[i][j] = (skladowaOceny[i+1][j+1]+skladowaOceny[][]+skladowaOceny[][]);
////                    }
//                }
//
//            }
//
//
//        }
        // Przejdz po tablicach, jeśli pole jest wolne, nadaj wartośc 1 dla pola

        for (int o = 0; o < Plansza.plansza.length; o++) {

            for (int p = 0; p < Plansza.plansza.length; p++) {// j  kolumna, i wiersz


                if (Plansza.plansza[o][p] == ' ') {

                    skladowaOceny[o][p] = 1;
                }
                else {
                    skladowaOceny[o][p] = 0;
                }
            }
        }
// Nadawanie wartosci dla poszczegolnych pol
        for (int i = 0; i < Plansza.plansza.length; i++) {

            for (int j = 0; j < Plansza.plansza.length; j++) {// , i wiersz, j  kolumna

                if (Plansza.plansza[i][j] == ' '){

                if (i == 0 && j == 0){ ocena[i][j] = (skladowaOceny[1][0] + skladowaOceny[2][0]+skladowaOceny[0][1]+skladowaOceny[0][2]+skladowaOceny[1][1]+skladowaOceny[2][2]);}
                if (i == 0 && j == 1){ ocena[i][j] = (skladowaOceny[0][0] + skladowaOceny[0][2]+skladowaOceny[1][1]+skladowaOceny[2][1]);}
                if (i == 0 && j == 2){ ocena[i][j] = (skladowaOceny[0][1] + skladowaOceny[0][0]+skladowaOceny[1][2]+skladowaOceny[2][2]+skladowaOceny[1][1]+skladowaOceny[2][0]);}

                if (i == 1 && j == 0){ ocena[i][j] = (skladowaOceny[0][0] + skladowaOceny[2][0]+skladowaOceny[1][1]+skladowaOceny[1][2]);}
                if (i == 1 && j == 1){ ocena[i][j] = (skladowaOceny[0][0] + skladowaOceny[2][2]+skladowaOceny[1][0]+skladowaOceny[1][2]+skladowaOceny[0][1]+skladowaOceny[2][1]+skladowaOceny[0][2]+skladowaOceny[2][0]);}
                if (i == 1 && j == 2){ ocena[i][j] = (skladowaOceny[1][0] + skladowaOceny[1][1]+skladowaOceny[0][2]+skladowaOceny[2][2]);}

                if (i == 2 && j == 0){ ocena[i][j] = (skladowaOceny[1][0] + skladowaOceny[0][0]+skladowaOceny[1][1]+skladowaOceny[0][2]+skladowaOceny[2][1]+skladowaOceny[2][2]);}
                if (i == 2 && j == 1){ ocena[i][j] = (skladowaOceny[2][0] + skladowaOceny[2][2]+skladowaOceny[1][1]+skladowaOceny[0][1]);}
                if (i == 2 && j == 2){ ocena[i][j] = (skladowaOceny[0][0] + skladowaOceny[1][1]+skladowaOceny[2][0]+skladowaOceny[2][1]+skladowaOceny[1][2]+skladowaOceny[0][2]);}
}
        else {
                ocena[i][j] = 0;
            }
            }
        }



        for (int i = 0; i < Plansza.plansza.length; i++) {

            for (int j = 0; j < Plansza.plansza.length; j++) {// j  kolumna, i wiersz
                System.out.print("[" + ocena[i][j]+ "]");
            }
            System.out.println();
        }
    }


}
//
//    public static void ileRuchowDoKonca_SI() {
//                        System.out.println("askdo");
//
//
//
//    }
//
//
//    public static void zmniejszenieUlozenPrzeciwnika_SI() {
//
//
//    }


