package com.company.TypyGeneryczne;

public class PsychologSportowy<E extends Sportowiec> {
    private E element;

    PsychologSportowy(E element){
        this.element = element;
    }


    public void wesprzyjDuchowo(){

        this.element.wesprzyjDuchowo();
    }


}
