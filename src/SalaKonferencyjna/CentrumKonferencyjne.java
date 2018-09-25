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
        double najtansza = 9999999;
        int index = -1;

        for (int i = 0; i < saleKonferencyjne.size(); i++) {

            if (saleKonferencyjne.get(i).getPojemnoscSali() >= iloscPotrzebnychMiejsc && saleKonferencyjne.get(i).getStanSali()) {
                if (saleKonferencyjne.get(i).getCenaSali() < najtansza) {
                    najtansza = saleKonferencyjne.get(i).getCenaSali();
                    index = i;
                }
            }
        }
        if (index == -1) {
            return null;
        } else {
            return saleKonferencyjne.get(index);
        }

    }

    public SalaKonferencyjna znajdzNajtanszaSal2e() {
        double najtansza = 9999999;
        int index = -1;

        for (int i = 0; i < saleKonferencyjne.size(); i++) {

            if (saleKonferencyjne.get(i).getStanSali()) {
                if (saleKonferencyjne.get(i).getCenaSali() < najtansza) {
                    najtansza = saleKonferencyjne.get(i).getCenaSali();
                    index = i;
                }
            }
        }
        if (index == -1) {
            return null;
        } else {
            return saleKonferencyjne.get(index);
        }

    }

    boolean zarezerwujSale(int numerSali) {
        for (int i = 0; i < saleKonferencyjne.size(); i++) {
            if (saleKonferencyjne.get(i).getStanSali() == true) {
                if (saleKonferencyjne.get(i).getNumerSali() == numerSali) {
                    saleKonferencyjne.get(i).setStanSali(false);
                    return true;
                }
            }
        }
        return false;
    }

    void wypiszWolneSale() {
        for (int i = 0; i < saleKonferencyjne.size(); i++) {
            if (saleKonferencyjne.get(i).getStanSali() == true) {
                System.out.println("Wolna sala :" + saleKonferencyjne.get(i));

            }
        }
    }

    boolean zwolnijSale(int numerSali) {
        for (int i = 0; i < saleKonferencyjne.size(); i++) {
            if (saleKonferencyjne.get(i).getStanSali() == false) {
                if (saleKonferencyjne.get(i).getNumerSali() == numerSali) {
                    saleKonferencyjne.get(i).setStanSali(true);
                    return true;
                }
            }
        }
        return false;
    }

    void wypiszStanSali(int numerSali) {

        for (int i = 0; i < saleKonferencyjne.size(); i++) {
            if (saleKonferencyjne.get(i).getNumerSali() == numerSali) {
                System.out.println(saleKonferencyjne.get(i).getStanSali());
            }
        }
    }
}

