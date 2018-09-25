package PortalStudenta;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        Dziennik dziennik = new Dziennik();

        Student s1 = new Student("Siersciuch", "Pchlarz", 111, Arrays.asList(2.0,2.0,2.0,3.0));
        Student s2 = new Student("Lewy", "Van Persie", 222, Arrays.asList(2.0,3.0,4.0,5.0));
        Student s3 = new Student("Proszkers", "Vanisz", 333, Arrays.asList(5.0,4.0,4.0,4.0));
        Student s4 = new Student("Grzyb", "Suszony-Marynowany", 444, Arrays.asList(5.0,4.0,4.0,4.0));




        dziennik.dodajStudenta(s1);
        dziennik.dodajStudenta(s2);
        dziennik.dodajStudenta(s3);
        dziennik.dodajStudenta(s4);


        System.out.println(s1.getListaOcen().get(0));
//        dziennik.podajSredniaStudenta(s1);
        System.out.println(dziennik.podajŚredniąStudenta(s1));
        System.out.println(dziennik.podajŚredniąStudenta(s2));
        System.out.println(dziennik.podajŚredniąStudenta(s3));
        System.out.println(dziennik.podajŚredniąStudenta(s4));







//        System.out.println(dziennik.getStudent(111));
//        System.out.println(dziennik.getStudent(222));
////        System.out.println(dziennik.getStudent(333));
//        System.out.println(s1.getListaOcen());
//        System.out.println(s1.getListaOcen());

        




    }
}
