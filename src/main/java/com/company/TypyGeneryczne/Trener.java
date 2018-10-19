package com.company.TypyGeneryczne;

public class Trener<E extends Sportowiec> {
    private E element;

    public Trener(E element) {
        this.element = element;
    }

    public void prowadzTrening() {
        // element.trenuj();
        this.element.trenuj();
    }

    public void dajSumplementy(){
        this.element.dajSuplementy();
    }


}
