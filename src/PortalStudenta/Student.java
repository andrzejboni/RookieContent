package PortalStudenta;

import java.util.ArrayList;
import java.util.List;

public class Student {

//        - posiadać listę ocen studenta (List<Double>)
//    - posiadać (pole) numer indeksu studenta (String)
//            - posiadać (pole) imię studenta
//    - posiadać (pole) nazwisko studenta

    private final List<Double> listaOcen;
    private final int numerIndeksu;
    private final String imie;
    private final String nazwisko;

    public Student(String imie, String nazwisko, int numerIndeksu, List<Double> listaOcen) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerIndeksu = numerIndeksu;
        this.listaOcen = listaOcen;
//        new ArrayList<>()
    }


    public List<Double> getListaOcen() {
        return listaOcen;
    }

    public int getNumerIndeksu() {
        return numerIndeksu;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    @Override
    public String toString() {
        return "Student{" +
                "listaOcen=" + listaOcen +
                ", numerIndeksu=" + numerIndeksu +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }
}
