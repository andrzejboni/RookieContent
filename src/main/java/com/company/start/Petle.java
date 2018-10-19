package com.company.start;

public class Petle {
    public static void main (String[] args) {


        // zgromadzona kwota
        // kwota która wpłacilismy
        double on = 3;  // oprocentowanie roczne
        double n = 12; // liczba kapitalizacji  12 bo 12 miesiecy
        double l = 1; // czas trwania umowy w latach
        double w = 1000;

        System.out.println("Wpłaciłeś 1000 zł");
//        for (int j = 1; j <= n; j++) {
//
//
//            // double z = w * (1 + (0.03/12)*1);  // Procent prosty
//
//            double z = (w * (Math.pow((1 + (((on / 12) / (n * 100)))), (n * l))));  // Procent składany
//            System.out.print("Zgromadzona kwota po " + j + " miesiacu, to ");
//            System.out.format("%.2f%n", z);
//            w = z;
//
//        }

        // -----------------------------------Podatek Belki
        for (int j = 1; j <= n; j++) {


            // double z = w * (1 + (0.03/12)*1);  // Procent prosty
            double Belka = (Math.pow((1 + (((on / 12) / (n * 100)))), (n * l)));
            double z = (w * (Belka));
            double OdliczeniePodatku = (z-w)*0.81;
            System.out.print("Zgromadzona kwota po " + j + " miesiacu, to " );
           System.out.format("%.2f%n", z);

            w = z;

        }


    }

}
