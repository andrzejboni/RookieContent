package com.company.Wielowatkowos;

import static java.lang.Thread.sleep;

public class od100do0 {

    Runnable uruchamialna = new Runnable(){

        public void run() {

            for (int i =100; i> 0; i--) {
                System.out.println("od100 ------> :"+i);

                try {
                    sleep(20);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    };
}
