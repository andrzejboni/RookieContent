package com.company.ProgramDoObslugiZamowien;

import java.util.ArrayList;
import java.util.Arrays;

public class Zamowienie {

    private ArrayList<Pozycja> pozycje = new ArrayList<>();
    //    Pozycja[] pozycje;
    int maksRozmiar = 10;
    int iloscSztuk;
    int cena;

    int licznikRozmiaru =0;

    double cenaRazem;

    Zamowienie(int maksRozmiar) {
        this.pozycje = pozycje;
        this.maksRozmiar = maksRozmiar;

    }


    Zamowienie() {       // Konstruktor domyślny, bezargumentowy
        this.pozycje = pozycje;
        this.maksRozmiar = maksRozmiar;
    }

    public void dodajPozycje(Pozycja pozycja) {
        if (licznikRozmiaru < maksRozmiar){
        pozycje.add(pozycja);
        cenaRazem += pozycja.cenaSztuki*pozycja.iloscSztuk;
        licznikRozmiaru++;}
        else {
            System.out.println("Twoje zamówienie osiągnęło maksymalny rozmiar!");
        }
    }

    public double obliczWartosc() {

        return cenaRazem;
    }

    @Override
    public String toString() {
        return "Zamowienie: \n" + pozycje + "\nRazem:" + cena + " zł";
    }

    public void wypisz(){
        System.out.println("Zamowienie: \n" + pozycje + "\n Razem:" + obliczWartosc() + " zł");}

    public int getIloscSztuk() {
        return iloscSztuk;
    }

    public void setIloscSztuk(int iloscSztuk) {
        this.iloscSztuk = iloscSztuk;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }
}
