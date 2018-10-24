package Strategy.Zadanie2;

import java.util.ArrayList;
import java.util.List;

public class Dziekanat {

    Strategia strategia;
    List<Student> listA = new ArrayList<Student>();

    public Dziekanat(Strategia strategia2, List<Student> listA) {
        this.strategia = strategia;
        this.listA = listA;
    }


    public void save(){
        strategia.zapisz(listA);
    }
}
