package com.company.interfejs;

import java.util.Objects;

public class Adres {
  //  public Adres adres;
    String ulica;
    String miasto;
    int nrDomu;

    String miastoGdans = "Gdańsk";

    Adres(String ulica, String miasto, int nrDomu){
        this.ulica = ulica;
        this.miasto = miasto;
        this.nrDomu = nrDomu;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        Adres adres = (Adres) o;
        return Objects.equals(miasto, adres.miasto);
    }

    @Override
    public int hashCode() {
        return Objects.hash(miasto);
    }






}
