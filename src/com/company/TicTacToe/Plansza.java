package com.company.TicTacToe;

//import static com.company.TicTacToe.Logika.plansza;

public class Plansza {

    public static char plansza[][] = new char[3][3];

    public static char getPlansza(int i, int j) { // zmienione!
        return plansza[i][j];
    }

    public static void setPlansza(int i, int j, char znak) {
        plansza[i][j] = znak;
    }


    public static void wyczyscPlansze() { // DO POPRAWKI - MOŻE WYGLADAC TAK JAK metoda postaw znak w klasie kolko  i krzyk
        for (int i = 0; i < plansza.length; i++) {

            for (int j = 0; j < plansza.length; j++) {// j  kolumna, i wiersz
                plansza[i][j] = ' ';
            }
        }

    }


    public static void wypisz() {
        System.out.println("Plansza: ");
        for (int i = 0; i < plansza.length; i++) {

            for (int j = 0; j < plansza.length; j++) {// j  kolumna, i wiersz
                System.out.print("[" + getPlansza(i, j) + "]");
            }
            System.out.println();
        }
    }


}
