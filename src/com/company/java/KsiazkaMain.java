package com.company.java;

import java.util.Scanner;

public class KsiazkaMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Biblioteka biblioteka = new Biblioteka();

        biblioteka.wypelnijTabliceKsiazek();


        System.out.println("Witaj w biliotece, oto dostępne działania, wciśnij:  \n 1. Sprawdzic dostępność książki \n 2. Wypożyczyć książkę\n 3.Wyswietlic wypozyczone ksiazki\n 4.Wyswietlic dostepne ksiazki\n 5.Exit");

        while (true) {
            String  liczbaDoSwitcha = scanner.nextLine();
            switch (liczbaDoSwitcha) {


                case "1":
                    System.out.println("Wpisz nazwe ksiazki ktora Cie interesuje: ");
                    String szukanaKsiazka = scanner.nextLine();
                    System.out.println("Dostepnosc ksiązki '" + szukanaKsiazka + "' to " + biblioteka.czyKsiazkaJestDostepna(szukanaKsiazka));
                    break;
                case "2":
                    System.out.println("Wpisz nazwe ksiazki ktora chcesz wypożyczyć: ");
                    String wypozyczonaKsiazka = scanner.nextLine();
                    System.out.println("Książka" + biblioteka.wypozyczKsiazke(wypozyczonaKsiazka) + " zostala wypożyczona!");
                    break;
                case "3":
                    System.out.println("Oto wypożyczone ksiazki: ");
                    biblioteka.wystwietlWypozyczoneKsiazki();
                    break;
                case "4":
                    System.out.println("Oto dostępne ksiazki: ");
                    biblioteka.wystwielDostepneKsiazki();
                    break;
                case "5":
                    System.exit(0);
                    break;
            }
        }










    }

}
