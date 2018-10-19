package com.company.java;

import java.util.Objects;

public class Samochod {

    int predkosc;
    boolean swiatla;


    String kolor;
    String marka;
    int rocznik;
    int nrVIN;


    public void przyspiesz() {

        if (predkosc < 120) {
            predkosc += 10;
            System.out.println("Przyspieszam, teraz jade " + predkosc);
        } else {
            System.out.println("Maksymalna predkosc zostala osiagnieta! Wiecej nie wyciśniesz");
        }
    }

    public void wlaczSwiatla() {
        swiatla = true;
        System.out.println("Swiatla wlaczone");
    }

    public boolean czySwiatlaWlaczone() {
        if (swiatla) return true;
        else return false;
    }

    Samochod(int predkosc, boolean swiatla, String kolor, String marka, int rocznik, int nrVIN) {
        this.predkosc = predkosc;
        this.swiatla = swiatla;
        this.kolor = kolor;
        this.marka = marka;
        this.rocznik = rocznik;
        this.nrVIN = nrVIN;

    }

    public String toString() {

        return kolor + " samochod marki " + marka + " rocznik " + rocznik;
    }

//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (obj == null)
//            return false;
//        if (getClass() != obj.getClass())
//            return false;
//        Samochod other = (Samochod) obj;
//        if (kolor == null) {
//            if (other.kolor != null)
//                return false;
//        } else if (!kolor.equals(other.kolor))
//            return false;
//        if (Double.doubleToLongBits(nrVIN) != Double.doubleToLongBits(other.nrVIN))
//            return false;
//        return true;
//    }
//
//    public boolean equals2(Object object){
//        Samochod samochod = (Samochod) object;
//
//
//        if (this.kolor == kolor){return true;}
//        if (this.nrVIN == nrVIN){return true;}
//        return true;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Samochod samochod = (Samochod) o;
        return nrVIN == samochod.nrVIN;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nrVIN);
    }
}
