package KoszykProduktow;

import PortalStudenta.Student;

import java.util.ArrayList;
import java.util.List;

public class Rachunek {

    List<Produkt> listaZakupow = new ArrayList<Produkt>();

    Rachunek(Produkt produkt) {
        this.listaZakupow.add(produkt);
    }

    Rachunek(Produkt p1, Produkt p2, Produkt p3, Produkt p4, Produkt p5) {
        this.listaZakupow = new ArrayList<>();
    }


    @Override
    public String toString() {
        return "Rachunek{" +
                "listaZakupow=" + listaZakupow +
                '}';
    }
}
