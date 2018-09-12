package com.company.WzorceProjektoweUG.DuzyProjekt;

public interface Robot {


    void jedzPrzod();

    void jedzTyl();

    void zatrzymaj();

    void jedzLewo();

    void jedzPrawo();

    String Wypisz();

    void setNazwa(String nazwa);
    void setSilnik(String silnik);
    void setNaped(String naped);
    void setNapedIlosc(int napedilosc);
    void setBateria(String bateria);
    void setPojemnoscBaterii(int pojemnoscBaterii);


    void podlacz(Obserwator x);
    void powiadomWszystkich();

    int getPredkosc();

    void setPredkosc(int predkosc);
}
