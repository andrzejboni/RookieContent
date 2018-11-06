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





        Map<Integer, List<Integer>> map = new HashMap<>();
//        map.put(1, new ArrayList<Integer>(Arrays.asList(1,2,3)));
        map.put(1, new ArrayList<Integer>());








    }

    public static void gui() throws IOException {
        System.out.println("\nLabolatorium 1. Macierze sąsiedstwa i ciągi graficzne, algorytmiczna teoria grafów.");
        Utils utils = new Utils();

        Scanner scanner = new Scanner(System.in);
        String zKlawiatury;


        do {
            System.out.println("\nMenu:\n" +
                    "[1]wczytaj tablice         [4]dodaj wierzcholek        [7]stopnie wierzchołka \n" +
                    "[2]wyswietl tablice        [5]modyfikuj krawędź        [99]quit\n" +
                    "[3]liczba wierzcholków     [6]wyczysc macierz\n" +
                    " ");
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

            }
            if (zKlawiatury.equals("9")) {

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