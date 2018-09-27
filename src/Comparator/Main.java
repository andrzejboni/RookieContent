package Comparator;

import SalaKonferencyjna.SalaKonferencyjna;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

// TA KLASA TO JEST TOTALNA SRAKA
public class Main {
    public static void main(String[] args) {
        SalaKonfComparator salaKonfComparator = new SalaKonfComparator();

        SalaKonferencyjna s1 = new SalaKonferencyjna(111, true, 120, 80);
        SalaKonferencyjna s3 = new SalaKonferencyjna(111, true, 120, 80);

        SalaKonferencyjna s2 = new SalaKonferencyjna(111, true, 190, 80);

//        System.out.println(salaKonfComparator.compare(s1,s2));
//        System.out.println(salaKonfComparator.compare(s2,s1));
//        System.out.println(salaKonfComparator.compare(s1,s3));

        PersonStringComparator personStringComparator = new PersonStringComparator();


        Person p1 = new Person("Janusz", "Sracz", 5423, Gender.Men);
        Person p5 = new Person("Piotrusiówka", "von HufflePuff", 5423, Gender.Woman);
        Person p2 = new Person("Marlenka", "Ravenclaw", 42, Gender.Woman);
        Person p3 = new Person("Jureczka", "Gryffidor", 233, Gender.Woman);
        Person p4 = new Person("Oleczka", "Bury", 12, Gender.Woman);

//        personStringComparator.compare(p1,p2);
//        personStringComparator.compare(p2,p1);
//        personStringComparator.compare(p3,p4);
//        System.out.println(personStringComparator.compare2(p1,p2));

        RejstrackaPacjentow rejstrackaPacjentow = new RejstrackaPacjentow();
        rejstrackaPacjentow.addPatientToQueue(p1);
        rejstrackaPacjentow.addPatientToQueue(p2);
        rejstrackaPacjentow.addPatientToQueue(p3);
        rejstrackaPacjentow.addPatientToQueue(p4);
        rejstrackaPacjentow.addPatientToQueue(p5);


//        List<RejstrackaPacjentow> list = (LinkedList)kolejkaPacjentow;
//
//
//        Collections.sort(list, new PersonStringComparator());

    }
}

//
//1.Stworz komparator, z którego użyciem można posortować liczby w kolejnosci: parzyste liczby - nieparzyste liczby
//        2. Stwórz klasę Person, która posiada pola: firstName, lastName, dateOfBirth (LocalDate.class);
//        a)stwórz komparator, którego można użyć do posortowania osób według nazwiska
//        b) stwórz komparator, którego można użyć do posortowania osób wg nazwiska, a potem według imion
//        c) stwórz komparator, którego można użyć do posortowania osób wg daty urodzenia. Malejąco i rosnąco