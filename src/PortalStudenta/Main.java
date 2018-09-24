package PortalStudenta;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


        Dziennik dziennik = new Dziennik();

        Student s1 = new Student("Janusz", "Pchlarz", 111, Arrays.asList(2.0,3.0,4.0,3.0));
        Student s2 = new Student("Ignac", "Van Persie", 222, Arrays.asList(2.0,3.0,4.0,5.0));
        Student s3 = new Student("Proszkers", "Vanish", 333, Arrays.asList(5.0,4.0,4.0,4.0));
        Student s4 = new Student("Grzyb", "Suszony", 444, Arrays.asList(5.0,4.0,4.0,4.0));




        dziennik.dodajStudenta(s1);
        dziennik.dodajStudenta(s2);
        dziennik.dodajStudenta(s3);
        dziennik.dodajStudenta(s4);



//        System.out.println(dziennik.getStudent(111));
//        System.out.println(dziennik.getStudent(222));
//        System.out.println(dziennik.getStudent(333));
        System.out.println(s1.getListaOcen());
        System.out.println(s1.getListaOcen());

        




    }
}
