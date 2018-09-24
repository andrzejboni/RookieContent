package PortalStudenta;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Dziennik {

//
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

    private List<Object> listaStudentow = new ArrayList<Object>();

    public void dodajStudenta(Object o) {
        listaStudentow.add(o);
    }

    public void usunStudentaw(Object o) {
        listaStudentow.remove(o);
    }

//    public Student zwrocStudenta(String numer) { // Przydatna akcja może zwóricć nam nulla GURWA Optional spoko opcja
//        Student student = listaStudentow.get(numer);
//        return student;
//    }

    public void podajSredniaStudenta() {


    }

    public void podajStudentowZagrozonych() {
    }

    public void posortujStudentowPoIndeksie() {
    }


}
