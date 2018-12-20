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

    public static boolean czyOdwiedzono[];


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
        for (int i = 0; i < liczbaWierzcholkow; i++) { // Tworzę tyle list ile mam wierzchołków nie wiem czy to do końća potrzebne
            map.put(i, new ArrayList<Integer>());
        }

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


        try (Scanner br = new Scanner(new File(fileMacierzIncydencji))) {

            liczbaWierzcholkowMacierzIncyd = br.nextInt();
            liczbaKrawedzi = br.nextInt();

            czyOdwiedzono = new boolean[Utils.liczbaWierzcholkowMacierzIncyd];


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
            System.out.println(licznik + "  " + liczbaWierzcholkow);
            System.out.println("\n  Graf jest spójny");
        } else {
            System.out.println("\n Graf nie jest spójny.");
            System.out.println(licznik + "  " + liczbaWierzcholkow);

        }


    }


    public void przeszukajWGlab_TrzeciePodejscie() {
        System.out.println("Liczba wierzchołkow: " + liczbaWierzcholkowMacierzIncyd);
        System.out.println("Liczba krawedzi: " + liczbaKrawedzi);

        boolean czyOdwiedzono[] = new boolean[Utils.liczbaWierzcholkowMacierzIncyd];
        for (int i = 0; i < czyOdwiedzono.length; i++) { // Zeruje stan
            czyOdwiedzono[i] = false;
        }
        czyOdwiedzono[0] = true; // Ustawiam wierzchołek poczatkowy na true;


        Queue<Integer> listaOdwiedzonych = new LinkedList<>(); // Jedna dla całego grafu!


        System.out.println();

        for (int i = 0; i < liczbaWierzcholkowMacierzIncyd; i++) {
            for (int j = 0; j < liczbaKrawedzi; j++) {
                if (macierzIncydencji[i][j] == 1) { // Wierzchołek ma połączenie wychodzące! IDĘ TAM GDZIE TA KRAWĘDŹ WCHODZI (SZUKAM -1)
                    for (int k = 0; k < liczbaWierzcholkowMacierzIncyd; k++) { // Szukam pionowo -1 by znaleźć gdzie krawędź wchodzi
                        if (macierzIncydencji[i][k] == -1) {
                            for (int l = 0; l < liczbaKrawedzi; l++) {
                            }
                            if (!czyOdwiedzono[j]) {  // Jeśli nie jest odwiedzony, zmieniam wartość na true, dodaje do kolejki.
                                czyOdwiedzono[k] = true;
                                listaOdwiedzonych.add(k);
                            }
                        }
                    }
                }
                // Poniżej odiwedzam nasepny wierzchołek !!!
                System.out.println();
            }
        }
        System.out.println("Lista odwiedzonych wierzchołkow: \n" + listaOdwiedzonych);
    }

//
//    Algorytm rekurencyjny DFS dla macierzy incydencji: DFS(v)
//    Wejście
//    n	 – 	liczba wierzchołków, n   C
//    m	 – 	liczba krawędzi, m   C
//    v	 – 	numer wierzchołka startowego, v   C
//    visited	 – 	n-elementowa tablica logiczna z informacją o odwiedzonych wierzchołkach
//    A	 – 	macierz incydencji o rozmiarze n x m
//    Wyjście:
//    Przetworzenie wszystkich wierzchołków w grafie.
//    Elementy pomocnicze:
//    i,j	 – 	indeksy. i,j   C
//    Lista kroków:
//    K01:	visited[v] ← true	; odwiedź wierzchołek
//    K02:	Przetwórz wierzchołek v	; przetwarzanie wstępne
//    K03:	Dla i = 0,1,...,m-1: wykonuj K04...K08	; przeszukujemy kolejne krawędzie
//   K04:	    Jeśli A[v][i] ≠ 1, to następny obieg pętli K03	; szukamy krawędzi, dla której v jest wierzchołkiem startowym
//    K05:	    Dla j = 0,1,...,n-1: wykonuj K06...K08
//    K06:	        Jeśli A[j][i] ≠ -1. to następny obieg pętli K05	; szukamy wierzchołka końcowego
//    K07:	        Jeśli visited[j] = false, to DFS(j)	; rekurencyjnie odwiedzamy znalezionego sąsiada
//   K08:	        Następny obieg pętli K03	; kontynuujemy szukanie dalszych sąsiadów
//    K09:	Przetwórz wierzchołek v	; przetwarzanie końcowe
//    K10:	Zakończ


    public int DFS(int numerWierzcholkaStartowego) {
        Utils.czyOdwiedzono = new boolean[Utils.liczbaWierzcholkowMacierzIncyd];
        for (int i = 0; i < czyOdwiedzono.length; i++) { // Zeruje stan
            czyOdwiedzono[i] = false;
        }

        czyOdwiedzono[numerWierzcholkaStartowego] = true;
        System.out.println(numerWierzcholkaStartowego + " ");
        for (int i = 0; i < liczbaKrawedzi - 1; i++) {
            if (macierzIncydencji[numerWierzcholkaStartowego][i] == 1) {
                for (int j = 0; j < liczbaWierzcholkowMacierzIncyd - 1; j++) {
                    if (macierzIncydencji[j][i] == 1) {
                        if (czyOdwiedzono[j] == false) {
                            return DFS(j);
                        }

                    }
                }
            }
        }
        return 99999;
    }


}
