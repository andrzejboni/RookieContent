package Comparator;


import java.util.Comparator;

import static Comparator.Gender.Men;

public class PersonByLastNameComparator implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {

        int lastNameComparingResult = o1.getLastName().compareTo(o2.getLastName()); // Metoda zwraca -1 , 1 , 0 jest jeśli sa równe
        if(lastNameComparingResult!=0) return lastNameComparingResult;

        int firstNameComparingResult = o1.getFirstName().compareTo(o2.getFirstName());
        return firstNameComparingResult;
    }

//
//    public int compareByLastName (Person o1, Person o2){
//        int lastNameComapringResult = o1.getLastName().compareTo(o2.getLastName());
//        return 1;
//    }


}

// KOMPARAOTR SOORTUJĄCY PO GENDER
//        if (o1.gender == Gender.Men && o2.gender == Gender.Woman) {
//            return 1;
//        }
//        if (o1.gender == Gender.Woman && o2.gender == Gender.Men) {
//            return -1;
//        }