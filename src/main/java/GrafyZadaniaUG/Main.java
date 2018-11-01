package GrafyZadaniaUG;


import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;


//zadania sprzed tygodnia sa na za tydzień.
// te z dzis są na 7 listopada. Ogolnie rzecz ujmujac sporo tych zadan, ale to raczej dobrze.

public class Main {

    public static void main(String[] args) throws IOException { // wyjątek ze względu na odczyt zapis plików


//        System.out.println(utils.getLiczbaWierszyMacierzy());    // Works
//        utils.addRowToFile("0 1 0 1 0");                          // Works
//
//        utils.readFromFile();
//
//        utils.wyswietlTablice();

        gui();


    }

    public static void gui() throws IOException {
        System.out.println("Labolatorium 1.\n Macierze sąsiedstwa i ciągi graficzne, Algorytmiczna teoria grafów.");
        Utils utils = new Utils();

        Scanner scanner = new Scanner(System.in);
        String zKlawiatury;

        do {
            System.out.println("\nMenu: [1]wczytac graf z pliku [2]wyswietl tablice [3]quit");
            zKlawiatury = scanner.nextLine();

            if (zKlawiatury.equals("1")) {
                utils.readFromFile();
            }


            if (zKlawiatury.equals("2")) {
                utils.wyswietlTablice();

            }

        } while (!zKlawiatury.equals("3"));

    }

}


// Example
//        5
//        0 1 0 1 1
//        0 0 1 0 0
//        1 0 0 1 1
//        1 0 0 0 0
//        0 0 0 0 0