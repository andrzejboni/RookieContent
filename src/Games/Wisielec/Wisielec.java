package Games.Wisielec;

import Games.Playable;

import java.util.Random;
import java.util.Scanner;


public class Wisielec implements Playable {


     static Scanner scanner = new Scanner(System.in);
    protected int nrZgadywanegoSlowa = 0;
    public static String[] parts;
    public static int iloscProb = 10;
    public static char[] tablicaCharow;
    public static char[] slowoNaChar = new char[20];
    Wypisz wypisz = new Wypisz();

//    Wisielec wisielec = new Wisielec();


    // Potrzebuje dwóch talic -> Jedna tablica ma wyrazy
    // Druga tablica wylosowany wyraz dzieli na chary!

    public int losujSlowo() {
        Random rand = new Random();
        nrZgadywanegoSlowa = rand.nextInt(29) + 1;
        return nrZgadywanegoSlowa;
    }

    public static String[] dodajSlowaDoTablicy(String wiersz) { // URUCHAMIANA W KLASIE WCZYTAJ SLOWO
//        int dlugosc = text.length() - 1;
        String linia = wiersz;

        parts = linia.split(";");
        return parts;  // TUTAJ SĄ SŁOWA SŁOWA ZE WCZYTANEGO TEKSTU W TABLICY, W TABLICY JEST 30 ELEMENTOW
    }

    public char[] rzutujWybraneSlowoNaChar(String[] parts) {

        slowoNaChar = parts[nrZgadywanegoSlowa].toCharArray();
        return slowoNaChar; // TUTAJ JEST JEDNO SLOWO, SLOWO O NUMERZE WYLOSOWANYM Z MET. LOSUJSLOWO, SLOWO JEST W TABLICY CHAROW
    }

    public static void podajLiczbeProb() {
        Wypisz.ileProb();

        iloscProb = scanner.nextInt();

    }


    public void czyPoprawnaLitera(char[] slowoNaChar) {
        tablicaCharow = slowoNaChar;
        char[] tablicaDoWyswieetlania = new char[tablicaCharow.length];
        for (int i = 0; i < tablicaDoWyswieetlania.length; i++) {
            tablicaDoWyswieetlania[i] = '#';
        }


        int j = 0;
        int licznikWygranej = tablicaCharow.length;

        while (j <= 20) {
            int licznik = 0;
            System.out.println(" \n---------------------------------------------");
            for (int i = 0; i < tablicaDoWyswieetlania.length; i++) {
                System.out.print(" " + tablicaDoWyswieetlania[i] + " ");
            }
            System.out.println("\n---------------------------------------------");

            Wypisz.podajLitere();


            String zgadywanaLitera = scanner.nextLine();

            char litera = zgadywanaLitera.charAt(0);


            for (int i = 0; i < tablicaCharow.length; i++) {

                if (litera == tablicaCharow[i]) {
                    tablicaDoWyswieetlania[i] = litera;
                    licznik++;
                    licznikWygranej--;
                }
            }

            if (licznik == 0) {
                Wypisz.niepoprawnaLitera();
            } else {
                Wypisz.poprawnaLitera();
            }
            iloscProb--;
            System.out.println("Pozostało szans: "+ iloscProb);

            if (j == iloscProb) {Wypisz.przegrana(); break;}
            if (j == iloscProb) {Wypisz.przegrana(); break;}
            if (licznikWygranej==0) {Wypisz.wygrana(); break;}


        }

    }
//    public void zgadnijLitere() {
//
//
//        wypisz.powitanie();
//        wypisz.ileProb();
//
//        iloscProb = scanner.nextInt();
//        int i = 0;
//
//        while (i < iloscProb) {
//
//            i++;
//        }
//
//
//    }
//
//    public void gra() {
//
//    }


}
