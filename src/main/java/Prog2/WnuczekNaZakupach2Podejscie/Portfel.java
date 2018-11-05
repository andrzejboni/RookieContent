package Prog2.WnuczekNaZakupach2Podejscie;

import Prog2.WnuczekNaZakupach.FormaPlatnosci;

public class Portfel extends GotowkoweZrodlaPieniedzy implements IProsteZrodloPieniedzy {

    @Override
    public String toString() {
        return "Portfel{" +
                "formaPlatnosci=" + formaPlatnosci +
                ", kwota=" + super.kwota +
                '}';
    }

    public Portfel(int kwota) {
        super.kwota = kwota;
        super.formaPlatnosci = formaPlatnosci;

    }

    @Override
    public void ustawKwote(Integer kwota) {
        super.kwota = kwota;
    }

    @Override
    public void dodajKwote(Integer kwota) {
        super.kwota += kwota;
    }

    @Override
    public void odejmijKwote(Integer kwota) {
        if (kwota > super.kwota) {
            System.out.println("Wyciagnieto z konta maksymalną kwotę" + kwota);
            super.kwota = 0;
            return;
        }
        super.kwota -= kwota;
    }

    @Override
    public FormaPlatnosci getFormaPieniedzy() {
        return this.formaPlatnosci;
    }

    public void otworzProtfel() {
        System.out.println("Otwarto porfel");
    }

    public void zamknijProtfel() {

        System.out.println("Zamknieto portfel");
    }


    @Override
    public int zabierzDostepneSrodki() {
        return super.kwota = 0;
    }

    @Override
    public int stanDostepnychSrodkow() {
        return super.kwota;
    }
}
