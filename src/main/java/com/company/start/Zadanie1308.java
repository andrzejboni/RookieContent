package com.company.start;

import java.util.Random;

public class Zadanie1308 {
    public static void main(String[] args) {

        Random rand = new Random();
        int[] tablica = new int[100];

        for (int i = 0; i < 100; i++) {
            int n = rand.nextInt(100) + 1;
            tablica[i] = n;
        }

        for (int i =0; i< tablica.length; i++) {
            switch (ileDzielnikow(tablica[i])) {
                case 1:
                    System.out.println(" 1 dzilenik ma " + tablica[i]);
                    break;
                case 2:
                    System.out.println(" 2 dzielniki ma " + tablica[i]);
                    break;
                case 3:
                    System.out.println(" 3 dzielniki ma " + tablica[i]);
                    break;
                case 4:
                    System.out.println(" 4 lub wiecej dzielnikow ma " + tablica[i]);
                    break;
            }
        }

    }

    public static int ileDzielnikow(int x){
        int licznik =0;
        if (x<2){;}

        for (int i=1; i <= x; i++) {
            if (x % i == 0) {

                licznik++;
            }
        }

        return licznik;
        }
    }



