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

        for (int i = 0; i < listaSasiedztwa.size() -1; i++) {


                Krawedz a = listaSasiedztwa.get(i + 1);

//            for (int j = 0; j < listaSasiedztwa.size() ; j++) {
//

                if (!zbiorWierzcholka.get(i).contains(a)) {

//                zbiorWierzcholka.get(i).addAll(a); Opcja z łączeniem dwu list Do rozważenia !!!
                    zbiorWierzcholka.get(i).add(a);

                    sumaWagKrawedzi += a.getWaga();
//                System.out.println(" Dodałem " + zbiorWierzcholka.get(0).contains(a));
                    wypiszListeSasiedztwa();
                    listaSasiedztwa.remove(a);
                    wypiszListeSasiedztwa();
                }
        }

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