package SalaKonferencyjna;

public class Main {
    public static void main(String[] args) {

        SalaKonferencyjna s1 = new SalaKonferencyjna(100,true,100,30);
        SalaKonferencyjna s2 = new SalaKonferencyjna(101,true,150,50);
        SalaKonferencyjna s3 = new SalaKonferencyjna(102,true,200,100);
        SalaKonferencyjna s4 = new SalaKonferencyjna(103,true,300,200);
        SalaKonferencyjna s5 = new SalaKonferencyjna(104,true,100,30);

        CentrumKonferencyjne centrumKonferencyjne = new CentrumKonferencyjne();

        centrumKonferencyjne.dodajSaleKonferencyjna(s1);
        centrumKonferencyjne.dodajSaleKonferencyjna(s2);
        centrumKonferencyjne.dodajSaleKonferencyjna(s3);
        centrumKonferencyjne.dodajSaleKonferencyjna(s4);
        centrumKonferencyjne.dodajSaleKonferencyjna(s5);



//        System.out.println(centrumKonferencyjne.toString());

//        centrumKonferencyjne.toString(); // Wypisuje wszystkie sale w objekcie i w ogóle i wszczególe.


        System.out.println(centrumKonferencyjne.znajdzNajtanszaSale(120));
//


//          centrumKonferencyjne.wypiszWszystkieSale();
    }
}
