package Prog2.WnuczekWersjaLipna;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> liczby = new ArrayList<>();
        liczby.add(12);
        liczby.add(1325);
        liczby.add(1532);
        List<String> listaSlow = new ArrayList<>();
        listaSlow.add("mleko");
        listaSlow.add("zupa");
        listaSlow.add("ziarno");

//        liczby.stream().forEach(liczba-> System.out.println("Liczba to "+ liczba));
        liczby.stream().filter(line -> !"ziarno".equals(line)) ;

        System.out.println(        listaSlow.stream().filter(line -> !"ziarno".equals(line)));

        listaSlow.stream().filter(line-> !"ziarno".equals(line));
        //Babcia trzyma pieniadze w skarpecie, kwota pieniedzy w skarpecie
        // wnuczek pojdzie na zakupy kupic trampki i do kina
        // wnuczek podbiera kase babci.

    }
}
