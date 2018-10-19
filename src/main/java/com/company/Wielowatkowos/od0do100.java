package com.company.Wielowatkowos;

import static java.lang.Thread.sleep;

public class od0do100 implements Runnable {

    static int i = 0;

    public synchronized   void run() {
        while (i < 100) {
            System.out.println("od0 :" + i);

            try {
                sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            i++;

// lock unclok decyduje o ilosci uruchomionych watkow w systemie

//        while (true) {
//
//            try {
//                sleep(500);
//                System.out.println("Watek 3 działa");
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }

            int aktualnyLicznik = i;

            if (aktualnyLicznik == 00) {
                System.out.println("KONIEC ODLICZANIA");
            }
        }
    }


}