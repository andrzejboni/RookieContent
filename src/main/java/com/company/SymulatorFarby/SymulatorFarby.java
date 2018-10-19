package com.company.SymulatorFarby;

public class SymulatorFarby {


    public static int obliczZapotrzebowanieNaFarbe(Figura[] figura, double pojemnikNaFarbe){ // Podając w nawiasie
        int wynik = 0;

        for (int i =0; i < figura.length; i++){
            wynik += figura[i].obliczPowierzchnie();

        }
         wynik= (int) (wynik/pojemnikNaFarbe)+1;


        return wynik;
    }


}
