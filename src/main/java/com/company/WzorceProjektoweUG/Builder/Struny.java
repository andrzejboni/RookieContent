package com.company.WzorceProjektoweUG.Builder;

public class Struny {
    private String typ;
    private int liczba;

    public String getTyp() {
        return typ;
    }
    public void setTyp(String typ) {
        this.typ = typ;
    }
    public int getLiczba() {
        return liczba;
    }
    public void setLiczba(int liczba) {
        this.liczba = liczba;
    }
    @Override
    public String toString() {
        return "Struny: " + typ + "\nLiczba strun: " + liczba + "\n";
    }
}