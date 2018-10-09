package Sety;

import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Set<String> names = new TreeSet<>();
        names.add("Wojtek");
        names.add("Grzegorz");
        names.add("Janusz");

        for (int i = 0; i < names.size(); i++) {
            for (int j = 0; j < names.size(); j++) {

            }
        }



        for (String name : names) {
            System.out.println(name);
        }

    }
}
