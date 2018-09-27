package Comparator;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class RejstracjaPacjentow {

    Queue<Person> kolejkaPacjentow = new PriorityQueue<>();

    public void addPatientToQueue(Person person) {
        kolejkaPacjentow.add(person);
    }

    public Person getNextPerson() {
        return kolejkaPacjentow.poll();
    }

}
