package com.company.WzorceProjektoweOnceAgain.Builder.BuilderAnotherExample;

public class WashMachine {
    private double cena;
    private int iloscObrotow;
    private int temperaturaWody;
    private String marka;
    private double waga;
    private int iloscProgramowPrania;
    private int iloscWsadu;

    @Override
    public String toString() {
        return "WashMachine{" +
                "cena=" + cena +
                ", iloscObrotow=" + iloscObrotow +
                ", temperaturaWody=" + temperaturaWody +
                ", marka='" + marka + '\'' +
                ", waga=" + waga +
                ", iloscProgramowPrania=" + iloscProgramowPrania +
                ", iloscWsadu=" + iloscWsadu +
                '}';
    }

    public double getCena() {
        return cena;
    }

    public int getIloscObrotow() {
        return iloscObrotow;
    }

    public int getTemperaturaWody() {
        return temperaturaWody;
    }

    public String getMarka() {
        return marka;
    }

    public double getWaga() {
        return waga;
    }

    public int getIloscProgramowPrania() {
        return iloscProgramowPrania;
    }

    public int getIloscWsadu() {
        return iloscWsadu;
    }

    public WashMachine(double cena, int iloscObrotow, int temperaturaWody, String marka, double waga, int iloscProgramowPrania, int iloscWsadu) {
        this.cena = cena;
        this.iloscObrotow = iloscObrotow;
        this.temperaturaWody = temperaturaWody;
        this.marka = marka;
        this.waga = waga;
        this.iloscProgramowPrania = iloscProgramowPrania;
        this.iloscWsadu = iloscWsadu;
    }

    public WashMachine(){}

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
