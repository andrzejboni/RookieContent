package com.company.WzorceProjektoweUG.SingletonDziedziczenie;


public class Singleton {
    private String name = "obiekt MATKA";

    protected Singleton() {}; //
    private static Singleton obiekt = null;

    public synchronized static Singleton getInstance() {
        if (obiekt == null){
            obiekt = new Singleton();
            System.out.println("Obiekt singleton MATKA został zainicjowany");
        }
        return obiekt;
    }

    public String getName() {
        return name;
    }



}