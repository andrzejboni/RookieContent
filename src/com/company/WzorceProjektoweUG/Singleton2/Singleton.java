package com.company.WzorceProjektoweUG.Singleton2;


import java.io.Serializable;

public class Singleton  implements Serializable {

    private static Singleton singleton = null;
    private static int id = 1;
    private Singleton() {};


    public static Singleton instancja() {
        if (singleton == null) {
            System.out.println("Singleton zainicjowany po raz " + id++);
            singleton = new Singleton();
        }
        id++;
        return singleton;
    }
}
