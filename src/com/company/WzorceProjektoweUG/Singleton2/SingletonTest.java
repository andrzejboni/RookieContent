package com.company.WzorceProjektoweUG.Singleton2;


public class SingletonTest {

    private static SingletonTest singleton = null;
    private static int id = 1;

    private SingletonTest() {};


    public static SingletonTest instancja(String watekID) {
        if (singleton == null) {
            System.out.println("Singleton Test zainicjowany po raz " + id++ + " przez wątek " + watekID);
            singleton = new SingletonTest();
        }

        return singleton;
    }
}
