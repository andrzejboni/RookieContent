package KoszykProduktow;

public class Produkt {

    String nazwaProduktu;
    double cenaProduktuNetto;
    double iloscPodatku;

    double podajCeneBrutto() {

        return 1;
    }


    public String getNazwaProduktu() {
        return nazwaProduktu;
    }

    public void setNazwaProduktu(String nazwaProduktu) {
        this.nazwaProduktu = nazwaProduktu;
    }

    public double getCenaProduktuNetto() {
        return cenaProduktuNetto;
    }

    public void setCenaProduktuNetto(double cenaProduktuNetto) {
        this.cenaProduktuNetto = cenaProduktuNetto;
    }

    public double getIloscPodatku() {
        return iloscPodatku;
    }

    public void setIloscPodatku(double iloscPodatku) {
        this.iloscPodatku = iloscPodatku;
    }
}
