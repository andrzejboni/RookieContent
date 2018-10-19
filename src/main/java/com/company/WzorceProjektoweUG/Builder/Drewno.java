package com.company.WzorceProjektoweUG.Builder;


public class Drewno {
    private String rodzajDrewna;

    public String getRodzajDrewna() {
        return rodzajDrewna;
    }

    public void setRodzajDrewna(String rodzajDrewna) {
        this.rodzajDrewna = rodzajDrewna;
    }

    @Override
    public String toString() {
        return "Rodzaj drewna: " + rodzajDrewna+ "\n";
    }
}