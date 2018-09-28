package Games.Wisielec;

import static Games.Wisielec.Wisielec.parts;
import static Games.Wisielec.Wisielec.tablicaCharow;

public class Wypisz {

    public static void powitanie() {
        System.out.println("Witaj w grze wisielec. \n Wymysliłem słowo które musisz zgadnąć!");
    }



    public static void podajLitere() {
        System.out.println("Podaj literkę!");
    }


    public static void wygrana() {
        System.out.println("Brawo, udało Ci sie zgadnąć słowo, wygrałeś!");
    }

    public static void przegrana() {
        System.out.println("Niestety, wykorzystałeś wszystkie możliwe ruchy! Spróbuj jeszczze raz!");
    }

    public static void poprawnaLitera() {
        System.out.println("Brawo, jesteś coraz bliżej.");
    }

    public static void niepoprawnaLitera() {
        System.out.println("Niestety, podana litera nie występuje w szukanym słowie!");
    }

    public static void ileProb() {
        System.out.println("Wpisz liczbe prob");
    }

    public static void wypiszStan(char poprawnaLitera) {

        for (int i = 0; i < tablicaCharow.length; i++) {
            if (poprawnaLitera == tablicaCharow[i]) {
                System.out.println(tablicaCharow[i]);
            } else {
                System.out.println(" _ ");
            }
        }


    }
}
