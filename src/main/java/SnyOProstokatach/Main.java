package SnyOProstokatach;

public class Main {
    public static void main(String[] args) {
        Sen sen = new Sen();

        WypisywaczFigur wypisywaczFigur = new WypisywaczFigur();
//        Trojkat trojkat = new Trojkat(5,5,5);
//        Prostokat prostokat = new Prostokat(2,3);
//
//        wypisywaczFigur.wypisz(trojkat);
//        wypisywaczFigur.wypisz(prostokat);

        Utils utils = new Utils();

        utils.produkujFigury();

        for (int i = 0; i < 10 ; i++) {
            wypisywaczFigur.wypisz(utils.listaFigur.get(utils.generujLiczbe(20)));

        }

        // poczytac o varargsach !


    }
}
