package com.company.WzorceProjektoweUG.SingletonDziedziczenie;



public class SingletonChild extends Singleton {
    private SingletonChild(){}

    private static SingletonChild obiekt = null;
    private String name = "obiekt DZIECKO";

    public synchronized static SingletonChild getInstance(){
        if (obiekt == null){
            obiekt = new SingletonChild();
            System.out.println("Obiekt singleton DZIECKO został zainicjowany");
        }
        return obiekt;
    }

    @Override
    public String getName() {
        return name;
    }


}