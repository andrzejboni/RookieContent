package SnyOProstokatach;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Utils {


    int size = 100;
    List<Figura> listaFigur = new ArrayList<Figura>();
    Random random = new Random();
    public int generujLiczbe(int size){
        int wygenerowanaLiczba = random.nextInt(size);
        return wygenerowanaLiczba;
    }


    public void produkujFigury(){
        for (int i = 0; i < 10 ; i++) {
            Prostokat prostokat = new Prostokat(generujLiczbe(size),generujLiczbe(size));
            Trojkat trojkat= new Trojkat(generujLiczbe(size),generujLiczbe(size),generujLiczbe(size));

            listaFigur.add(prostokat);
            listaFigur.add(trojkat);
        }
    }

}
