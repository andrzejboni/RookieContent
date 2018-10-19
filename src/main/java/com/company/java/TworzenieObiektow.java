package com.company.java;

public class TworzenieObiektow {
    public String imie;
    public int rokUrodzenia;
    public String kolorWlosow;
    public char plec;

    public TworzenieObiektow(String imie, int rokUrodzenia, String kolorWlosow, char plec) {
        this.imie = imie;
        this.rokUrodzenia = rokUrodzenia;
        this.kolorWlosow = kolorWlosow;
        this.plec = plec;

    }


    public void przedstawSie() {
        System.out.println("Czesc jestem " + imie + " mój kolor wlosow to " + kolorWlosow + " mam " + +(rokUrodzenia) + " lat, plec: " +plec);
    }


    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getKolorWlosow() {
        return kolorWlosow;
    }

    public void setKolorWlosow(String kolorWlosow) {
        this.kolorWlosow = kolorWlosow;
    }

    public int getRokUrodzenia() {
        return rokUrodzenia;
    }

    public void setRokUrodzenia(int rokUrodzenia) {
        this.rokUrodzenia = rokUrodzenia;
    }
}
