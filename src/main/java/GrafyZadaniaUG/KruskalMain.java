package GrafyZadaniaUG;

import javax.rmi.CORBA.Util;
import java.util.ArrayList;
import java.util.Collections;

import static GrafyZadaniaUG.Utils.*;

public class KruskalMain {
    public static void main(String[] args) {


        Utils utils = new Utils();

        Kruskal kruskal = new Kruskal();


        Krawedz krawedz = new Krawedz();


        KrawedzComparator krawedzComparator = new KrawedzComparator();

        // Macierz skrócona ------
//        kruskal.dodajKrawedzDoListySasiedztwa(0, 1, 4);
//        kruskal.dodajKrawedzDoListySasiedztwa(0, 2, 4);
//        kruskal.dodajKrawedzDoListySasiedztwa(0, 3, 6);
//        kruskal.dodajKrawedzDoListySasiedztwa(0, 4, 6);
//
//        kruskal.dodajKrawedzDoListySasiedztwa(1, 2, 2);
//
//        kruskal.dodajKrawedzDoListySasiedztwa(2, 3, 8);
//
//        kruskal.dodajKrawedzDoListySasiedztwa(3, 4, 9);
//


        // Druga macierz.
        kruskal.dodajKrawedzDoListySasiedztwa(0, 1, 1);
        kruskal.dodajKrawedzDoListySasiedztwa(0, 2, 10);
        kruskal.dodajKrawedzDoListySasiedztwa(0, 3, 6);
        kruskal.dodajKrawedzDoListySasiedztwa(0, 4, 5);

        kruskal.dodajKrawedzDoListySasiedztwa(1, 2, 2);
        kruskal.dodajKrawedzDoListySasiedztwa(1, 3, 7);
        kruskal.dodajKrawedzDoListySasiedztwa(1, 4, 8);

        kruskal.dodajKrawedzDoListySasiedztwa(2, 3, 3);
        kruskal.dodajKrawedzDoListySasiedztwa(2, 4, 9);

        kruskal.dodajKrawedzDoListySasiedztwa(3, 4, 4);


        krawedz.posortujKrawedzieRosnaco();
        kruskal.stworzZbiorWierzcholkow();

        kruskal.wypiszListeSasiedztwa();
        kruskal.wypiszZbiorWierzcholkow();
        System.out.println("------------------------");

//        kruskal.kruskal();

//        System.out.println(" Przed dodaniem krawedzi" + zbiorWierzcholka.get(0));


        //-------
//        zbiorWierzcholka.get(0).add(listaSasiedztwa.get(1));
//        zbiorWierzcholka.get(0).add(listaSasiedztwa.get(2));
//        zbiorWierzcholka.get(0).add(listaSasiedztwa.get(3));
//        zbiorWierzcholka.get(0).add(listaSasiedztwa.get(4));
//
//        sumaWagKrawedzi += zbiorWierzcholka.get(0).get(1).getWaga();
//        sumaWagKrawedzi += zbiorWierzcholka.get(0).get(2).getWaga();
//        sumaWagKrawedzi += zbiorWierzcholka.get(0).get(3).getWaga();
//        sumaWagKrawedzi += zbiorWierzcholka.get(0).get(4).getWaga();

//        System.out.println(sumaWagKrawedzi);

//        System.out.println(" PO dodaniu " + zbiorWierzcholka.get(0));
// --- Wszystko działa poprawnie



        for (int i = 0; i < zbiorWierzcholka.size(); i++) {

            int licznik = 0;
            for (int j = 0; j < zbiorWierzcholka.size(); j++) {

                if (!zbiorWierzcholka.get(i).contains(listaSasiedztwa.get(j))) {
                    if (licznik < 1) {
                        zbiorWierzcholka.get(i).add(listaSasiedztwa.get(j));
                        System.out.println(zbiorWierzcholka.get(i)); // powinno wypisac liste która jest w tym zawarta
                        sumaWagKrawedzi += listaSasiedztwa.get(j).getWaga();
                        System.out.println(sumaWagKrawedzi);

                        licznik++;
                    }
                }
            }

        }
//            System.out.println(zbiorWierzcholka.get(i));
    }

// 48 punktow do zaliczenia.


//        Krawedz a = listaSasiedztwa.get(0);
//        if (!zbiorWierzcholka.get(1).contains(a)) {
//            System.out.println("dupa");
//        }


}



// 91%, 27 na 31 i pół, dwa punkty skoszone z zadań.