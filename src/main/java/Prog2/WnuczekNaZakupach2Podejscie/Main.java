package Prog2.WnuczekNaZakupach2Podejscie;

import Prog2.WnuczekNaZakupach.FormaPlatnosci;

public class Main {
    public static void main(String[] args) {

        System.out.println("");

        Portfel portfel = new Portfel(200);

        portfel.otworzProtfel();
        portfel.dodajKwote(12000);
        portfel.zamknijProtfel();

        System.out.println(portfel.toString());
//
//        portfel.getFormaPieniedzy();
//        portfel.stanDostepnychSrodkow();
//        portfel.zabierzDostepneSrodki();
//        portfel.stanDostepnychSrodkow();
//        System.out.println(portfel.toString());


    }
}
