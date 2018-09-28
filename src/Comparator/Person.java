package Comparator;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class Person {

    String firstName;
    String lastName;
    int data;
    Gender gender;
    Person(String firstName, String lastName, int data, Gender gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.data = data;
        this.gender = gender;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
