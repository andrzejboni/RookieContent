package Games.Wisielec;

import Games.Playable;

import java.util.Random;
import java.util.Scanner;


public class Wisielec implements Playable {


    Scanner scanner = new Scanner(System.in);
    protected int nrZgadywanegoSlowa = 0;
    public static String[] parts;
    int iloscProb;

    Wisielec wisielec = new Wisielec();


    // Potrzebuje dwóch talic -> Jedna tablica ma wyrazy
    // Druga tablica wylosowany wyraz dzieli na chary!

    public int losujSlowo() {
        Random rand = new Random();
        nrZgadywanegoSlowa = rand.nextInt(30) + 1;
        return nrZgadywanegoSlowa;
    }

    public static String[] dodajSlowaDoTablicy(String line) {
//        int dlugosc = text.length() - 1;
        String linia = line;

        parts = linia.split(";");
        return parts;
    }

    public char[] rzutujWybraneSlowoNaChar(String[] parts) {
        char[] slowoNaChar = new char[parts.length + 1];
        slowoNaChar = parts[nrZgadywanegoSlowa].toCharArray();
        return slowoNaChar;
    }

    public boolean czyPoprawnaLitera(char[] slowoNaChar) {
        String zgadywanaLitera = scanner.nextLine();
        zgadywanaLitera.toCharArray();

        for (int i = 0; i < slowoNaChar.length; i++) {

            if (zgadywanaLitera == zgadywanaLitera) {
                Wypisz.poprawnaLitera();
            } else {
                Wypisz.niepoprawnaLitera();
            }

        }

        return true;
    }


    public void zgadnijLitere() {
        Wypisz wypisz = new Wypisz();

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
