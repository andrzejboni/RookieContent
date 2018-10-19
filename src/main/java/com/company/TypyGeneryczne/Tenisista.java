package com.company.TypyGeneryczne;

public class Tenisista extends Sportowiec {
    @Override
    public void trenuj() {
        System.out.println("Trenujemy Tenisiste! Serwowanie ćwiczymy, dawaj!");
    }


    @Override
    public void dajSuplementy() {
        System.out.println("Ale zajebiste prochy dla tenisistów!");
    }

    @Override
    protected void wesprzyjDuchowo() {
        System.out.println("Osiagaj dobre wyniki Tenisisto, Psycholog Sportowy dobrze Ci radzi");
    }


}
