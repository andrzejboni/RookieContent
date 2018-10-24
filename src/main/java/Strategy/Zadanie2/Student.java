package Strategy.Zadanie2;

public class Student {
    String firstName;
    String lastName;
    int ID;

    public Student(String firstName, String lastName, int ID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", ID=" + ID +
                '}';
    }


    public String toString2() {
        return firstName + ";" +
                ";" + lastName + ";" +
                ";" + ID ;
    }
}
