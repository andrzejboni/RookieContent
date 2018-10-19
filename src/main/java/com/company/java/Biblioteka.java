package com.company.java;

import java.util.ArrayList;

public class Biblioteka {

    Ksiazka k1  = new Ksiazka("Paradoks", "Philip Zimbardo", 1234, 2010);
    Ksiazka k2  = new Ksiazka("Efekt", "Philip Zimbardo", 1235, 2006);
    Ksiazka k3  = new Ksiazka("Bill", "Izrael Poznanski", 1236, 1994);
    Ksiazka k4  = new Ksiazka("Big", "Zbigniew Brzeziński", 1237, 1987);
    Ksiazka k5  = new Ksiazka("Pułapki", "Daniel Kahneman",1238, 2004);
    Ksiazka k6  = new Ksiazka("Bieguni", "Olga Tokarczuk", 1239, 2007);




    Ksiazka[] tablicaKsiazek = new Ksiazka[6];
    Ksiazka[] tablicaWypozyczonychKsiazek = new Ksiazka[6];



    ArrayList<Ksiazka> listaKsiazek = new ArrayList<Ksiazka>();
    ArrayList<Ksiazka> listaWypozyczonychKsiazek = new ArrayList<Ksiazka>();

public void wypelnijTabliceKsiazek () {



    listaKsiazek.add(k1);
    listaKsiazek.add(k2);
    listaKsiazek.add(k3);
    listaKsiazek.add(k4);
    listaKsiazek.add(k5);
    listaKsiazek.add(k6);



}


    public boolean czyKsiazkaJestDostepna(String nazwaKsiazki) {

        for (int i=0; i < listaKsiazek.size(); i++) {
            if (nazwaKsiazki.equals(listaKsiazek.get(i).nazwa) ) {
                //System.out.println("Prawda");
                return true;
            }
        }
        return false;
    }

        public String wypozyczKsiazke (String nazwaKsiazki){

            for (int i=0; i < listaKsiazek.size(); i++) {
                if (nazwaKsiazki.equals(listaKsiazek.get(i).nazwa)) {
                    listaWypozyczonychKsiazek.add(listaKsiazek.get(i)) ;
                    listaKsiazek.remove(i);

                }
            }

            return nazwaKsiazki;
        }


        public void wystwietlWypozyczoneKsiazki () {


            for (Ksiazka ksiazka : listaWypozyczonychKsiazek){
                System.out.println(ksiazka.nazwa);
            }

        }


        public void wystwielDostepneKsiazki () {

            for (Ksiazka ksiazka : listaKsiazek){
                System.out.println(ksiazka.nazwa);
            }
        }

    }

