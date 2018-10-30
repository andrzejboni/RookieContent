package com.company.WzorceProjektoweUG.www;


import java.io.Serializable;

public class Singleton  implements Serializable {

    private static Singleton singleton = null;
    private static int id = 1;
    protected Singleton() {}


    public static Singleton instancja() {
        if (singleton == null) {
            System.out.println("Singleton zainicjowany po raz " + id++);
            singleton = new Singleton();
        }
        id++;
        return singleton;
    }
}
