package com.company.WzorceProjektoweUG.Builder;


public class KolorGitary {
    private String kolor;

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor= kolor;
    }

    @Override
    public String toString() {
        return "Kolor gitary: " + kolor+ "\n";
    }
}