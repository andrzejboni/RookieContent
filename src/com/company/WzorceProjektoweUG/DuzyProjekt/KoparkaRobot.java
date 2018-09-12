package com.company.WzorceProjektoweUG.DuzyProjekt;

class KoparkaRobot extends PodstawowyRobot {

    int glebokoscKopania;
    int silaSpychu;

    public KoparkaRobot(String nazwa, String typ) {
        super(nazwa, typ);
    }

    public KoparkaRobot(String nazwa, String typ, String silnik, String naped, int napedIlosc, String bateria, int pojemnoscBaterii) {
        super(nazwa, typ, silnik, naped, napedIlosc, bateria, pojemnoscBaterii);
    }

    void kop() { }

    void spychaj() { }

    void pobierz() { }

}