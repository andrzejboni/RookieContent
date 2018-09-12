package com.company.WzorceProjektoweUG.DuzyProjekt;

public  abstract class Dekorator implements Robot{

    private Robot robot;

    public Dekorator(Robot robot) {
        this.robot = robot;
       // System.out.println("Dekorowanie "+ this.robot.toString());
    }


    @Override
    public void jedzPrzod() {
        this.robot.jedzPrzod();
    }

    @Override
    public void jedzTyl() {
        this.robot.jedzTyl();
    }

    @Override
    public void zatrzymaj() {
        this.robot.zatrzymaj();
    }

    @Override
    public void jedzLewo() {
        this.robot.jedzLewo();
    }

    @Override
    public void jedzPrawo() {
        this.robot.jedzPrawo();
    }

    @Override
    public String Wypisz() {

        return this.robot.Wypisz();
    }

    @Override
    public void setNazwa(String nazwa) {
        this.robot.setNazwa(nazwa);
    }

    @Override
    public void setSilnik(String silnik) {
        this.robot.setSilnik(silnik);
    }

    @Override
    public void setNaped(String naped) {
        this.robot.setNaped(naped);
    }

    @Override
    public void setNapedIlosc(int napedilosc) {
        this.robot.setNapedIlosc(napedilosc);
    }

    @Override
    public void setBateria(String bateria) {
        this.robot.setBateria(bateria);
    }

    @Override
    public void setPojemnoscBaterii(int pojemnoscBaterii) {
        this.robot.setPojemnoscBaterii(pojemnoscBaterii);
    }

    @Override
    public void podlacz(Obserwator x) {
        this.robot.podlacz(x);
    }

    @Override
    public void powiadomWszystkich() {
        this.robot.powiadomWszystkich();
    }

    @Override
    public int getPredkosc() {

        return this.robot.getPredkosc();
    }

    @Override
    public void setPredkosc(int predkosc) {
        this.robot.setPredkosc(predkosc);
    }
}
