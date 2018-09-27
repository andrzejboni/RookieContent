package Comparator;


import java.util.Comparator;

import static Comparator.Gender.Men;

public class PersonStringComparator implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {
        if (o1.gender == Gender.Men && o2.gender == Gender.Woman) {
            return 1;
        }
        if (o1.gender == Gender.Woman && o2.gender == Gender.Men) {
            return -1;
        }
        return 0;

    }

}
