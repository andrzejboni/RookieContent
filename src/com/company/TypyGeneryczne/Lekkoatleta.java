package com.company.TypyGeneryczne;

public class Lekkoatleta extends Sportowiec {
    @Override
    public void trenuj() {
        System.out.println("Trenujemy Lekkoatlete! Skok w wzwyż, dawaj!");
    }

    @Override
    public void dajSuplementy() {
        System.out.println("Ale zajebiste prochy dla lekkoatletów!");
    }

    @Override
    protected void wesprzyjDuchowo() {
        System.out.println("Osiagaj dobre wyniki LekkoAtleto, Psycholog Sportowy dobrze Ci radzi");
    }
}
