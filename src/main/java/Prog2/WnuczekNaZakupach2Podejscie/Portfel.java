package Prog2.WnuczekNaZakupach2Podejscie;

import Prog2.WnuczekNaZakupach.FormaPlatnosci;

public class Portfel extends GotowkoweZrodlaPieniedzy implements IProsteZrodloPieniedzy {


    public Portfel(int kwota, FormaPlatnosci formaPlatnosci) {
        super.kwota = kwota;
        this.formaPlatnosci = formaPlatnosci;
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
        if (kwota >super.kwota){
            System.out.println("Wyciagnieto z konta maksymalną kwotę"+ kwota);
            super.kwota = 0;
            return;
        }
        super.kwota -= kwota;
    }

    @Override
    public FormaPlatnosci getFormaPieniedzy() {
        return this.formaPlatnosci;
    }


}
