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
        System.out.println("Brawo to dobra litera, jesteś coraz bliżej.");
    }

    public static void niepoprawnaLitera() {
        System.out.println("Nie ma takiej literki.");
    }

    public static void ileProb() {
        System.out.println("Wpisz liczbe prob");
    }


}
