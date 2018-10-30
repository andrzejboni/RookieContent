package com.company.start;

import java.util.Scanner;

public class GwiazdkiPiramida {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj wysokosc");

        int wysokosc = scanner.nextInt();
        System.out.println("Podaj szerokosc");
        int szerokosc = scanner.nextInt();

        int pom2 = 1;
        for (int i = 0; i < wysokosc; i++) {
            int pomocnicza = wysokosc;

            if (i < wysokosc) {
                while (i < pomocnicza) {
                    System.out.print(" ");
                    pomocnicza--;
                }
            }

            if (pom2<=szerokosc) {



                for (int j = 0; j < pom2; j++) {

                    System.out.print("@");

                }
                pom2++;
            }

            System.out.println();
            szerokosc++;
        }
    }
}

/*
    @
   @@@
  @@@@@
 @@@@@@@
@@@@@@@@@
  *
 */