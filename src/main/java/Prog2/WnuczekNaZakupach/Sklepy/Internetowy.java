package Prog2.WnuczekNaZakupach.Sklepy;


import Prog2.WnuczekNaZakupach.FormaPlatnosci;
import Prog2.WnuczekNaZakupach.Sklepy.Produkt.Produkt;

public class Internetowy implements  Sklep {
    FormaPlatnosci f1 = FormaPlatnosci.KartaPlatnicza;

    WyslijMaila wyslijMaila;



    @Override
    public void kupProdukt(Produkt produkt) {
        System.out.println("Kupiono "+produkt+" na w sklepie internetowym!");
    }
}
