package PortalStudenta;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Dziennik {

//    Dziennik powinna:
//            - posiadać (jako pole) listę Studentów.
//            - posiadać metodę 'dodajStudenta(Student):void' do dodawania nowego studenta do dziennika
//    - posiadać metodę 'usuńStudenta(Student):void' do usuwania studenta
//    - posiadać metodę 'usuńStudenta(String):void' do usuwania studenta po jego numerze indexu
//    - posiadać metodę 'zwróćStudenta(String):Student' która jako parametr przyjmuje numer indexu studenta, a w wyniku zwraca konkretnego studenta.
//    - posiadać metodę 'podajŚredniąStudenta(String):double' która przyjmuje indeks studenta i zwraca średnią ocen studenta.
//    - posiadać metodę 'podajStudentówZagrożonych():List<Student>'
//    * posiadać metodę 'posortujStudentówPoIndeksie():List<Student>' - która sortuje listę studentów po numerach indeksów, a następnie zwraca posortowaną listę.
//

    private List<Student> listaStudentow = new ArrayList<Student>();

    public Dziennik(List<Student> listaStudentow) {
        this.listaStudentow = listaStudentow;
    }

    public Dziennik() {
        listaStudentow = new ArrayList<>();
    }


    public void dodajStudenta(Student o) {
        listaStudentow.add(o);
    }

    public void usunStudentaw(int numerIndeksu) {
        listaStudentow.remove(numerIndeksu);
    }

    public Optional<Student> getStudent(int id) {
        for (Student student : listaStudentow) {
            int nrIndeksu = student.getNumerIndeksu();

            if (nrIndeksu == id) {
                return Optional.of(student);
            }

        }

        return Optional.empty();
    }

    public void podajSredniaStudenta(Student o) {

        Student student;
//        o.getListaOcen();
//        double srednia;
//        for (int i = 0; i < o.getListaOcen().size(); i++) {
//            srednia = o.getListaOcen(i) / o.getListaOcen().size();
//
//        }
//        int i = o.getNumerIndeksu().get(1);

    }

    public void podajStudentowZagrozonych() {
    }

    public void posortujStudentowPoIndeksie() {
    }


}
