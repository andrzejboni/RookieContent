package com.company.WzorceProjektoweOnceAgain.Dekorator;

public class TirDecorator {

    private Car car;

    public TirDecorator(Car car) {
        this.car = car;
    }

    public void start(){
        this.car.start();
        System.out.println("Dołączam się do ruchu i staje się szeryfem lewego pasa");
        this.car.accelerate();
    }

    public void accelerate(){
        System.out.println("Używam klaksonu aby przestraszyć przechodniów");
        this.car.accelerate();
    }

    public void pack(){
        System.out.println("Ładowanie naczepy");
    }


    public void wiejskiTuning(){
        System.out.println("Dodaje zbyt duży spojler");
        System.out.println("Dodaje grubą rurę");
        System.out.println("Demontuje migacze");
        System.out.println("Futrzane kostki i piesek");
        System.out.println("Wieszam choinkę Wunderbaum");
    }
}
