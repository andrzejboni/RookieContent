package KoszykProduktow;

public class Main {
    public static void main(String[] args) {

        PodatekProduktu vat5 = PodatekProduktu.VAT5;
        PodatekProduktu vat8 = PodatekProduktu.VAT8;
        PodatekProduktu vat23 = PodatekProduktu.VAT23;
        PodatekProduktu NO_VAT = PodatekProduktu.NO_VAT;

        Rachunek rachunek = new Rachunek();


        Produkt p1 = new Produkt("mleko", 200.0, vat5);
        Produkt p2 = new Produkt("woda", 200.0, vat8);
        Produkt p3 = new Produkt("czekolada", 200.0, vat23);
        Produkt p4 = new Produkt("mąka", 200.0, NO_VAT);
        Produkt p5 = new Produkt("kartoffle", 200.0, vat5);


        Rachunek rachunek1 = new Rachunek();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());

        System.out.println("Cena brutto tego produktu to :" + p1.podajCeneBrutto());
        System.out.println("Cena brutto tego produktu to :" + p2.podajCeneBrutto());
        System.out.println("Cena brutto tego produktu to :" + p3.podajCeneBrutto());
        System.out.println("Cena brutto tego produktu to :" + p4.podajCeneBrutto());
        System.out.println("Cena brutto tego produktu to :" + p5.podajCeneBrutto());





    }
}
