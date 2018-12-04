package GrafyZadaniaUG;


import java.io.IOException;
import java.util.*;


//zadania sprzed tygodnia sa na za tydzień.
// te z dzis są na 7 listopada. Ogolnie rzecz ujmujac sporo tych zadan, ale to raczej dobrze.

public class Main {

    public static void main(String[] args) throws IOException { // wyjątek ze względu na odczyt zapis plików


//        System.out.println(utils.getLiczbaWierszyMacierzy());    // Works
//        utils.addRowToFile("0 1 0 1 0");                          // Works


        gui();
        //  metoda wyswietl tablice nie aktualizuje grafu po dodaniu wierzcholka
        // metoda dodaj wierzcholek dodaje jeden wierzcholek, po probie dodania kolejnego, nadpisuje stary


    }


    // POPRAWIĆ DODAWANIE I WIERZCHOŁKÓW, WCZYTYWANIE ITP.
    // POPRAWIĆ METODĘ NAIWNĄ
    // Dopracować pozostałe metody


    public static void gui() throws IOException {
        System.out.println("\nLabolatorium 1. Macierze sąsiedstwa i ciągi graficzne, algorytmiczna teoria grafów.");
        Utils utils = new Utils();

        Scanner scanner = new Scanner(System.in);
        String zKlawiatury;


        do {
            System.out.println("\nMenu:\n" +
                    "[1]Wczytaj graf            [6]Wyczysc macierz              [11]Wyśw. m.incydencji  [16] ---------\n" +
                    "[2]Wyswietl graf           [7]Stopnie wierzchołka          [12] ---------          [17] ---------\n" +
                    "[3]Liczba wierzcholków     [8]Znajdz podgraf(naiwnie)      [13] ---------          [18] ---------\n" +
                    "[4]Dodaj wierzcholek       [9]Przeszukuj w głąb - DFS      [14] ---------          [19] ---------\n" +
                    "[5]Modyfikuj krawędź       [10]Wczytaj macierz incydencji  [15] ---------          [99] quit\n");
            zKlawiatury = scanner.nextLine();

            if (zKlawiatury.equals("1")) {
                utils.readFromFile();
            }
            if (zKlawiatury.equals("2")) {
                utils.wyswietlTablice();
            }
            if (zKlawiatury.equals("3")) {
                utils.getLiczbaWierzcholkow();
            }
            if (zKlawiatury.equals("4")) {
                utils.dodajWierzcholek();
            }
            if (zKlawiatury.equals("5")) {
                utils.modyfikujKrawedz();
            }
            if (zKlawiatury.equals("6")) {
                utils.wyczyscMacierz();
            }
            if (zKlawiatury.equals("7")) {
                utils.stopnieWierzcholka();
            }
            if (zKlawiatury.equals("8")) {
                utils.podgrafIzomofricznydoC3();
            }
            if (zKlawiatury.equals("9")) {
                utils.przeszukajWGlab();
            }
            if (zKlawiatury.equals("10")) {
                utils.wczytajMacierzIncydencji();
            }
            if (zKlawiatury.equals("11")) {
                utils.wyswietlMacierzIncydencji();
            }


        } while (!zKlawiatury.equals("99"));

    }

}


// Example
//        5
//        0 1 0 1 1
//        0 0 1 0 0
//        1 0 0 1 1
//        1 0 0 0 0
//        0 0 0 0 0
//
//7
//        0 0 0 0 1 1 0
//        0 1 0 0 0 0 0
//        1 0 0 0 0 0 1
//        0 0 0 0 0 0 0
//        1 0 0 0 0 1 0
//        1 0 0 0 1 0 0
//        0 1 0 0 0 0 1