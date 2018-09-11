package com.company.SymulatorFarby;

public class Kwadrat extends Figura {
    double bokB;
    double bokA;

    public double obliczPowierzchnie() {

        double powierzchnia = bokA*bokA;


        return powierzchnia;
    }

    Kwadrat(double bokA,double bokB) {

        this.bokA= bokA;
        this.bokB = bokB;
    }


}
