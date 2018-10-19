package com.company.WzorceProjektoweUG.PrototypPlytko;

public class ZawartoscKoszyka {

    private String tytul;
    private String wykonawca;


    private int id;
    private String nazwa;
    private String zawartoscSlodyczy;
    private String zawartoscAlkoholi;
    private String zawartoscJedznia;
    private int cena;

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getZawartoscSlodyczy() {
        return zawartoscSlodyczy;
    }

    public void setZawartoscSlodyczy(String zawartoscSlodyczy) {
        this.zawartoscSlodyczy = zawartoscSlodyczy;
    }

    public String getZawartoscAlkoholi() {
        return zawartoscAlkoholi;
    }

    public void setZawartoscAlkoholi(String zawartoscAlkoholi) {
        this.zawartoscAlkoholi = zawartoscAlkoholi;
    }

    public String getZawartoscJedznia() {
        return zawartoscJedznia;
    }

    public void setZawartoscJedznia(String zawartoscJedznia) {
        this.zawartoscJedznia = zawartoscJedznia;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }




    @Override
    public String toString() {
        return "\nId:" + id + " Nazwa [" + nazwa + "] Cena ["+ cena + " zł]" +"\n Slodycze: [" + zawartoscSlodyczy + "] \n Alkohole: [" + zawartoscAlkoholi
                + "] \n Jedzenie: [" + zawartoscJedznia+ "]";
    }
}

