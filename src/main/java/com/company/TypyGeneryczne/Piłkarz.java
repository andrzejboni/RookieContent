package com.company.TypyGeneryczne;

public class Piłkarz extends Sportowiec {


    @Override
    public void trenuj() {
        System.out.println("Trenujemy piłkarza! Rzuty wolne, dawaj!");
    }

    @Override
    public void dajSuplementy() {
        System.out.println("Ale zajebiste prochy dla piłkarzy!");
    }

    @Override
    protected void wesprzyjDuchowo() {
        System.out.println("Osiagaj dobre wyniki Piłkarzu, Psycholog Sportowy dobrze Ci radzi");
    }


}


