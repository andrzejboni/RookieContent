package Prog2.WnuczekNaZakupach.Sklepy;

import Prog2.WnuczekNaZakupach.Sklepy.Produkt.Produkt;
import Prog2.WnuczekNaZakupach.FormaPlatnosci;

public class Bazar implements Sklep, Produkt {
    FormaPlatnosci formaPlatnosci = FormaPlatnosci.Gotowka;

    public Bazar() {

    }

    @Override
    public void kupProdukt(Produkt produkt) {
        System.out.println("Kupiono "+produkt+" na Bazarze!");
    }
}
