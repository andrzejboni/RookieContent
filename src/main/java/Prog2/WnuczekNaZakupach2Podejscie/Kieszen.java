package Prog2.WnuczekNaZakupach2Podejscie;

import Prog2.WnuczekNaZakupach.FormaPlatnosci;

public class Kieszen extends GotowkoweZrodlaPieniedzy implements IProsteZrodloPieniedzy  {

    public Kieszen  (int kwota, FormaPlatnosci formaPlatnosci) {
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

    public  void    otworzProtfel(){
        System.out.println("Sięgnięto do kieszni");
    }
    public  void    zamknijProtfel(){

        System.out.println("Wysięgnięto z kieszeni rękę albo co");
    }

    public  void    otwarcieNozaWKieszni(){

        System.out.println("otwarto nóż w kieszeni");
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
