package com.company.WzorceProjektoweUG.SingletonDziedziczenie;


public class Test {
    public static void main(String[] args){
        Singleton matka = Singleton.getInstance();
        Singleton dziecko = SingletonChild.getInstance();
        System.out.println();

        System.out.println("Wywołanie funkcji z klasy głównej:");
        System.out.println("Nazwa: " + matka.getName() + " " + matka.getClass());
        System.out.println();
        System.out.println("Wywołanie funkcji z klasy dziedziczacej po klasie głównej:");
        System.out.println("Nazwa: " + dziecko.getName() + " " + dziecko.getClass());
    }
}