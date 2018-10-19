package KoszykProduktow;

import PortalStudenta.Student;

import java.util.ArrayList;
import java.util.List;

public class Rachunek {

    private List<Produkt> listaZakupow = new ArrayList<Produkt>();


    public Rachunek(List<Produkt> listaZakupow) {
        this.listaZakupow = listaZakupow;
    }

    public Rachunek() {
        this.listaZakupow = new ArrayList<>();
    }


//
//    public Rachunek(Produkt produkt) {
//        this.listaZakupow.add(produkt);
//    }
//
//    public Rachunek(Produkt p1, Produkt p2, Produkt p3, Produkt p4, Produkt p5) {
//        this.listaZakupow = new ArrayList<>();
//    }


    public List<Produkt> getListaZakupow() {
        return listaZakupow;
    }




    public void setListaZakupow(List<Produkt> listaZakupow) {
        this.listaZakupow = listaZakupow;
    }

    public void wypiszRachunek() {
        for (int i = 0; i < listaZakupow.size(); i++) {
            System.out.println(listaZakupow.get(i));
        }
    }

    public double podsumujRachunekNetto() {
        double suma = 0;
        for (int i = 0; i < listaZakupow.size(); i++) {
            suma += listaZakupow.get(i).cenaProduktuNetto;
        }
        return suma;
    }

    public double podsumujRachunekBrutto() {
        double suma = 0;
        for (int i = 0; i < listaZakupow.size(); i++) {
            suma += listaZakupow.get(i).podajCeneBrutto();
        }
        return suma;
    }

    public double zwrocWartoscPodatku() { // Nie jest tutaj dookreślone, czy mają być to różnice cen brutto i netto, czy ceny (pojedynczej) brutto i netto
        double roznica = 0;
        for (int i = 0; i < listaZakupow.size(); i++) {
            roznica += listaZakupow.get(i).podajCeneBrutto() - listaZakupow.get(i).cenaProduktuNetto;
        }
        return roznica;
    }

    public void kosztPrzyRoznymVACIE() {
        double cena = 0;
        System.out.println("POdatek wynosi " +PodatekProduktu.VAT8.getPodatek());

        for (int i = 0; i < listaZakupow.size(); i++) {
            cena += (listaZakupow.get(i).cenaProduktuNetto * ((PodatekProduktu.VAT8.getPodatek() * 0.01)) + listaZakupow.get(i).cenaProduktuNetto);
        }

        System.out.println("Wszystkie produkty, przy VACie 8% kosztowałyby: " + cena);

        cena = 0;

        for (int i = 0; i < listaZakupow.size(); i++) {
            cena += (listaZakupow.get(i).cenaProduktuNetto * (PodatekProduktu.VAT23.getPodatek() * 0.01)) + listaZakupow.get(i).cenaProduktuNetto;
        }
        System.out.println("Wszystkie produkty, przy VACie 23% kosztowałyby: " + cena);

    }


    @Override
    public String toString() {
        return "Rachunek{" +
                "listaZakupow=" + listaZakupow +
                '}';
    }
}
