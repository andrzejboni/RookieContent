package com.company.java;

public class Ulamek {
    public int licznik;
    public int mianownik;

    public int getLicznik() {
        return licznik;
    }

    public void setLicznik(int licznik) {
        this.licznik = licznik;
    }

    public int getMianownik() {
        return mianownik;
    }

    public void setMianownik(int mianownik) {
        this.mianownik = mianownik;
    }

    public Ulamek(int licznik, int mianownik){
        this.licznik = licznik;
        this.mianownik = mianownik;

    }


    public void dodawanie(int licznikPrzekazany, int mianownikPrzekazany){  // Działa GIT
        int wynikLicznik;
        int wynikMianownik;

        if (mianownik == mianownikPrzekazany){
            wynikLicznik = licznik + licznikPrzekazany;
            System.out.println("Wynik dodawania to: "+ wynikLicznik+"/"+mianownik);
        }
        else {
            wynikLicznik = (licznik*mianownikPrzekazany)+(mianownik*licznikPrzekazany);
            wynikMianownik = mianownik*mianownikPrzekazany;
            System.out.println("Wynik dodawania to: "+ wynikLicznik+"/"+wynikMianownik);
        }
    }

    public void odejmowanie(int licznikPrzekazany, int mianownikPrzekazany){

        int wynikLicznik;
        int wynikMianownik;

        if (mianownik == mianownikPrzekazany){
            wynikLicznik = licznik - licznikPrzekazany;
            System.out.println("Wynik odejmowania to: "+ wynikLicznik+"/"+mianownik);
        }
        else {
            wynikLicznik = (licznik*mianownikPrzekazany)-(mianownik*licznikPrzekazany);
            wynikMianownik = mianownik*mianownikPrzekazany;
            System.out.println("Wynik odejmowania to: "+ wynikLicznik+"/"+wynikMianownik);
        }
    }

    public void mnozenie(int licznikPrzekazany, int mianownikPrzekazany){

        int wynikLicznik;
        int wynikMianownik;

            wynikLicznik = licznik*licznikPrzekazany;
            wynikMianownik = mianownik*mianownikPrzekazany;
            System.out.println("Wynik mnozenia to: "+ wynikLicznik+"/"+wynikMianownik);

    }


    public void dzielenie(int licznikPrzekazany, int mianownikPrzekazany){

        int wynikLicznik;
        int wynikMianownik;

        wynikLicznik = licznik*mianownikPrzekazany;
        wynikMianownik = mianownik*licznikPrzekazany;
        System.out.println("Wynik dzielenia to: "+ wynikLicznik+"/"+wynikMianownik);

    }





}
