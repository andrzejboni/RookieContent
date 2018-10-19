package Comparator;

import java.util.Comparator;

public class PersonByGenderComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getGender().compareTo(o2.getGender()) == -1) {return -1;}
        if (o1.getGender().compareTo(o2.getGender())== 1) {return 1;}

        return 0;
    }
}
