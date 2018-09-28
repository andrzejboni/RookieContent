package Games.Wisielec;

public class Wypisz {

    public static void powitanie(){
        System.out.println("Witaj w grze wisielec. \n Wymysliłem słowo które musisz zgadnąć, podaj literkę!");
    }
    public static void wygrana(){
        System.out.println("Brawo, udało Ci sie zgadnąć słowo, wygrałeś!");
    }
    public static void przegrana(){
        System.out.println("Niestety, wykorzystałeś wszystkie możliwe ruchy! Spróbuj jeszczze raz!");
    }
    public static void poprawnaLitera(){
        System.out.println("Brawo, jesteś coraz bliżej.");
    }
    public static void niepoprawnaLitera(){
        System.out.println("Niestety, podana litera nie występuje w szukanym słowie!");
    }

    public static void ileProb(){System.out.println("Wpisz liczbe prob");}
    public static void wypiszStan(){System.out.println(" ");}
}
