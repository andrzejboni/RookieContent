package com.company.java;


//import static com.company.java.TworzenieObiektow.przedstawSie;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
//
//        TworzenieObiektow andrzej = new TworzenieObiektow();
//        TworzenieObiektow mariola = new TworzenieObiektow();
//        TworzenieObiektow rysiek = new TworzenieObiektow();
//
//        andrzej.setImie("Andrzej");
//        andrzej.setRokUrodzenia(1959);
//
//        mariola.setImie("Mariola");
//        mariola.setRokUrodzenia(1981);
//
//        rysiek.setImie("Ryszard");
//        rysiek.setRokUrodzenia(1993);
//
//        mariola.przedstawSie();
//        andrzej.przedstawSie();
//        rysiek.przedstawSie();


        String[] imiona = new String[]{"Piotr", "Jerzy", "Jan", "Zygmunt", "Bogdan", "Józef", "Ryszard", "Henryk", "Andrzej", "Zenon"};
        String[] kolorWlosow = new String[]{"blond","brazowe","czarne","kasztanowe","rude"};

        Random rand = new Random();


        TworzenieObiektow[] ludzieZkonstruktora = new TworzenieObiektow[3];



        TworzenieObiektow p1 = new TworzenieObiektow("Marlena", 1999, "musztardowy",'k');
        TworzenieObiektow p2 = new TworzenieObiektow("Grażyna", 1809, "grzybowy",'k');
        TworzenieObiektow p3 = new TworzenieObiektow("Zenon", 1000, "rudy",'m');



            ludzieZkonstruktora[0] = p1;
            ludzieZkonstruktora[1] = p2;
            ludzieZkonstruktora[2] = p3;


        for (int i = 0; i < 3; i++) { // ALE SZTOS !!!!

            if(ludzieZkonstruktora[i].plec == 'k') {
                ludzieZkonstruktora[i].przedstawSie();
            }
        }






  //      TworzenieObiektow[] czlowiek = new TworzenieObiektow[10];
//        for (int i = 0; i < czlowiek.length; i++) { // Tworzenie obiektów typu człowiek
//            czlowiek[i] = new TworzenieObiektow();
//        }

//        for (int i = 0; i < czlowiek.length; i++) {
//            int n = rand.nextInt(60) + 10;
//            int m = rand.nextInt(9);
//            int o = rand.nextInt(5);
//            //System.out.println(m);
//            czlowiek[i].setRokUrodzenia(n);
//            czlowiek[i].setImie(imiona[m]);
//            czlowiek[i].setKolorWlosow(kolorWlosow[o]);
//        }
//
//
//        for (int i = 0; i < czlowiek.length; i++) {
//            czlowiek[i].przedstawSie();
//
//        }


    }
}
