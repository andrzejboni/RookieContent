package com.company.Enum;

public class BiletMain {

    public static void main(String[] args) {
        Bilet bilet1 = Bilet.NORMALNY_CALODNIOWY;
        Bilet bilet2 = Bilet.ULGOWY_CAŁODNIOWY;
        Bilet bilet3 = Bilet.BRAK_BILETU;
        Bilet bilet4 = Bilet.ULGOWY_GODZINNY;


        System.out.println(bilet1.pobierzCzasJazdy());
        System.out.println(bilet2.pobierzCene());

        bilet1.wyswietlDaneObilecie();
        System.out.println(Bilet.jakiBilet(60,4.8d,false));


    }
}
