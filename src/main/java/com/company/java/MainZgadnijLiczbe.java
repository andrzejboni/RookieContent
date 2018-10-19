package com.company.java;

import Games.ZgadnijLiczbe.ZgadnijLiczbe;

public class MainZgadnijLiczbe {

    public static void main(String[] args) {
        System.out.println("Witaj w grze zgadnij liczbę!\nWymyśliłem liczbę do zgadnięcia...\nPodaj liczbę od 0 do 100 i spróbuj ją zgadnąć!");
        ZgadnijLiczbe zgadnij = new ZgadnijLiczbe();
        zgadnij.zgadywanie(zgadnij.losujLiczbe());
    }
}
