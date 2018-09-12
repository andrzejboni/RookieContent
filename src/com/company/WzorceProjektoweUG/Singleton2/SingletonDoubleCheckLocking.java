package com.company.WzorceProjektoweUG.Singleton2;


import java.io.Serializable;

public class SingletonDoubleCheckLocking implements Serializable {

    private volatile static SingletonDoubleCheckLocking singleton = null;
    private static int id = 1;
    private SingletonDoubleCheckLocking() {};

    public static SingletonDoubleCheckLocking instancja() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    System.out.println("Singleton DCL zainicjowany po raz " + id++);
                    singleton = new SingletonDoubleCheckLocking();
                }
            }
        }
        return singleton;
    }
}
