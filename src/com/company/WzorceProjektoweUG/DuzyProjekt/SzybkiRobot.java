package com.company.WzorceProjektoweUG.DuzyProjekt;

public class SzybkiRobot extends Dekorator {


    public SzybkiRobot(Robot robot){
        super(robot);

        //System.out.println("Szybki");
    }


    @Override
    public void jedzPrzod() {
        super.jedzPrzod();
        super.setPredkosc(8);
        System.out.println("SzybkiRobot jedzie teraz " + super.getPredkosc()+" km/h!");
    }

    @Override
    public void jedzTyl() {
        super.jedzTyl();
        super.setPredkosc(-8);
        System.out.println("SzybkiRobot jedzie teraz " + super.getPredkosc() + " km/h!");
    }
}
