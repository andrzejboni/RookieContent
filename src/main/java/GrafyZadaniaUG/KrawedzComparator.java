package GrafyZadaniaUG;

import java.util.Comparator;

public class KrawedzComparator implements Comparator<Krawedz> {
    @Override
    public int compare(Krawedz o1, Krawedz o2) {

        if (o1.getWaga() > o2.getWaga()) {
            return 1;
        }
        if (o1.getWaga() < o2.getWaga()) {
            return -1;
        }
        return 0;
    }

    /*
    Jeśli pierwsza krawędź ma większa wagę, wynik jest równy 1.
    Jeśli druga ma większą wagę, wynik jest równy -1
    Jeśli krawędzie mają takie same wagi wynik jest równy 0.
     */


}
