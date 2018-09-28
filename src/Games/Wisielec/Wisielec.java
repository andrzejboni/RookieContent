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
    public static char[] slowoNaChar = new char[10 + 1];
    Wypisz wypisz = new Wypisz();

//    Wisielec wisielec = new Wisielec();


    // Potrzebuje dwóch talic -> Jedna tablica ma wyrazy
    // Druga tablica wylosowany wyraz dzieli na chary!

    public int losujSlowo() {
        Random rand = new Random();
        nrZgadywanegoSlowa = rand.nextInt(30) + 1;
        return nrZgadywanegoSlowa;
    }

    public static String[] dodajSlowaDoTablicy(String line) { // URUCHAMIANA W KLASIE WCZYTAJ SLOWO
//        int dlugosc = text.length() - 1;
        String linia = line;

        parts = linia.split(";");
        return parts;
    }

    public char[] rzutujWybraneSlowoNaChar(String[] parts) {

        slowoNaChar = parts[nrZgadywanegoSlowa].toCharArray();
        return slowoNaChar;
    }

    public boolean czyPoprawnaLitera(char[] slowoNaChar) {
        tablicaCharow = slowoNaChar;
        String zgadywanaLitera = scanner.nextLine();
//        zgadywanaLitera.toCharArray();
        int licznik = 0;

        for (int i = 0; i < slowoNaChar.length; i++) {

            if (zgadywanaLitera.equals(tablicaCharow[i])) {
                Wypisz.poprawnaLitera();
                Wypisz.wypiszStan(tablicaCharow[i]);
                licznik++;

            }
        }

        if (licznik != 0) {
            return true;
        }

        iloscProb--;
        return false;
    }


    public void zgadnijLitere() {


        wypisz.powitanie();
        wypisz.ileProb();

        iloscProb = scanner.nextInt();
        int i = 0;

        while (i < iloscProb) {

            i++;
        }


    }

    public void gra() {

    }


    @Override
    public void start() {

    }
}
