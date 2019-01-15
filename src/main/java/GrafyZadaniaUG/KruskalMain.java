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
        kruskal.dodajKrawedzDoListySasiedztwa(0, 1, 4);
        kruskal.dodajKrawedzDoListySasiedztwa(0, 2, 4);
        kruskal.dodajKrawedzDoListySasiedztwa(0, 3, 6);
        kruskal.dodajKrawedzDoListySasiedztwa(0, 4, 6);

        kruskal.dodajKrawedzDoListySasiedztwa(1, 2, 2);

        kruskal.dodajKrawedzDoListySasiedztwa(2, 3, 8);

        kruskal.dodajKrawedzDoListySasiedztwa(3, 4, 9);


        krawedz.posortujKrawedzieRosnaco();
        kruskal.stworzZbiorWierzcholkow();




        kruskal.wypiszListeSasiedztwa();
        kruskal.wypiszZbiorWierzcholkow();
        System.out.println("------------------------");

        kruskal.kruskal();





//        Krawedz a = listaSasiedztwa.get(0);
//        if (!zbiorWierzcholka.get(1).contains(a)) {
//            System.out.println("dupa");
//        }


    }
}
