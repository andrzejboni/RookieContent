package GrafyZadaniaUG;

import javafx.scene.control.ComboBox;
import org.assertj.core.util.Lists;

import javax.rmi.CORBA.Util;
import java.util.*;

import static GrafyZadaniaUG.Utils.*;

public class Kruskal {

    public Kruskal() {

    }


    public void dodajKrawedzDoListySasiedztwa(int x, int y, int waga) {
        listaSasiedztwa.add(new Krawedz(x, y, waga));
    }

    public void wypiszListeSasiedztwa() {
        System.out.println(listaSasiedztwa);
    }

    public void kruskal() {
        // Należy sprawdzić spójnośc grafu uprzendnio!!
//        if (!Utils.czyGrafJestSpojnyNieskierowanyWazony()) { // ODKOMENTOWAC @!!!@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
//            System.out.printf("Graf nie jest spójny");
//            return;
//        }
//
//        zbiorWierzcholka.remove(0);
        /*
        Zbior wierzcholkow(defcto lista) który będzie powiększał wraz z dodawaniem kolejnych wierzchołków
        tworząc finalnie minimalne drzewo rozpinające.
        zbiorWierzcholka.get(0);
        */

        sumaWagKrawedzi += zbiorWierzcholka.get(0).get(0).getWaga(); // Do sumy wag krawedzi dodaje pierwszy wierzcholek
        listaSasiedztwa.remove(0);


        for (int i = 0; i < listaSasiedztwa.size() -1; i++) {
            Krawedz a = listaSasiedztwa.get(i);
            listaSasiedztwa.remove(i); // ewentualne do usuniecia.

            if (!zbiorWierzcholka.get(i).contains(a)) {
                System.out.println(zbiorWierzcholka.get(i) + " PRZED");
                zbiorWierzcholka.get(i).addAll(zbiorWierzcholka.get(i + 1)); // powinienem dodawac całą listę a nie tylko wierzch
                System.out.println(zbiorWierzcholka.get(i) + " PO DODANIU");


                sumaWagKrawedzi += a.getWaga(); // sumuje wage dodanych krawedzi
                System.out.println("DODAŁEM " + a);

                System.out.println("Lista s przed usunieciem" + listaSasiedztwa.get(i + 1));
                listaSasiedztwa.remove(a);
                zbiorWierzcholka.remove(a);
                System.out.println("Lista s PO usunieciu" + listaSasiedztwa.get(i + 1));

                System.out.println(listaSasiedztwa);
            }
        }
//        wypiszZbiorWierzcholkow();
//        System.out.println("Minimalne drzewo spinające:" + zbiorWierzcholka.get(0));
        System.out.println("Suma wag krawedzi to : " + sumaWagKrawedzi);
    }


    public void stworzZbiorWierzcholkow() {

        for (int j = 0; j < listaSasiedztwa.size(); j++) {

            zbiorWierzcholka.add(new ArrayList<Krawedz>(Arrays.asList(listaSasiedztwa.get(j))));
        }
    }

    public void wypiszZbiorWierzcholkow() {
        System.out.println(zbiorWierzcholka);

    }


//
////         if nie tworzy cyklu, dodaj do listy
//        for(
//    int i = 0;
//    i< 20;i++)
//
//    {
//        if () {
//            zbiorWierzcholka.add(Utils.listaSasiedztwa.get(i));
//        }
//    }


    public boolean sprawdzCzyWGrafieJestCykl() {


        return false;
    }


}
//            ArrayList<Krawedz> l3 = Lists.newArrayList(listaSasiedztwa.get(j));