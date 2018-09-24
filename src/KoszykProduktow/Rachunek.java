package KoszykProduktow;

import PortalStudenta.Student;

import java.util.ArrayList;
import java.util.List;

public class Rachunek {

    List<Produkt> listaZakupow = new ArrayList<Produkt>();

    Rachunek(List listaZakupow){
        this.listaZakupow = listaZakupow;
    }


    Rachunek(){
        this.listaZakupow = new ArrayList<>();
    }




    @Override
    public String toString() {
        return "Rachunek{" +
                "listaZakupow=" + listaZakupow +
                '}';
    }
}
