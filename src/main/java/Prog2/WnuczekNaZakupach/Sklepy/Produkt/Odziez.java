package Prog2.WnuczekNaZakupach.Sklepy.Produkt;

public class Odziez implements Produkt {
    int cena;

    public Odziez(int cena) {
        this.cena = cena;
    }

    @Override
    public void pobierzProdukt() {
        System.out.println("Pobrano odzież!");
    }
}
