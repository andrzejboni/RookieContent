package com.company.java;

public class MainUlamek {
    public static void main(String[] args) { // Działa legitnie, brak tylko skracania ułamków i jakichś przygotowań idiotoodpornych akcji.
        Ulamek u1 = new Ulamek(105,8);
//        Ulamek u2 = new Ulamek(2,3);


        System.out.println(u1.getLicznik());
        System.out.println(u1.getMianownik());


        u1.dodawanie(33,15);
        u1.odejmowanie(33,15);
        u1.mnozenie(33,15);
        u1.dzielenie(33,15);


    }


}
