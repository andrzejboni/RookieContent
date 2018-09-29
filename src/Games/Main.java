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

        Wypisz.powitanie();
//        Wisielec.podajLiczbeProb();

        wczytajSlowo.wczytaj();
//        System.out.println(wiersz);

        wisielec.dodajSlowaDoTablicy(wiersz);

        String wyraz = parts[wisielec.losujSlowo()];
//        System.out.println(wyraz);

        wisielec.rzutujWybraneSlowoNaChar(parts);

        wisielec.czyPoprawnaLitera(slowoNaChar);

//        System.out.println(Wisielec.slowoNaChar[0]);







//        wisielec.dodajSlowaDoTablicy(wiersz);
//
//        wisielec.rzutujWybraneSlowoNaChar(parts);
//        wisielec.czyPoprawnaLitera(slowoNaChar);


//        wisielec.rzutujWybraneSlowoNaChar(parts);
//        wisielec.czyPoprawnaLitera(slowoNaChar);
//        wisielec.czyPoprawnaLitera(slowoNaChar);
//        wisielec.zgadnijLitere();


    }


}
