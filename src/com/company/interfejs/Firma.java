package com.company.interfejs;

import java.util.Objects;

public  class Firma implements PosiadaNazwe, PosiadaAdres{
    String nazwa;
    Adres adres;

    Firma(String nazwa, Adres adres){
        this.adres = adres;
        this.nazwa = nazwa;
//        this.adres = adres;
    }


    @Override
    public Adres getAdres() {

        return adres;
    }

    @Override
    public String getNazwa() {
return nazwa;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Firma firma = (Firma) o;
        return Objects.equals(adres, firma.adres);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adres);
    }
}
