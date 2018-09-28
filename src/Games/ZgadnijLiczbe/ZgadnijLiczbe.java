package Games.ZgadnijLiczbe;

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
        System.out.println("Wpisz ile prób chcesz mieć:  ");

        int liczbaProb = scanner.nextInt();
        while (licznikProb < liczbaProb) {
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

// Później przenieśc do maina !!!!

//    public static void main(String[] args) {
//        System.out.println("Witaj w grze zgadnij liczbę!\nWymyśliłem liczbę do zgadnięcia...\nPodaj liczbę od 0 do 100 i spróbuj ją zgadnąć!");
//        ZgadnijLiczbe zgadnij = new ZgadnijLiczbe();
//        zgadnij.zgadywanie(zgadnij.losujLiczbe());
//    }