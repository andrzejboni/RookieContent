package Prog2.WnuczekNaZakupach;

import Prog2.WnuczekNaZakupach.ZrodloPieniedzy.PracaDlaWnuczka;

public class Wnuczek implements PracaDlaWnuczka {
    int gotowka = 0;
    int karta = 0;

    public void wykonajPrace(){
        gotowka = PracaDlaWnuczka.dniowka/2;
        karta = PracaDlaWnuczka.dniowka/2;
    }

    public void wezKredyt(){
        gotowka = PracaDlaWnuczka.dniowka/2;
        karta = PracaDlaWnuczka.dniowka/2;

    }

}
