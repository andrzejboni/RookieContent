package com.company.java;

import java.util.Random;
import java.util.Scanner;

public class ZgadnijLiczbe {
    protected int zgadywanaLiczba;

    public int losujLiczbe() {
        Random rand = new Random();
        zgadywanaLiczba = rand.nextInt(100) + 1;
        return zgadywanaLiczba;
    }

    public void zgadywanie(int zgadywanaLiczba) {
        Scanner scanner = new Scanner(System.in);

        int licznikProb = 1;

        while (licznikProb < 7) {
            int liczba = scanner.nextInt();
            if (zgadywanaLiczba == liczba) {
                System.out.println("Brawo, zgadłeś! To była Twoja " + licznikProb + " próba.");
                break;

            } else if (zgadywanaLiczba < liczba) {
                System.out.println( "Liczba o której myślę jest mniejsza od " + liczba);
                licznikProb++;
            } else if (zgadywanaLiczba > liczba) {
                System.out.println("Liczba o której myślę jest większa od " + liczba);
                licznikProb++;
            }

        }
    }


}


