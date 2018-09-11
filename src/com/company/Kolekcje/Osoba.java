package com.company.Kolekcje;

public class Osoba {
    int pesel;
    String imie;
    String nazwisko;

Osoba(String imie, String nazwisko, int pesel) {
    this.imie = imie;
    this.nazwisko = nazwisko;
    this.pesel = pesel;
}

    @Override
    public String toString() {
        return "Osoba{" +
                "pesel=" + pesel +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}
