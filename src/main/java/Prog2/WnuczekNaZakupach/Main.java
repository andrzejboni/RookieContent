package Prog2.WnuczekNaZakupach;

import Prog2.WnuczekNaZakupach.ZrodloPieniedzy.*;

import java.util.Collection;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        Wnuczek wnuczek = new Wnuczek();

        new Portfel(100);
        new Babcia(150);
        new Pozyczka(1000);
        new PracaDlaWnuczka(400);

        final Collection<ZrodloPieniedzy> zrodla = new HashSet<>();
        zrodla.add(new Portfel(55));
        zrodla.add(new Babcia(15));
        zrodla.add(new Pozyczka(65));
        zrodla.add(new PracaDlaWnuczka(90));


//        dopisac wypisywanie czegokolwiek do tego

    }
}
