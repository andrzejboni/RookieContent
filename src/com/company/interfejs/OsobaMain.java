package com.company.interfejs;

import sun.rmi.transport.ObjectTable;

import java.util.Objects;

public class OsobaMain {
    public static void main(String[] args) {
        // Adres Gdańska do porównania
        Adres adresGdansk = new Adres(" ", "Gdańsk", 0);
        Osoba osobaAdresGdansk = new Osoba(" ", " ", adresGdansk);
        // Firma z Gdańska do porównania
        Firma firmaAdresGdansk = new Firma("Pchlak C.O.", adresGdansk);

        // ########################


        Adres adresos1 = new Adres("Szczupacza", "Gdańsk", 12);
        Adres adresos2 = new Adres("Kazimierza", "Gdynia", 188);
        Adres adresfirma1 = new Adres("Rycha z Bogdańca", "Gdańsk", 11);
        Adres adresfirma2 = new Adres("Ernesta ", "Kolibki", 1);


        Osoba os1 = new Osoba("Janusz", "Pchlak", adresos1);
        Osoba os2 = new Osoba("Jan", "Roczny", adresos2);

        Firma firma1 = new Firma("Pchlak C.O.", adresfirma1);
        Firma firma2 = new Firma("Trąd z.o.o", adresfirma2);

//
//        System.out.println(adresGdansk.equals(adresos1)); // Działa, z tym że niepoprawnie  stworzone są zależności. Spradza dla klasy Adres, potrzbuje porównania w klasie Osoba lub Firma.
//        System.out.println(adresGdansk.equals(adresfirma1));

//
//        System.out.println(osobaAdresGdansk.equals(os1));
//        System.out.println(firmaAdresGdansk.equals(firma1));


        System.out.println(czyGdanskiAdres(firma1));


    }

    public static boolean czyGdanskiAdres(PosiadaAdres o) {
        ///if (== o) return true;
//        System.out.println(o.getClass());
//        System.out.println(o.toString());
        if (o instanceof Firma) {
            System.out.println("Obiek jest Firmą");
        } else {
            System.out.println("Obiekt jest osobą");
        }

        Adres adres = o.getAdres();

        return Objects.equals("Gdańsk", adres.miasto);

    }


}
