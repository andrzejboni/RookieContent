package com.company.Wielowatkowos;

import static java.lang.Thread.sleep;

public class Wielowatkowosc {
    public static void main(String[] args) {


//        System.out.println("Tu się coś dzieje w metodzie main");
        //////////////////////////////////////////////


        od0do100 liczA = new od0do100();
//        od100do0 liczB = new od100do0();


        Thread watekA = new Thread(liczA);
//        Thread watekB = new Thread(liczB.uruchamialna);
//        Thread watekC = new Thread(licz);


//        watekC.setDaemon(true);  // ZABIJA TEN WĄTEK, JEŚLI JAKIKOLWIEK WĄTEK SIE SKOŃCZY!!
//        watekC.start();
        watekA.start();
//        watekB.start();



    }
}
