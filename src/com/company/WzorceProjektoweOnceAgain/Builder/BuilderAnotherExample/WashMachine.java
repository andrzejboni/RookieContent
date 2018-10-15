package com.company.WzorceProjektoweOnceAgain.Builder.BuilderAnotherExample;

public class WashMachine {
    private double cena;
    private int iloscObrotow;
    private int temperaturaWody;
    private String marka;
    private double waga;
    private int iloscProgramowPrania;
    private int iloscWsadu;

    public WashMachine(double cena, int iloscObrotow, int temperaturaWody, String marka, double waga, int iloscProgramowPrania, int iloscWsadu) {
        this.cena = cena;
        this.iloscObrotow = iloscObrotow;
        this.temperaturaWody = temperaturaWody;
        this.marka = marka;
        this.waga = waga;
        this.iloscProgramowPrania = iloscProgramowPrania;
        this.iloscWsadu = iloscWsadu;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public void setIloscObrotow(int iloscObrotow) {
        this.iloscObrotow = iloscObrotow;
    }

    public void setTemperaturaWody(int temperaturaWody) {
        this.temperaturaWody = temperaturaWody;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public void setWaga(double waga) {
        this.waga = waga;
    }

    public void setIloscProgramowPrania(int iloscProgramowPrania) {
        this.iloscProgramowPrania = iloscProgramowPrania;
    }

    public void setIloscWsadu(int iloscWsadu) {
        this.iloscWsadu = iloscWsadu;
    }
}
