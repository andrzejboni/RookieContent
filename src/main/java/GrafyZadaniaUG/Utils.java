package GrafyZadaniaUG;

import java.awt.geom.Point2D;
import java.io.*;
import java.util.*;


public class Utils {

    String file = "C:\\git\\Rookie77\\src\\main\\java\\GrafyZadaniaUG\\graf";
    String fileMacierzIncydencji = "C:\\git\\Rookie77\\src\\main\\java\\GrafyZadaniaUG\\macierzIncydencji.txt";

    public static int[][] macierzGrafu = new int[Utils.liczbaWierzcholkow + 50][Utils.liczbaWierzcholkow + 50];
    public static int stopnieParzyste = 0;
    public static int stopnieNieparzyste = 0;
    public static int liczbaWierzcholkow;
    public static List<Integer> stopien = new ArrayList<>();
    public static int[][] macierzIncydencji = new int[Utils.liczbaWierzcholkow + 50][Utils.liczbaWierzcholkow + 50];
    public static int liczbaKrawedzi;
    public static int liczbaWierzcholkowMacierzIncyd;

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


    public void dodajWierzcholek() { // po przekątnej muszą być zawsze same zera -> wierzchołek nie może być połączony sam ze sobą
        // Dodając wierzchołek, powiekszamy zarówno liczbę wierszy i liczbę kolumn w pliku <- tak to ma działać.

        System.out.println("Wpisz połączenia wierzchołka pionowo \nDodajesz: " + (liczbaWierzcholkow + 1) + " wierzchołek."); // 1 2 3 .. n  gdzie n to liczba krawedzi

//        liczbaWierzcholkow = liczbaWierzcholkow+1; // TRZEBA DODAC ZMIANE LICZBY OZNACZAJACEJ LICZBE KRAWEDZI! TO NIE ZAPISUJE SI EDO TABLICY

        Scanner zKlawiatury = new Scanner(System.in);
        String linia = zKlawiatury.nextLine();  // wpisuje mu linie
        String[] tablicaZnakowPionow = linia.split(" "); // robie z tego tablice, spoko

        for (int i = 0; i < liczbaWierzcholkow; i++) {
            macierzGrafu[i][liczbaWierzcholkow] = Integer.parseInt(tablicaZnakowPionow[i]);
            macierzGrafu[liczbaWierzcholkow][i] = Integer.parseInt(tablicaZnakowPionow[i]);
//        }
//        System.out.println("\nWpisz połączenia wierzchołka poziomo \nDodajesz: " + (liczbaWierzcholkow + 1) + " wierzchołek.");
//        linia = zKlawiatury.nextLine();  // wpisuje mu linie
//        String tablicaZnakowPoziomo[] = linia.split(" "); // robie z tego tablice, spoko
//
//        for (int i = 0; i < liczbaWierzcholkow; i++) {
//            macierzGrafu[liczbaWierzcholkow][i] = Integer.parseInt(tablicaZnakowPoziomo[i]);
        }
        liczbaWierzcholkow += 1;
    }


    public void modyfikujKrawedz() {

        System.out.println("Podaj ciąg znaków do edytowania wierzchołka, wzór: x y 1 ");
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

        for (int i = 0; i < liczbaWierzcholkow; i++) {
            System.out.println("\n");
            for (int j = 0; j < liczbaKrawedzi; j++) {
                macierzIncydencji[i][j] = 0;
            }
        }
        liczbaKrawedzi = 0;

        stopnieParzyste = 0;
        stopnieNieparzyste = 0;
        liczbaWierzcholkow = 0;
        stopien.clear();
    }

    public void zapiszDoPliku() throws IOException {
        FileWriter writer = new FileWriter(file, true);

//        writer.write(column);
        writer.write(liczbaWierzcholkow);
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

    public void podgrafIzomofricznydoC3() {

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
            for (int j = 0; j < liczbaWierzcholkow; j++) { // przetestowane działa
                if (macierzGrafu[i][j] == 1) {
                    map.get(i).add(j);
                }
            }
        }

        int licznik = 0;
        for (int i = 0; i < liczbaWierzcholkow; i++) { // sprawdz i zapisz do lisy nr wierzchołka który ma połączenie z danym wierzchołkiem
            for (int j = 0; j < map.get(i).size() - 1; j++) {

                if (map.get(map.get(i).get(j)).contains(map.get(i).get(j + 1))) {
                    if (licznik == 0) {
                        licznik++;
                        System.out.println("Podgraf znaleziony");
                        System.out.println("Wierzchołki [1]: " + map.get(i).get(j) + " [2]: " + map.get(map.get(i).get(j)).get(j) + " [3]: " + map.get(i).get(j + 1));
                    }
                }

            }
            licznik = 0;
        }
        licznik = 0;
    }

    public void wyswietlTablice() {
        for (int i = 0; i < liczbaWierzcholkow; i++) {
            System.out.println("\n");
            for (int j = 0; j < liczbaWierzcholkow; j++) {
                System.out.printf(" " + macierzGrafu[i][j]);
            }
        }
    }

    public void wyswietlMacierzIncydencji() {
        for (int i = 0; i < liczbaWierzcholkowMacierzIncyd; i++) {
            System.out.println("\n");
            for (int j = 0; j < liczbaKrawedzi; j++) {
                if (macierzIncydencji[i][j] < 0) {
                    System.out.printf("" + macierzIncydencji[i][j]);
                } else {

                    System.out.printf(" " + macierzIncydencji[i][j]);
                }
            }
        }
    }

    public void przeszukajWGlab() { // DFS  POWINNO BYc na podstawie macierzy incydencji!!


        System.out.println("Liczba wierzchołkow: " + liczbaWierzcholkowMacierzIncyd);
        System.out.println("Liczba krawedzi: " + liczbaKrawedzi);

        int licznik = 0;

        boolean czyOdwiedzono[] = new boolean[Utils.liczbaWierzcholkowMacierzIncyd];
        for (int i = 0; i < czyOdwiedzono.length; i++) { // Zeruje stan
            czyOdwiedzono[i] = false;
        }

        czyOdwiedzono[0] = true;
        System.out.print(" 0");
      //  for (int k = 0; k < liczbaWierzcholkowMacierzIncyd; k++) { // Jesli nie przeszedł wszystkich krawedzi to przechodzi je dla pewnosci jeszcze raz !


            for (int i = 0; i < Utils.liczbaWierzcholkowMacierzIncyd; i++) {

                int licznik2 = 0; // licznik nie pozwalający przechodzić wiecej niz jedngo wierzchołka w za pierwszym razem

                for (int j = 0; j < Utils.liczbaKrawedzi; j++) {


                    if (licznik2 == 0) { // Licznik ten pozwala odwiedzić tylko jeden wierzchołek w jednym przebiegu pętli
                        if (macierzIncydencji[i][j] >= 1) {

                            if (!czyOdwiedzono[i]) {
                                System.out.print(" " + i);
                                czyOdwiedzono[i] = true;
                                licznik2++;
                            }
                        }
                    }
                }
            }
    //    }

        // TODO Przekiwanie w głąb  Opis działania:
        // Wchodze do pierwszego wierzchołka. Biorę dane, do jakich wierzchołków mam dostęp z wierzchołka w którym jestem
        // Idę do niego, sprawdzam czy bł juz odwiedzony, jeśli nie zaznaczam obecnośc, i sprawdzam czy ma jakies inne do odwiesdzenia
        // jesli nie sprawsdzam czy z poprzeniego moge gdzies pojsc jeszcze. Jeśli nie sprawdzam dalej <- aż do momentu dojscia do wierzcholka poczatkoweog.
        // Rozwiazazanie ewentualnosci pętli w wierzcholku-> jesli wierzcholek ma pętle która prawsdzi do samej siebie, blokujemy.
        // Ta linijka do dodania w metodzie sprawdz czy graf jest spójny : Na koncu sprawdzamy czy liczba  odwiesdzonych wierzchołkow jest równa ilosci posiadanych
        // przez graf wierzcholkow.




//
//        boolean czyOdwiedzono[] = new boolean[Utils.liczbaWierzcholkowMacierzIncyd];
//        for (int i = 0; i < czyOdwiedzono.length; i++) { // Zeruje stan
//            czyOdwiedzono[i] = false;
//        }
////
////        czyOdwiedzono[0] = true;
////        System.out.print(" 0");
//
//        for (int i = 0; i < Utils.liczbaWierzcholkowMacierzIncyd; i++) {
//            for (int j = 0; j < Utils.liczbaKrawedzi; j++) {
//
//                if (macierzIncydencji[i][j] >= 1) {
//
//                    if (!czyOdwiedzono[i]) {
//
//
//                        System.out.print(" " + i);
//                        czyOdwiedzono[i] = true;
//                    }
//                }
//                // Sytuacja w której z grafu nie wychodzi żaden wierzchołek tez powinna być obsłużona
//                // Nastepenie zajmę sie sytuacja w której wierzhcołek ma połączenie wielokrotne (pętla)
//
//            }
    }


// Poprawna sciezka dla recznie przepisanej macierzy
// v0 v1 v5 v2 v3 v4


// Macierz przepisana ręcznie moga być ew. błedy
//        6 9
//        1  1  0  0  0  0  0  0  0
//       -1  0 -1 -1 -1  0  0  0  0
//        0  0  1  0  0 -1  1  0  0
//        0  0  0  0  0  0 -1  1  0
//        0  0  0  1  0  0  0 -1  1
//        0 -1  0  0  1  1  0  0 -1

//// Przykład a)
//        1	0	0  -1	0	0
//       -1	1	0	0  -1	0
//        0  -1	1	0	0	0
//        0	0  -1	1	0	1
//        0	0	0	0	1  -1


    // Przyklad b)


    public void readFromFile() throws IOException {    // Zapisuje do tablicy a nastepnie
        try (Scanner br = new Scanner(new File(file))) {

            liczbaWierzcholkow = br.nextInt();

            for (int i = 0; i < liczbaWierzcholkow; i++) { // Liczba wierszy jest równa liczbie kolumn
                for (int j = 0; j < liczbaWierzcholkow; j++) {
                    macierzGrafu[i][j] = br.nextInt();
                }
            }
        }
    }

    public void wczytajMacierzIncydencji() throws IOException {


        Scanner scan = new Scanner(System.in);
//
//        System.out.println("Ile macierz ma krawędzi?");
//        liczbaKrawedzi = scan.nextInt();
//        System.out.println("liczba krawedzi to " + liczbaKrawedzi);


        try (Scanner br = new Scanner(new File(fileMacierzIncydencji))) {

            liczbaWierzcholkowMacierzIncyd = br.nextInt();
            liczbaKrawedzi = br.nextInt();

            for (int i = 0; i < liczbaWierzcholkowMacierzIncyd; i++) {
                for (int j = 0; j < liczbaKrawedzi; j++) {
                    macierzIncydencji[i][j] = br.nextInt();
                }
            }
            br.close();
        }
    }

    public void modyfikujKrawedzDoMacierzyIncydencji() {
        if (liczbaWierzcholkow == 0) {
            System.out.println("(!) Wczytaj najpierw macierz wierzchołkow!");
            return;
        }
        Scanner scan = new Scanner(System.in);
        System.out.println("Ile krawędzi chcesz edytować?");
        liczbaKrawedzi = scan.nextInt();
        System.out.println("Podaj ciąg znaków do dodania krawędzi, wzór: x y 1 ");
        for (int i = 0; i < liczbaKrawedzi; i++) {

            String linia = scan.nextLine();  // wpisuje mu linie
            String[] tablicaZnakowPionow = linia.split(" "); // robie z tego tablice, spoko
            macierzIncydencji[Integer.parseInt(tablicaZnakowPionow[0])][Integer.parseInt(tablicaZnakowPionow[1])] = Integer.parseInt(tablicaZnakowPionow[2]);
            System.out.println("Dodano połączenie ");
        }
    }


    public void czyGrafJestSpojny() {
        // TODO Przetestować dla innej macierzy .
/*
Tworzymy licznik odwiedzonych wierzchołków i ustawiamy go na zero. Następnie uruchamiamy przejście DFS od dowolnie wybranego wierzchołka.
W każdym odwiedzonym wierzchołku zwiększamy nasz licznik. Gdy przejście DFS się zakończy, w liczniku będzie liczba wszystkich odwiedzonych wierzchołków.
Jeśli liczba ta będzie równa liczbie wierzchołków grafu, to graf jest spójny. Inaczej nie jest spójny.
 */


        System.out.println("Liczba wierzchołkow: " + liczbaWierzcholkow);
        System.out.println("Liczba krawedzi: " + liczbaKrawedzi);

        int licznik = 1;

        boolean czyOdwiedzono[] = new boolean[Utils.liczbaWierzcholkow];
        for (int i = 0; i < czyOdwiedzono.length; i++) { // Zeruje stan
            czyOdwiedzono[i] = false;
        }

        czyOdwiedzono[0] = true;
        System.out.print(" 0");
        for (int k = 0; k < liczbaWierzcholkow; k++) { // Jesli nie przeszedł wszystkich krawedzi to przechodzi je dla pewnosci jeszcze raz !


            for (int i = 0; i < Utils.liczbaWierzcholkow; i++) {

                int licznik2 = 0; // licznik nie pozwalający przechodzić wiecej niz jedngo wierzchołka w za pierwszym razem

                for (int j = 0; j < Utils.liczbaWierzcholkow; j++) { // zmieniono na liczba krawedzi


                    if (licznik2 == 0) { // Licznik ten pozwala odwiedzić tylko jeden wierzchołek w jednym przebiegu pętli
                        if (macierzGrafu[i][j] == 1) {

                            if (czyOdwiedzono[j] == false) {

                                System.out.print(" " + j);
                                czyOdwiedzono[j] = true;
                                licznik2++;
                                licznik++;
                            }
                        }
                    }
                }
            }
        }
        if (licznik == liczbaWierzcholkowMacierzIncyd) {
            System.out.println(licznik +  "  " + liczbaWierzcholkow);
            System.out.println("\n  Graf jest spójny");
        } else {
            System.out.println("\n Graf nie jest spójny.");
            System.out.println(licznik +  "  " + liczbaWierzcholkow);

        }


    }

        /*
            E1 E2 E3 E4 E5 E6 E7 E8 E9
        0    1  1  0  0  0  0  0  0  0
        1   -1  0 -1 -1 -1  0  0  0  0
        2    0  0  1  0  0 -1  1  0  0
        3    0  0  0  0  0  0 -1  1  0
        4    0  0  0  1  0  0  0 -1  1
        5    0 -1  0  0  1  1  0  0 -1
     */
}
/*  DOBRZE NAPISANA METODA.
        boolean czyOdwiedzono[] = new boolean[Utils.liczbaWierzcholkow];
        for (int i = 0; i < czyOdwiedzono.length; i++) { // Zeruje stan
            czyOdwiedzono[i] = false;
        }

        czyOdwiedzono[0] = true;
        System.out.println(" 0");

        for (int i = 0; i < Utils.liczbaWierzcholkow; i++) {
            for (int j = 0; j < Utils.liczbaWierzcholkow; j++) {

                if (macierzGrafu[i][j] == 1) {

                    if (czyOdwiedzono[j] == false) {

                        System.out.print(" " + j);
                        czyOdwiedzono[j] = true;
                    }
                }
            }
        }


 */