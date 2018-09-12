package com.company.WzorceProjektoweUG.DuzyProjekt;


import java.util.ArrayList;
import java.util.List;

class PodstawowyRobot implements Robot{

    String nazwa;      // koparka, robot do wiercenia w ziemi, robot do oświetlania, robot kamera
    String typ;
    int predkosc = 0;

    List<Obserwator> obserwatorzy;


    public PodstawowyRobot(String nazwa, String typ) {
        this.nazwa = nazwa;
        this.typ = typ;
        this.obserwatorzy = new ArrayList<Obserwator>();

    }


    public PodstawowyRobot(String nazwa, String typ, String silnik, String naped, int napedIlosc, String bateria, int pojemnoscBaterii) {
        this.nazwa = nazwa;
        this.typ = typ;
        this.silnik = silnik;
        this.naped = naped;
        this.napedIlosc = napedIlosc;
        this.bateria = bateria;
        this.pojemnoscBaterii = pojemnoscBaterii;
    }
    String silnik;    // nazwa silnika

    public String getNazwa() {
        return nazwa;
    }


    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
        powiadomWszystkich();
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
        powiadomWszystkich();
    }

    public String getSilnik() {
        return silnik;
    }


    public void setSilnik(String silnik) {
        this.silnik = silnik;
        powiadomWszystkich();
    }

    public String getNaped() {
        return naped;
    }


    public void setNaped(String naped) {
        this.naped = naped;
        powiadomWszystkich();
    }

    public int getNapedIlosc() {
        return napedIlosc;
    }

    public void setNapedIlosc(int napedIlosc) {
        this.napedIlosc = napedIlosc;
        powiadomWszystkich();
    }

    public String getBateria() {
        return bateria;
    }


    public void setBateria(String bateria) {
        this.bateria = bateria;
        powiadomWszystkich();
    }

    public int getPojemnoscBaterii() {
        return pojemnoscBaterii;
    }

    public void setPojemnoscBaterii(int pojemnoscBaterii) {
        this.pojemnoscBaterii = pojemnoscBaterii;
        powiadomWszystkich();
    }




    @Override
    public void podlacz(Obserwator x) {
        this.obserwatorzy.add(x);


    }

    @Override
    public void powiadomWszystkich() {

        if (obserwatorzy.size() > 0)
        for (Obserwator x: obserwatorzy) {
         //   System.out.println(x.toString());
            x.update();
        }
    }

    String naped;      // gąsiennice, koła,
    int napedIlosc;      // gąsiennic/kół
    String bateria;   //  Li-Ion/ Li-Pol
    int pojemnoscBaterii; // w mAh


    @Override
    public void jedzPrzod() {
        this.predkosc = 1;
        powiadomWszystkich();

    }

    @Override
    public void jedzTyl() {
        this.predkosc = -1;
        powiadomWszystkich();
    }

    @Override
    public void zatrzymaj() {
        this.predkosc = 0;
        powiadomWszystkich();
    }


    @Override
    public void jedzLewo() {
        powiadomWszystkich();
    }

    @Override
    public void jedzPrawo() {
        powiadomWszystkich();
    }

    @Override
    public String Wypisz() {

        return nazwa + " " + typ + " " +  silnik + " " +  naped+ " " +
                napedIlosc+ " " +  bateria+ " " +  pojemnoscBaterii;
    }
    @Override
    public int getPredkosc() {
        return predkosc;
    }
    @Override
    public void setPredkosc(int predkosc) {
        this.predkosc = predkosc;
        powiadomWszystkich();
    }

}


