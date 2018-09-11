package com.company.TicTacToe;

public class Wypisywanie {


    public static void przywitanie(){ // Poki co mozliwa tylko gra we 2
        System.out.println("Witaj w grze kółko i krzyżyk \n Jesli chcesz grac z komputerem nacisnij [ k ], jesli chcesz grac z drugim uzytkownikiem [ c ].Wiersze i kolumny liczymy od 0. Krzyzyk zaczyna pierwszy.");
    }
    public static void granie(){
        System.out.println("Podaj współrzędne gdzie chcesz postawić znak: ");
    }


    public static void przegrana(){
        System.out.println("Niestety, przegrałeś, spróbuj jeszcze raz.");
    }

    public static void wygrana(){
        System.out.println("Gratuluje, wygrałeś!");
    }

    public static void remis(){
        System.out.println("Remis, spróbuj jeszcze raz!");
    }



}
