package com.company.KontoBankowe;

public class MainKontoBankowe {
    public static void main(String[] args) {
        System.out.println("                  Witamy w ");
        System.out.println("                 ×AndyBank×   ");
        System.out.println("            Jak możemy Ci pomóc?");
        System.out.println();
        KontoBankowe kontoAndrzeja = new KontoBankowe(123L,1000);
        KontoBankowe kontoBeaty = new KontoBankowe(555L,2000);


        kontoAndrzeja.wyswietlStanKonta();

        kontoBeaty.wyswietlStanKonta();

        kontoAndrzeja.przelejSrodki(500,kontoBeaty);


        kontoAndrzeja.wyswietlStanKonta();

        kontoBeaty.wyswietlStanKonta();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("           .†:AndyBank:†.");
        System.out.println("©Twoja kapusta jest u nas bezpieczna.");


//        KontoBankowe kontoCwaniaczka = new KontoBankowe(5555L, 0);
//       // kontoCwaniaczka.stanKonta = 1000000;
//        kontoCwaniaczka.wyswietlStanKonta();

    }

}
