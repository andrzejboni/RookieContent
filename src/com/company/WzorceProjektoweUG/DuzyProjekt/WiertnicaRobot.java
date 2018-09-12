package com.company.WzorceProjektoweUG.DuzyProjekt;

class WiertnicaRobot extends PodstawowyRobot{
    int silaWiercenia;

    public WiertnicaRobot(String nazwa, String typ) {
        super(nazwa, typ);
    }

    public WiertnicaRobot(String nazwa, String typ, String silnik, String naped, int napedIlosc, String bateria, int pojemnoscBaterii) {
        super(nazwa, typ, silnik, naped, napedIlosc, bateria, pojemnoscBaterii);
    }

    void wierc() { }

    void pobierz() { }

    void kop() { }
}