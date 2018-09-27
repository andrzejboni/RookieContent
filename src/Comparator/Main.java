package Comparator;

import SalaKonferencyjna.SalaKonferencyjna;

public class Main {
    public static void main(String[] args) {
        SalaKonfComparator salaKonfComparator = new SalaKonfComparator();

        SalaKonferencyjna s1 = new SalaKonferencyjna(111,true,120,80);
        SalaKonferencyjna s3 = new SalaKonferencyjna(111,true,120,80);

        SalaKonferencyjna s2 = new SalaKonferencyjna(111,true,190,80);

        System.out.println(salaKonfComparator.compare(s1,s2));
        System.out.println(salaKonfComparator.compare(s2,s1));
        System.out.println(salaKonfComparator.compare(s1,s3));

        PersonStringComparator personStringComparator = new PersonStringComparator();


        Person p1 = new Person("Janusz", "Sracz", 5423);
        Person p2 = new Person("Ignac", "Szaoper", 42);
        Person p3 = new Person("Romual", "Ptak", 233);
        Person p4 = new Person("Arnol", "Bury", 12);

        personStringComparator.compare(p1,p2);
        personStringComparator.compare(p2,p1);
        personStringComparator.compare(p3,p4);

    }
}

//
//1.Stworz komparator, z którego użyciem można posortować liczby w kolejnosci: parzyste liczby - nieparzyste liczby
//        2. Stwórz klasę Person, która posiada pola: firstName, lastName, dateOfBirth (LocalDate.class);
//        a)stwórz komparator, którego można użyć do posortowania osób według nazwiska
//        b) stwórz komparator, którego można użyć do posortowania osób wg nazwiska, a potem według imion
//        c) stwórz komparator, którego można użyć do posortowania osób wg daty urodzenia. Malejąco i rosnąco