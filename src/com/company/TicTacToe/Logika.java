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



    public static void sztucznaInteligencja() {
        /*  Na czym opierać ma się sztuczna inteligencja w grze kółko i krzyżyk.
            Otóż jak mi się wydaje, powinna ona liczyć pola jakie dostępne są obok - im więcej możliwości
            Rozróżniamy:
            - ilość dostępnych pól obok (im więcej tym lepiej)  -> inicjatywa nad iloscia rzedow
            - ilość ruchów do ułożenia 3 kolejnych znaków (im mniej tym lepiej)
            - zmniejszenie ułożeń przecinikia (im mniej tym lepiej)
        */


        for (int i = 0; i < Plansza.plansza.length; i++) {

            for (int j = 0; j < Plansza.plansza.length; j++) {// j  kolumna, i wiersz

               if( Plansza.plansza[i][j] == ' ') {
                    

               }
            }
        }

























    }


}
