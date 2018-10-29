package com.company.WzorceProjektoweUG.Singleton;
//

public class DoubleSingleton {

    private static DoubleSingleton instancja;

    private DoubleSingleton() { }

    public static DoubleSingleton pobierzInstancje() {
        if (instancja == null) {
            synchronized(DoubleSingleton.class) {
                if(instancja == null) {
                    instancja = new DoubleSingleton();
                    System.out.println("Instancja została utworzona.");
                }
            }
        } else {
            System.out.println("Nie można stworzyć instancji");
        }
        return instancja;
    }
}

