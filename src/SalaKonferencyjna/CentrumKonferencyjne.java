package SalaKonferencyjna;

import java.util.ArrayList;
import java.util.List;

public class CentrumKonferencyjne {
    boolean stanCentrum;


    List<SalaKonferencyjna> saleKonferencyjne = new ArrayList<SalaKonferencyjna>();

    boolean dodajSaleKonferencyjna(SalaKonferencyjna o) {

        if (saleKonferencyjne.contains(o)) {
            return false;
        } else {
            saleKonferencyjne.add(o);
            o.setStanSali(true);
            return true;
        }
    }


//
//1 - wylistujWszystkieSale():void - metoda która wypisuje wszystkie sale które znajdują się w CentrumKonferencyjnym.
//    Przetestuj działanie metody w mainie.

    public void wypiszWszystkieSale() {
        saleKonferencyjne.get(1);
    }

    @Override
    public String toString() {
        return "CentrumKonferencyjne{" +
                "stanCentrum=" + stanCentrum +
                ", saleKonferencyjne=" + saleKonferencyjne +
                '}';
    }


//    znajdźNajtanszaSale(int iloscPotrzebnychMiejsc):SalaKonferencyjna

    public SalaKonferencyjna znajdzNajtanszaSale(int iloscPotrzebnychMiejsc) {
        double najtansza = 0;
        int index = 0;
        for (int i = 0; i < saleKonferencyjne.size(); i++) {
            if (saleKonferencyjne.get(i).getCenaSali() < najtansza)
                najtansza = saleKonferencyjne.get(i).getCenaSali();
            index = i;
        }
        return saleKonferencyjne.get(index);
    }

}
