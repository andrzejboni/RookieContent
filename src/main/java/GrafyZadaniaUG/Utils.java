package GrafyZadaniaUG;

import java.io.*;
import java.util.Scanner;


public class Utils {

    String file = "C:\\git\\Rookie77\\src\\main\\java\\GrafyZadaniaUG\\graf";
    public static int liczbaWierszyMacierzy;

    public static int[][] macierzGrafu = new int[Utils.liczbaWierszyMacierzy + 20][Utils.liczbaWierszyMacierzy + 20];


    // pierwsza linia oznacza ilosc wierzcholkow czy tam krawedzi
// biblioteka matrix do mnozenia macierzy albo cos





    public int getLiczbaWierszyMacierzy() throws IOException { // Tested works
        try (Scanner br = new Scanner(new File(file))) {
            liczbaWierszyMacierzy = br.nextInt();
        }
            return liczbaWierszyMacierzy;
    }

    public void addRowToFile(String row) throws IOException { //  Tested Works
        FileWriter writer = new FileWriter(file, true);
        writer.write("\n"); // zapisywanie Wiersza odbywa sie w nowej linii !!!!
        writer.write(row);
        writer.close();
    }

    public void readFromFile() throws IOException {    // Zapisuje do tablicy a nastepnie
        try (Scanner br = new Scanner(new File(file))) {
            int line;
            liczbaWierszyMacierzy = br.nextInt();

            for (int i = 0; i < liczbaWierszyMacierzy; i++) { // Liczba wierszy jest równa liczbie kolumn
                for (int j = 0; j < liczbaWierszyMacierzy; j++) {
                    macierzGrafu[i][j] = br.nextInt();
                }
            }
        }
    }

    public void wyswietlTablice() {
        for (int i = 0; i < liczbaWierszyMacierzy; i++) {
            System.out.println("\n");
            for (int j = 0; j < liczbaWierszyMacierzy; j++) {
                System.out.printf(" " + macierzGrafu[i][j]);
            }
        }


    }




    public void dodajWierzcholekRoBOCZANAZWA() { // po przekątnej muszą być zawsze same zera -> wierzchołek nie może być połączony sam ze sobą
        // Dodając wierzchołek, powiekszamy zarówno liczbę wierszy i liczbę kolumn w pliku <- tak to ma działać.

        liczbaWierszyMacierzy = liczbaWierszyMacierzy + 1;

        for (int i = 0; i < liczbaWierszyMacierzy; i++) {


            System.out.println("\nDodawany wierzchołek ma być połączony z wierzchołkiem? Wpisz 1 lub 0"); // Zamienic to na dodawnanie automatycznie
            // to znaczy podaje w ciągu np. 1 1 0 1 1 - > i on automatiko wie, co gdzie i ile ma wypełnić
            Scanner zKlawiatury = new Scanner(System.in);
            int klaw = zKlawiatury.nextInt();

            if (klaw == 1) {
                macierzGrafu[i][liczbaWierszyMacierzy] = 1;
            } else
                macierzGrafu[i][liczbaWierszyMacierzy] = 0;
            }



        }



        // Dodać podloge



    // Teraz należy
// usunąć wszystko z pliku i zapisac tam jeszcze raz z macierzy.





    public void addTopToTheFile() {


    }
//public static int[][] macierzGrafu = new int[Utils.liczbaWierszyMacierzy+20][Utils.liczbaWierszyMacierzy+20];


    public void removeRowFromFile(int whichRow) { // Najpierw trzeba policzyc ile mam wierszy w pliwkersie a następnie przeiterować po inich
        // i zamienić dany wiersz na 0;
//
//        FileWriter writer = new FileWriter(file, true);
//
//
//        writer.write("");
//
//        writer.close();

    }


    public void removeAllFromFile() throws IOException {

        PrintWriter writer = new PrintWriter(file);


        writer.print("");

        writer.close();



//        PrintWriter pw = new PrintWriter(file);
//        pw.close();

    }

    public void writeToFile(String column) throws IOException {
        FileWriter writer = new FileWriter(file, true);

        writer.write(column);
        writer.close();
    }

    public void dodajKrawedz(String line){

    }
    public void usunKrawedz(){

    }
    public void dodajWierzcholek(){

    }
    public void usnunWierzcholek(){

    }

    public void wyznaczStopienWierzcholka(){

    }
    public void maksymalnyStopienGrafu(){

    }
    public void iloscWierzcholkowParzystych(){

    }

    public void iloscWierzcholkowNieparzystych(){

    }


}
//