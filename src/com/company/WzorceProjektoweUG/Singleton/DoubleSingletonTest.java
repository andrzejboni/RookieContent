package com.company.WzorceProjektoweUG.Singleton;

public class DoubleSingletonTest {
    public static void main(String[] args) {

        Thread thread1 = new Thread(new Runnable() {
            public void run() {
                DoubleSingleton object = DoubleSingleton.pobierzInstancje();
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            public void run() {
                DoubleSingleton object = DoubleSingleton.pobierzInstancje();
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            public void run() {
                DoubleSingleton object = DoubleSingleton.pobierzInstancje();
            }
        });

        System.out.println("Tworzymy instancję:");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
