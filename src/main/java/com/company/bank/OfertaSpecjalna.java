package com.company.bank;

public class OfertaSpecjalna extends OfertaPodstawowa {  //

//    double oprocentowanie;

    double maxOprocentowanie = 10.0d;
    boolean czyOfertaSpecjalna = true;

    OfertaSpecjalna(double oprocentowanie, Kapitalizacja kapitalizacja) {
        super(oprocentowanie,kapitalizacja);
        this.maxOprocentowanie = maxOprocentowanie;
//        this.czyOfertaSpecjalna = czyOfertaSpecjalna;

    }

}
