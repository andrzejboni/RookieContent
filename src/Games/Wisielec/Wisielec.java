package Games.Wisielec;

import Games.Playable;

import java.util.Random;
import java.util.Scanner;


public class Wisielec implements Playable {


    Scanner scanner = new Scanner(System.in);
    protected int nrZgadywanegoSlowa = 0;
    public static String[] parts;
    int iloscProb;
    public static char[] tablicaCharow;
    public static char[] slowoNaChar = new char[20 + 1];
    Wypisz wypisz = new Wypisz();

//    Wisielec wisielec = new Wisielec();


    // Potrzebuje dwóch talic -> Jedna tablica ma wyrazy
    // Druga tablica wylosowany wyraz dzieli na chary!

    public int losujSlowo() {
        Random rand = new Random();
        nrZgadywanegoSlowa = rand.nextInt(15) + 1;
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

    public void podajLiczbeProb() {
        Wypisz.powitanie();
        Wypisz.ileProb();

        iloscProb = scanner.nextInt();

    }

    public boolean czyPoprawnaLitera(char[] slowoNaChar) {
        tablicaCharow = slowoNaChar;

        int j = 0;
        int licznik = 0;
        int temp = 0;

        while (j < iloscProb) {
            Wypisz.podajLitere();

            String zgadywanaLitera = scanner.nextLine();
//        zgadywanaLitera.toCharArray();


            for (int i = 0; i < tablicaCharow.length; i++) {

                if (zgadywanaLitera.equals(tablicaCharow[i])) {
                    licznik++;
                    temp = j;
                }
            }

            if (licznik != 0) {
                Wypisz.poprawnaLitera();
                Wypisz.wypiszStan(tablicaCharow[j]);
                iloscProb--;
                return true;
            }

            j++;
            iloscProb--;
            return false;

        }
        return false;
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
