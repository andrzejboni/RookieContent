package com.company.TicTacToe;

public class Wypisywanie {


    public static void przywitanie(){ // Poki co mozliwa tylko gra we 2
        System.out.println("Witaj w grze kółko i krzyżyk .Wiersze i kolumny liczymy od 0. Krzyzyk zaczyna pierwszy.");
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

    public static void zKimChceszZagrac () { System.out.println("Jesli chcesz zagrac z komputerem wpisz  1 , jesli z człowiekiem wpisz  2 .");
    }



}
