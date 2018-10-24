package GrafyZadaniaUG;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Graf {
    int wierzcholki;
    int krawedzie;



    String file = "C:\\git\\Rookie\\src\\main\\java\\GrafyZadaniaUG\\graf";

    public static int liczbaWierszyMacierzy;

    // pierwsza linia oznacza ilosc wierzcholkow czy tam krawedzi


    public static int getLiczbaWierszyMacierzy() {
        return liczbaWierszyMacierzy;
    }
//
//    public void addRowToFile(String row) throws IOException {
//        FileWriter writer = new FileWriter(file,true);
//        writer.write("\n"); // zapisywanie Wiersza odbywa sie w nowej linii !!!!
//        writer.write(row);
//        writer.close();
//    }

//
//    public void addTopToTheFile(String row) throws IOException {
//        try (Scanner br = new Scanner(new File(file))) {
//            int line;
//            liczbaWierszyMacierzy = br.nextInt();
//
//
//            for (int i = 0; i < liczbaWierszyMacierzy; i++) { // Liczba wierszy jest równa liczbie kolumn
//                for (int j = 0; j < liczbaWierszyMacierzy; j++) {
//                    Graf.macierzGrafu[i][j] = br.nextInt();
//                }
//
//            }
//
//        }
//
//        FileWriter writer = new FileWriter(file,true);
//        writer.write("\n"); // zapisywanie Wiersza odbywa sie w nowej linii !!!!
//        writer.write(row);
//        writer.close();
//    }
//
//
//    public void removeRowFromFile(int whichRow) throws IOException { // Najpierw trzeba policzyc ile mam wierszy w pliwkersie a następnie przeiterować po inich
//        // i zamienić dany wiersz na 0;
//
//        FileWriter writer = new FileWriter(file,true);
//
//
//        writer.write("");
//
//
//
//        writer.close();
//    }
//
//    public void writeToFile(String column) throws IOException {
//
//
//        FileWriter writer = new FileWriter(file,true);
//
//        writer.write(column);
//        writer.close();
//    }

//
//    public void readFromFile() throws IOException {
//        try (Scanner br = new Scanner(new File(file))) {
//            int line;
//            liczbaWierszyMacierzy = br.nextInt();
//
//
//            for (int i = 0; i < liczbaWierszyMacierzy; i++) { // Liczba wierszy jest równa liczbie kolumn
//                for (int j = 0; j < liczbaWierszyMacierzy; j++) {
//                    Graf.macierzGrafu[i][j] = br.nextInt();
//                }
//
//            }
//
//        }
//    }

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
