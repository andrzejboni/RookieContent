package com.company.ProgramDoObslugiZamowien;

import java.util.ArrayList;
import java.util.Scanner;

public class ProgramDoObslugiZamowienMain {

    public static void main(String[] args) {
        Pozycja chleb = new Pozycja("chleb", 2.0, 3);
        Pozycja mleko = new Pozycja("mleko", 2.5, 2);
        Pozycja ryz = new Pozycja("ryz", 3.5, 1);
        Pozycja kasza = new Pozycja("kasza", 1.5, 4);


        Zamowienie nr1 = new Zamowienie(15);
        Zamowienie nr2 = new Zamowienie();


        nr1.dodajPozycje(ryz);
        nr1.dodajPozycje(mleko);
        nr1.dodajPozycje(chleb);
        nr1.dodajPozycje(kasza);





        nr1.wypisz();










    }


}
