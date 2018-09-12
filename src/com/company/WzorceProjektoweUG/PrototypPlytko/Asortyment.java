package com.company.WzorceProjektoweUG.PrototypPlytko;


import java.util.ArrayList;
import java.util.List;

public class Asortyment implements Cloneable {
    private String nazwa;
    List<ZawartoscKoszyka> koszyk = new ArrayList<>();
    public String getNazwa() {
        return nazwa;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    public List<ZawartoscKoszyka> getZawartoscKoszyka() {
        return koszyk;
    }
    public void setPiosenki(List<ZawartoscKoszyka> piosenki) {
        this.koszyk = piosenki;
    }
    @Override
    public String toString() {
        return "Nazwa koszyków słodkości: " + nazwa + koszyk;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public void dodajZawartosc() {
        ZawartoscKoszyka k = new ZawartoscKoszyka();
        k.setId(1);
        k.setNazwa("Koszyk Słodkości na święta");
        k.setZawartoscSlodyczy("Czekolada Lind, Bombonierka Milka, Ferrero Rocher");
        k.setZawartoscAlkoholi("Wino 12%");
        k.setZawartoscJedznia("Kawior czarny");
        k.setCena(80);
        getZawartoscKoszyka().add(k);
        ZawartoscKoszyka k2 = new ZawartoscKoszyka();
        k2.setId(2);
        k2.setNazwa("Koszyk Słodkości na imieniny");
        k2.setZawartoscSlodyczy("Bombonierka Wedel, Czekolada Milka, Merci");
        k2.setZawartoscAlkoholi("Whisky 40%");
        k2.setZawartoscJedznia("Kawior czerwony");
        k2.setCena(140);
        getZawartoscKoszyka().add(k2);
        ZawartoscKoszyka k3 = new ZawartoscKoszyka();
        k3.setId(3);
        k3.setNazwa("Koszyk Słodkości na urodziny");
        k3.setZawartoscSlodyczy("Praliny Magnifique, Czekolada Toblerone, Merci");
        k3.setZawartoscAlkoholi("Whisky 40%");
        k3.setZawartoscJedznia("Kawior czerwony, rodzynki");
        k3.setCena(180);
        getZawartoscKoszyka().add(k3);
        ZawartoscKoszyka k4 = new ZawartoscKoszyka();
        k4.setId(4);
        k4.setNazwa("Koszyk Słodkości na okrągłą rocznice");
        k4.setZawartoscSlodyczy("Praliny Magnifique, Czekolada Toblerone, Ferrero Rocher, Merci");
        k4.setZawartoscAlkoholi("Whisky 40%, Wino 12%");
        k4.setZawartoscJedznia("Kawior czerwony, rodzynki, grzyby marynowane, ser Gorgonzola");
        k4.setCena(240);
        getZawartoscKoszyka().add(k4);
    }
}