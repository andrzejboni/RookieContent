package SalaKonferencyjna;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        SalaKonferencyjna s1 = new SalaKonferencyjna(100, false, 80, 20);
        SalaKonferencyjna s2 = new SalaKonferencyjna(101, false, 150, 50);
        SalaKonferencyjna s3 = new SalaKonferencyjna(102, false, 200, 100);
        SalaKonferencyjna s4 = new SalaKonferencyjna(103, false, 300, 200);
        SalaKonferencyjna s5 = new SalaKonferencyjna(104, false, 100, 40);

        CentrumKonferencyjne centrumKonferencyjne = new CentrumKonferencyjne();

        centrumKonferencyjne.dodajSaleKonferencyjna(s1);
        centrumKonferencyjne.dodajSaleKonferencyjna(s2);
        centrumKonferencyjne.dodajSaleKonferencyjna(s3);
        centrumKonferencyjne.dodajSaleKonferencyjna(s4);
        centrumKonferencyjne.dodajSaleKonferencyjna(s5);

//        System.out.println(centrumKonferencyjne.toString());
//        centrumKonferencyjne.toString(); // Wypisuje wszystkie sale w objekcie i w ogóle i wszczególe.
//        System.out.println(centrumKonferencyjne.znajdzNajtanszaSale(130));


        Scanner sc = new Scanner(System.in);


        System.out.println("Wypisz staff który chcesz uzyskać, oferuję: \n wypiszWymaluj, znajdzNajtansze, znajdzNajtansza, zarezerwuj, zwolnij, wypiszStanSali, quit");
        int i = 0;
        while (i <= 100) {
            String tekst = sc.nextLine();

            if (tekst.equals("wypiszWymaluj")) {
                System.out.println(centrumKonferencyjne.toString());
            }


            if (tekst.equals("znajdzNajtansze")) {
                System.out.println(centrumKonferencyjne.znajdzNajtanszaSale(0));
            }


            if (tekst.equals("znajdzNajtansza")) {
                System.out.println("Podaj ilosc miejsc ktore potrzbujesz: ");
                String tekst1 = sc.nextLine();
                System.out.println(centrumKonferencyjne.znajdzNajtanszaSale(Integer.parseInt(tekst1)));
            }

            if (tekst.equals("zarezerwuj")) {
                System.out.println("Podaj nr sali który chesz zarezerwować: ");
                String tekst1 = sc.nextLine();
                System.out.println(centrumKonferencyjne.zarezerwujSale(Integer.parseInt(tekst1)));
            }
            if (tekst.equals("zwolnij")) {
                System.out.println("Podaj nr sali którą chcesz zwolnic: ");
                String tekst2 = sc.nextLine();
                System.out.println(centrumKonferencyjne.zwolnijSale(Integer.parseInt(tekst2)));
            }

            if (tekst.equals("wypiszStanSali")) {
                System.out.println("Podaj nr sali którą stan chcesz wypisac: ");
                String tekst2 = sc.nextLine();
                centrumKonferencyjne.wypiszStanSali(Integer.parseInt(tekst2));
            }
            if (tekst.equals("quit")) {
                System.out.println("Dziękuje za skorzystanie z programu do rezerwacji sal.");
                break;
            }

            i++;
        }
    }
}
