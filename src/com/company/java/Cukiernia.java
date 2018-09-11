package com.company.java;

public class Cukiernia {

    private String przepis;
    public String maka;
    public String woda;
    public String sol;
    public String drozdze;


    protected static void przygotujCiasto() {  // DO KONCZYC!!!
        System.out.println("Przygotowuje ciasto...");

    }

    private static String rozszyfrujPrzepis(String przepis) {
        System.out.println("Rozszyfrowuje przepis...");
        String rozszyfrowanyPrzepis = "Oto rozszyfrowany przepis: 10 g maki, 100 ml wody, 5 g soli, 5 g drozdzy";

        return rozszyfrowanyPrzepis;
    }


    protected static Cukiernia zrobPaczka() {
        Cukiernia paczek = new Cukiernia();
        return paczek;
    }

    protected static void upieczPaczka() {
        System.out.println("Pieke paczka");
    }
}
