package com.company.WzorceProjektoweOnceAgain.Dekorator;

public class BMWDecorator {
    private Car car;

    public BMWDecorator(Car car) {
        this.car = car;
    }

    public void start(){
        this.car.start();
        System.out.println("Uruchamia się radio i mówi że lubi zupę z buraków");
        this.car.accelerate();
    }


    public void sell(){
        System.out.println("Jeżdzę starym rzęchem ale go nie sprzedam");
    }

    public void accelerate(){
        this.car.accelerate();
        System.out.println("Poszła uszczelka pod głowicą i nie mogę przyspieszyć.");
    }

    public void wiejskiTuning(){
        System.out.println("Dodaje zbyt duży spojler");
        System.out.println("Dodaje grubą rurę");
        System.out.println("Demontuje migacze");
        System.out.println("Futrzane kostki i piesek");
        System.out.println("Wieszam choinkę Wunderbaum");
    }
}
