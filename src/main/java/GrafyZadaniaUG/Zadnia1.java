package GrafyZadaniaUG;

import java.util.LinkedList;
import java.util.Queue;

public class Zadnia1 {

//    public void przeszukajWGlabDRUGIE_PODEJSCIE() { // POWINNO BYc na podstawie macierzy incydencji!!
//        System.out.println("Liczba wierzchołkow: " + liczbaWierzcholkowMacierzIncyd);
//        System.out.println("Liczba krawedzi: " + liczbaKrawedzi);
//
//        boolean czyOdwiedzono[] = new boolean[Utils.liczbaWierzcholkowMacierzIncyd];
//        for (int i = 0; i < czyOdwiedzono.length; i++) { // Zeruje stan
//            czyOdwiedzono[i] = false;
//        }
//        czyOdwiedzono[0] = true; // Ustawiam wierzchołek poczatkowy na true;
////        System.out.print(" 0");
//
//
//        Queue<Integer> listaOdwiedzonych = new LinkedList<>(); // Jedna dla całego grafu!
//
//        //dodajemy elementy metoda add()
////        queue.add(1);
//
//
//        for (int i = 0; i < liczbaWierzcholkowMacierzIncyd; i++) {
//
//            Queue<Integer> nastepnyWierzcholek = new LinkedList<>(); // indywidualna dla każdego wierzchołka
//
//            for (int j = 0; j < liczbaKrawedzi; j++) {
//
//                if (macierzIncydencji[i][j] == 1) { // Wierzchołek ma połączenie wychodzące! IDĘ TAM GDZIE TA KRAWĘDŹ WCHODZI (SZUKAM -1)
//
//                    nastepnyWierzcholek.add(j);
//
//                    for (int k = 0; k < liczbaWierzcholkowMacierzIncyd; k++) { // Szukam pionowo -1 by znaleźć gdzie krawędź wchodzi
//                        if (macierzIncydencji[i][k] == -1) {
//                            if (!czyOdwiedzono[j]) {  // Jeśli nie jest odwiedzony, zmieniam wartość na true, dodaje do kolejki.
//                                czyOdwiedzono[k] = true;
//                                listaOdwiedzonych.add(k);
//                            }
//                        }
//                    }
//                }
//
//                // Poniżej odiwedzam nasepny wierzchołek !!!
//
//            }
//
//        }
//
//
//        System.out.println("Lista odwiedzonych wierzchołkow: \n" + listaOdwiedzonych);
//
//    }
//public void przeszukajWGlab() { //   POWINNO BYc na podstawie macierzy incydencji!!
//
//
//    System.out.println("Liczba wierzchołkow: " + liczbaWierzcholkowMacierzIncyd);
//    System.out.println("Liczba krawedzi: " + liczbaKrawedzi);
//
//    int licznik = 0;
//
//    boolean czyOdwiedzono[] = new boolean[Utils.liczbaWierzcholkowMacierzIncyd];
//    for (int i = 0; i < czyOdwiedzono.length; i++) { // Zeruje stan
//        czyOdwiedzono[i] = false;
//    }
//
//    czyOdwiedzono[0] = true;
//    System.out.print(" 0");
//    //  for (int k = 0; k < liczbaWierzcholkowMacierzIncyd; k++) { // Jesli nie przeszedł wszystkich krawedzi to przechodzi je dla pewnosci jeszcze raz !
//
//
//    for (int i = 0; i < Utils.liczbaWierzcholkowMacierzIncyd; i++) {
//
//        int licznik2 = 0; // licznik nie pozwalający przechodzić wiecej niz jedngo wierzchołka w za pierwszym razem
//
//        for (int j = 0; j < Utils.liczbaKrawedzi; j++) {
//
//
//            if (licznik2 == 0) { // Licznik ten pozwala odwiedzić tylko jeden wierzchołek w jednym przebiegu pętli
//                if (macierzIncydencji[i][j] >= 1) {
//
//                    if (!czyOdwiedzono[i]) {
//                        System.out.print(" " + i);
//                        czyOdwiedzono[i] = true;
//                        licznik2++;
//                    }
//                }
//            }
//        }
//    }
//}


//    public int odwiedzWierzcholek(int wierzcholek) { // [wiersz][kolumna]
//
////        for (int i = 0; i < czyOdwiedzono.length; i++) {
////            System.out.print(i + ""+ czyOdwiedzono[i] + " ");
////        }
//        Queue<Integer> listaDoOdwiedzenia = new LinkedList<>();
//
//        czyOdwiedzono[wierzcholek] = true;
//        System.out.print(" v" + wierzcholek);
//
//        for (int j = 0; j < liczbaKrawedzi; j++) {
//            if (macierzIncydencji[wierzcholek][j] == 1) {
//                if (!czyOdwiedzono[j]){
//                    listaDoOdwiedzenia.add(j);
//                }
//            }
//        }
//
//
//        for (int j = 0; j < listaDoOdwiedzenia.size() ; j++) {
//            for (int i = 0; i < liczbaWierzcholkowMacierzIncyd; i++) {
//                if (macierzIncydencji[i][j] == -1) {
//                    if (!czyOdwiedzono[i]) {
//                        return odwiedzWierzcholek(listaDoOdwiedzenia.poll());
//                    }
//                }
//            }
//        }
//
//
////        czyOdwiedzono[wierzcholek] = true;
////        System.out.print(" v" + wierzcholek);
////        for (int j = 0; j < liczbaKrawedzi; j++) {
////            if (macierzIncydencji[wierzcholek][j] == 1) {
////
////                for (int i = 0; i < liczbaWierzcholkowMacierzIncyd; i++) {
////                    if (macierzIncydencji[i][j] == -1) {
////                        if (!czyOdwiedzono[i]) {
////                            return odwiedzWierzcholek(i);
////                        }
////                    }
////                }
////
////            }
////        }
//        return 9999;
////    }
//public int DFS() {
//
//    for (int i = 0; i < czyOdwiedzono.length; i++) { // Zeruje stan
//        czyOdwiedzono[i] = false;
//    }
//
//    for (int i = 0; i < liczbaWierzcholkowMacierzIncyd; i++) {
//        if (!czyOdwiedzono[i]) {
//            return odwiedzWierzcholek(i);
//        }
//    }
//    return 9999;
//}
//


/*
   function VisitNode(u):
       oznacz u jako odwiedzony
       dla każdego wierzchołka v na liście sąsiedztwa u:
           jeżeli v nieodwiedzony:
               VisitNode(v)
   function DepthFirstSearch(Graf G):
       dla każdego wierzchołka u z grafu G:
           oznacz u jako nieodwiedzony
       dla każdego wierzchołka u z grafu G:
           jeżeli u nieodwiedzony:
               VisitNode(u)
 */

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


}
