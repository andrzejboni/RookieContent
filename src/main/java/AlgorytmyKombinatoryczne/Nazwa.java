package AlgorytmyKombinatoryczne;

import java.util.Random;

public class Nazwa  {

    private String nazwa;
    double interwal;

    Random random = new Random();

//    @Override
//    public void run() {
//
//
//        try {
//
//            for (int j = 0; j < 50000; j++) {
//                int  n = random.nextInt(9999) + 1;
//                System.out.println(this.nazwa +n);
//                Thread.sleep(interwal);
//            }
//
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//    }

    public Nazwa(String nazwa, int interwal) {
        this.nazwa = nazwa;
        this.interwal = interwal;
    }
}
