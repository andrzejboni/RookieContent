package Prog2.WnuczekNaZakupach.Sklepy.Produkt;

public class Owoc implements Produkt {
    int cena;


    public Owoc(int cena) {
        this.cena = cena;
    }

    @Override
    public void pobierzProdukt() {
        System.out.println("Pobrałeś owoc!");
    }
}
