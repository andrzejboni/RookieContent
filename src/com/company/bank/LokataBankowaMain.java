package com.company.bank;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LokataBankowaMain {
    public static void main(String[] args) {
        Kapitalizacja kapitalizacjaK = Kapitalizacja.KWARTALNA;
        Kapitalizacja kapitalizacjaM = Kapitalizacja.MIESIECZNA;
        Kapitalizacja kapitalizacjaR = Kapitalizacja.ROCZNA;

        OfertaPodstawowa o1 = new OfertaPodstawowa(0.07, kapitalizacjaK);
        OfertaPodstawowa o2 = new OfertaPodstawowa(0.07, kapitalizacjaM);
        OfertaPodstawowa o3 = new OfertaPodstawowa(0.07, kapitalizacjaR);
        OfertaPodstawowa o4 = new OfertaPodstawowa(0.07, kapitalizacjaM);
//
        OfertaSpecjalna oSpec1 = new OfertaSpecjalna(0.3, kapitalizacjaM);
        OfertaSpecjalna oSpec2 = new OfertaSpecjalna(0.6, kapitalizacjaR);
        OfertaSpecjalna oSpec3 = new OfertaSpecjalna(0.6, kapitalizacjaR);
        OfertaSpecjalna oSpec4 = new OfertaSpecjalna(0.6, kapitalizacjaR);

        SymulatorZysku symulatorZysku = new SymulatorZysku();

        symulatorZysku.obliczZysk(o1, 10000, 36);

        symulatorZysku.obliczZysk(o2, 10000, 36);

        symulatorZysku.obliczZysk(o3, 10000, 36);

        symulatorZysku.obliczZysk(o4, 10000, 36);

        symulatorZysku.obliczZysk(oSpec1, 10000, 36);

        symulatorZysku.obliczZysk(oSpec2, 10000, 36);

        symulatorZysku.obliczZysk(oSpec3, 10000, 36);

        symulatorZysku.obliczZysk(oSpec4, 10000, 36);


    }

}
