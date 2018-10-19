package Comparator;

import SalaKonferencyjna.SalaKonferencyjna;

import java.time.Instant;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//
//1.Stworz komparator, z którego użyciem można posortować liczby w kolejnosci: parzyste liczby - nieparzyste liczby
//        2. Stwórz klasę Person, która posiada pola: firstName, lastName, dateOfBirth (LocalDate.class)

//        a)stwórz komparator, którego można użyć do posortowania osób według nazwiska !! DO ZROBIENIA

//        b) stwórz komparator, którego można użyć do posortowania osób wg nazwiska, a potem według imion

//        c) stwórz komparator, którego można użyć do posortowania osób wg daty urodzenia. Malejąco i rosnąco
//        d) według płci



// TA KLASA TO JEST TOTALNA SRAKA
public class Main {
    public static void main(String[] args) {
        // Od początku


        long epochTime = Instant.now().toEpochMilli();
        String epochToString = String.valueOf(epochTime);

    }
}

//
//    SalaKonfComparator salaKonfComparator = new SalaKonfComparator();
//
//    SalaKonferencyjna s1 = new SalaKonferencyjna(111, true, 120, 80);
//    SalaKonferencyjna s3 = new SalaKonferencyjna(112, true, 120, 10);
//    SalaKonferencyjna s2 = new SalaKonferencyjna(113, true, 190, 80);
//
////        System.out.println(salaKonfComparator.compare(s1,s2));
////        System.out.println(salaKonfComparator.compare(s2,s1));
////        System.out.println(salaKonfComparator.compare(s1,s3));
//
//    PersonStringComparator personStringComparator = new PersonStringComparator();
//
//
//    Person p1 = new Person("Janusz", "Pracz", 5423, Gender.Men);
//    Person p5 = new Person("Piotrusiówka", "von HufflePuff", 5423, Gender.Woman);
//    Person p2 = new Person("Marlenka", "Ravenclaw", 42, Gender.Woman);
//    Person p3 = new Person("Jureczka", "Gryffindor", 233, Gender.Woman);
//    Person p4 = new Person("Oleczka", "Bury", 12, Gender.Woman);
//
////        personStringComparator.compare(p1,p2);
////        personStringComparator.compare(p2,p1);
////        personStringComparator.compare(p3,p4);
////        System.out.println(personStringComparator.compare2(p1,p2));
//
//    RejstracjaPacjentow rejstracjaPacjentow = new RejstracjaPacjentow();
//        rejstracjaPacjentow.addPatientToQueue(p1);
//                rejstracjaPacjentow.addPatientToQueue(p2);
//                rejstracjaPacjentow.addPatientToQueue(p3);
//                rejstracjaPacjentow.addPatientToQueue(p4);
//                rejstracjaPacjentow.addPatientToQueue(p5);
//
//
////        List<RejstracjaPacjentow> list = (LinkedList)kolejkaPacjentow;
//
////
////        Collections.sort(rejstracjaPacjentow, new PersonStringComparator());