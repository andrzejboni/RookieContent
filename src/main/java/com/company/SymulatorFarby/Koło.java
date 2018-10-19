package com.company.SymulatorFarby;

public class Koło extends Figura {
double r;


    public double obliczPowierzchnie() {
        double powierzchnia = (Math.PI)*(r*r);

        return powierzchnia;
    }

    Koło(double r){
        this.r = r;
    }

}
