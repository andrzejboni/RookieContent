package com.company.java;

public class Kabriolet extends Samochod {

    boolean czyDachSchowany;

    Kabriolet(int predkosc, boolean swiatla, String kolor, String marka, int rocznik, boolean czyDachSchowany, int nrVIN) {
        super(predkosc, swiatla, kolor, marka, rocznik, nrVIN);
        this.czyDachSchowany = czyDachSchowany;
    }

    @Override
    public void przyspiesz() {

        if (predkosc < 220) {
            predkosc += 10;
            System.out.println("Przyspieszam, teraz jade " + predkosc);
        } else {
            System.out.println("Maksymalna predkosc zostala osiagnieta! Wiecej nie wyciśniesz");
        }
    }


    public void schowajDach() {
        System.out.println("Chowam dach");
        czyDachSchowany = false;
    }

    public boolean czyDachSchowany() {
        if (this.czyDachSchowany) {
            System.out.println("dach jest schowany");
            return true;
        } else {
            System.out.println("Dach nie jest schowany");
            return false;
        }
    }

    public String toString() {
        return  super.toString() +"z rozsuwanym świetnym dachem ";
    }




}
