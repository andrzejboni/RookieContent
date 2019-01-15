package GrafyZadaniaUG;

import java.util.Comparator;
import java.util.Objects;

public class Krawedz { // Klasa służy do przechowywania list sąsiedztwa.
    int x;
    int y;
    int waga;

    public Krawedz() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWaga() {
        return waga;
    }

    public void setWaga(int waga) {
        this.waga = waga;
    }

    public Krawedz(int x, int y, int waga) {
        this.x = x;
        this.y = y;
        this.waga = waga;
    }


    @Override
    public String toString() {
        return "x=" + x +
                " y=" + y +
                " waga=" + waga +", ";
    }


    public void posortujKrawedzieRosnaco() {
        KrawedzComparator krawedzComparator = new KrawedzComparator();
         Utils.listaSasiedztwa.sort(krawedzComparator);
    }


}
