package KoszykProduktow;

public class Produkt {

    String nazwaProduktu;
    double cenaProduktuNetto;
    double iloscPodatku;


    Produkt(String nazwaProduktu, double cenaProduktuNetto, PodatekProduktu podatekProduktu) {
        this.nazwaProduktu = nazwaProduktu;
        this.cenaProduktuNetto = cenaProduktuNetto;
        this.iloscPodatku = podatekProduktu.getPodatek();
    }

    double podajCeneBrutto() {
        return (((cenaProduktuNetto * (iloscPodatku / 100)) + cenaProduktuNetto));
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

    @Override
    public String toString() {
        return "Produkt{" +
                "nazwaProduktu='" + nazwaProduktu + '\'' +
                ", cenaProduktuNetto=" + cenaProduktuNetto +
                ", iloscPodatku=" + iloscPodatku +
                '}';
    }
}
