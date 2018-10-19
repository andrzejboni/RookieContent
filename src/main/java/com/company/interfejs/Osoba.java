package com.company.interfejs;

import java.util.Objects;

public class Osoba implements PosiadaAdres, PosiadaImie{

    String imie;
    String nazwisko;
    Adres adres;

    Osoba(String imie, String nazwisk, Adres adres ){
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;

    }


    @Override
    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    @Override
    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Osoba osoba = (Osoba) o;
        return Objects.equals(adres, osoba.adres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adres);
    }
}
