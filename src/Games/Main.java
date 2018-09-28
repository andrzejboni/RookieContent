package Games;

import Games.Wisielec.WczytajSlowo;
import Games.Wisielec.Wisielec;
import Games.Wisielec.Wypisz;
import Games.ZgadnijLiczbe.ZgadnijLiczbe;

import static Games.Wisielec.WczytajSlowo.wiersz;
import static Games.Wisielec.Wisielec.parts;
import static Games.Wisielec.Wisielec.slowoNaChar;

public class Main {
    public static void main(String[] args) {

        Wisielec wisielec = new Wisielec();
        WczytajSlowo wczytajSlowo = new WczytajSlowo();

        wczytajSlowo.wczytaj();
//        System.out.println(wiersz);
        wisielec.losujSlowo();
        wisielec.dodajSlowaDoTablicy(wiersz);

        wisielec.rzutujWybraneSlowoNaChar(parts);
        wisielec.czyPoprawnaLitera(slowoNaChar);



//        wisielec.rzutujWybraneSlowoNaChar(parts);
//        wisielec.czyPoprawnaLitera(slowoNaChar);
//        wisielec.czyPoprawnaLitera(slowoNaChar);
//        wisielec.zgadnijLitere();


    }


}
