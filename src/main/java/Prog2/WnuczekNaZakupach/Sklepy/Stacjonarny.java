package Prog2.WnuczekNaZakupach.Sklepy;

import Prog2.WnuczekNaZakupach.FormaPlatnosci;
import Prog2.WnuczekNaZakupach.Sklepy.Produkt.Produkt;

public class Stacjonarny  implements Sklep {
    FormaPlatnosci f2= FormaPlatnosci.Gotowka;
    FormaPlatnosci f1 = FormaPlatnosci.KartaPlatnicza;

    @Override
    public void kupProdukt(Produkt produkt) {

    }
}
