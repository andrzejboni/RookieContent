package KoszykProduktow;

public enum PodatekProduktu {

    VAT8(8),
    VAT23(23),
    VAT5(5),
    NO_VAT(0);

    private int podatek;

    PodatekProduktu(int podatek) {
        this.podatek = podatek;
    }

    public int getPodatek() {
        return podatek;
    }

    public void setPodatek(int podatek) {
        this.podatek = podatek;
    }
}
