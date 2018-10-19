package com.company.WzorceProjektoweUG.DuzyProjekt;

class LadowarkaRobot extends PodstawowyRobot {
    int udzwig;

    public LadowarkaRobot(String nazwa, String typ) {
        super(nazwa, typ);
    }

    public LadowarkaRobot(String nazwa, String typ, String silnik, String naped, int napedIlosc, String bateria, int pojemnoscBaterii) {
        super(nazwa, typ, silnik, naped, napedIlosc, bateria, pojemnoscBaterii);
    }

    void zaladuj(){};
    void zdejmij(){};
    void podnies(){};
    void opusc(){};

}