package GrafyZadaniaUG;

import java.io.*;
import java.util.Scanner;

import static com.company.TicTacToe.Logika.j;

public class Utils {

    String file = "C:\\git\\Rookie\\src\\main\\java\\GrafyZadaniaUG\\graf";
    public static int liczbaWierszyMacierzy;

    // pierwsza linia oznacza ilosc wierzcholkow czy tam krawedzi


    public static int getLiczbaWierszyMacierzy() {
        return liczbaWierszyMacierzy;
    }

    public void addRowToFile(String row) throws IOException {
        FileWriter writer = new FileWriter(file, true);
        writer.write("\n"); // zapisywanie Wiersza odbywa sie w nowej linii !!!!
        writer.write(row);
        writer.close();
    }

    public void dodajWierzcholekRoBOCZANAZWA(String row) throws IOException {
        // Dodając wierzchołek, powiekszamy zarówno liczbę wierszy w pliku jak i liczbę kolumn.


        // DOKONCZYC METODE !!! I POZOSTAŁY STUFF TEŻ.

        FileWriter writer = new FileWriter(file, true);


        try (Scanner br = new Scanner(new File(file))) {
            int line;
            liczbaWierszyMacierzy = br.nextInt();


            for (int i = 0; i < liczbaWierszyMacierzy; i++) { // Liczba wierszy jest równa liczbie kolumn
                for (int j = 0; j < liczbaWierszyMacierzy; j++) {
                    Graf.macierzGrafu[i][j] = br.nextInt();
                }


                for (int k = 0; k < liczbaWierszyMacierzy; k++) {
                    System.out.println("Dodawany wierzchołek ma być połączony z " + k + " wierzchołkiem? Wpisz 1 lub 0");
                    Scanner zKlawiatury = new Scanner(System.in);

                    if (zKlawiatury.nextInt() == 1) {
                        for (int j = 0; j < liczbaWierszyMacierzy; j++) {
                            br.nextInt(); // przewiń do końca wiersza
                        }

                        writer.write("1");
                        System.out.println("\n");
                        writer.close();
                    } else {
                        writer.write("0");

                        System.out.println("\n");
                        writer.close();
                    }

                }
            }

        }


    }

    public void addTopToTheFile(String row) throws IOException {
        // Dodając wierzchołek, powiekszamy zarówno liczbę wierszy w pliku jak i liczbę kolumn.

        try (Scanner br = new Scanner(new File(file))) {
            int line;
            liczbaWierszyMacierzy = br.nextInt();


            for (int i = 0; i < liczbaWierszyMacierzy; i++) { // Liczba wierszy jest równa liczbie kolumn
                for (int j = 0; j < liczbaWierszyMacierzy; j++) {
                    Graf.macierzGrafu[i][j] = br.nextInt();
                }

            }

        }

        FileWriter writer = new FileWriter(file, true);
        writer.write("\n"); // zapisywanie Wiersza odbywa sie w nowej linii !!!!
        writer.write(row);
        writer.close();
    }


    public void removeRowFromFile(int whichRow) throws IOException { // Najpierw trzeba policzyc ile mam wierszy w pliwkersie a następnie przeiterować po inich
        // i zamienić dany wiersz na 0;

        FileWriter writer = new FileWriter(file, true);


        writer.write("");


        writer.close();
    }

    public void writeToFile(String column) throws IOException {


        FileWriter writer = new FileWriter(file, true);

        writer.write(column);
        writer.close();
    }


    public void readFromFile() throws IOException {
        try (Scanner br = new Scanner(new File(file))) {
            int line;
            liczbaWierszyMacierzy = br.nextInt();


            for (int i = 0; i < liczbaWierszyMacierzy; i++) { // Liczba wierszy jest równa liczbie kolumn
                for (int j = 0; j < liczbaWierszyMacierzy; j++) {
                    Graf.macierzGrafu[i][j] = br.nextInt();
                }

            }

        }
    }
}
