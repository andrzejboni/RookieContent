package Comparator;


import java.util.Comparator;

public class PersonStringComparator implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {
        if (o1.data > o2.data) {
            return 1;
        }
        if (o1.data< o2.data) {
            return -1;
        }

        return 0;
    }
}
