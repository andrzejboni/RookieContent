package Games;

import Games.Wisielec.WczytajSlowo;
import Games.Wisielec.Wisielec;
import Games.Wisielec.Wypisz;
import Games.ZgadnijLiczbe.ZgadnijLiczbe;

import static Games.Wisielec.Wisielec.parts;
import static Games.Wisielec.Wisielec.slowoNaChar;

public class Main {
    public static void main(String[] args) {

        Wisielec wisielec = new Wisielec();
        WczytajSlowo wczytajSlowo = new WczytajSlowo();

        wczytajSlowo.wczytaj();
        wisielec.losujSlowo();
        wisielec.rzutujWybraneSlowoNaChar(parts);
        wisielec.czyPoprawnaLitera(slowoNaChar);
        wisielec.czyPoprawnaLitera(slowoNaChar);
        wisielec.zgadnijLitere();


    }


}
