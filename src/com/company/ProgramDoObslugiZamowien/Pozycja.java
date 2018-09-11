package com.company.ProgramDoObslugiZamowien;

public class Pozycja {

    String nazwaTowaru;
    int iloscSztuk;
    double cenaSztuki;


    Pozycja(String nazwaTowaru, double cenaSztuki, int iloscSztuk) {
        this.nazwaTowaru = nazwaTowaru;
        this.cenaSztuki = cenaSztuki;
        this.iloscSztuk = iloscSztuk;
    }

    public double obliczWartosc(){
        return cenaSztuki*iloscSztuk;
    }

    @Override
    public String toString() {
        return nazwaTowaru +" "+cenaSztuki+" zł "+iloscSztuk+" szt. "+obliczWartosc()+" zł \n";
    }
}
