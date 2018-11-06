package GrafyZadaniaUG;

import java.awt.geom.Point2D;
import java.io.*;
import java.util.*;


public class Utils {

    String file = "C:\\git\\Rookie77\\src\\main\\java\\GrafyZadaniaUG\\graf";


    public static int[][] macierzGrafu = new int[Utils.liczbaWierzcholkow + 50][Utils.liczbaWierzcholkow + 50];
    public static int stopnieParzyste = 0;
    public static int stopnieNieparzyste = 0;
    public static int liczbaWierzcholkow;
    public static List<Integer> stopien = new ArrayList<>();

    // pierwsza linia oznacza ilosc wierzcholkow czy tam krawedzi
    // biblioteka matrix do mnozenia macierzy albo cos


    public void getLiczbaWierzcholkow() {
        System.out.println("Liczba wierzchołków: " + liczbaWierzcholkow);
    }

    public void addRowToFile(String row) throws IOException { //  Tested Works - dopisuje na koncu pliku jedna linie
        FileWriter writer = new FileWriter(file, true);
        writer.write("\n"); // zapisywanie Wiersza odbywa sie w nowej linii !!!!
        writer.write(row);
        writer.close();
    }

    public void readFromFile() throws IOException {    // Zapisuje do tablicy a nastepnie
        try (Scanner br = new Scanner(new File(file))) {
            int line;
            liczbaWierzcholkow = br.nextInt();

            for (int i = 0; i < liczbaWierzcholkow; i++) { // Liczba wierszy jest równa liczbie kolumn
                for (int j = 0; j < liczbaWierzcholkow; j++) {
                    macierzGrafu[i][j] = br.nextInt();
                }
            }
        }
    }

    public void wyswietlTablice() {
        for (int i = 0; i < liczbaWierzcholkow; i++) {
            System.out.println("\n");
            for (int j = 0; j < liczbaWierzcholkow; j++) {
                System.out.printf(" " + macierzGrafu[i][j]);
            }
        }
    }

    public void dodajWierzcholek() { // po przekątnej muszą być zawsze same zera -> wierzchołek nie może być połączony sam ze sobą
        // Dodając wierzchołek, powiekszamy zarówno liczbę wierszy i liczbę kolumn w pliku <- tak to ma działać.

        System.out.println("Wpisz połączenia wierzchołka pionowo \nDodajesz: " + (liczbaWierzcholkow + 1) + " wierzchołek."); // 1 2 3 .. n  gdzie n to liczba krawedzi

//        liczbaWierzcholkow = liczbaWierzcholkow+1; // TRZEBA DODAC ZMIANE LICZBY OZNACZAJACEJ LICZBE KRAWEDZI! TO NIE ZAPISUJE SI EDO TABLICY

        Scanner zKlawiatury = new Scanner(System.in);
        String linia = zKlawiatury.nextLine();  // wpisuje mu linie
        String[] tablicaZnakowPionow = linia.split(" "); // robie z tego tablice, spoko

        for (int i = 0; i < liczbaWierzcholkow; i++) {
            macierzGrafu[i][liczbaWierzcholkow] = Integer.parseInt(tablicaZnakowPionow[i]);
        }
        System.out.println("\nWpisz połączenia wierzchołka poziomo \nDodajesz: " + (liczbaWierzcholkow + 1) + " wierzchołek.");
        linia = zKlawiatury.nextLine();  // wpisuje mu linie
        String tablicaZnakowPoziomo[] = linia.split(" "); // robie z tego tablice, spoko

        for (int i = 0; i < liczbaWierzcholkow; i++) {
            macierzGrafu[liczbaWierzcholkow][i] = Integer.parseInt(tablicaZnakowPoziomo[i]);
        }
        liczbaWierzcholkow += 1;
    }


    public void modyfikujKrawedz() {

        System.out.println("Podaj ciąg znaków do edytowania krawędzi, wzór: x y 1 ");
        Scanner zKlawiatury = new Scanner(System.in);
        String linia = zKlawiatury.nextLine();  // wpisuje mu linie
        String[] tablicaZnakowPionow = linia.split(" "); // robie z tego tablice, spoko
        macierzGrafu[Integer.parseInt(tablicaZnakowPionow[0])][Integer.parseInt(tablicaZnakowPionow[1])] = Integer.parseInt(tablicaZnakowPionow[2]);
        System.out.println("Zmodyfikowano krawędź");
    }


    public void wyczyscPlik() throws IOException {

        PrintWriter writer = new PrintWriter(file);
        writer.print("");
        writer.close();
    }

    public void wyczyscMacierz() throws IOException {
        for (int i = 0; i < liczbaWierzcholkow; i++) {
            System.out.println("\n");
            for (int j = 0; j < liczbaWierzcholkow; j++) {
                macierzGrafu[i][j] = 0;
            }
        }
        stopnieParzyste = 0;
        stopnieNieparzyste = 0;
        liczbaWierzcholkow = 0;
        stopien.clear();
    }

    public void writeToFile(String column) throws IOException {
        FileWriter writer = new FileWriter(file, true);

        writer.write(column);
        writer.close();
    }

    public void stopnieWierzcholka() {

        for (int i = 0; i < liczbaWierzcholkow; i++) {
            stopien.add(i, 0);
            for (int j = 0; j < liczbaWierzcholkow; j++) {

                if (macierzGrafu[i][j] == 1) {
                    stopien.set(i, stopien.get(i) + 1);
                }
            }
        }
        System.out.println("\n");

        System.out.println("Maksymalny stopień grafu to " + Collections.max(stopien)
                + ", minimalny: " + Collections.min(stopien));
        for (int i = 0; i < liczbaWierzcholkow; i++) {
            System.out.println("Stopień wierzchołka " + i + " wynosi: " + stopien.get(i));
            if (stopien.get(i) % 2 == 0) {
                stopnieParzyste++;
            } else {
                stopnieNieparzyste++;
            }
        }
        System.out.print("Lista wierzchołków nierosnąco: ");
        List<Integer> stopienPosortowany = new ArrayList<>();
        stopienPosortowany.addAll(stopien);
        Collections.sort(stopienPosortowany, Collections.reverseOrder());
        for (int i = 0; i < liczbaWierzcholkow; i++) {
            System.out.print(stopienPosortowany.get(i) + ", ");
        }

        System.out.println("\nStopni wierzchołka parzystych: " + stopnieParzyste + ", nieparzystych " + stopnieNieparzyste);


        stopnieParzyste = 0;
        stopnieNieparzyste = 0;
        stopien.clear();
    }

    public void podgrafIzomofricznydoC3(){
        // Trzeba to zrobic jakos tak.
        // Mam grafik, trzeba odpalić liczni, taki sam licznik jak dla tego co liczy




        Map<Integer, List<Integer>> map = new HashMap<>();
//        map.put(1, new ArrayList<Integer>(Arrays.asList(1,2,3)));


        for (int i = 0; i < liczbaWierzcholkow; i++) { // Tworzę tyle list ile mam wierzchołków nie wiem czy to do końća potrzebne
            map.put(i, new ArrayList<Integer>());
        }

//        map.get(1).add(1);
//        System.out.println(" 1. "+  map.get(1).add(1));
//        System.out.println(" 1. "+  map.get(1).add(5));
//        System.out.println(map.get(1).get(0)+ map.get(1).get(1));



        for (int i = 0; i < liczbaWierzcholkow; i++) { // sprawdz i zapisz do lisy nr wierzchołka który ma połączenie z danym wierzchołkiem
            for (int j = 0; j < liczbaWierzcholkow; j++) {
                if (macierzGrafu[i][j] == 1) {
                    map.get(i).add(j);
                }
            }
        }








    }




    public void czyGrafZawieraPodgrafIzomorficzny() {
//    The number of nodes must be the same
//    The number of edges must be the same
//    Count how many vertices have k adjacent edges. These must be the same for both graphs.

//        5
//        A B C D E
//      A 0 1 0 0 1             stopien wierzcholka A = 2,
//      B 1 0 0 0 0
//      C 0 0 0 0 0
//      D 0 0 0 0 0
//      E 1 0 0 0 0

//        5
//        A B C D E
//      A 0 0 0 0 0
//      B 0 0 0 0 1             // to samo co wyzej
//      C 0 0 0 0 0
//      D 0 0 0 0 1             // to samo co wyzej
//      E 0 1 0 1 0             stopien wierzchołka A= 2

// Do każdego grafu można stworzyć analogiczny graf izomofriczny. '
        // Sprawdzenie czy graf ma podgraf


    }





//    public boolean isC3() {
//
//        int[][] mul;
//        mul = new int[this.getnVert()][this.getnVert()];
//        for (int i = 0; i < this.getnVert(); i += 1) {
//            // System.out.println("i="+i);
//            for (int j = 0; j < this.getnVert(); j += 1) {
//                // System.out.println("j="+j);
//                mul[i][j] = 0;
//                for (int k = 0; k < this.getnVert(); k += 1) {
//                    mul[i][j] += mat[i][k] * mat[k][j];
//                }
//                if (mul[i][j] > 0) {
//                    if (mat[i][j] > 0) {
//                        return true;
//                    }
//                }
//            }
//
//        }
//
//        return false;
//    }
}