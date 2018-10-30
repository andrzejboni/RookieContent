//package com.company.TicTacToe;
//
//import java.util.Scanner;
//
//public class Logika {
//
//    public static Scanner scanner = new Scanner(System.in);
//    public static int komputerCzyCzlowiek;
//
//    public static void setKomputerCzyCzlowiek(int komputerCzyCzlowiek) {
//        Logika.komputerCzyCzlowiek = komputerCzyCzlowiek;
//    }
//
//    public static int i;
//    public static int j;
//
//    public static boolean czyMoznaPostawicZnak(int i, int j) {
//
//        return Plansza.plansza[i][j] == ' ';
//    }
//
//    public static boolean czyKRZYZYKWygral() {
//        // Jest 3 + 3 + 2 czyli razem 8 mozliwosci wygranai w kolko i krzyżor trzeba wszystkie razy tutaj zaimplementowac
//
//
//        for (int i = 0; i < Plansza.plansza.length; i++) { // Sprwadzenie po kolumnach
//
//            int licznik = 0;
//            for (int j = 0; j < Plansza.plansza.length; j++) {
//
//                if (Plansza.plansza[i][j] == 'X') {
//                    licznik++;
//                }
//
//                if (licznik == 3) {
//                    return true;
//                }
//            }
//        }
//
//        for (int i = 0; i < Plansza.plansza.length; i++) { // Sprwadzenie po wierszach
//
//            int licznik = 0;
//            for (int j = 0; j < Plansza.plansza.length; j++) {
//
//                if (Plansza.plansza[j][i] == 'X') {
//                    licznik++;
//                }
//
//                if (licznik == 3) {
//                    return true;
//                }
//            }
//        }
//
//        // Sprwadzenie po przekatnych od lewego gornego rogu
//        if (true) {
//            int licznik = 0;
//
//            if (Plansza.plansza[0][0] == 'X') {
//                licznik++;
//            }
//
//            if (Plansza.plansza[1][1] == 'X') {
//                licznik++;
//            }
//
//            if (Plansza.plansza[2][2] == 'X') {
//                licznik++;
//            }
//
//            if (licznik == 3) {
//                return true;
//            }
//        }
//
//        // Sprwadzenie po przekatnych od prawego gornego rogu // i wiersz , j kolumna
//        if (true) {
//            int licznik = 0;
//
//            if (Plansza.plansza[0][2] == 'X') {
//                licznik++;
//            }
//
//            if (Plansza.plansza[1][1] == 'X') {
//                licznik++;
//            }
//
//            if (Plansza.plansza[2][0] == 'X') {
//                licznik++;
//            }
//
//            return licznik == 3;
//        }
//
//    }
//
//    public static boolean czyKOLKOWygral() {
//        // Jest 3 + 3 + 2 czyli razem 8 mozliwosci wygranai w kolko i krzyżor trzeba wszystkie razy tutaj zaimplementowac
//
//        for (int i = 0; i < Plansza.plansza.length; i++) { // Sprwadzenie po kolumnach
//
//            int licznik = 0;
//            for (int j = 0; j < Plansza.plansza.length; j++) {
//
//                if (Plansza.plansza[i][j] == 'O') {
//                    licznik++;
//                }
//
//                if (licznik == 3) {
//                    return true;
//                }
//            }
//        }
//
//        for (int i = 0; i < Plansza.plansza.length; i++) { // Sprwadzenie po wierszach
//
//            int licznik = 0;
//            for (int j = 0; j < Plansza.plansza.length; j++) {
//
//                if (Plansza.plansza[j][i] == 'O') {
//                    licznik++;
//                }
//
//                if (licznik == 3) {
//                    return true;
//                }
//            }
//        }
//
//        // Sprwadzenie po przekatnych od lewego gornego rogu
//        if (true) {
//            int licznik = 0;
//
//            if (Plansza.plansza[0][0] == 'O') {
//                licznik++;
//            }
//
//            if (Plansza.plansza[1][1] == 'O') {
//                licznik++;
//            }
//
//            if (Plansza.plansza[2][2] == 'O') {
//                licznik++;
//            }
//
//            if (licznik == 3) {
//                return true;
//            }
//        }
//
//        // Sprwadzenie po przekatnych od prawego gornego rogu // i wiersz , j kolumna
//        if (true) {
//            int licznik = 0;
//
//            if (Plansza.plansza[0][2] == 'O') {
//                licznik++;
//            }
//
//            if (Plansza.plansza[1][1] == 'O') {
//                licznik++;
//            }
//
//            if (Plansza.plansza[2][0] == 'O') {
//                licznik++;
//            }
//
//            return licznik == 3;
//        }
//
//    }
//
//
//    public static void rozgrywka() {
//        boolean krzyz = true; // ZMIENNE DO ZMIANY KOLEJKI
//        boolean kolo = false;
//
//        setKomputerCzyCzlowiek(scanner.nextInt());
//
//        for (int w = 0; w <= 9; w++) {
//            Logika.ilePolObok_SI(); // z każdą iteracją aktualizuje oceny dla planszy
//
//
//            if (w == 9) {
//                System.out.println("Remis!");
//                break;
//            }
//
//
//            Plansza.wypisz();
//            if (Logika.czyKRZYZYKWygral()) {
//                System.out.println("Krzyzyk wygrał!");
//                break;
//            }
//            if (Logika.czyKOLKOWygral()) {
//                System.out.println("Kółko wygrało!");
//                break;
//            }
//
//            Wypisywanie.granie();
//
//
//            if (kolo == true) {
//
//
//                if (komputerCzyCzlowiek == 1) {
//                    postawZnak_SI();            // jesli gra komputer !}
//                } else {
//                    i = scanner.nextInt();
//                    j = scanner.nextInt();
//
//                    if (Logika.czyMoznaPostawicZnak(i, j) == true) {
//
//                        Kolko.postawZnak(i, j);   // Jesli chcemy grac 1 na 1
//                    } else {
//                        System.out.println("Nie można postawić tutaj znaku!");
//                    }
//                }
//
//            }
//
//            if (krzyz == true) {
//                i = scanner.nextInt();
//                j = scanner.nextInt();
//                if (Logika.czyMoznaPostawicZnak(i, j) == true) {
//                    Krzyzyk.postawZnak(i, j);
//                } else {
//                    System.out.println("Nie można postawić tutaj znaku!");
//                }
//
//            }
//
//            if (krzyz == true) {
//                krzyz = false;
//                kolo = true;
//            } else {
//                krzyz = true;
//                kolo = false;
//            }
//
//        }
//
//    }
//
//    public static int ocena[][] = new int[3][3];
//    public static int skladowaOceny[][] = new int[3][3];
//
//
//    public static void ilePolObok_SI() {
//        /*  Na czym opierać ma się sztuczna inteligencja w grze kółko i krzyżyk.
//
//            Rozróżniamy:
//            - ilość dostępnych pól obok (im więcej tym lepiej)  -> inicjatywa nad iloscia rzedow
//            - ilość ruchów do ułożenia 3 kolejnych znaków (im mniej tym lepiej)
//            - zmniejszenie ułożeń przecinikia (im mniej tym lepiej)
//        */
//        // implementuję pierwszą rzecz, to jest ile jest dostępnych ruchów obok ma każde pole na planszy
//        //   Należy przejść przez każd pole w każdej komórce i sprawdzić czy w danej komórce jest możliwy ruch.
//
//        // implementuje drugą rzecz, liczenie ile został do ułożenia 3 kolejnych znaków - kółek, a tym samym wygrania całej batalii
//        // Zdaje sie, że odpowiednie bedzie: Rożróżnienie każdej możliwej kombinacji (dośc pracochłonne - jest ich 8 )
//        // ale! mogę się posłużyć kodem ze sprawdzania czy kółko wygrało! - kwestia edycji tej metody.
//
//
//        for (int o = 0; o < Plansza.plansza.length; o++) {          // Przejdz po tablicach, jeśli pole jest wolne, nadaj wartośc 1 dla pola
//
//            for (int p = 0; p < Plansza.plansza.length; p++) {// j  kolumna, i wiersz
//
//
//                if (Plansza.plansza[o][p] == ' ') {
//
//                    skladowaOceny[o][p] = 1;
//                } else {
//                    skladowaOceny[o][p] = 0;
//                }
//            }
//        }
//
//        for (int i = 0; i < Plansza.plansza.length; i++) { // Nadawanie wartosci dla poszczegolnych pol
//
//            for (int j = 0; j < Plansza.plansza.length; j++) {// , i wiersz, j  kolumna
//
//                if (Plansza.plansza[i][j] == ' ') {
//
//                    if (i == 0 && j == 0) {
//                        ocena[i][j] = (skladowaOceny[1][0] + skladowaOceny[2][0] + skladowaOceny[0][1] + skladowaOceny[0][2] + skladowaOceny[1][1] + skladowaOceny[2][2]);
//                    }
//                    if (i == 0 && j == 1) {
//                        ocena[i][j] = (skladowaOceny[0][0] + skladowaOceny[0][2] + skladowaOceny[1][1] + skladowaOceny[2][1]);
//                    }
//                    if (i == 0 && j == 2) {
//                        ocena[i][j] = (skladowaOceny[0][1] + skladowaOceny[0][0] + skladowaOceny[1][2] + skladowaOceny[2][2] + skladowaOceny[1][1] + skladowaOceny[2][0]);
//                    }
//
//                    if (i == 1 && j == 0) {
//                        ocena[i][j] = (skladowaOceny[0][0] + skladowaOceny[2][0] + skladowaOceny[1][1] + skladowaOceny[1][2]);
//                    }
//                    if (i == 1 && j == 1) {
//                        ocena[i][j] = (skladowaOceny[0][0] + skladowaOceny[2][2] + skladowaOceny[1][0] + skladowaOceny[1][2] + skladowaOceny[0][1] + skladowaOceny[2][1] + skladowaOceny[0][2] + skladowaOceny[2][0]);
//                    }
//                    if (i == 1 && j == 2) {
//                        ocena[i][j] = (skladowaOceny[1][0] + skladowaOceny[1][1] + skladowaOceny[0][2] + skladowaOceny[2][2]);
//                    }
//
//                    if (i == 2 && j == 0) {
//                        ocena[i][j] = (skladowaOceny[1][0] + skladowaOceny[0][0] + skladowaOceny[1][1] + skladowaOceny[0][2] + skladowaOceny[2][1] + skladowaOceny[2][2]);
//                    }
//                    if (i == 2 && j == 1) {
//                        ocena[i][j] = (skladowaOceny[2][0] + skladowaOceny[2][2] + skladowaOceny[1][1] + skladowaOceny[0][1]);
//                    }
//                    if (i == 2 && j == 2) {
//                        ocena[i][j] = (skladowaOceny[0][0] + skladowaOceny[1][1] + skladowaOceny[2][0] + skladowaOceny[2][1] + skladowaOceny[1][2] + skladowaOceny[0][2]);
//                    }
//                } else {
//                    ocena[i][j] = 0;
//                }
//            }
//        }
//
//
//        for (int i = 0; i < Plansza.plansza.length; i++) { // Wypisz nadane oceny dla każdego pola w planszy
//
//            for (int j = 0; j < Plansza.plansza.length; j++) {// j  kolumna, i wiersz
//                System.out.print("[" + ocena[i][j] + "]");
//            }
//            System.out.println();
//        }
//    }
//
//
//    public static void postawZnak_SI() { // SI działające opierajace się na liczeniu dostępnych jeszcze pól
//        int najwiekszaOcena = -1;
//        int wiersz = -1;
//        int kolumna = -1;
//
//        for (int i = 0; i < Plansza.plansza.length; i++) {
//
//            for (int j = 0; j < Plansza.plansza.length; j++) {// j  kolumna, i wiersz
//                if (najwiekszaOcena < ocena[i][j]) {
//                    najwiekszaOcena = ocena[i][j];
//                    wiersz = i;
//                    kolumna = j;
//
//                }
//            }
//        }
//        Kolko.postawZnak(wiersz, kolumna); // Tą metodę trzeba będzie przenieść!
//
//    }
//
//    public static void ileRuchowDoWygranej() {
//        int wiersz = -1;
//        int kolumna = -1;
//
//
//        for (int w = 0; w < Plansza.plansza.length; w++) { // Sprwadzenie po kolumnach
//
//            int licznik = 0;
//            for (int p = 0; p < Plansza.plansza.length; p++) {
//
//                if (Plansza.plansza[w][p] == 'O') {
//                    licznik++;
//                }
//
//                if (czyMoznaPostawicZnak(w, p)) {
//                    wiersz = w;
//                    kolumna = p;
//                }
//            }
//
//            // Tutaj trzeba wrzucić metodę która sprawdzi które pole jest wolne - i temu polu nadać odpowiednią ocenę
//
//            if (wiersz != -1 && kolumna != -1) {
//                if (licznik == 1) {
//                    // myślę że 60% to będzie wystarczający
//                    ocena[wiersz][kolumna] += 2;
//
//                }
//                if (licznik == 2) {
//                    ocena[wiersz][kolumna] += 10;
//                    // Znaczny wpływ na ocenę! Jeden ruch do wygrania - Powinno być przynajmniej 90% wpłyewu na ocenę nastęnego ruchu.
//
//
//                }
//            }
//
//
//            wiersz = -1;
//            kolumna = -1;
//        }
//
//        for (int w = 0; w < Plansza.plansza.length; w++) { // Sprwadzenie po wierszach
//
//            int licznik = 0;
//            for (int p = 0; p < Plansza.plansza.length; p++) {
//
//                if (Plansza.plansza[p][w] == 'O') {
//                    licznik++;
//                }
//
//                if (czyMoznaPostawicZnak(w, p)) {
//                    wiersz = p;
//                    kolumna = w;
//                }
//            }
//
//
//            if (wiersz != -1 && kolumna != -1) {
//                if (licznik == 1) {
//                    // myślę że 60% to będzie wystarczający
//                    ocena[wiersz][kolumna] += 2;
//
//                }
//                if (licznik == 2) {
//                    ocena[wiersz][kolumna] += 10;
//                    // Znaczny wpływ na ocenę! Jeden ruch do wygrania - Powinno być przynajmniej 90% wpłyewu na ocenę nastęnego ruchu.
//
//
//                }
//            }
//
//            wiersz = -1;
//            kolumna = -1;
//        }
//
//
//
//        // Sprwadzenie po przekatnych od lewego gornego rogu
//        if (true) {
//            wiersz = -1;
//            kolumna = -1;
//
//            int licznik = 0;
//
//            if (Plansza.plansza[0][0] == 'O') {
//                licznik++;
//            }
//
//            if (Plansza.plansza[1][1] == 'O') {
//                licznik++;
//            }
//
//            if (Plansza.plansza[2][2] == 'O') {
//                licznik++;
//            }
//
//
//
//            if (wiersz != -1 && kolumna != -1) {
//                if (Plansza.plansza[0][0] == ' ') {
//                    wiersz = 0;
//                    kolumna = 0;
//                }
//
//                if (Plansza.plansza[1][1] == ' ') {
//                    licznik++;
//                }
//
//                if (Plansza.plansza[2][2] == ' ') {
//                    licznik++;
//                }
//
//            }
//            if (wiersz != -1 && kolumna != -1) {
//                if (licznik == 1) {
//                    // myślę że 60% to będzie wystarczający
//                    ocena[wiersz][kolumna] += 2;
//
//                }
//                if (licznik == 2) {
//                    ocena[wiersz][kolumna] += 10;
//                    // Znaczny wpływ na ocenę! Jeden ruch do wygrania - Powinno być przynajmniej 90% wpłyewu na ocenę nastęnego ruchu.
//
//
//                }
//            }
//
//
//            wiersz = -1;
//            kolumna = -1;
//
//        }
//
//        // Sprwadzenie po przekatnych od prawego gornego rogu // i wiersz , j kolumna
//        if (true) {
//            int licznik = 0;
//
//            if (Plansza.plansza[0][2] == 'O') {
//                licznik++;
//            }
//
//            if (Plansza.plansza[1][1] == 'O') {
//                licznik++;
//            }
//
//            if (Plansza.plansza[2][0] == 'O') {
//                licznik++;
//            }
//
//            if (licznik == 3) {
//
//            }
//        }
//
//
//    }
//
//
//}
//
//
////
////    public static void ileRuchowDoKonca_SI() {
////                        System.out.println("askdo");
////
////
////
////    }
////
////
////    public static void zmniejszenieUlozenPrzeciwnika_SI() {
////
////
////    }
//
//
