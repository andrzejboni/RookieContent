package com.company.WzorceProjektoweUG.Singleton2;


public class SingletonTestDCL {
    private volatile static SingletonTestDCL singleton = null;
    private static int id = 1;
    private SingletonTestDCL() {};

    public static SingletonTestDCL instancja(String watekID) {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    System.out.println("Singleton DCL zainicjowany po raz " + id++ + " przez wątek " + watekID);
                    singleton = new SingletonTestDCL();
                }
            }
        }
        return singleton;
    }
}
