package com.company.SymulatorFarby;

public class Trapez extends Figura {
    double bokB;
    double bokA;
    double wysokosc;

    public double obliczPowierzchnie() {

        double powierzchnia = ((bokA+bokB)*wysokosc)/2;

        return powierzchnia;
    }

    Trapez(double bokA, double bokB, double wysokosc){
        this.bokA = bokA;
        this.bokB = bokB;
        this.wysokosc = wysokosc;

    }
}
